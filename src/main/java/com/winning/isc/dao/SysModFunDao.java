package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysModFun;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:07
*/
@Repository
public interface SysModFunDao {

    public int insertSysModFun(SysModFun sysModFun) throws DataAccessException;

    public int updateSysModFun(SysModFun sysModFun) throws DataAccessException;

    public int deleteSysModFun(SysModFun sysModFun) throws DataAccessException;

    public SysModFun selectSysModFun(SysModFun sysModFun) throws DataAccessException;

    public Object selectSysModFunCount(SysModFun sysModFun) throws DataAccessException;

    public List<SysModFun> selectSysModFunList(SysModFun sysModFun) throws DataAccessException;

    public List<SysModFun> selectSysModFunPageList(SysModFun sysModFun) throws DataAccessException;
}