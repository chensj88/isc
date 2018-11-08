package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.TrainNote;  


/**
* @author ISC
* @title TRAIN_NOTE
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-19-08 09:19:52
*/
public interface TrainNoteService {

    public int createTrainNote(TrainNote trainNote);

    public int modifyTrainNote(TrainNote trainNote);

    public int removeTrainNote(TrainNote trainNote);

    public TrainNote getTrainNote(TrainNote trainNote);

    public int getTrainNoteCount(TrainNote trainNote);

    public List<TrainNote> getTrainNoteList(TrainNote trainNote);

    public List<TrainNote> getTrainNotePageList(TrainNote trainNote);
}