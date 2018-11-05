package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysFun;

import com.winning.isc.dao.SysFunDao;

import com.winning.isc.service.SysFunService;


/**
* @author HLHT
* @title SYS_FUN
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:06
*/
@Service
public class SysFunServiceImpl implements  SysFunService {

    @Autowired
    private SysFunDao sysFunDao;

    public int createSysFun(SysFun sysFun){
        return this.sysFunDao.insertSysFun(sysFun);
    }

    public int modifySysFun(SysFun sysFun){
        return this.sysFunDao.updateSysFun(sysFun);
    }

    public int removeSysFun(SysFun sysFun){
        return this.sysFunDao.deleteSysFun(sysFun);
    }

    public SysFun getSysFun(SysFun sysFun){
        return this.sysFunDao.selectSysFun(sysFun);
    }

    public int getSysFunCount(SysFun sysFun){
        return (Integer)this.sysFunDao.selectSysFunCount(sysFun);
    }

    public List<SysFun> getSysFunList(SysFun sysFun){
        return this.sysFunDao.selectSysFunList(sysFun);
    }

    public List<SysFun> getSysFunPageList(SysFun sysFun){
        return this.sysFunDao.selectSysFunPageList(sysFun);
    }
}