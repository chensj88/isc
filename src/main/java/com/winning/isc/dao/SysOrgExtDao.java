package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysOrgExt;  



import org.springframework.stereotype.Repository;
/**
* @author ISC [Implementation service center]
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-51-30 15:51:29
*/
@Repository
public interface SysOrgExtDao {

    public int insertSysOrgExt(SysOrgExt sysOrgExt) throws DataAccessException;

    public int updateSysOrgExt(SysOrgExt sysOrgExt) throws DataAccessException;

    public int deleteSysOrgExt(SysOrgExt sysOrgExt) throws DataAccessException;

    public SysOrgExt selectSysOrgExt(SysOrgExt sysOrgExt) throws DataAccessException;

    public Object selectSysOrgExtCount(SysOrgExt sysOrgExt) throws DataAccessException;

    public List<SysOrgExt> selectSysOrgExtList(SysOrgExt sysOrgExt) throws DataAccessException;

    public List<SysOrgExt> selectSysOrgExtPageList(SysOrgExt sysOrgExt) throws DataAccessException;

    public void insertSysOrgExtByProc(SysOrgExt pubOrgExt) throws DataAccessException;
}