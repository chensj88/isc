package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.IscFileType;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-29-08 17:29:53
*/
@Repository
public interface IscFileTypeDao {

    public int insertIscFileType(IscFileType iscFileType) throws DataAccessException;

    public int updateIscFileType(IscFileType iscFileType) throws DataAccessException;

    public int deleteIscFileType(IscFileType iscFileType) throws DataAccessException;

    public IscFileType selectIscFileType(IscFileType iscFileType) throws DataAccessException;

    public Object selectIscFileTypeCount(IscFileType iscFileType) throws DataAccessException;

    public List<IscFileType> selectIscFileTypeList(IscFileType iscFileType) throws DataAccessException;

    public List<IscFileType> selectIscFileTypePageList(IscFileType iscFileType) throws DataAccessException;
}