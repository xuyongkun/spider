package com.spider.upms.rpc.api;

import com.spider.common.base.BaseService;
import com.spider.upms.dao.model.UpmsUser;
import com.spider.upms.dao.model.UpmsUserExample;

/**
 * UpmsUserService接口
 * Created by kenny on 2017/7/3
 */
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);

}