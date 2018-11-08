package com.winning.isc.service;

import com.winning.isc.ws.service.PmisWebServiceClient;

/**
* @author chensj
* @title Facade
* @email chensj@winning.com.cn
* @package com.winning.isc.service;
* @date 2018-05-23 09:05:16
*/
public interface Facade {

    PmisWebServiceClient getPmisWebServiceClient();

    SysUserInfoService getSysUserInfoService();

    SysOrgService getSysOrgService();

    SysOrgExtService getSysOrgExtService();

    SysRoleUserService getSysRoleUserService();

    SysModuleService getSysModuleService();

    SysModPopedomService getSysModPopedomService();

    ZTreeNodeService getZTreeNodeService();

    SysRoleInfoService getSysRoleInfoService();
}