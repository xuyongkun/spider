package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsCategoryMapper;
import com.spider.cms.dao.model.CmsCategory;
import com.spider.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created by kenny on 2017/7/11.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}
