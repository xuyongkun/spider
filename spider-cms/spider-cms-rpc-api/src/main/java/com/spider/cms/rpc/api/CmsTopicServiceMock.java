package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsTopicMapper;
import com.spider.cms.dao.model.CmsTopic;
import com.spider.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created by kenny on 2017/7/11.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}
