package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayInOrderMapper;
import com.spider.pay.dao.model.PayInOrder;
import com.spider.pay.dao.model.PayInOrderExample;
import com.spider.pay.rpc.api.PayInOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayInOrderService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayInOrderServiceImpl extends BaseServiceImpl<PayInOrderMapper, PayInOrder, PayInOrderExample> implements PayInOrderService {

    private static Logger logger = LoggerFactory.getLogger(PayInOrderServiceImpl.class);

    @Autowired
    PayInOrderMapper payInOrderMapper;

}