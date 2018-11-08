package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.TrainData;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-19-08 09:19:47
*/
@Repository
public interface TrainDataDao {

    public int insertTrainData(TrainData trainData) throws DataAccessException;

    public int updateTrainData(TrainData trainData) throws DataAccessException;

    public int deleteTrainData(TrainData trainData) throws DataAccessException;

    public TrainData selectTrainData(TrainData trainData) throws DataAccessException;

    public Object selectTrainDataCount(TrainData trainData) throws DataAccessException;

    public List<TrainData> selectTrainDataList(TrainData trainData) throws DataAccessException;

    public List<TrainData> selectTrainDataPageList(TrainData trainData) throws DataAccessException;
}