package com.winning.isc.model;

import java.util.Date; 
import java.util.Date; 
import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author ISC
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-19-08 09:19:52
 */
@Alias("trainNote")
public class TrainNote extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：TRAIN_ID
     * 备注: 
     * 默认值：无
     */
    private Long trainId;
    /**
     * 字段名：NOTE_UPLOAD
     * 备注: 
     * 默认值：无
     */
    private String noteUpload;
    /**
     * 字段名：IN_DATE
     * 备注: 
     * 默认值：无
     */
    private Date inDate;
    /**
     * 字段名：SCORE
     * 备注: 
     * 默认值：无
     */
    private Integer score;
    /**
     * 字段名：CREATOR
     * 备注: 
     * 默认值：无
     */
    private String creator;
    /**
     * 字段名：CREATE_TIME
     * 备注: 
     * 默认值：无
     */
    private Date createTime;

    public TrainNote (){

    }

   /**
   * 字段名：ID
   * get方法
   * 备注: 
   */
   public Long getId(){

        return id;
   }

   /**
   * 字段名：ID
   * set方法
   * 备注: 
   */
   public void setId(Long id){
        this.id = id;
   }
   /**
   * 字段名：TRAIN_ID
   * get方法
   * 备注: 
   */
   public Long getTrainId(){

        return trainId;
   }

   /**
   * 字段名：TRAIN_ID
   * set方法
   * 备注: 
   */
   public void setTrainId(Long trainId){
        this.trainId = trainId;
   }
   /**
   * 字段名：NOTE_UPLOAD
   * get方法
   * 备注: 
   */
   public String getNoteUpload(){

        return noteUpload;
   }

   /**
   * 字段名：NOTE_UPLOAD
   * set方法
   * 备注: 
   */
   public void setNoteUpload(String noteUpload){
        this.noteUpload = noteUpload;
   }
   /**
   * 字段名：IN_DATE
   * get方法
   * 备注: 
   */
   public Date getInDate(){

        return inDate;
   }

   /**
   * 字段名：IN_DATE
   * set方法
   * 备注: 
   */
   public void setInDate(Date inDate){
        this.inDate = inDate;
   }
   /**
   * 字段名：SCORE
   * get方法
   * 备注: 
   */
   public Integer getScore(){

        return score;
   }

   /**
   * 字段名：SCORE
   * set方法
   * 备注: 
   */
   public void setScore(Integer score){
        this.score = score;
   }
   /**
   * 字段名：CREATOR
   * get方法
   * 备注: 
   */
   public String getCreator(){

        return creator;
   }

   /**
   * 字段名：CREATOR
   * set方法
   * 备注: 
   */
   public void setCreator(String creator){
        this.creator = creator;
   }
   /**
   * 字段名：CREATE_TIME
   * get方法
   * 备注: 
   */
   public Date getCreateTime(){

        return createTime;
   }

   /**
   * 字段名：CREATE_TIME
   * set方法
   * 备注: 
   */
   public void setCreateTime(Date createTime){
        this.createTime = createTime;
   }

}