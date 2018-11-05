package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysRoleUser;


/**
* @author HLHT
* @title SYS_ROLE_USER
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:26
*/
public interface SysRoleUserService {

    public int createSysRoleUser(SysRoleUser sysRoleUser);

    public int modifySysRoleUser(SysRoleUser sysRoleUser);

    public int removeSysRoleUser(SysRoleUser sysRoleUser);

    public SysRoleUser getSysRoleUser(SysRoleUser sysRoleUser);

    public int getSysRoleUserCount(SysRoleUser sysRoleUser);

    public List<SysRoleUser> getSysRoleUserList(SysRoleUser sysRoleUser);

    public List<SysRoleUser> getSysRoleUserPageList(SysRoleUser sysRoleUser);
}