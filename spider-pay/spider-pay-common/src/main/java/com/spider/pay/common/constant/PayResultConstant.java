package com.spider.pay.common.constant;

/**
 * pay系统接口结果常量枚举类
 * Created by kenny on 2017/7/26.
 */
public enum PayResultConstant {

    FAILED(0, "failed"),
    SUCCESS(1, "success");


    public int code;

    public String message;

    PayResultConstant(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
