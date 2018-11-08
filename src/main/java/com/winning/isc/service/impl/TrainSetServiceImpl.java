package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;  

import com.winning.isc.model.TrainSet;  

import com.winning.isc.dao.TrainSetDao;  

import com.winning.isc.service.TrainSetService;  


/**
* @author ISC
* @title TRAIN_SET
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-19-08 09:19:50
*/
@Service
public class TrainSetServiceImpl implements  TrainSetService {

    @Autowired
    private TrainSetDao trainSetDao;

    public int createTrainSet(TrainSet trainSet){
        return this.trainSetDao.insertTrainSet(trainSet);
    }

    public int modifyTrainSet(TrainSet trainSet){
        return this.trainSetDao.updateTrainSet(trainSet);
    }

    public int removeTrainSet(TrainSet trainSet){
        return this.trainSetDao.deleteTrainSet(trainSet);
    }

    public TrainSet getTrainSet(TrainSet trainSet){
        return this.trainSetDao.selectTrainSet(trainSet);
    }

    public int getTrainSetCount(TrainSet trainSet){
        return (Integer)this.trainSetDao.selectTrainSetCount(trainSet);
    }

    public List<TrainSet> getTrainSetList(TrainSet trainSet){
        return this.trainSetDao.selectTrainSetList(trainSet);
    }

    public List<TrainSet> getTrainSetPageList(TrainSet trainSet){
        return this.trainSetDao.selectTrainSetPageList(trainSet);
    }
}