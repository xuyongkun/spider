package com.spider.cms.rpc.api;

import com.spider.cms.dao.model.CmsArticle;
import com.spider.cms.dao.model.CmsArticleExample;
import com.spider.common.base.BaseService;

import java.util.List;

/**
* CmsArticleService接口
* Created by kenny on 2017/7/11.
*/
public interface CmsArticleService extends BaseService<CmsArticle, CmsArticleExample> {

    // 根据类目获取文章列表
    List<CmsArticle> selectCmsArticlesByCategoryId(Integer categoryId, Integer offset, Integer limit);

    // 根据类目获取文章数量
    long countByCategoryId(Integer categoryId);

    // 根据标签获取文章列表
    List<CmsArticle> selectCmsArticlesByTagId(Integer tagId, Integer offset, Integer limit);

    // 根据标签获取文章数量
    long countByTagId(Integer tagId);

}