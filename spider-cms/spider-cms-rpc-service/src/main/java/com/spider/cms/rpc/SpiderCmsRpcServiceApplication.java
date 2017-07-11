package com.spider.cms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by kenny on 2017/7/11
 */
public class SpiderCmsRpcServiceApplication {

	private static Logger logger = LoggerFactory.getLogger(SpiderCmsRpcServiceApplication.class);

	public static void main(String[] args) {
		logger.info(">>>>> spider-cms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		logger.info(">>>>> spider-cms-rpc-service 启动完成 <<<<<");
	}

}
