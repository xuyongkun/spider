package com.spider.upms.rpc.api;


import com.spider.common.base.BaseService;
import com.spider.upms.dao.model.UpmsUserRole;
import com.spider.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {

    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);

}