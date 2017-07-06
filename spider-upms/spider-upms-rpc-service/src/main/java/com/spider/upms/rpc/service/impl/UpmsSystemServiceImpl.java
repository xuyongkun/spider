package com.spider.upms.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.upms.dao.mapper.UpmsSystemMapper;
import com.spider.upms.dao.model.UpmsSystem;
import com.spider.upms.dao.model.UpmsSystemExample;
import com.spider.upms.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemService实现
* Created by kenny on 2017/6/28.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static Logger logger = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

}