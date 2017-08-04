package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayTypeMapper;
import com.spider.pay.dao.model.PayType;
import com.spider.pay.dao.model.PayTypeExample;
import com.spider.pay.rpc.api.PayTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayTypeService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayTypeServiceImpl extends BaseServiceImpl<PayTypeMapper, PayType, PayTypeExample> implements PayTypeService {

    private static Logger logger = LoggerFactory.getLogger(PayTypeServiceImpl.class);

    @Autowired
    PayTypeMapper payTypeMapper;

}