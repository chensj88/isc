package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysOrgExt;  


/**
* @author ISC [Implementation service center]
* @title SYS_ORG_EXT
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-51-30 15:51:29
*/
public interface SysOrgExtService {

    public int createSysOrgExt(SysOrgExt sysOrgExt);

    public int modifySysOrgExt(SysOrgExt sysOrgExt);

    public int removeSysOrgExt(SysOrgExt sysOrgExt);

    public SysOrgExt getSysOrgExt(SysOrgExt sysOrgExt);

    public int getSysOrgExtCount(SysOrgExt sysOrgExt);

    public List<SysOrgExt> getSysOrgExtList(SysOrgExt sysOrgExt);

    public List<SysOrgExt> getSysOrgExtPageList(SysOrgExt sysOrgExt);

    void createSysOrgExtByProc(SysOrgExt sysOrgExt);
}