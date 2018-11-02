package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysOrganization;

import com.winning.isc.dao.SysOrganizationDao;

import com.winning.isc.service.SysOrganizationService;


/**
* @author HLHT
* @title SYS_ORGANIZATION
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:25
*/
@Service
public class SysOrganizationServiceImpl implements  SysOrganizationService {

    @Autowired
    private SysOrganizationDao sysOrganizationDao;

    public int createSysOrganization(SysOrganization sysOrganization){
        return this.sysOrganizationDao.insertSysOrganization(sysOrganization);
    }

    public int modifySysOrganization(SysOrganization sysOrganization){
        return this.sysOrganizationDao.updateSysOrganization(sysOrganization);
    }

    public int removeSysOrganization(SysOrganization sysOrganization){
        return this.sysOrganizationDao.deleteSysOrganization(sysOrganization);
    }

    public SysOrganization getSysOrganization(SysOrganization sysOrganization){
        return this.sysOrganizationDao.selectSysOrganization(sysOrganization);
    }

    public int getSysOrganizationCount(SysOrganization sysOrganization){
        return (Integer)this.sysOrganizationDao.selectSysOrganizationCount(sysOrganization);
    }

    public List<SysOrganization> getSysOrganizationList(SysOrganization sysOrganization){
        return this.sysOrganizationDao.selectSysOrganizationList(sysOrganization);
    }

    public List<SysOrganization> getSysOrganizationPageList(SysOrganization sysOrganization){
        return this.sysOrganizationDao.selectSysOrganizationPageList(sysOrganization);
    }
}