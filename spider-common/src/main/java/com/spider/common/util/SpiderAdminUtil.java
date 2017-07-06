package com.spider.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压spiderAdmin-x.x.x.jar到resources目录
 * Created by kenny on 2017/6/29
 */
public class SpiderAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger logger = LoggerFactory.getLogger(SpiderAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        logger.info("===== 开始解压spider-admin =====");
        String version = PropertiesFileUtil.getInstance("spider-admin-client").get("spider.admin.version");
        logger.info("spider-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/spider-admin-" + version + ".jar");
        logger.info("spider-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/spider-admin";
        logger.info("spider-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        logger.info("===== 解压spider-admin完成 =====");
    }

}
