package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.TrainSet;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-19-08 09:19:50
*/
@Repository
public interface TrainSetDao {

    public int insertTrainSet(TrainSet trainSet) throws DataAccessException;

    public int updateTrainSet(TrainSet trainSet) throws DataAccessException;

    public int deleteTrainSet(TrainSet trainSet) throws DataAccessException;

    public TrainSet selectTrainSet(TrainSet trainSet) throws DataAccessException;

    public Object selectTrainSetCount(TrainSet trainSet) throws DataAccessException;

    public List<TrainSet> selectTrainSetList(TrainSet trainSet) throws DataAccessException;

    public List<TrainSet> selectTrainSetPageList(TrainSet trainSet) throws DataAccessException;
}