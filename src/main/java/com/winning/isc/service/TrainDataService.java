package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.TrainData;  


/**
* @author ISC
* @title TRAIN_DATA
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-19-08 09:19:47
*/
public interface TrainDataService {

    public int createTrainData(TrainData trainData);

    public int modifyTrainData(TrainData trainData);

    public int removeTrainData(TrainData trainData);

    public TrainData getTrainData(TrainData trainData);

    public int getTrainDataCount(TrainData trainData);

    public List<TrainData> getTrainDataList(TrainData trainData);

    public List<TrainData> getTrainDataPageList(TrainData trainData);
}