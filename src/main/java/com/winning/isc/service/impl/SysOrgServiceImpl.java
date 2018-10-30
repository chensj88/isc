package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysOrg;  

import com.winning.isc.dao.SysOrgDao;  

import com.winning.isc.service.SysOrgService;  


/**
* @author ISC [Implementation service center]
* @title SYS_ORG
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-51-30 15:51:27
*/
@Service
public class SysOrgServiceImpl implements  SysOrgService {

    @Autowired
    private SysOrgDao sysOrgDao;

    public int createSysOrg(SysOrg sysOrg){
        return this.sysOrgDao.insertSysOrg(sysOrg);
    }

    public int modifySysOrg(SysOrg sysOrg){
        return this.sysOrgDao.updateSysOrg(sysOrg);
    }

    public int removeSysOrg(SysOrg sysOrg){
        return this.sysOrgDao.deleteSysOrg(sysOrg);
    }

    public SysOrg getSysOrg(SysOrg sysOrg){
        return this.sysOrgDao.selectSysOrg(sysOrg);
    }

    public int getSysOrgCount(SysOrg sysOrg){
        return (Integer)this.sysOrgDao.selectSysOrgCount(sysOrg);
    }

    public List<SysOrg> getSysOrgList(SysOrg sysOrg){
        return this.sysOrgDao.selectSysOrgList(sysOrg);
    }

    public List<SysOrg> getSysOrgPageList(SysOrg sysOrg){
        return this.sysOrgDao.selectSysOrgPageList(sysOrg);
    }
}