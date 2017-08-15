package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayPayMapper;
import com.spider.pay.dao.model.PayPay;
import com.spider.pay.dao.model.PayPayExample;

/**
* 降级实现PayPayService接口
* Created by kenny on 2017/8/4.
*/
public class PayPayServiceMock extends BaseServiceMock<PayPayMapper, PayPay, PayPayExample> implements PayPayService {

}
