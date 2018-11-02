package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysModule;


/**
* @author HLHT
* @title SYS_MODULE
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:14
*/
public interface SysModuleService {

    public int createSysModule(SysModule sysModule);

    public int modifySysModule(SysModule sysModule);

    public int removeSysModule(SysModule sysModule);

    public SysModule getSysModule(SysModule sysModule);

    public int getSysModuleCount(SysModule sysModule);

    public List<SysModule> getSysModuleList(SysModule sysModule);

    public List<SysModule> getSysModulePageList(SysModule sysModule);
}