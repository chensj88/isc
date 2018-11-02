package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysModPopedom;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:09
*/
@Repository
public interface SysModPopedomDao {

    public int insertSysModPopedom(SysModPopedom sysModPopedom) throws DataAccessException;

    public int updateSysModPopedom(SysModPopedom sysModPopedom) throws DataAccessException;

    public int deleteSysModPopedom(SysModPopedom sysModPopedom) throws DataAccessException;

    public SysModPopedom selectSysModPopedom(SysModPopedom sysModPopedom) throws DataAccessException;

    public Object selectSysModPopedomCount(SysModPopedom sysModPopedom) throws DataAccessException;

    public List<SysModPopedom> selectSysModPopedomList(SysModPopedom sysModPopedom) throws DataAccessException;

    public List<SysModPopedom> selectSysModPopedomPageList(SysModPopedom sysModPopedom) throws DataAccessException;
}