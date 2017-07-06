package com.spider.upms.rpc.api;


import com.spider.common.base.BaseServiceMock;
import com.spider.upms.dao.mapper.UpmsUserMapper;
import com.spider.upms.dao.model.UpmsUser;
import com.spider.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}
