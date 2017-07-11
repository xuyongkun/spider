package com.spider.cms.rpc.api;

import com.spider.common.base.BaseServiceMock;
import com.spider.cms.dao.mapper.CmsSettingMapper;
import com.spider.cms.dao.model.CmsSetting;
import com.spider.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* Created by kenny on 2017/7/11.
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}
