package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.IscTools;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-46-02 09:46:47
*/
@Repository
public interface IscToolsDao {

    public int insertIscTools(IscTools iscTools) throws DataAccessException;

    public int updateIscTools(IscTools iscTools) throws DataAccessException;

    public int deleteIscTools(IscTools iscTools) throws DataAccessException;

    public IscTools selectIscTools(IscTools iscTools) throws DataAccessException;

    public Object selectIscToolsCount(IscTools iscTools) throws DataAccessException;

    public List<IscTools> selectIscToolsList(IscTools iscTools) throws DataAccessException;

    public List<IscTools> selectIscToolsPageList(IscTools iscTools) throws DataAccessException;
}