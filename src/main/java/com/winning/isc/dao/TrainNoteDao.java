package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.TrainNote;  



import org.springframework.stereotype.Repository;
/**
* @author ISC
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-19-08 09:19:52
*/
@Repository
public interface TrainNoteDao {

    public int insertTrainNote(TrainNote trainNote) throws DataAccessException;

    public int updateTrainNote(TrainNote trainNote) throws DataAccessException;

    public int deleteTrainNote(TrainNote trainNote) throws DataAccessException;

    public TrainNote selectTrainNote(TrainNote trainNote) throws DataAccessException;

    public Object selectTrainNoteCount(TrainNote trainNote) throws DataAccessException;

    public List<TrainNote> selectTrainNoteList(TrainNote trainNote) throws DataAccessException;

    public List<TrainNote> selectTrainNotePageList(TrainNote trainNote) throws DataAccessException;
}