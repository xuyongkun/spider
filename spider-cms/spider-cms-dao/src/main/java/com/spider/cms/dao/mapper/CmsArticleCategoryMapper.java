package com.spider.cms.dao.mapper;

import com.spider.cms.dao.model.CmsArticleCategory;
import com.spider.cms.dao.model.CmsArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleCategoryMapper {
    long countByExample(CmsArticleCategoryExample example);

    int deleteByExample(CmsArticleCategoryExample example);

    int deleteByPrimaryKey(Integer articleCategoryId);

    int insert(CmsArticleCategory record);

    int insertSelective(CmsArticleCategory record);

    List<CmsArticleCategory> selectByExample(CmsArticleCategoryExample example);

    CmsArticleCategory selectByPrimaryKey(Integer articleCategoryId);

    int updateByExampleSelective(@Param("record") CmsArticleCategory record, @Param("example") CmsArticleCategoryExample example);

    int updateByExample(@Param("record") CmsArticleCategory record, @Param("example") CmsArticleCategoryExample example);

    int updateByPrimaryKeySelective(CmsArticleCategory record);

    int updateByPrimaryKey(CmsArticleCategory record);
}