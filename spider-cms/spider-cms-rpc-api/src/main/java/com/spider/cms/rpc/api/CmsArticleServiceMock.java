package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsArticleMapper;
import com.spider.cms.dao.model.CmsArticle;
import com.spider.cms.dao.model.CmsArticleExample;

/**
* 降级实现CmsArticleService接口
* Created by kenny on 2017/7/11.
*/
public class CmsArticleServiceMock extends BaseServiceMock<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

}
