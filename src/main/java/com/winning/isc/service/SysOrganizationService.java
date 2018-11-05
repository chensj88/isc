package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysOrganization;


/**
* @author HLHT
* @title SYS_ORGANIZATION
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:25
*/
public interface SysOrganizationService {

    public int createSysOrganization(SysOrganization sysOrganization);

    public int modifySysOrganization(SysOrganization sysOrganization);

    public int removeSysOrganization(SysOrganization sysOrganization);

    public SysOrganization getSysOrganization(SysOrganization sysOrganization);

    public int getSysOrganizationCount(SysOrganization sysOrganization);

    public List<SysOrganization> getSysOrganizationList(SysOrganization sysOrganization);

    public List<SysOrganization> getSysOrganizationPageList(SysOrganization sysOrganization);
}