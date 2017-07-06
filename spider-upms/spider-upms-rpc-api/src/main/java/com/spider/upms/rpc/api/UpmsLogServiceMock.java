package com.spider.upms.rpc.api;


import com.spider.common.base.BaseServiceMock;
import com.spider.upms.dao.mapper.UpmsLogMapper;
import com.spider.upms.dao.model.UpmsLog;
import com.spider.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
