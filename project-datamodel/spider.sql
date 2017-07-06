/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/6/28 9:50:54                            */
/*==============================================================*/


drop table if exists cms_article;

drop table if exists cms_article_category;

drop table if exists cms_article_tag;

drop table if exists cms_category;

drop table if exists cms_category_tag;

drop table if exists cms_comment;

drop table if exists cms_menu;

drop table if exists cms_page;

drop table if exists cms_setting;

drop table if exists cms_system;

drop table if exists cms_tag;

drop table if exists cms_topic;

drop table if exists pay_in_order;

drop table if exists pay_in_order_detail;

drop table if exists pay_mch;

drop table if exists pay_out_order;

drop table if exists pay_out_order_detail;

drop table if exists pay_pay;

drop table if exists pay_type;

drop table if exists pay_vendor;

drop table if exists pay_vest;

drop table if exists ucenter_oauth;

drop table if exists ucenter_user;

drop table if exists ucenter_user_details;

drop table if exists ucenter_user_log;

drop table if exists ucenter_user_oauth;

drop table if exists upms_log;

drop table if exists upms_organization;

drop table if exists upms_permission;

drop table if exists upms_role;

drop table if exists upms_role_permission;

drop table if exists upms_system;

drop table if exists upms_user;

drop table if exists upms_user_organization;

drop table if exists upms_user_permission;

drop table if exists upms_user_role;

