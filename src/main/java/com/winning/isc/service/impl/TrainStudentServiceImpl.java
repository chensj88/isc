package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.TrainStudent;  

import com.winning.isc.dao.TrainStudentDao;  

import com.winning.isc.service.TrainStudentService;  


/**
* @author ISC
* @title TRAIN_STUDENT
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-20-08 09:20:00
*/
@Service
public class TrainStudentServiceImpl implements  TrainStudentService {

    @Autowired
    private TrainStudentDao trainStudentDao;

    public int createTrainStudent(TrainStudent trainStudent){
        return this.trainStudentDao.insertTrainStudent(trainStudent);
    }

    public int modifyTrainStudent(TrainStudent trainStudent){
        return this.trainStudentDao.updateTrainStudent(trainStudent);
    }

    public int removeTrainStudent(TrainStudent trainStudent){
        return this.trainStudentDao.deleteTrainStudent(trainStudent);
    }

    public TrainStudent getTrainStudent(TrainStudent trainStudent){
        return this.trainStudentDao.selectTrainStudent(trainStudent);
    }

    public int getTrainStudentCount(TrainStudent trainStudent){
        return (Integer)this.trainStudentDao.selectTrainStudentCount(trainStudent);
    }

    public List<TrainStudent> getTrainStudentList(TrainStudent trainStudent){
        return this.trainStudentDao.selectTrainStudentList(trainStudent);
    }

    public List<TrainStudent> getTrainStudentPageList(TrainStudent trainStudent){
        return this.trainStudentDao.selectTrainStudentPageList(trainStudent);
    }
}