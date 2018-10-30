package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysOrg;  



import org.springframework.stereotype.Repository;
/**
* @author ISC [Implementation service center]
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-51-30 15:51:27
*/
@Repository
public interface SysOrgDao {

    public int insertSysOrg(SysOrg sysOrg) throws DataAccessException;

    public int updateSysOrg(SysOrg sysOrg) throws DataAccessException;

    public int deleteSysOrg(SysOrg sysOrg) throws DataAccessException;

    public SysOrg selectSysOrg(SysOrg sysOrg) throws DataAccessException;

    public Object selectSysOrgCount(SysOrg sysOrg) throws DataAccessException;

    public List<SysOrg> selectSysOrgList(SysOrg sysOrg) throws DataAccessException;

    public List<SysOrg> selectSysOrgPageList(SysOrg sysOrg) throws DataAccessException;
}