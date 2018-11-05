package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.IscSuggest;

import com.winning.isc.dao.IscSuggestDao;

import com.winning.isc.service.IscSuggestService;


/**
* @author HLHT
* @title ISC_SUGGEST
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:03
*/
@Service
public class IscSuggestServiceImpl implements  IscSuggestService {

    @Autowired
    private IscSuggestDao iscSuggestDao;

    public int createIscSuggest(IscSuggest iscSuggest){
        return this.iscSuggestDao.insertIscSuggest(iscSuggest);
    }

    public int modifyIscSuggest(IscSuggest iscSuggest){
        return this.iscSuggestDao.updateIscSuggest(iscSuggest);
    }

    public int removeIscSuggest(IscSuggest iscSuggest){
        return this.iscSuggestDao.deleteIscSuggest(iscSuggest);
    }

    public IscSuggest getIscSuggest(IscSuggest iscSuggest){
        return this.iscSuggestDao.selectIscSuggest(iscSuggest);
    }

    public int getIscSuggestCount(IscSuggest iscSuggest){
        return (Integer)this.iscSuggestDao.selectIscSuggestCount(iscSuggest);
    }

    public List<IscSuggest> getIscSuggestList(IscSuggest iscSuggest){
        return this.iscSuggestDao.selectIscSuggestList(iscSuggest);
    }

    public List<IscSuggest> getIscSuggestPageList(IscSuggest iscSuggest){
        return this.iscSuggestDao.selectIscSuggestPageList(iscSuggest);
    }
}