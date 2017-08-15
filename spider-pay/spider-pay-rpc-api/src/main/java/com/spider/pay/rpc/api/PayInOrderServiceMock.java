package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayInOrderMapper;
import com.spider.pay.dao.model.PayInOrder;
import com.spider.pay.dao.model.PayInOrderExample;

/**
* 降级实现PayInOrderService接口
* Created by kenny on 2017/8/4.
*/
public class PayInOrderServiceMock extends BaseServiceMock<PayInOrderMapper, PayInOrder, PayInOrderExample> implements PayInOrderService {

}
