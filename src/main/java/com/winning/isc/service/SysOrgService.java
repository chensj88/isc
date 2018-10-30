package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysOrg;  


/**
* @author ISC [Implementation service center]
* @title SYS_ORG
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-51-30 15:51:27
*/
public interface SysOrgService {

    public int createSysOrg(SysOrg sysOrg);

    public int modifySysOrg(SysOrg sysOrg);

    public int removeSysOrg(SysOrg sysOrg);

    public SysOrg getSysOrg(SysOrg sysOrg);

    public int getSysOrgCount(SysOrg sysOrg);

    public List<SysOrg> getSysOrgList(SysOrg sysOrg);

    public List<SysOrg> getSysOrgPageList(SysOrg sysOrg);
}