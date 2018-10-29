package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.PubUserInfo;  



import org.springframework.stereotype.Repository;
/**
* @author ISC [Implementation service center]
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-12-29 16:12:50
*/
@Repository
public interface PubUserInfoDao {

    public int insertPubUserInfo(PubUserInfo pubUserInfo) throws DataAccessException;

    public int updatePubUserInfo(PubUserInfo pubUserInfo) throws DataAccessException;

    public int deletePubUserInfo(PubUserInfo pubUserInfo) throws DataAccessException;

    public PubUserInfo selectPubUserInfo(PubUserInfo pubUserInfo) throws DataAccessException;

    public Object selectPubUserInfoCount(PubUserInfo pubUserInfo) throws DataAccessException;

    public List<PubUserInfo> selectPubUserInfoList(PubUserInfo pubUserInfo) throws DataAccessException;

    public List<PubUserInfo> selectPubUserInfoPageList(PubUserInfo pubUserInfo) throws DataAccessException;
}