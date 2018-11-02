package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysModFun;

import com.winning.isc.dao.SysModFunDao;

import com.winning.isc.service.SysModFunService;


/**
* @author HLHT
* @title SYS_MOD_FUN
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:07
*/
@Service
public class SysModFunServiceImpl implements  SysModFunService {

    @Autowired
    private SysModFunDao sysModFunDao;

    public int createSysModFun(SysModFun sysModFun){
        return this.sysModFunDao.insertSysModFun(sysModFun);
    }

    public int modifySysModFun(SysModFun sysModFun){
        return this.sysModFunDao.updateSysModFun(sysModFun);
    }

    public int removeSysModFun(SysModFun sysModFun){
        return this.sysModFunDao.deleteSysModFun(sysModFun);
    }

    public SysModFun getSysModFun(SysModFun sysModFun){
        return this.sysModFunDao.selectSysModFun(sysModFun);
    }

    public int getSysModFunCount(SysModFun sysModFun){
        return (Integer)this.sysModFunDao.selectSysModFunCount(sysModFun);
    }

    public List<SysModFun> getSysModFunList(SysModFun sysModFun){
        return this.sysModFunDao.selectSysModFunList(sysModFun);
    }

    public List<SysModFun> getSysModFunPageList(SysModFun sysModFun){
        return this.sysModFunDao.selectSysModFunPageList(sysModFun);
    }
}