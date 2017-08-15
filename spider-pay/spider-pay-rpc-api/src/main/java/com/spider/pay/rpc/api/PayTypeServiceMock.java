package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayTypeMapper;
import com.spider.pay.dao.model.PayType;
import com.spider.pay.dao.model.PayTypeExample;

/**
* 降级实现PayTypeService接口
* Created by kenny on 2017/8/4.
*/
public class PayTypeServiceMock extends BaseServiceMock<PayTypeMapper, PayType, PayTypeExample> implements PayTypeService {

}
