package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayPayMapper;
import com.spider.pay.dao.model.PayPay;
import com.spider.pay.dao.model.PayPayExample;
import com.spider.pay.rpc.api.PayPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayPayService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayPayServiceImpl extends BaseServiceImpl<PayPayMapper, PayPay, PayPayExample> implements PayPayService {

    private static Logger logger = LoggerFactory.getLogger(PayPayServiceImpl.class);

    @Autowired
    PayPayMapper payPayMapper;

}