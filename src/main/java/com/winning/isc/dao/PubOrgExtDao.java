package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.PubOrgExt;  



import org.springframework.stereotype.Repository;
/**
* @author ISC [Implementation service center]
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-12-29 16:12:54
*/
@Repository
public interface PubOrgExtDao {

    public int insertPubOrgExt(PubOrgExt pubOrgExt) throws DataAccessException;

    public int updatePubOrgExt(PubOrgExt pubOrgExt) throws DataAccessException;

    public int deletePubOrgExt(PubOrgExt pubOrgExt) throws DataAccessException;

    public PubOrgExt selectPubOrgExt(PubOrgExt pubOrgExt) throws DataAccessException;

    public Object selectPubOrgExtCount(PubOrgExt pubOrgExt) throws DataAccessException;

    public List<PubOrgExt> selectPubOrgExtList(PubOrgExt pubOrgExt) throws DataAccessException;

    public List<PubOrgExt> selectPubOrgExtPageList(PubOrgExt pubOrgExt) throws DataAccessException;

    public void insertPubOrgExtByProc(PubOrgExt pubOrgExt) throws DataAccessException;
}