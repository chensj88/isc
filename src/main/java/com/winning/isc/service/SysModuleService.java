package com.winning.isc.service;

import java.util.List;
import java.util.Set;

import com.winning.isc.model.SysModule;
import com.winning.isc.model.SysRoleInfo;
import com.winning.isc.model.support.NodeTree;


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

    Set<String> getBtnModuleListByModuleURL(SysModule module);

    List<NodeTree> getSysModuleNodeTree(SysModule module);
}