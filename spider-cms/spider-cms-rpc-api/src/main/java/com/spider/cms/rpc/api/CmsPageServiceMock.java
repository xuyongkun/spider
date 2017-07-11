package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsPageMapper;
import com.spider.cms.dao.model.CmsPage;
import com.spider.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created by kenny on 2017/7/11.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}
