package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsArticleMapper;
import com.spider.cms.dao.model.CmsArticle;
import com.spider.cms.dao.model.CmsArticleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* 降级实现CmsArticleService接口
* Created by kenny on 2017/7/11.
*/
public class CmsArticleServiceMock extends BaseServiceMock<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

    private static Logger logger = LoggerFactory.getLogger(CmsArticleServiceMock.class);

    @Override
    public List<CmsArticle> selectCmsArticlesByCategoryId(Integer categoryId, Integer offset, Integer limit) {
        logger.info("CmsArticleServiceMock => getCmsArticlesByCategoryId");
        return null;
    }

    @Override
    public long countByCategoryId(Integer categoryId) {
        logger.info("CmsArticleServiceMock => countByCategoryId");
        return 0;
    }

    @Override
    public List<CmsArticle> selectCmsArticlesByTagId(Integer tagId, Integer offset, Integer limit) {
        logger.info("CmsArticleServiceMock => getCmsArticlesByCategoryId");
        return null;
    }

    @Override
    public long countByTagId(Integer tagId) {
        logger.info("CmsArticleServiceMock => countByTagId");
        return 0;
    }

}
