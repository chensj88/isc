package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

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
}