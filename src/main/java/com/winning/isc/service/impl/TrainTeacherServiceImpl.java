package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.TrainTeacher;  

import com.winning.isc.dao.TrainTeacherDao;  

import com.winning.isc.service.TrainTeacherService;  


/**
* @author ISC
* @title TRAIN_TEACHER
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-20-08 09:20:06
*/
@Service
public class TrainTeacherServiceImpl implements  TrainTeacherService {

    @Autowired
    private TrainTeacherDao trainTeacherDao;

    public int createTrainTeacher(TrainTeacher trainTeacher){
        return this.trainTeacherDao.insertTrainTeacher(trainTeacher);
    }

    public int modifyTrainTeacher(TrainTeacher trainTeacher){
        return this.trainTeacherDao.updateTrainTeacher(trainTeacher);
    }

    public int removeTrainTeacher(TrainTeacher trainTeacher){
        return this.trainTeacherDao.deleteTrainTeacher(trainTeacher);
    }

    public TrainTeacher getTrainTeacher(TrainTeacher trainTeacher){
        return this.trainTeacherDao.selectTrainTeacher(trainTeacher);
    }

    public int getTrainTeacherCount(TrainTeacher trainTeacher){
        return (Integer)this.trainTeacherDao.selectTrainTeacherCount(trainTeacher);
    }

    public List<TrainTeacher> getTrainTeacherList(TrainTeacher trainTeacher){
        return this.trainTeacherDao.selectTrainTeacherList(trainTeacher);
    }

    public List<TrainTeacher> getTrainTeacherPageList(TrainTeacher trainTeacher){
        return this.trainTeacherDao.selectTrainTeacherPageList(trainTeacher);
    }
}