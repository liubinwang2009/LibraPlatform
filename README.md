# Libra-Platform 微服务平台
目前Libra-Platform平台还处于开发阶段，计划于第四季度中上旬开源，先Star不迷路。基于SpringCloud(2020.0.0) + SpringCloudAlibaba(2021.1) + SpringBoot(2.4.2) + Vue3开发，基于多租户SaaS模式的设计，拥有强大的用户中心，权限基于RBAC设计，支持租户灰度发布等功能。Libra-Platform平台架构清晰、代码简介、注解齐全，很适合作为基础框架使用。相关功能如下：
## 相关功能
![相关功能](./docs/img/Libra-Platform平台规划.png)

## 总体架构图
待补充

## 模块说明
```lua
libra-platform -- 父项目
│  ├─libra-auth -- 认证授权服务
│  │─libra-common -- 公共工具父级
│  │  ├─libra-common-log -- 封装log相关
│  │  ├─libra-common-mq -- 封装MQ相关操作
│  │  ├─libra-common-mybatis -- 封装mybatis相关配置
│  │  ├─libra-common-redis -- 封装Redis相关操作逻辑
│  │  ├─libra-common-security -- 用户鉴权相关处理
│  │  ├─libra-common-springcloud -- 微服务相关组件引用及配置
│  │  ├─libra-common-swagger -- Swagger+Knife4j整合
│  │  ├─libra-core -- 相关公共工具代码封装
│  ├─libra-gateway -- 网关SpringCloud-Gateway
│  ├─libra-service -- 业务服务父级
│  │  ├─libra-base -- 基础服务【提供用户中心及权限管理】
│  │  ├─libra-gen -- 代码生成服务
│  │  ├─libra-tenant -- 租户服务
```

## Libra-Platform 功能说明

### 租户配置
租户配置包括了两块内容，租户管理和菜单模板。租户管理主要用来创建租户。菜单模板用来配置租户菜单权限模板，此模块的设计主要为了达到不通的租户等级可以配置不通的租户菜单。
#### 租户管理
租户管理功能包括新增、查询、修改、禁用等功能。
- 新增租户时候默认会初始化租户默认部门、默认角色、管理员账号等相关信息（注意：默认的数据在系统是无法操作的，相关的界面及接口都做了判断）
- 特别说明租户编码是作为整个系统数据隔离的重要字段，一旦创建不建议修改，如果要修改需要将相关表的租户字段更新为最新的租户编码，后续作为扩展功能完善

##### 租户列表
![租户列表](./docs/img/tenant-list.png)
##### 新增租户
![新增租户](./docs/img/tenant-add.png)

#### 菜单模板
菜单模板功能包括新增、查询、修改、权限同步等功能。
- 菜单模板修改时候不会将关联此菜单模板的租户权限同步到默认角色里，需要另外操作一下权限同步功能，将此菜单权限同步到租户管理员角色

##### 菜单模板列表
![租户列表](./docs/img/tenant-menu-listt.png)
##### 新增菜单模板
![新增租户](./docs/img/tenant-menu-add.png)


### 组织管理
租户配置包括了员工管理、部门管理、角色管理、岗位管理
#### 员工管理
员工管理功能包括新增、查询、修改、重置密码，删除等功能。
- 新增员工的账号和手机号做为账号的唯一标识，部门和角色为必填

##### 员工管理列表
![租户列表](./docs/img/p-emp-list.png)
##### 新增员工
![新增租户](./docs/img/p-emp-add.png)

#### 部门管理
部门管理功能包括新增、查询、修改、删除等功能。
- 当部门有关联了用户对应的部门是无法删除
- 系统默认部门无法删除，可修改，创建租户时候默认以租户名称创建默认部门
##### 部门管理列表
![租户列表](./docs/img/p-dept-list.png)

#### 角色管理
角色管理功能包括新增、查询、修改、删除等功能。
- 角色组及角色在创建租户时候会默认创建，对应的权限无法编辑及删除
##### 角色管理列表
![租户列表](./docs/img/p-role-list.png)

#### 岗位管理
岗位管理功能包括新增、查询、修改、删除等功能。
##### 岗位管理列表
![租户列表](./docs/img/p-position-list.png)

### 系统设置
系统设置包括了菜单管理、接口管理、版本管理、终端管理、操作日志、登录日志
#### 菜单管理
菜单管理功能包括新增、查询、修改、删除、接口权限配置等功能。
- 接口权限配置是用来做接口管理的接口绑定，后端在验证接口权限鉴权时候使用此关联关联数据做校验。此模块设计初衷，当业务线较为复杂时候很多接口会在不同功能模块调用，此时就可以灵活配置接口权限了

##### 菜单管理列表
![租户列表](./docs/img/system-menu-list.png)
##### 新增菜单
![新增租户](./docs/img/system-menu-add.png)
##### 接口权限配置
![新增租户](./docs/img/system-menu-interface-add.png)

#### 接口管理
接口管理功能包括新增、查询、修改、删除等功能。
##### 接口管理列表
![租户列表](./docs/img/system-interface-list.png)

#### 版本管理
待完善

#### 终端管理
待完善

#### 操作日志
待完善

#### 登录日志
待完善

### 代码生成
待完善

### 系统监控
待完善

## Libra-Platform 数据库设计
待完善



