package com.winning.isc.dao;



import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import com.winning.isc.model.SysRoleInfo;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:28
*/
@Repository
public interface SysRoleInfoDao {

    public int insertSysRoleInfo(SysRoleInfo sysRoleInfo) throws DataAccessException;

    public int updateSysRoleInfo(SysRoleInfo sysRoleInfo) throws DataAccessException;

    public int deleteSysRoleInfo(SysRoleInfo sysRoleInfo) throws DataAccessException;

    public SysRoleInfo selectSysRoleInfo(SysRoleInfo sysRoleInfo) throws DataAccessException;

    public Object selectSysRoleInfoCount(SysRoleInfo sysRoleInfo) throws DataAccessException;

    public List<SysRoleInfo> selectSysRoleInfoList(SysRoleInfo sysRoleInfo) throws DataAccessException;

    public List<SysRoleInfo> selectSysRoleInfoPageList(SysRoleInfo sysRoleInfo) throws DataAccessException;

    List<SysRoleInfo> selectSysRoleInfoListForName(SysRoleInfo roleInfo);

    Set<String> listUserRolesByUserId(@Param(value="userId")String userId);
}