package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysRoleInfo;
import com.winning.isc.model.support.NodeTree;


/**
* @author HLHT
* @title SYS_ROLE_INFO
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:28
*/
public interface SysRoleInfoService {

    public int createSysRoleInfo(SysRoleInfo sysRoleInfo);

    public int modifySysRoleInfo(SysRoleInfo sysRoleInfo);

    public int removeSysRoleInfo(SysRoleInfo sysRoleInfo);

    public SysRoleInfo getSysRoleInfo(SysRoleInfo sysRoleInfo);

    public int getSysRoleInfoCount(SysRoleInfo sysRoleInfo);

    public List<SysRoleInfo> getSysRoleInfoList(SysRoleInfo sysRoleInfo);

    public List<SysRoleInfo> getSysRoleInfoPageList(SysRoleInfo sysRoleInfo);

    List<NodeTree> getRoleInfoTree(String roleName);
}