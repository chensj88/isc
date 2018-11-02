package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.IscFiles;

import com.winning.isc.dao.IscFilesDao;

import com.winning.isc.service.IscFilesService;


/**
* @author HLHT
* @title ISC_FILES
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-46-02 09:46:57
*/
@Service
public class IscFilesServiceImpl implements  IscFilesService {

    @Autowired
    private IscFilesDao iscFilesDao;

    public int createIscFiles(IscFiles iscFiles){
        return this.iscFilesDao.insertIscFiles(iscFiles);
    }

    public int modifyIscFiles(IscFiles iscFiles){
        return this.iscFilesDao.updateIscFiles(iscFiles);
    }

    public int removeIscFiles(IscFiles iscFiles){
        return this.iscFilesDao.deleteIscFiles(iscFiles);
    }

    public IscFiles getIscFiles(IscFiles iscFiles){
        return this.iscFilesDao.selectIscFiles(iscFiles);
    }

    public int getIscFilesCount(IscFiles iscFiles){
        return (Integer)this.iscFilesDao.selectIscFilesCount(iscFiles);
    }

    public List<IscFiles> getIscFilesList(IscFiles iscFiles){
        return this.iscFilesDao.selectIscFilesList(iscFiles);
    }

    public List<IscFiles> getIscFilesPageList(IscFiles iscFiles){
        return this.iscFilesDao.selectIscFilesPageList(iscFiles);
    }
}