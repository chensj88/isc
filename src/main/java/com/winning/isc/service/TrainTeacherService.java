package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.TrainTeacher;  


/**
* @author ISC
* @title TRAIN_TEACHER
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-20-08 09:20:06
*/
public interface TrainTeacherService {

    public int createTrainTeacher(TrainTeacher trainTeacher);

    public int modifyTrainTeacher(TrainTeacher trainTeacher);

    public int removeTrainTeacher(TrainTeacher trainTeacher);

    public TrainTeacher getTrainTeacher(TrainTeacher trainTeacher);

    public int getTrainTeacherCount(TrainTeacher trainTeacher);

    public List<TrainTeacher> getTrainTeacherList(TrainTeacher trainTeacher);

    public List<TrainTeacher> getTrainTeacherPageList(TrainTeacher trainTeacher);
}