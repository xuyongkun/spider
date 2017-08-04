package com.spider.pay.rpc.service.impl;

import com.spider.common.annotation.BaseService;
import com.spider.common.base.BaseServiceImpl;
import com.spider.pay.dao.mapper.PayVendorMapper;
import com.spider.pay.dao.model.PayVendor;
import com.spider.pay.dao.model.PayVendorExample;
import com.spider.pay.rpc.api.PayVendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PayVendorService实现
* Created by kenny on 2017/8/4.
*/
@Service
@Transactional
@BaseService
public class PayVendorServiceImpl extends BaseServiceImpl<PayVendorMapper, PayVendor, PayVendorExample> implements PayVendorService {

    private static Logger logger = LoggerFactory.getLogger(PayVendorServiceImpl.class);

    @Autowired
    PayVendorMapper payVendorMapper;

}