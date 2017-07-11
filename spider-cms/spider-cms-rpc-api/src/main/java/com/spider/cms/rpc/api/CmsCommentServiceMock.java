package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsCommentMapper;
import com.spider.cms.dao.model.CmsComment;
import com.spider.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created by kenny on 2017/7/11.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}
