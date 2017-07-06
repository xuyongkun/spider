package com.spider.upms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by kenny on 2017/6/28
 */
public class SpiderUpmsRpcServiceApplication {

	private static Logger logger = LoggerFactory.getLogger(SpiderUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		logger.info(">>>>> spider-upms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META_INF/spring/*.xml");
		logger.info(">>>>> spider-upms-rpc-service 启动完成 <<<<<");
	}

}
