package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysOrgExt;  

import com.winning.isc.dao.SysOrgExtDao;  

import com.winning.isc.service.SysOrgExtService;  


/**
* @author ISC [Implementation service center]
* @title SYS_ORG_EXT
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-51-30 15:51:29
*/
@Service
public class SysOrgExtServiceImpl implements  SysOrgExtService {

    @Autowired
    private SysOrgExtDao sysOrgExtDao;

    public int createSysOrgExt(SysOrgExt sysOrgExt){
        return this.sysOrgExtDao.insertSysOrgExt(sysOrgExt);
    }

    public int modifySysOrgExt(SysOrgExt sysOrgExt){
        return this.sysOrgExtDao.updateSysOrgExt(sysOrgExt);
    }

    public int removeSysOrgExt(SysOrgExt sysOrgExt){
        return this.sysOrgExtDao.deleteSysOrgExt(sysOrgExt);
    }

    public SysOrgExt getSysOrgExt(SysOrgExt sysOrgExt){
        return this.sysOrgExtDao.selectSysOrgExt(sysOrgExt);
    }

    public int getSysOrgExtCount(SysOrgExt sysOrgExt){
        return (Integer)this.sysOrgExtDao.selectSysOrgExtCount(sysOrgExt);
    }

    public List<SysOrgExt> getSysOrgExtList(SysOrgExt sysOrgExt){
        return this.sysOrgExtDao.selectSysOrgExtList(sysOrgExt);
    }

    public List<SysOrgExt> getSysOrgExtPageList(SysOrgExt sysOrgExt){
        return this.sysOrgExtDao.selectSysOrgExtPageList(sysOrgExt);
    }

    @Override
    public void createSysOrgExtByProc(SysOrgExt sysOrgExt) {
        this.sysOrgExtDao.insertSysOrgExtByProc(sysOrgExt);
    }
}