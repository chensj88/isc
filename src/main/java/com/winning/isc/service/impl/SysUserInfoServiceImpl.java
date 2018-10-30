package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysUserInfo;  

import com.winning.isc.dao.SysUserInfoDao;  

import com.winning.isc.service.SysUserInfoService;  


/**
* @author ISC [Implementation service center]
* @title SYS_USER_INFO
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-51-30 15:51:22
*/
@Service
public class SysUserInfoServiceImpl implements  SysUserInfoService {

    @Autowired
    private SysUserInfoDao sysUserInfoDao;

    public int createSysUserInfo(SysUserInfo sysUserInfo){
        return this.sysUserInfoDao.insertSysUserInfo(sysUserInfo);
    }

    public int modifySysUserInfo(SysUserInfo sysUserInfo){
        return this.sysUserInfoDao.updateSysUserInfo(sysUserInfo);
    }

    public int removeSysUserInfo(SysUserInfo sysUserInfo){
        return this.sysUserInfoDao.deleteSysUserInfo(sysUserInfo);
    }

    public SysUserInfo getSysUserInfo(SysUserInfo sysUserInfo){
        return this.sysUserInfoDao.selectSysUserInfo(sysUserInfo);
    }

    public int getSysUserInfoCount(SysUserInfo sysUserInfo){
        return (Integer)this.sysUserInfoDao.selectSysUserInfoCount(sysUserInfo);
    }

    public List<SysUserInfo> getSysUserInfoList(SysUserInfo sysUserInfo){
        return this.sysUserInfoDao.selectSysUserInfoList(sysUserInfo);
    }

    public List<SysUserInfo> getSysUserInfoPageList(SysUserInfo sysUserInfo){
        return this.sysUserInfoDao.selectSysUserInfoPageList(sysUserInfo);
    }
}