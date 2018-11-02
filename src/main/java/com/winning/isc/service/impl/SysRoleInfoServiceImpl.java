package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysRoleInfo;

import com.winning.isc.dao.SysRoleInfoDao;

import com.winning.isc.service.SysRoleInfoService;


/**
* @author HLHT
* @title SYS_ROLE_INFO
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:28
*/
@Service
public class SysRoleInfoServiceImpl implements  SysRoleInfoService {

    @Autowired
    private SysRoleInfoDao sysRoleInfoDao;

    public int createSysRoleInfo(SysRoleInfo sysRoleInfo){
        return this.sysRoleInfoDao.insertSysRoleInfo(sysRoleInfo);
    }

    public int modifySysRoleInfo(SysRoleInfo sysRoleInfo){
        return this.sysRoleInfoDao.updateSysRoleInfo(sysRoleInfo);
    }

    public int removeSysRoleInfo(SysRoleInfo sysRoleInfo){
        return this.sysRoleInfoDao.deleteSysRoleInfo(sysRoleInfo);
    }

    public SysRoleInfo getSysRoleInfo(SysRoleInfo sysRoleInfo){
        return this.sysRoleInfoDao.selectSysRoleInfo(sysRoleInfo);
    }

    public int getSysRoleInfoCount(SysRoleInfo sysRoleInfo){
        return (Integer)this.sysRoleInfoDao.selectSysRoleInfoCount(sysRoleInfo);
    }

    public List<SysRoleInfo> getSysRoleInfoList(SysRoleInfo sysRoleInfo){
        return this.sysRoleInfoDao.selectSysRoleInfoList(sysRoleInfo);
    }

    public List<SysRoleInfo> getSysRoleInfoPageList(SysRoleInfo sysRoleInfo){
        return this.sysRoleInfoDao.selectSysRoleInfoPageList(sysRoleInfo);
    }
}