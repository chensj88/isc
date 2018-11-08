package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysDictInfo;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-21-08 09:21:42
*/
@Repository
public interface SysDictInfoDao {

    public int insertSysDictInfo(SysDictInfo sysDictInfo) throws DataAccessException;

    public int updateSysDictInfo(SysDictInfo sysDictInfo) throws DataAccessException;

    public int deleteSysDictInfo(SysDictInfo sysDictInfo) throws DataAccessException;

    public SysDictInfo selectSysDictInfo(SysDictInfo sysDictInfo) throws DataAccessException;

    public Object selectSysDictInfoCount(SysDictInfo sysDictInfo) throws DataAccessException;

    public List<SysDictInfo> selectSysDictInfoList(SysDictInfo sysDictInfo) throws DataAccessException;

    public List<SysDictInfo> selectSysDictInfoPageList(SysDictInfo sysDictInfo) throws DataAccessException;
}