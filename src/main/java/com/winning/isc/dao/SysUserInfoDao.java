package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysUserInfo;  



import org.springframework.stereotype.Repository;
/**
* @author ISC [Implementation service center]
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-51-30 15:51:22
*/
@Repository
public interface SysUserInfoDao {

    public int insertSysUserInfo(SysUserInfo sysUserInfo) throws DataAccessException;

    public int updateSysUserInfo(SysUserInfo sysUserInfo) throws DataAccessException;

    public int deleteSysUserInfo(SysUserInfo sysUserInfo) throws DataAccessException;

    public SysUserInfo selectSysUserInfo(SysUserInfo sysUserInfo) throws DataAccessException;

    public Object selectSysUserInfoCount(SysUserInfo sysUserInfo) throws DataAccessException;

    public List<SysUserInfo> selectSysUserInfoList(SysUserInfo sysUserInfo) throws DataAccessException;

    public List<SysUserInfo> selectSysUserInfoPageList(SysUserInfo sysUserInfo) throws DataAccessException;
}