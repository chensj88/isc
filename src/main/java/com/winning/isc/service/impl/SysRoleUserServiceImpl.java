package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysRoleUser;

import com.winning.isc.dao.SysRoleUserDao;

import com.winning.isc.service.SysRoleUserService;


/**
* @author HLHT
* @title SYS_ROLE_USER
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:26
*/
@Service
public class SysRoleUserServiceImpl implements  SysRoleUserService {

    @Autowired
    private SysRoleUserDao sysRoleUserDao;

    public int createSysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.insertSysRoleUser(sysRoleUser);
    }

    public int modifySysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.updateSysRoleUser(sysRoleUser);
    }

    public int removeSysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.deleteSysRoleUser(sysRoleUser);
    }

    public SysRoleUser getSysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.selectSysRoleUser(sysRoleUser);
    }

    public int getSysRoleUserCount(SysRoleUser sysRoleUser){
        return (Integer)this.sysRoleUserDao.selectSysRoleUserCount(sysRoleUser);
    }

    public List<SysRoleUser> getSysRoleUserList(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.selectSysRoleUserList(sysRoleUser);
    }

    public List<SysRoleUser> getSysRoleUserPageList(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.selectSysRoleUserPageList(sysRoleUser);
    }
}