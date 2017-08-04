package com.spider.pay.common.constant;

import com.spider.common.base.BaseResult;

/**
 * pay系统常量枚举类
 * Created by kenny on 2017/7/26.
 */
public class PayResult extends BaseResult {

    public PayResult(PayResultConstant payResultConstant, Object data) {
        super(payResultConstant.getCode(), payResultConstant.getMessage(), data);
    }

}
