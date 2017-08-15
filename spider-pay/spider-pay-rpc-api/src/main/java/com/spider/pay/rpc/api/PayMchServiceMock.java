package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayMchMapper;
import com.spider.pay.dao.model.PayMch;
import com.spider.pay.dao.model.PayMchExample;

/**
* 降级实现PayMchService接口
* Created by kenny on 2017/8/4.
*/
public class PayMchServiceMock extends BaseServiceMock<PayMchMapper, PayMch, PayMchExample> implements PayMchService {

}
