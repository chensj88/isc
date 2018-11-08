package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.SysDictInfo;  

import com.winning.isc.dao.SysDictInfoDao;  

import com.winning.isc.service.SysDictInfoService;  


/**
* @author ISC
* @title SYS_DICT_INFO
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-21-08 09:21:42
*/
@Service
public class SysDictInfoServiceImpl implements  SysDictInfoService {

    @Autowired
    private SysDictInfoDao sysDictInfoDao;

    public int createSysDictInfo(SysDictInfo sysDictInfo){
        return this.sysDictInfoDao.insertSysDictInfo(sysDictInfo);
    }

    public int modifySysDictInfo(SysDictInfo sysDictInfo){
        return this.sysDictInfoDao.updateSysDictInfo(sysDictInfo);
    }

    public int removeSysDictInfo(SysDictInfo sysDictInfo){
        return this.sysDictInfoDao.deleteSysDictInfo(sysDictInfo);
    }

    public SysDictInfo getSysDictInfo(SysDictInfo sysDictInfo){
        return this.sysDictInfoDao.selectSysDictInfo(sysDictInfo);
    }

    public int getSysDictInfoCount(SysDictInfo sysDictInfo){
        return (Integer)this.sysDictInfoDao.selectSysDictInfoCount(sysDictInfo);
    }

    public List<SysDictInfo> getSysDictInfoList(SysDictInfo sysDictInfo){
        return this.sysDictInfoDao.selectSysDictInfoList(sysDictInfo);
    }

    public List<SysDictInfo> getSysDictInfoPageList(SysDictInfo sysDictInfo){
        return this.sysDictInfoDao.selectSysDictInfoPageList(sysDictInfo);
    }
}