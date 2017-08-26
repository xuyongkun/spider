package com.spider.upms.server;


import com.spider.common.util.PropertiesFileUtil;
import com.spider.upms.dao.model.UpmsSystemExample;
import com.spider.upms.rpc.api.UpmsSystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * 单元测试
 * Created by shuzheng on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:applicationContext-dubbo-consumer.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class UpmsServiceTest {

    @Autowired
    private UpmsSystemService upmsSystemService;

    @Test
    public void index() {
        int count = upmsSystemService.countByExample(new UpmsSystemExample());
        System.out.println(count);
    }


    public static void main(String args[]) {

        String ps = PropertiesFileUtil.getInstance("redis").get("master.redis.password");
        System.out.println("测试：" + ps);

    }

}
