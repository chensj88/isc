package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.IscTools;

import com.winning.isc.dao.IscToolsDao;

import com.winning.isc.service.IscToolsService;


/**
* @author HLHT
* @title ISC_TOOLS
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-46-02 09:46:47
*/
@Service
public class IscToolsServiceImpl implements  IscToolsService {

    @Autowired
    private IscToolsDao iscToolsDao;

    public int createIscTools(IscTools iscTools){
        return this.iscToolsDao.insertIscTools(iscTools);
    }

    public int modifyIscTools(IscTools iscTools){
        return this.iscToolsDao.updateIscTools(iscTools);
    }

    public int removeIscTools(IscTools iscTools){
        return this.iscToolsDao.deleteIscTools(iscTools);
    }

    public IscTools getIscTools(IscTools iscTools){
        return this.iscToolsDao.selectIscTools(iscTools);
    }

    public int getIscToolsCount(IscTools iscTools){
        return (Integer)this.iscToolsDao.selectIscToolsCount(iscTools);
    }

    public List<IscTools> getIscToolsList(IscTools iscTools){
        return this.iscToolsDao.selectIscToolsList(iscTools);
    }

    public List<IscTools> getIscToolsPageList(IscTools iscTools){
        return this.iscToolsDao.selectIscToolsPageList(iscTools);
    }
}