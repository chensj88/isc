package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.TrainStudent;  


/**
* @author ISC
* @title TRAIN_STUDENT
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-20-08 09:20:00
*/
public interface TrainStudentService {

    public int createTrainStudent(TrainStudent trainStudent);

    public int modifyTrainStudent(TrainStudent trainStudent);

    public int removeTrainStudent(TrainStudent trainStudent);

    public TrainStudent getTrainStudent(TrainStudent trainStudent);

    public int getTrainStudentCount(TrainStudent trainStudent);

    public List<TrainStudent> getTrainStudentList(TrainStudent trainStudent);

    public List<TrainStudent> getTrainStudentPageList(TrainStudent trainStudent);
}