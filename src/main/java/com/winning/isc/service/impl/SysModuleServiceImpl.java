package com.winning.isc.service.impl;

import com.winning.isc.base.Constants;
import com.winning.isc.model.SysRoleInfo;
import com.winning.isc.model.support.NodeTree;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import com.winning.isc.model.SysModule;

import com.winning.isc.dao.SysModuleDao;

import com.winning.isc.service.SysModuleService;


/**
* @author HLHT
* @title SYS_MODULE
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:14
*/
@Service
public class SysModuleServiceImpl implements  SysModuleService {

    @Autowired
    private SysModuleDao sysModuleDao;

    public int createSysModule(SysModule sysModule){
        return this.sysModuleDao.insertSysModule(sysModule);
    }

    public int modifySysModule(SysModule sysModule){
        return this.sysModuleDao.updateSysModule(sysModule);
    }

    public int removeSysModule(SysModule sysModule){
        return this.sysModuleDao.deleteSysModule(sysModule);
    }

    public SysModule getSysModule(SysModule sysModule){
        return this.sysModuleDao.selectSysModule(sysModule);
    }

    public int getSysModuleCount(SysModule sysModule){
        return (Integer)this.sysModuleDao.selectSysModuleCount(sysModule);
    }

    public List<SysModule> getSysModuleList(SysModule sysModule){
        return this.sysModuleDao.selectSysModuleList(sysModule);
    }

    public List<SysModule> getSysModulePageList(SysModule sysModule){
        return this.sysModuleDao.selectSysModulePageList(sysModule);
    }

    @Override
    public Set<String> getBtnModuleListByModuleURL(SysModule module) {
        List<String> allBtnList = sysModuleDao.selectBtnModuleListByModuleURL(module);
        Set<String> allBtnSet = new HashSet<>();
        allBtnSet.addAll(allBtnList);
        return allBtnSet;
    }

    @Override
    public List<NodeTree> getSysModuleNodeTree(SysModule module) {
        module.setIsDel(Constants.STATUS_UNUSE);
        module.setModLevel(1);
        List<SysModule> moduleList = this.sysModuleDao.selectSysModuleDaoListForName(module);
        List<NodeTree> moduleTree = new ArrayList<NodeTree>();
        for (SysModule sysModule : moduleList) {
            NodeTree node = new NodeTree();
            node.setId(sysModule.getModId());
            node.setNodeId(sysModule.getModId());
            node.setText(sysModule.getModName());
            node.setNodes(getChildNode(sysModule.getModId()));
            moduleTree.add(node);
        }
        return moduleTree;
    }



    private List<NodeTree> getChildNode(Long modId) {
        SysModule module = new SysModule();
        module.setParId(modId);
        module.setIsDel(0);
        List<NodeTree> moduleTree = new ArrayList<NodeTree>();
        List<SysModule> moduleList = this.sysModuleDao.selectSysModuleList(module);
        for (SysModule sysModule : moduleList) {
            moduleTree.add(sysModule.getNodeTree());
        }
        return moduleTree;
    }

}