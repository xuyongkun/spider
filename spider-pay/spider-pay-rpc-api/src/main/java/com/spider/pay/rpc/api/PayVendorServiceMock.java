package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayVendorMapper;
import com.spider.pay.dao.model.PayVendor;
import com.spider.pay.dao.model.PayVendorExample;

/**
* 降级实现PayVendorService接口
* Created by kenny on 2017/8/4.
*/
public class PayVendorServiceMock extends BaseServiceMock<PayVendorMapper, PayVendor, PayVendorExample> implements PayVendorService {

}