/*==============================================================*/
/* Table: cms_article                                           */
/*==============================================================*/
create table cms_article
(
   article_id           int(10) unsigned not null auto_increment comment '文章编号',
   topic_id             int comment '所属专题',
   title                varchar(200) not null comment '文章标题',
   author               varchar(50) default NULL comment '文章原作者',
   fromurl              varchar(300) default NULL comment '转载来源网址',
   image                varchar(300) default NULL comment '封面图',
   keywords             varchar(100) default NULL comment '关键字',
   description          varchar(500) default NULL comment '简介',
   type                 tinyint(4) not null default 1 comment '类型(1:普通,2:热门...)',
   allowcomments        tinyint(4) not null default 1 comment '是否允许评论(0:不允许,1:允许)',
   status               tinyint(4) not null default 1 comment '状态(-1:不通过,0未审核,1:通过)',
   content              mediumtext comment '内容',
   user_id              int(10) unsigned not null comment '发布人id',
   readnumber           int(10) unsigned not null default 0 comment '阅读数量',
   top                  int not null default 0 comment '置顶等级',
   system_id            int comment '所属系统',
   ctime                bigint(20) unsigned not null comment '创建时间',
   orders               bigint(20) unsigned not null comment '排序',
   primary key (article_id),
   key cms_article_orders (orders)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

alter table cms_article comment '文章表';

/*==============================================================*/
/* Table: cms_article_category                                  */
/*==============================================================*/
create table cms_article_category
(
   article_category_id  int(10) unsigned not null auto_increment comment '编号',
   article_id           int(10) unsigned not null comment '文章编号',
   category_id          int(10) unsigned not null comment '类目编号',
   primary key (article_category_id),
   key cms_article_category_article_id (article_id),
   key cms_article_category_category_id (category_id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章类目表';

alter table cms_article_category comment '文章类目关联表';

/*==============================================================*/
/* Table: cms_article_tag                                       */
/*==============================================================*/
create table cms_article_tag
(
   article_tag_id       int(10) unsigned not null auto_increment comment '编号',
   article_id           int(10) unsigned not null comment '文章编号',
   tag_id               int(10) unsigned not null comment '标签编号',
   primary key (article_tag_id),
   key cms_article_tag_article_id (article_id),
   key cms_article_tag_tag_id (tag_id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章标签表';

alter table cms_article_tag comment '文章标签关联表';

/*==============================================================*/
/* Table: cms_category                                          */
/*==============================================================*/
create table cms_category
(
   category_id          int(10) unsigned not null auto_increment comment '类目编号',
   pid                  int(10) unsigned comment '上级编号',
   level                tinyint(4) not null comment '层级',
   name                 varchar(20) not null comment '名称',
   description          varchar(200) default NULL comment '描述',
   icon                 varchar(50) default NULL comment '图标',
   type                 tinyint(3) not null default 1 comment '类型(1:普通,2:热门...)',
   alias                varchar(20) default NULL comment '别名',
   system_id            int comment '所属系统',
   ctime                bigint(20) unsigned not null comment '创建时间',
   orders               bigint(255) unsigned not null comment '排序',
   primary key (category_id),
   key cms_category_orders (orders),
   key cms_category_pid (pid),
   key cms_category_alias (alias),
   key cms_category_level (level)
)
ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='类目表';

alter table cms_category comment '类目表';

/*==============================================================*/
/* Table: cms_category_tag                                      */
/*==============================================================*/
create table cms_category_tag
(
   category_tag_id      int(10) unsigned not null auto_increment comment '编号',
   category_id          int(10) unsigned not null comment '类目编号',
   tag_id               int(10) unsigned not null comment '标签编号',
   primary key (category_tag_id),
   key cms_category_tag_tag_id (tag_id),
   key cms_category_tag_category_id (category_id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT=' 分类标签表';

alter table cms_category_tag comment '类目标签关联表';

/*==============================================================*/
/* Table: cms_comment                                           */
/*==============================================================*/
create table cms_comment
(
   comment_id           int(10) unsigned not null auto_increment comment '编号',
   pid                  int(10) unsigned default NULL comment '回复楼中楼编号回复楼中楼编号',
   article_id           int(10) unsigned not null comment '文章编号',
   user_id              int(10) unsigned not null comment '用户编号',
   content              text not null comment '评论内容',
   status               tinyint(4) not null default 1 comment '状态(-1:不通过,0:未审核,1:通过)',
   ip                   varchar(30) default NULL comment '评论人ip地址',
   agent                varchar(200) default NULL comment '评论人终端信息',
   system_id            int comment '所属系统',
   ctime                bigint(20) not null comment '创建时间',
   primary key (comment_id),
   key cms_comment_article_id (article_id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

alter table cms_comment comment '评论表';

/*==============================================================*/
/* Table: cms_menu                                              */
/*==============================================================*/
create table cms_menu
(
   menu_id              int unsigned not null auto_increment comment '编号',
   pid                  int comment '父菜单',
   name                 varchar(20) comment '名称',
   url                  varchar(100) comment '链接',
   target               varchar(10) comment '打开方式',
   orders               bigint comment '排序',
   primary key (menu_id)
);

alter table cms_menu comment '菜单';

/*==============================================================*/
/* Table: cms_page                                              */
/*==============================================================*/
create table cms_page
(
   page_id              int(10) unsigned not null auto_increment comment '编码',
   pid                  int(10) comment '父页面',
   title                varchar(20) comment '标题',
   alias                varchar(20) comment '别名',
   content              mediumtext comment '页面内容',
   keywords             varchar(100) comment '关键字',
   description          varchar(300) comment '描述',
   ctime                bigint(20) comment '创建时间',
   orders               bigint(20) comment '排序',
   primary key (page_id)
);

alter table cms_page comment '页面';

/*==============================================================*/
/* Table: cms_setting                                           */
/*==============================================================*/
create table cms_setting
(
   setting_id           int(10) unsigned not null auto_increment,
   setting_key          varchar(10),
   setting_value        varchar(500),
   primary key (setting_id)
);

alter table cms_setting comment '网站配置';

/*==============================================================*/
/* Table: cms_system                                            */
/*==============================================================*/
create table cms_system
(
   system_id            int unsigned not null auto_increment comment '编号',
   name                 varchar(20) not null comment '系统名称',
   code                 varchar(20) comment '别名',
   description          varchar(300) comment '描述',
   ctime                bigint comment '创建时间',
   orders               bigint comment '排序',
   primary key (system_id)
);

alter table cms_system comment '系统管理';

/*==============================================================*/
/* Table: cms_tag                                               */
/*==============================================================*/
create table cms_tag
(
   tag_id               int(10) unsigned not null auto_increment comment '标签编号',
   name                 varchar(20) not null comment '名称',
   description          varchar(200) default NULL comment '描述',
   icon                 varchar(50) default NULL comment '图标',
   type                 tinyint(4) not null default 1 comment '类型(1:普通,2:热门...)',
   alias                varchar(20) default NULL comment '别名',
   system_id            int comment '所属系统',
   ctime                bigint(20) unsigned not null comment '创建时间',
   orders               bigint(20) unsigned not null comment '排序',
   primary key (tag_id),
   key cms_tag_orders (orders),
   key cms_tag_alias (alias)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='标签表';

alter table cms_tag comment '标签表';

/*==============================================================*/
/* Table: cms_topic                                             */
/*==============================================================*/
create table cms_topic
(
   topic_id             int unsigned not null auto_increment comment '编号',
   title                varchar(100) comment '标题',
   description          varchar(300) comment '描述',
   url                  varchar(100) comment '链接',
   ctime                bigint comment '创建时间',
   primary key (topic_id)
);

alter table cms_topic comment '专题';

/*==============================================================*/
/* Table: pay_in_order                                          */
/*==============================================================*/
create table pay_in_order
(
   pay_in_order_id      int(10) unsigned not null auto_increment,
   pay_vendor_id        int(10),
   pay_mch_id           int(10),
   amount               decimal not null,
   status               tinyint(4) not null,
   ctime                bigint(20) unsigned not null,
   primary key (pay_in_order_id)
);

alter table pay_in_order comment '收入订单表';

/*==============================================================*/
/* Table: pay_in_order_detail                                   */
/*==============================================================*/
create table pay_in_order_detail
(
   pay_in_order_detail_id int(10) unsigned not null auto_increment,
   pay_in_order_id      int(10),
   product_id           varchar(50),
   product_name         varchar(100),
   product_price        decimal,
   product_count        int(10),
   remark               varchar(500),
   primary key (pay_in_order_detail_id)
);

alter table pay_in_order_detail comment '收入订单明细表';

/*==============================================================*/
/* Table: pay_mch                                               */
/*==============================================================*/
create table pay_mch
(
   pay_mch_id           int(10) not null auto_increment,
   mch_id               varchar(20),
   name                 varchar(20),
   reqKey               varchar(50),
   resKey               varchar(50),
   primary key (pay_mch_id)
);

alter table pay_mch comment '支付中心商户管理表';

/*==============================================================*/
/* Table: pay_out_order                                         */
/*==============================================================*/
create table pay_out_order
(
   pay_out_order_id     int(10) unsigned not null auto_increment,
   pay_mch_id           int(10),
   pay_vendor_id        int(10),
   amount               decimal not null,
   status               tinyint(4) not null,
   ctime                bigint(20) unsigned not null,
   primary key (pay_out_order_id)
);

alter table pay_out_order comment '支出订单表';

/*==============================================================*/
/* Table: pay_out_order_detail                                  */
/*==============================================================*/
create table pay_out_order_detail
(
   pay_out_order_detail_id int(10) unsigned not null auto_increment,
   pay_out_order_id     int(10),
   remark               varchar(500),
   primary key (pay_out_order_detail_id)
);

alter table pay_out_order_detail comment '支出订单明细表';

/*==============================================================*/
/* Table: pay_pay                                               */
/*==============================================================*/
create table pay_pay
(
   pay_pay_id           int(10) not null auto_increment,
   pay_type_id          int(10),
   param                varchar(1000),
   primary key (pay_pay_id)
);

alter table pay_pay comment '支付参数配置表';

/*==============================================================*/
/* Table: pay_type                                              */
/*==============================================================*/
create table pay_type
(
   pay_type_id          int(10) not null auto_increment,
   pay_vendor_id        int(10),
   pay_mch_id           int(10),
   primary key (pay_type_id)
);

alter table pay_type comment '商户支持支付类型表';

/*==============================================================*/
/* Table: pay_vendor                                            */
/*==============================================================*/
create table pay_vendor
(
   pay_vendor_id        int(10) not null auto_increment,
   name                 varchar(20),
   appid                varchar(50),
   appsecret            varchar(150),
   config               varchar(1000),
   primary key (pay_vendor_id)
);

alter table pay_vendor comment '第三方支付标识表';

/*==============================================================*/
/* Table: pay_vest                                              */
/*==============================================================*/
create table pay_vest
(
   pay_vest_id          int(10) not null auto_increment,
   pay_type_id          int(10),
   prefix               varchar(20),
   param                varchar(1000),
   primary key (pay_vest_id)
);

alter table pay_vest comment '马甲支付参数配置表';

/*==============================================================*/
/* Table: ucenter_oauth                                         */
/*==============================================================*/
create table ucenter_oauth
(
   oauth_id             int unsigned not null auto_increment comment '编号',
   name                 varchar(20) comment '认证方式名称',
   primary key (oauth_id)
);

alter table ucenter_oauth comment '认证方式表';

/*==============================================================*/
/* Table: ucenter_user                                          */
/*==============================================================*/
create table ucenter_user
(
   user_id              int unsigned not null auto_increment comment '编号',
   password             varchar(32) comment '密码(MD5(密码+盐))',
   salt                 varchar(32) comment '盐',
   nickname             varchar(20) comment '昵称',
   sex                  tinyint(4) default 0 comment '性别(0:未知,1:男,2:女)',
   avatar               varchar(100) comment '头像',
   create_time          timestamp default CURRENT_TIMESTAMP comment '注册时间',
   create_ip            varchar(50) comment '注册IP地址',
   last_login_time      timestamp comment '最后登录时间',
   last_login_ip        varchar(50) comment '最后登录IP地址',
   primary key (user_id)
);

alter table ucenter_user comment '用户表';

/*==============================================================*/
/* Table: ucenter_user_details                                  */
/*==============================================================*/
create table ucenter_user_details
(
   user_id              int unsigned not null comment '编号',
   signature            varchar(300) comment '个性签名',
   real_name            varchar(20) comment '真实姓名',
   birthday             timestamp comment '出生日期',
   question             varchar(100) comment '帐号安全问题',
   answer               varchar(100) comment '帐号安全答案',
   primary key (user_id)
);

alter table ucenter_user_details comment '用户详情表';

/*==============================================================*/
/* Table: ucenter_user_log                                      */
/*==============================================================*/
create table ucenter_user_log
(
   user_log_id          int unsigned not null auto_increment comment '编号',
   user_id              int unsigned comment '用户编号',
   content              varbinary(100) comment '内容',
   ip                   varchar(20) comment '操作IP地址',
   agent                varbinary(200) comment '操作环境',
   create_time          timestamp default CURRENT_TIMESTAMP comment '操作时间',
   primary key (user_log_id)
);

alter table ucenter_user_log comment '用户操作日志表';

/*==============================================================*/
/* Table: ucenter_user_oauth                                    */
/*==============================================================*/
create table ucenter_user_oauth
(
   user_oauth_id        int unsigned not null auto_increment comment '编号',
   user_id              int unsigned not null comment '帐号编号',
   oauth_id             int unsigned not null comment '认证方式编号',
   open_id              varbinary(50) not null comment '第三方ID',
   status               tinyint(4) unsigned comment '绑定状态(0:解绑,1:绑定)',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   primary key (user_oauth_id)
);

alter table ucenter_user_oauth comment '用户认证方式表';

/*==============================================================*/
/* Table: upms_log                                              */
/*==============================================================*/
create table upms_log
(
   log_id               int not null auto_increment comment '编号',
   description          varchar(100) comment '操作描述',
   username             varchar(20) comment '操作用户',
   start_time           bigint(20) comment '操作时间',
   spend_time           int comment '消耗时间',
   base_path            varchar(100) comment '根路径',
   uri                  varchar(200) comment 'URI',
   url                  varchar(200) comment 'URL',
   method               varchar(10) comment '请求类型',
   parameter            mediumtext comment '请求参数',
   user_agent           varchar(200) comment '用户标识',
   ip                   varchar(30) comment 'IP地址',
   result               mediumtext comment '响应结果',
   permissions          varchar(100) comment '权限值',
   primary key (log_id)
);

alter table upms_log comment '操作日志';

/*==============================================================*/
/* Table: upms_organization                                     */
/*==============================================================*/
create table upms_organization
(
   organization_id      int(10) unsigned not null auto_increment comment '编号',
   pid                  int(10) comment '所属上级',
   name                 varchar(20) comment '组织名称',
   description          varchar(1000) comment '组织描述',
   ctime                bigint(20) comment '创建时间',
   primary key (organization_id)
);

alter table upms_organization comment '组织';

/*==============================================================*/
/* Table: upms_permission                                       */
/*==============================================================*/
create table upms_permission
(
   permission_id        int(10) unsigned not null auto_increment comment '编号',
   system_id            int(10) unsigned not null comment '所属系统',
   pid                  int(10) comment '所属上级',
   name                 varchar(20) comment '名称',
   type                 tinyint(4) comment '类型(1:目录,2:菜单,3:按钮)',
   permission_value     varchar(50) comment '权限值',
   uri                  varchar(100) comment '路径',
   icon                 varchar(50) comment '图标',
   status               tinyint(4) comment '状态(0:禁止,1:正常)',
   ctime                bigint(20) comment '创建时间',
   orders               bigint(20) comment '排序',
   primary key (permission_id)
);

alter table upms_permission comment '权限';

/*==============================================================*/
/* Table: upms_role                                             */
/*==============================================================*/
create table upms_role
(
   role_id              int(10) unsigned not null auto_increment comment '编号',
   name                 varchar(20) comment '角色名称',
   title                varchar(20) comment '角色标题',
   description          varchar(1000) comment '角色描述',
   ctime                bigint(20) not null comment '创建时间',
   orders               bigint(20) not null comment '排序',
   primary key (role_id)
);

alter table upms_role comment '角色';

/*==============================================================*/
/* Table: upms_role_permission                                  */
/*==============================================================*/
create table upms_role_permission
(
   role_permission_id   int(10) unsigned not null auto_increment comment '编号',
   role_id              int(10) unsigned not null comment '角色编号',
   permission_id        int(10) unsigned not null comment '权限编号',
   primary key (role_permission_id)
);

alter table upms_role_permission comment '角色权限关联表';

/*==============================================================*/
/* Table: upms_system                                           */
/*==============================================================*/
create table upms_system
(
   system_id            int(10) unsigned not null auto_increment comment '编号',
   icon                 varchar(50) comment '图标',
   banner               varchar(150) comment '背景',
   theme                varchar(50) comment '主题',
   basepath             varchar(100) comment '根目录',
   status               tinyint(4) comment '状态(-1:黑名单,1:正常)',
   name                 varchar(20) comment '系统名称',
   title                varchar(20) comment '系统标题',
   description          varchar(300) comment '系统描述',
   ctime                bigint(20) comment '创建时间',
   orders               bigint(20) comment '排序',
   primary key (system_id)
);

alter table upms_system comment '系统';

/*==============================================================*/
/* Table: upms_user                                             */
/*==============================================================*/
create table upms_user
(
   user_id              int(10) unsigned not null auto_increment comment '编号',
   username             varchar(20) not null comment '帐号',
   password             varchar(32) not null comment '密码MD5(密码+盐)',
   salt                 varchar(32) comment '盐',
   realname             varchar(20) comment '姓名',
   avatar               varchar(150) comment '头像',
   phone                varchar(20) comment '电话',
   email                varchar(50) comment '邮箱',
   sex                  tinyint(4) comment '性别',
   locked               tinyint(4) comment '状态(0:正常,1:锁定)',
   ctime                bigint(20) comment '创建时间',
   primary key (user_id)
);

alter table upms_user comment '用户';

/*==============================================================*/
/* Table: upms_user_organization                                */
/*==============================================================*/
create table upms_user_organization
(
   user_organization_id int(10) unsigned not null auto_increment comment '编号',
   user_id              int(10) unsigned not null comment '用户编号',
   organization_id      int(10) unsigned not null comment '组织编号',
   primary key (user_organization_id)
);

alter table upms_user_organization comment '用户组织关联表';

/*==============================================================*/
/* Table: upms_user_permission                                  */
/*==============================================================*/
create table upms_user_permission
(
   user_permission_id   int(10) unsigned not null auto_increment comment '编号',
   user_id              int(10) unsigned not null comment '用户编号',
   permission_id        int(10) unsigned not null comment '权限编号',
   type                 tinyint(4) not null comment '权限类型(-1:减权限,1:增权限)',
   primary key (user_permission_id)
);

alter table upms_user_permission comment '用户权限关联表';

/*==============================================================*/
/* Table: upms_user_role                                        */
/*==============================================================*/
create table upms_user_role
(
   user_role_id         int(10) unsigned not null auto_increment comment '编号',
   user_id              int(10) unsigned not null comment '用户编号',
   role_id              int(10) comment '角色编号',
   primary key (user_role_id)
);

alter table upms_user_role comment '用户角色关联表';

alter table cms_article add constraint FK_Reference_30 foreign key (topic_id)
      references cms_topic (topic_id) on delete restrict on update restrict;

alter table cms_article_category add constraint FK_Reference_7 foreign key (category_id)
      references cms_category (category_id) on delete cascade on update cascade;

alter table cms_article_category add constraint FK_Reference_8 foreign key (article_id)
      references cms_article (article_id) on delete cascade on update cascade;

alter table cms_article_tag add constraint FK_Reference_3 foreign key (article_id)
      references cms_article (article_id) on delete cascade on update cascade;

alter table cms_article_tag add constraint FK_Reference_4 foreign key (tag_id)
      references cms_tag (tag_id) on delete cascade on update cascade;

alter table cms_category add constraint FK_Reference_10 foreign key (pid)
      references cms_category (category_id) on delete set null on update restrict;

alter table cms_category_tag add constraint FK_Reference_5 foreign key (category_id)
      references cms_category (category_id) on delete cascade on update cascade;

alter table cms_category_tag add constraint FK_Reference_6 foreign key (tag_id)
      references cms_tag (tag_id) on delete cascade on update cascade;

alter table cms_comment add constraint FK_Reference_1 foreign key (article_id)
      references cms_article (article_id) on delete cascade on update cascade;

alter table cms_comment add constraint FK_Reference_2 foreign key (pid)
      references cms_comment (comment_id) on delete cascade on update cascade;

alter table pay_in_order add constraint FK_Reference_32 foreign key (pay_vendor_id)
      references pay_vendor (pay_vendor_id) on delete restrict on update restrict;

alter table pay_in_order add constraint FK_Reference_38 foreign key (pay_mch_id)
      references pay_mch (pay_mch_id) on delete restrict on update restrict;

alter table pay_in_order_detail add constraint FK_Reference_40 foreign key (pay_in_order_id)
      references pay_in_order (pay_in_order_id) on delete restrict on update restrict;

alter table pay_out_order add constraint FK_Reference_33 foreign key (pay_vendor_id)
      references pay_vendor (pay_vendor_id) on delete restrict on update restrict;

alter table pay_out_order add constraint FK_Reference_39 foreign key (pay_mch_id)
      references pay_mch (pay_mch_id) on delete restrict on update restrict;

alter table pay_out_order_detail add constraint FK_Reference_31 foreign key (pay_out_order_id)
      references pay_out_order (pay_out_order_id) on delete restrict on update restrict;

alter table pay_pay add constraint FK_Reference_35 foreign key (pay_type_id)
      references pay_type (pay_type_id) on delete restrict on update restrict;

alter table pay_type add constraint FK_Reference_34 foreign key (pay_vendor_id)
      references pay_vendor (pay_vendor_id) on delete restrict on update restrict;

alter table pay_type add constraint FK_Reference_37 foreign key (pay_mch_id)
      references pay_mch (pay_mch_id) on delete restrict on update restrict;

alter table pay_vest add constraint FK_Reference_36 foreign key (pay_type_id)
      references pay_type (pay_type_id) on delete restrict on update restrict;

alter table ucenter_user_details add constraint FK_Reference_41 foreign key (user_id)
      references ucenter_user (user_id) on delete restrict on update restrict;

alter table ucenter_user_log add constraint FK_Reference_44 foreign key (user_id)
      references ucenter_user (user_id) on delete restrict on update restrict;

alter table ucenter_user_oauth add constraint FK_Reference_42 foreign key (user_id)
      references ucenter_user (user_id) on delete restrict on update restrict;

alter table ucenter_user_oauth add constraint FK_Reference_43 foreign key (oauth_id)
      references ucenter_oauth (oauth_id) on delete restrict on update restrict;

alter table upms_permission add constraint FK_Reference_29 foreign key (system_id)
      references upms_system (system_id) on delete restrict on update restrict;

alter table upms_role_permission add constraint FK_Reference_22 foreign key (permission_id)
      references upms_permission (permission_id) on delete restrict on update restrict;

alter table upms_role_permission add constraint FK_Reference_23 foreign key (role_id)
      references upms_role (role_id) on delete restrict on update restrict;

alter table upms_user_organization add constraint FK_Reference_18 foreign key (user_id)
      references upms_user (user_id) on delete restrict on update restrict;

alter table upms_user_organization add constraint FK_Reference_19 foreign key (organization_id)
      references upms_organization (organization_id) on delete restrict on update restrict;

alter table upms_user_permission add constraint FK_Reference_24 foreign key (user_id)
      references upms_user (user_id) on delete restrict on update restrict;

alter table upms_user_permission add constraint FK_Reference_25 foreign key (permission_id)
      references upms_permission (permission_id) on delete restrict on update restrict;

alter table upms_user_role add constraint FK_Reference_20 foreign key (user_id)
      references upms_user (user_id) on delete restrict on update restrict;

alter table upms_user_role add constraint FK_Reference_21 foreign key (role_id)
      references upms_role (role_id) on delete restrict on update restrict;

