package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsSystemMapper;
import com.spider.cms.dao.model.CmsSystem;
import com.spider.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created by kenny on 2017/7/11.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}
