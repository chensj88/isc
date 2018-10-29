package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.PubOrg;  



import org.springframework.stereotype.Repository;
/**
* @author ISC [Implementation service center]
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-12-29 16:12:53
*/
@Repository
public interface PubOrgDao {

    public int insertPubOrg(PubOrg pubOrg) throws DataAccessException;

    public int updatePubOrg(PubOrg pubOrg) throws DataAccessException;

    public int deletePubOrg(PubOrg pubOrg) throws DataAccessException;

    public PubOrg selectPubOrg(PubOrg pubOrg) throws DataAccessException;

    public Object selectPubOrgCount(PubOrg pubOrg) throws DataAccessException;

    public List<PubOrg> selectPubOrgList(PubOrg pubOrg) throws DataAccessException;

    public List<PubOrg> selectPubOrgPageList(PubOrg pubOrg) throws DataAccessException;
}