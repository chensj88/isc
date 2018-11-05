package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.SysFun;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:06
*/
@Repository
public interface SysFunDao {

    public int insertSysFun(SysFun sysFun) throws DataAccessException;

    public int updateSysFun(SysFun sysFun) throws DataAccessException;

    public int deleteSysFun(SysFun sysFun) throws DataAccessException;

    public SysFun selectSysFun(SysFun sysFun) throws DataAccessException;

    public Object selectSysFunCount(SysFun sysFun) throws DataAccessException;

    public List<SysFun> selectSysFunList(SysFun sysFun) throws DataAccessException;

    public List<SysFun> selectSysFunPageList(SysFun sysFun) throws DataAccessException;
}