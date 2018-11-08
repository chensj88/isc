package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.TrainSet;  


/**
* @author ISC
* @title TRAIN_SET
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-19-08 09:19:50
*/
public interface TrainSetService {

    public int createTrainSet(TrainSet trainSet);

    public int modifyTrainSet(TrainSet trainSet);

    public int removeTrainSet(TrainSet trainSet);

    public TrainSet getTrainSet(TrainSet trainSet);

    public int getTrainSetCount(TrainSet trainSet);

    public List<TrainSet> getTrainSetList(TrainSet trainSet);

    public List<TrainSet> getTrainSetPageList(TrainSet trainSet);
}