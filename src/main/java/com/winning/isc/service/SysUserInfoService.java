package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysUserInfo;  


/**
* @author ISC [Implementation service center]
* @title SYS_USER_INFO
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-51-30 15:51:22
*/
public interface SysUserInfoService {

    public int createSysUserInfo(SysUserInfo sysUserInfo);

    public int modifySysUserInfo(SysUserInfo sysUserInfo);

    public int removeSysUserInfo(SysUserInfo sysUserInfo);

    public SysUserInfo getSysUserInfo(SysUserInfo sysUserInfo);

    public int getSysUserInfoCount(SysUserInfo sysUserInfo);

    public List<SysUserInfo> getSysUserInfoList(SysUserInfo sysUserInfo);

    public List<SysUserInfo> getSysUserInfoPageList(SysUserInfo sysUserInfo);
}