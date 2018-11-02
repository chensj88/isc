package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysOrganization;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:25
*/
@Repository
public interface SysOrganizationDao {

    public int insertSysOrganization(SysOrganization sysOrganization) throws DataAccessException;

    public int updateSysOrganization(SysOrganization sysOrganization) throws DataAccessException;

    public int deleteSysOrganization(SysOrganization sysOrganization) throws DataAccessException;

    public SysOrganization selectSysOrganization(SysOrganization sysOrganization) throws DataAccessException;

    public Object selectSysOrganizationCount(SysOrganization sysOrganization) throws DataAccessException;

    public List<SysOrganization> selectSysOrganizationList(SysOrganization sysOrganization) throws DataAccessException;

    public List<SysOrganization> selectSysOrganizationPageList(SysOrganization sysOrganization) throws DataAccessException;
}