package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayOutOrderMapper;
import com.spider.pay.dao.model.PayOutOrder;
import com.spider.pay.dao.model.PayOutOrderExample;

/**
* 降级实现PayOutOrderService接口
* Created by kenny on 2017/8/4.
*/
public class PayOutOrderServiceMock extends BaseServiceMock<PayOutOrderMapper, PayOutOrder, PayOutOrderExample> implements PayOutOrderService {

}
