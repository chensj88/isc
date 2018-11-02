package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysModule;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:14
*/
@Repository
public interface SysModuleDao {

    public int insertSysModule(SysModule sysModule) throws DataAccessException;

    public int updateSysModule(SysModule sysModule) throws DataAccessException;

    public int deleteSysModule(SysModule sysModule) throws DataAccessException;

    public SysModule selectSysModule(SysModule sysModule) throws DataAccessException;

    public Object selectSysModuleCount(SysModule sysModule) throws DataAccessException;

    public List<SysModule> selectSysModuleList(SysModule sysModule) throws DataAccessException;

    public List<SysModule> selectSysModulePageList(SysModule sysModule) throws DataAccessException;
}