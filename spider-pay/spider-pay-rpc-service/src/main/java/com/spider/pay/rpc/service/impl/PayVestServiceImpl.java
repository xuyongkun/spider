package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayVestMapper;
import com.spider.pay.dao.model.PayVest;
import com.spider.pay.dao.model.PayVestExample;
import com.spider.pay.rpc.api.PayVestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayVestService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayVestServiceImpl extends BaseServiceImpl<PayVestMapper, PayVest, PayVestExample> implements PayVestService {

    private static Logger logger = LoggerFactory.getLogger(PayVestServiceImpl.class);

    @Autowired
    PayVestMapper payVestMapper;

}