package com.spider.upms.server;

import com.spider.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 系统接口
 * Created by kenny on 2017/6/28
 */
public class Initialize implements BaseInterface {

	private static Logger logger = LoggerFactory.getLogger(Initialize.class);

	@Override
	public void init() {
		logger.info(">>>>> 系统初始化");
	}

}
