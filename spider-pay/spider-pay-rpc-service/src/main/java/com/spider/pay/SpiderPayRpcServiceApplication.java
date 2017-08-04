package com.spider.pay;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by kenny on 2017/8/4
 */
public class SpiderPayRpcServiceApplication {

	private static Logger logger = LoggerFactory.getLogger(SpiderPayRpcServiceApplication.class);

	public static void main(String[] args) {
		logger.info(">>>>> spider-pay-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		logger.info(">>>>> spider-pay-rpc-service 启动完成 <<<<<");
	}

}
