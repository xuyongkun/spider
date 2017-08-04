package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayOutOrderMapper;
import com.spider.pay.dao.model.PayOutOrder;
import com.spider.pay.dao.model.PayOutOrderExample;
import com.spider.pay.rpc.api.PayOutOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayOutOrderService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayOutOrderServiceImpl extends BaseServiceImpl<PayOutOrderMapper, PayOutOrder, PayOutOrderExample> implements PayOutOrderService {

    private static Logger logger = LoggerFactory.getLogger(PayOutOrderServiceImpl.class);

    @Autowired
    PayOutOrderMapper payOutOrderMapper;

}