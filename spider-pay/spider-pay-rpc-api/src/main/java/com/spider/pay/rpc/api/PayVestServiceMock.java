package com.spider.pay.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.pay.dao.mapper.PayVestMapper;
import com.spider.pay.dao.model.PayVest;
import com.spider.pay.dao.model.PayVestExample;

/**
* 降级实现PayVestService接口
* Created by kenny on 2017/8/4.
*/
public class PayVestServiceMock extends BaseServiceMock<PayVestMapper, PayVest, PayVestExample> implements PayVestService {

}
