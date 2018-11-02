package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysModFun;


/**
* @author HLHT
* @title SYS_MOD_FUN
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:07
*/
public interface SysModFunService {

    public int createSysModFun(SysModFun sysModFun);

    public int modifySysModFun(SysModFun sysModFun);

    public int removeSysModFun(SysModFun sysModFun);

    public SysModFun getSysModFun(SysModFun sysModFun);

    public int getSysModFunCount(SysModFun sysModFun);

    public List<SysModFun> getSysModFunList(SysModFun sysModFun);

    public List<SysModFun> getSysModFunPageList(SysModFun sysModFun);
}