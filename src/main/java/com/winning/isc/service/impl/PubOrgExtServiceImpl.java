package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.PubOrgExt;  

import com.winning.isc.dao.PubOrgExtDao;  

import com.winning.isc.service.PubOrgExtService;  


/**
* @author ISC [Implementation service center]
* @title PUB_ORG_EXT
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-12-29 16:12:54
*/
@Service
public class PubOrgExtServiceImpl implements  PubOrgExtService {

    @Autowired
    private PubOrgExtDao pubOrgExtDao;

    public int createPubOrgExt(PubOrgExt pubOrgExt){
        return this.pubOrgExtDao.insertPubOrgExt(pubOrgExt);
    }

    public int modifyPubOrgExt(PubOrgExt pubOrgExt){
        return this.pubOrgExtDao.updatePubOrgExt(pubOrgExt);
    }

    public int removePubOrgExt(PubOrgExt pubOrgExt){
        return this.pubOrgExtDao.deletePubOrgExt(pubOrgExt);
    }

    public PubOrgExt getPubOrgExt(PubOrgExt pubOrgExt){
        return this.pubOrgExtDao.selectPubOrgExt(pubOrgExt);
    }

    public int getPubOrgExtCount(PubOrgExt pubOrgExt){
        return (Integer)this.pubOrgExtDao.selectPubOrgExtCount(pubOrgExt);
    }

    public List<PubOrgExt> getPubOrgExtList(PubOrgExt pubOrgExt){
        return this.pubOrgExtDao.selectPubOrgExtList(pubOrgExt);
    }

    public List<PubOrgExt> getPubOrgExtPageList(PubOrgExt pubOrgExt){
        return this.pubOrgExtDao.selectPubOrgExtPageList(pubOrgExt);
    }

    @Override
    public void createPubOrgExtByProc(PubOrgExt pubOrgExt) {
        this.pubOrgExtDao.insertPubOrgExtByProc(null);
    }
}