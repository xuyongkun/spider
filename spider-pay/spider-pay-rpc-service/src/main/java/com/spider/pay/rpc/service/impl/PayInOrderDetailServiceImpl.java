package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayInOrderDetailMapper;
import com.spider.pay.dao.model.PayInOrderDetail;
import com.spider.pay.dao.model.PayInOrderDetailExample;
import com.spider.pay.rpc.api.PayInOrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayInOrderDetailService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayInOrderDetailServiceImpl extends BaseServiceImpl<PayInOrderDetailMapper, PayInOrderDetail, PayInOrderDetailExample> implements PayInOrderDetailService {

    private static Logger logger = LoggerFactory.getLogger(PayInOrderDetailServiceImpl.class);

    @Autowired
    PayInOrderDetailMapper payInOrderDetailMapper;

}