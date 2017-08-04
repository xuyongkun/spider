package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayMchMapper;
import com.spider.pay.dao.model.PayMch;
import com.spider.pay.dao.model.PayMchExample;
import com.spider.pay.rpc.api.PayMchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayMchService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayMchServiceImpl extends BaseServiceImpl<PayMchMapper, PayMch, PayMchExample> implements PayMchService {

    private static Logger logger = LoggerFactory.getLogger(PayMchServiceImpl.class);

    @Autowired
    PayMchMapper payMchMapper;

}