package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsMenuMapper;
import com.spider.cms.dao.model.CmsMenu;
import com.spider.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created by kenny on 2017/7/11.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}
