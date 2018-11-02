package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.IscFiles;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-46-02 09:46:57
*/
@Repository
public interface IscFilesDao {

    public int insertIscFiles(IscFiles iscFiles) throws DataAccessException;

    public int updateIscFiles(IscFiles iscFiles) throws DataAccessException;

    public int deleteIscFiles(IscFiles iscFiles) throws DataAccessException;

    public IscFiles selectIscFiles(IscFiles iscFiles) throws DataAccessException;

    public Object selectIscFilesCount(IscFiles iscFiles) throws DataAccessException;

    public List<IscFiles> selectIscFilesList(IscFiles iscFiles) throws DataAccessException;

    public List<IscFiles> selectIscFilesPageList(IscFiles iscFiles) throws DataAccessException;
}