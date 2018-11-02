package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysModPopedom;

import com.winning.isc.dao.SysModPopedomDao;

import com.winning.isc.service.SysModPopedomService;


/**
* @author HLHT
* @title SYS_MOD_POPEDOM
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:09
*/
@Service
public class SysModPopedomServiceImpl implements  SysModPopedomService {

    @Autowired
    private SysModPopedomDao sysModPopedomDao;

    public int createSysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.insertSysModPopedom(sysModPopedom);
    }

    public int modifySysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.updateSysModPopedom(sysModPopedom);
    }

    public int removeSysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.deleteSysModPopedom(sysModPopedom);
    }

    public SysModPopedom getSysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.selectSysModPopedom(sysModPopedom);
    }

    public int getSysModPopedomCount(SysModPopedom sysModPopedom){
        return (Integer)this.sysModPopedomDao.selectSysModPopedomCount(sysModPopedom);
    }

    public List<SysModPopedom> getSysModPopedomList(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.selectSysModPopedomList(sysModPopedom);
    }

    public List<SysModPopedom> getSysModPopedomPageList(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.selectSysModPopedomPageList(sysModPopedom);
    }
}