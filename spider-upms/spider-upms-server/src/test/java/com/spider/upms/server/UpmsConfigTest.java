package com.spider.upms.server;

import com.spider.common.util.PropertiesFileUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试
 * Created by kenny on 2017/8/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:applicationContext-dubbo-consumer.xml"
})
public class UpmsConfigTest {

    @Test
    public void testConfig(){
        String ps = PropertiesFileUtil.getInstance("redis").get("master.redis.password");
        System.out.println("测试：" + ps);

    }

}
