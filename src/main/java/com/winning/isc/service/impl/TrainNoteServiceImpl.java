package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.TrainNote;  

import com.winning.isc.dao.TrainNoteDao;  

import com.winning.isc.service.TrainNoteService;  


/**
* @author ISC
* @title TRAIN_NOTE
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-19-08 09:19:52
*/
@Service
public class TrainNoteServiceImpl implements  TrainNoteService {

    @Autowired
    private TrainNoteDao trainNoteDao;

    public int createTrainNote(TrainNote trainNote){
        return this.trainNoteDao.insertTrainNote(trainNote);
    }

    public int modifyTrainNote(TrainNote trainNote){
        return this.trainNoteDao.updateTrainNote(trainNote);
    }

    public int removeTrainNote(TrainNote trainNote){
        return this.trainNoteDao.deleteTrainNote(trainNote);
    }

    public TrainNote getTrainNote(TrainNote trainNote){
        return this.trainNoteDao.selectTrainNote(trainNote);
    }

    public int getTrainNoteCount(TrainNote trainNote){
        return (Integer)this.trainNoteDao.selectTrainNoteCount(trainNote);
    }

    public List<TrainNote> getTrainNoteList(TrainNote trainNote){
        return this.trainNoteDao.selectTrainNoteList(trainNote);
    }

    public List<TrainNote> getTrainNotePageList(TrainNote trainNote){
        return this.trainNoteDao.selectTrainNotePageList(trainNote);
    }
}