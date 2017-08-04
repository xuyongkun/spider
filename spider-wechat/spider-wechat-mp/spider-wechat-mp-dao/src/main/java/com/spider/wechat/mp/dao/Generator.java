package com.spider.wechat.mp.dao;


import com.spider.common.util.MybatisGeneratorUtil;
import com.spider.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 * Created by kenny on 2017/7/25
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "spider-wechat-mp";
	private static String DATABASE = "spider";
	private static String TABLE_PREFIX = "wechat_mp_";
	private static String PACKAGE_NAME = "com.spider.wechat.mp";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("jdbc").get("master.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("jdbc").get("master.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("jdbc").get("master.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("jdbc").get("master.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	static {

	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
	}

}