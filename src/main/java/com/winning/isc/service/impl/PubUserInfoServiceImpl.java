package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.PubUserInfo;  

import com.winning.isc.dao.PubUserInfoDao;  

import com.winning.isc.service.PubUserInfoService;  


/**
* @author ISC [Implementation service center]
* @title PUB_USER_INFO
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-12-29 16:12:50
*/
@Service
public class PubUserInfoServiceImpl implements  PubUserInfoService {

    @Autowired
    private PubUserInfoDao pubUserInfoDao;

    public int createPubUserInfo(PubUserInfo pubUserInfo){
        return this.pubUserInfoDao.insertPubUserInfo(pubUserInfo);
    }

    public int modifyPubUserInfo(PubUserInfo pubUserInfo){
        return this.pubUserInfoDao.updatePubUserInfo(pubUserInfo);
    }

    public int removePubUserInfo(PubUserInfo pubUserInfo){
        return this.pubUserInfoDao.deletePubUserInfo(pubUserInfo);
    }

    public PubUserInfo getPubUserInfo(PubUserInfo pubUserInfo){
        return this.pubUserInfoDao.selectPubUserInfo(pubUserInfo);
    }

    public int getPubUserInfoCount(PubUserInfo pubUserInfo){
        return (Integer)this.pubUserInfoDao.selectPubUserInfoCount(pubUserInfo);
    }

    public List<PubUserInfo> getPubUserInfoList(PubUserInfo pubUserInfo){
        return this.pubUserInfoDao.selectPubUserInfoList(pubUserInfo);
    }

    public List<PubUserInfo> getPubUserInfoPageList(PubUserInfo pubUserInfo){
        return this.pubUserInfoDao.selectPubUserInfoPageList(pubUserInfo);
    }
}