package com.winning.isc.model;

import java.util.Date; 
import java.util.Date; 
import java.util.Date; 
import java.util.Date; 
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
 * @date 2018-19-08 09:19:50
 */
@Alias("trainSet")
public class TrainSet extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：TRAIN_TYPE
     * 备注: 
     * 默认值：无
     */
    private String trainType;
    /**
     * 字段名：TRAIN_DETAIL
     * 备注: 
     * 默认值：无
     */
    private String trainDetail;
    /**
     * 字段名：TRAIN_NAME
     * 备注: 
     * 默认值：无
     */
    private String trainName;
    /**
     * 字段名：ENROLL_START_DATE
     * 备注: 
     * 默认值：无
     */
    private Date enrollStartDate;
    /**
     * 字段名：ENROLL_END_DATE
     * 备注: 
     * 默认值：无
     */
    private Date enrollEndDate;
    /**
     * 字段名：TRAIN_START_DATE
     * 备注: 
     * 默认值：无
     */
    private Date trainStartDate;
    /**
     * 字段名：TRAIN_END_DATE
     * 备注: 
     * 默认值：无
     */
    private Date trainEndDate;
    /**
     * 字段名：PERSON_NUM
     * 备注: 
     * 默认值：无
     */
    private Integer personNum;
    /**
     * 字段名：NUM
     * 备注: 
     * 默认值：无
     */
    private Integer num;
    /**
     * 字段名：LINK
     * 备注: 
     * 默认值：无
     */
    private String link;
    /**
     * 字段名：TRAIN_STATUS
     * 备注: 
     * 默认值：无
     */
    private Integer trainStatus;
    /**
     * 字段名：SITE_UPLOAD
     * 备注: 
     * 默认值：无
     */
    private String siteUpload;
    /**
     * 字段名：HOTEL_UPLOAD
     * 备注: 
     * 默认值：无
     */
    private String hotelUpload;
    /**
     * 字段名：TRAIN_PLAN_UPLOAD
     * 备注: 
     * 默认值：无
     */
    private String trainPlanUpload;
    /**
     * 字段名：TRAIN_ARRANGE_UPLOAD
     * 备注: 
     * 默认值：无
     */
    private String trainArrangeUpload;
    /**
     * 字段名：TRAIN_NOTE_UPLOAD
     * 备注: 
     * 默认值：无
     */
    private String trainNoteUpload;
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
    /**
     * 字段名：OPERATER
     * 备注: 
     * 默认值：无
     */
    private String operater;
    /**
     * 字段名：OPERATE_TIME
     * 备注: 
     * 默认值：无
     */
    private Date operateTime;

    public TrainSet (){

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
   * 字段名：TRAIN_TYPE
   * get方法
   * 备注: 
   */
   public String getTrainType(){

        return trainType;
   }

   /**
   * 字段名：TRAIN_TYPE
   * set方法
   * 备注: 
   */
   public void setTrainType(String trainType){
        this.trainType = trainType;
   }
   /**
   * 字段名：TRAIN_DETAIL
   * get方法
   * 备注: 
   */
   public String getTrainDetail(){

        return trainDetail;
   }

   /**
   * 字段名：TRAIN_DETAIL
   * set方法
   * 备注: 
   */
   public void setTrainDetail(String trainDetail){
        this.trainDetail = trainDetail;
   }
   /**
   * 字段名：TRAIN_NAME
   * get方法
   * 备注: 
   */
   public String getTrainName(){

        return trainName;
   }

   /**
   * 字段名：TRAIN_NAME
   * set方法
   * 备注: 
   */
   public void setTrainName(String trainName){
        this.trainName = trainName;
   }
   /**
   * 字段名：ENROLL_START_DATE
   * get方法
   * 备注: 
   */
   public Date getEnrollStartDate(){

        return enrollStartDate;
   }

   /**
   * 字段名：ENROLL_START_DATE
   * set方法
   * 备注: 
   */
   public void setEnrollStartDate(Date enrollStartDate){
        this.enrollStartDate = enrollStartDate;
   }
   /**
   * 字段名：ENROLL_END_DATE
   * get方法
   * 备注: 
   */
   public Date getEnrollEndDate(){

        return enrollEndDate;
   }

   /**
   * 字段名：ENROLL_END_DATE
   * set方法
   * 备注: 
   */
   public void setEnrollEndDate(Date enrollEndDate){
        this.enrollEndDate = enrollEndDate;
   }
   /**
   * 字段名：TRAIN_START_DATE
   * get方法
   * 备注: 
   */
   public Date getTrainStartDate(){

        return trainStartDate;
   }

   /**
   * 字段名：TRAIN_START_DATE
   * set方法
   * 备注: 
   */
   public void setTrainStartDate(Date trainStartDate){
        this.trainStartDate = trainStartDate;
   }
   /**
   * 字段名：TRAIN_END_DATE
   * get方法
   * 备注: 
   */
   public Date getTrainEndDate(){

        return trainEndDate;
   }

   /**
   * 字段名：TRAIN_END_DATE
   * set方法
   * 备注: 
   */
   public void setTrainEndDate(Date trainEndDate){
        this.trainEndDate = trainEndDate;
   }
   /**
   * 字段名：PERSON_NUM
   * get方法
   * 备注: 
   */
   public Integer getPersonNum(){

        return personNum;
   }

   /**
   * 字段名：PERSON_NUM
   * set方法
   * 备注: 
   */
   public void setPersonNum(Integer personNum){
        this.personNum = personNum;
   }
   /**
   * 字段名：NUM
   * get方法
   * 备注: 
   */
   public Integer getNum(){

        return num;
   }

   /**
   * 字段名：NUM
   * set方法
   * 备注: 
   */
   public void setNum(Integer num){
        this.num = num;
   }
   /**
   * 字段名：LINK
   * get方法
   * 备注: 
   */
   public String getLink(){

        return link;
   }

   /**
   * 字段名：LINK
   * set方法
   * 备注: 
   */
   public void setLink(String link){
        this.link = link;
   }
   /**
   * 字段名：TRAIN_STATUS
   * get方法
   * 备注: 
   */
   public Integer getTrainStatus(){

        return trainStatus;
   }

   /**
   * 字段名：TRAIN_STATUS
   * set方法
   * 备注: 
   */
   public void setTrainStatus(Integer trainStatus){
        this.trainStatus = trainStatus;
   }
   /**
   * 字段名：SITE_UPLOAD
   * get方法
   * 备注: 
   */
   public String getSiteUpload(){

        return siteUpload;
   }

   /**
   * 字段名：SITE_UPLOAD
   * set方法
   * 备注: 
   */
   public void setSiteUpload(String siteUpload){
        this.siteUpload = siteUpload;
   }
   /**
   * 字段名：HOTEL_UPLOAD
   * get方法
   * 备注: 
   */
   public String getHotelUpload(){

        return hotelUpload;
   }

   /**
   * 字段名：HOTEL_UPLOAD
   * set方法
   * 备注: 
   */
   public void setHotelUpload(String hotelUpload){
        this.hotelUpload = hotelUpload;
   }
   /**
   * 字段名：TRAIN_PLAN_UPLOAD
   * get方法
   * 备注: 
   */
   public String getTrainPlanUpload(){

        return trainPlanUpload;
   }

   /**
   * 字段名：TRAIN_PLAN_UPLOAD
   * set方法
   * 备注: 
   */
   public void setTrainPlanUpload(String trainPlanUpload){
        this.trainPlanUpload = trainPlanUpload;
   }
   /**
   * 字段名：TRAIN_ARRANGE_UPLOAD
   * get方法
   * 备注: 
   */
   public String getTrainArrangeUpload(){

        return trainArrangeUpload;
   }

   /**
   * 字段名：TRAIN_ARRANGE_UPLOAD
   * set方法
   * 备注: 
   */
   public void setTrainArrangeUpload(String trainArrangeUpload){
        this.trainArrangeUpload = trainArrangeUpload;
   }
   /**
   * 字段名：TRAIN_NOTE_UPLOAD
   * get方法
   * 备注: 
   */
   public String getTrainNoteUpload(){

        return trainNoteUpload;
   }

   /**
   * 字段名：TRAIN_NOTE_UPLOAD
   * set方法
   * 备注: 
   */
   public void setTrainNoteUpload(String trainNoteUpload){
        this.trainNoteUpload = trainNoteUpload;
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
   /**
   * 字段名：OPERATER
   * get方法
   * 备注: 
   */
   public String getOperater(){

        return operater;
   }

   /**
   * 字段名：OPERATER
   * set方法
   * 备注: 
   */
   public void setOperater(String operater){
        this.operater = operater;
   }
   /**
   * 字段名：OPERATE_TIME
   * get方法
   * 备注: 
   */
   public Date getOperateTime(){

        return operateTime;
   }

   /**
   * 字段名：OPERATE_TIME
   * set方法
   * 备注: 
   */
   public void setOperateTime(Date operateTime){
        this.operateTime = operateTime;
   }

}