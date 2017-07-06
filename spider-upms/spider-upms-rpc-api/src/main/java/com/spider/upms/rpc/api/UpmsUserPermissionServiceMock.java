package com.spider.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.spider.common.base.BaseServiceMock;
import com.spider.upms.dao.mapper.UpmsUserPermissionMapper;
import com.spider.upms.dao.model.UpmsUserPermission;
import com.spider.upms.dao.model.UpmsUserPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserPermissionServiceMock.class);

    @Override
    public int permission(JSONArray datas, int id) {
        _log.info("UpmsUserPermissionServiceMock => permission");
        return 0;
    }

}
