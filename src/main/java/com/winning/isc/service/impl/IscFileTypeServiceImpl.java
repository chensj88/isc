package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.IscFileType;  

import com.winning.isc.dao.IscFileTypeDao;  

import com.winning.isc.service.IscFileTypeService;  


/**
* @author ISC
* @title ISC_FILE_TYPE
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-29-08 17:29:53
*/
@Service
public class IscFileTypeServiceImpl implements  IscFileTypeService {

    @Autowired
    private IscFileTypeDao iscFileTypeDao;

    public int createIscFileType(IscFileType iscFileType){
        return this.iscFileTypeDao.insertIscFileType(iscFileType);
    }

    public int modifyIscFileType(IscFileType iscFileType){
        return this.iscFileTypeDao.updateIscFileType(iscFileType);
    }

    public int removeIscFileType(IscFileType iscFileType){
        return this.iscFileTypeDao.deleteIscFileType(iscFileType);
    }

    public IscFileType getIscFileType(IscFileType iscFileType){
        return this.iscFileTypeDao.selectIscFileType(iscFileType);
    }

    public int getIscFileTypeCount(IscFileType iscFileType){
        return (Integer)this.iscFileTypeDao.selectIscFileTypeCount(iscFileType);
    }

    public List<IscFileType> getIscFileTypeList(IscFileType iscFileType){
        return this.iscFileTypeDao.selectIscFileTypeList(iscFileType);
    }

    public List<IscFileType> getIscFileTypePageList(IscFileType iscFileType){
        return this.iscFileTypeDao.selectIscFileTypePageList(iscFileType);
    }
}