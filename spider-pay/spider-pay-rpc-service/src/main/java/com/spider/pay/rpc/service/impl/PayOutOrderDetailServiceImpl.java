package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayOutOrderDetailMapper;
import com.spider.pay.dao.model.PayOutOrderDetail;
import com.spider.pay.dao.model.PayOutOrderDetailExample;
import com.spider.pay.rpc.api.PayOutOrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayOutOrderDetailService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayOutOrderDetailServiceImpl extends BaseServiceImpl<PayOutOrderDetailMapper, PayOutOrderDetail, PayOutOrderDetailExample> implements PayOutOrderDetailService {

    private static Logger logger = LoggerFactory.getLogger(PayOutOrderDetailServiceImpl.class);

    @Autowired
    PayOutOrderDetailMapper payOutOrderDetailMapper;

}