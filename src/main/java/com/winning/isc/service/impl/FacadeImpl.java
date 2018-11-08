package com.winning.isc.service.impl;

import com.winning.isc.service.*;
import com.winning.isc.ws.service.PmisWebServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chensj
 * @title FacadeImpl
 * @email chensj@winning.com.cn
 * @package com.winning.isc.service.impl;
 * @date 2018-05-23 09:05:16
 */
@Component
public class FacadeImpl implements Facade {

    @Autowired
    private PmisWebServiceClient pmisWebServiceClient;
    @Autowired
    private SysUserInfoService sysUserInfoService;
    @Autowired
    private SysOrgService sysOrgService;
    @Autowired
    private SysOrgExtService sysOrgExtService;
    @Autowired
    private SysRoleUserService sysRoleUserService;
    @Autowired
    private SysModuleService sysModuleService;
    @Autowired
    private SysModPopedomService sysModPopedomService;
    @Autowired
    private ZTreeNodeService zTreeNodeService;
    @Autowired
    private SysRoleInfoService sysRoleInfoService;

    @Override
    public PmisWebServiceClient getPmisWebServiceClient() {
        return pmisWebServiceClient;
    }

    @Override
    public SysUserInfoService getSysUserInfoService() {
        return sysUserInfoService;
    }

    @Override
    public SysOrgService getSysOrgService() {
        return sysOrgService;
    }

    @Override
    public SysOrgExtService getSysOrgExtService() {
        return sysOrgExtService;
    }

    @Override
    public SysRoleUserService getSysRoleUserService() {
        return sysRoleUserService;
    }

    @Override
    public SysModuleService getSysModuleService() {
        return sysModuleService;
    }

    @Override
    public SysModPopedomService getSysModPopedomService() {
        return sysModPopedomService;
    }

    @Override
    public ZTreeNodeService getZTreeNodeService() {
        return zTreeNodeService;
    }

    @Override
    public SysRoleInfoService getSysRoleInfoService() {
        return sysRoleInfoService;
    }


}