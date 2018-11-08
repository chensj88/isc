package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.TrainTeacher;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-20-08 09:20:06
*/
@Repository
public interface TrainTeacherDao {

    public int insertTrainTeacher(TrainTeacher trainTeacher) throws DataAccessException;

    public int updateTrainTeacher(TrainTeacher trainTeacher) throws DataAccessException;

    public int deleteTrainTeacher(TrainTeacher trainTeacher) throws DataAccessException;

    public TrainTeacher selectTrainTeacher(TrainTeacher trainTeacher) throws DataAccessException;

    public Object selectTrainTeacherCount(TrainTeacher trainTeacher) throws DataAccessException;

    public List<TrainTeacher> selectTrainTeacherList(TrainTeacher trainTeacher) throws DataAccessException;

    public List<TrainTeacher> selectTrainTeacherPageList(TrainTeacher trainTeacher) throws DataAccessException;
}