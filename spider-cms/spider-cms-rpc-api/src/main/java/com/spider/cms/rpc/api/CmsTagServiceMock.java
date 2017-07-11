package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsTagMapper;
import com.spider.cms.dao.model.CmsTag;
import com.spider.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created by kenny on 2017/7/11.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}
