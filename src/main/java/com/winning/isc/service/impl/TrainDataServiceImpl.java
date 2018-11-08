package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.TrainData;  

import com.winning.isc.dao.TrainDataDao;  

import com.winning.isc.service.TrainDataService;  


/**
* @author ISC
* @title TRAIN_DATA
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-19-08 09:19:47
*/
@Service
public class TrainDataServiceImpl implements  TrainDataService {

    @Autowired
    private TrainDataDao trainDataDao;

    public int createTrainData(TrainData trainData){
        return this.trainDataDao.insertTrainData(trainData);
    }

    public int modifyTrainData(TrainData trainData){
        return this.trainDataDao.updateTrainData(trainData);
    }

    public int removeTrainData(TrainData trainData){
        return this.trainDataDao.deleteTrainData(trainData);
    }

    public TrainData getTrainData(TrainData trainData){
        return this.trainDataDao.selectTrainData(trainData);
    }

    public int getTrainDataCount(TrainData trainData){
        return (Integer)this.trainDataDao.selectTrainDataCount(trainData);
    }

    public List<TrainData> getTrainDataList(TrainData trainData){
        return this.trainDataDao.selectTrainDataList(trainData);
    }

    public List<TrainData> getTrainDataPageList(TrainData trainData){
        return this.trainDataDao.selectTrainDataPageList(trainData);
    }
}