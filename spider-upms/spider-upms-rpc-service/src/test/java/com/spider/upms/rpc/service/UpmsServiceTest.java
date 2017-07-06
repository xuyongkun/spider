package com.spider.upms.rpc.service;


import com.spider.upms.dao.mapper.UpmsUserMapper;
import com.spider.upms.dao.model.UpmsPermission;
import com.spider.upms.dao.model.UpmsPermissionExample;
import com.spider.upms.dao.model.UpmsUser;
import com.spider.upms.rpc.api.UpmsPermissionService;
import com.spider.upms.rpc.api.UpmsSystemService;
import com.spider.upms.rpc.api.UpmsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;

/**
 * 单元测试
 * Created by kenny on 2017/6/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:META-INF/spring/applicationContext-jdbc.xml",
        "classpath:META-INF/spring/applicationContext-listener.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class UpmsServiceTest {

    @Autowired
    private UpmsSystemService upmsSystemService;

    @Autowired
    private UpmsUserMapper upmsUserMapper;

    @Autowired
    private UpmsUserService upmsUserService;

    @Autowired
    private UpmsPermissionService upmsPermissionService;

    @Test
    public void index() {
        UpmsUser upmsUser = new UpmsUser();
        upmsUser.setAvatar("");
        upmsUser.setCtime(System.currentTimeMillis());
        upmsUser.setEmail("");
        upmsUser.setLocked((byte) 0);
        upmsUser.setPassword("xxx");
        upmsUser.setPhone("");
        upmsUser.setRealname("zsz");
        upmsUser.setSex((byte) 1);
        upmsUser.setSalt("");
        upmsUser.setUsername("zsz");
        upmsUserService.insertSelective(upmsUser);
        System.out.println(upmsUser.getUserId());
    }

    @Test
    public void selectForPage() {
        // 根据条件，按页码+每页条数分页
        UpmsPermissionExample upmsPermissionExample = new UpmsPermissionExample();
        upmsPermissionExample.createCriteria()
                .andSystemIdEqualTo(1);
        List<UpmsPermission> upmsPermissions = upmsPermissionService.selectByExampleForStartPage(upmsPermissionExample, 2, 20);
        System.out.println(upmsPermissions.size());
        // 根据条件，按offset+limit分页
        upmsPermissionExample = new UpmsPermissionExample();
        upmsPermissionExample.createCriteria()
                .andSystemIdEqualTo(2);
        upmsPermissions = upmsPermissionService.selectByExampleForOffsetPage(upmsPermissionExample, 3, 5);
        System.out.println(upmsPermissions.size());
    }

}
