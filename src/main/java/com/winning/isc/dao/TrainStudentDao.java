package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.TrainStudent;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-20-08 09:20:00
*/
@Repository
public interface TrainStudentDao {

    public int insertTrainStudent(TrainStudent trainStudent) throws DataAccessException;

    public int updateTrainStudent(TrainStudent trainStudent) throws DataAccessException;

    public int deleteTrainStudent(TrainStudent trainStudent) throws DataAccessException;

    public TrainStudent selectTrainStudent(TrainStudent trainStudent) throws DataAccessException;

    public Object selectTrainStudentCount(TrainStudent trainStudent) throws DataAccessException;

    public List<TrainStudent> selectTrainStudentList(TrainStudent trainStudent) throws DataAccessException;

    public List<TrainStudent> selectTrainStudentPageList(TrainStudent trainStudent) throws DataAccessException;
}