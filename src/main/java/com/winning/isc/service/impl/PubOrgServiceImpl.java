package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.PubOrg;  

import com.winning.isc.dao.PubOrgDao;  

import com.winning.isc.service.PubOrgService;  


/**
* @author ISC [Implementation service center]
* @title PUB_ORG
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-12-29 16:12:53
*/
@Service
public class PubOrgServiceImpl implements  PubOrgService {

    @Autowired
    private PubOrgDao pubOrgDao;

    public int createPubOrg(PubOrg pubOrg){
        return this.pubOrgDao.insertPubOrg(pubOrg);
    }

    public int modifyPubOrg(PubOrg pubOrg){
        return this.pubOrgDao.updatePubOrg(pubOrg);
    }

    public int removePubOrg(PubOrg pubOrg){
        return this.pubOrgDao.deletePubOrg(pubOrg);
    }

    public PubOrg getPubOrg(PubOrg pubOrg){
        return this.pubOrgDao.selectPubOrg(pubOrg);
    }

    public int getPubOrgCount(PubOrg pubOrg){
        return (Integer)this.pubOrgDao.selectPubOrgCount(pubOrg);
    }

    public List<PubOrg> getPubOrgList(PubOrg pubOrg){
        return this.pubOrgDao.selectPubOrgList(pubOrg);
    }

    public List<PubOrg> getPubOrgPageList(PubOrg pubOrg){
        return this.pubOrgDao.selectPubOrgPageList(pubOrg);
    }
}