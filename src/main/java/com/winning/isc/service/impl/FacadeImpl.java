package com.winning.isc.service.impl;

import com.winning.isc.service.Facade;
import com.winning.isc.service.SysOrgExtService;
import com.winning.isc.service.SysOrgService;
import com.winning.isc.service.SysUserInfoService;
import com.winning.isc.ws.service.PmisWebServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chensj
 * @title FacadeImpl
 * @email chensj@winning.com.cn
 * @package com.winning.hic.service.impl;
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


}