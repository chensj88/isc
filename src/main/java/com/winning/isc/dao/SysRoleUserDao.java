package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysRoleUser;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:26
*/
@Repository
public interface SysRoleUserDao {

    public int insertSysRoleUser(SysRoleUser sysRoleUser) throws DataAccessException;

    public int updateSysRoleUser(SysRoleUser sysRoleUser) throws DataAccessException;

    public int deleteSysRoleUser(SysRoleUser sysRoleUser) throws DataAccessException;

    public SysRoleUser selectSysRoleUser(SysRoleUser sysRoleUser) throws DataAccessException;

    public Object selectSysRoleUserCount(SysRoleUser sysRoleUser) throws DataAccessException;

    public List<SysRoleUser> selectSysRoleUserList(SysRoleUser sysRoleUser) throws DataAccessException;

    public List<SysRoleUser> selectSysRoleUserPageList(SysRoleUser sysRoleUser) throws DataAccessException;
}