package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.IscFiles;


/**
* @author HLHT
* @title ISC_FILES
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-46-02 09:46:57
*/
public interface IscFilesService {

    public int createIscFiles(IscFiles iscFiles);

    public int modifyIscFiles(IscFiles iscFiles);

    public int removeIscFiles(IscFiles iscFiles);

    public IscFiles getIscFiles(IscFiles iscFiles);

    public int getIscFilesCount(IscFiles iscFiles);

    public List<IscFiles> getIscFilesList(IscFiles iscFiles);

    public List<IscFiles> getIscFilesPageList(IscFiles iscFiles);
}