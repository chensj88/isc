package com.winning.isc.model;

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
 * @date 2018-20-08 09:20:06
 */
@Alias("trainTeacher")
public class TrainTeacher extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：YEAR
     * 备注: 
     * 默认值：无
     */
    private Integer year;
    /**
     * 字段名：MOUTH
     * 备注: 
     * 默认值：无
     */
    private String mouth;
    /**
     * 字段名：YEAR_MOUTH
     * 备注: 
     * 默认值：无
     */
    private String yearMouth;
    /**
     * 字段名：MOUTH_DATE
     * 备注: 
     * 默认值：无
     */
    private String mouthDate;
    /**
     * 字段名：TRAIN_TYPE
     * 备注: 
     * 默认值：无
     */
    private String trainType;
    /**
     * 字段名：NUM
     * 备注: 
     * 默认值：无
     */
    private Integer num;
    /**
     * 字段名：COURSE_TITLE
     * 备注: 
     * 默认值：无
     */
    private String courseTitle;
    /**
     * 字段名：COURSE_TIME
     * 备注: 
     * 默认值：无
     */
    private Short courseTime;
    /**
     * 字段名：ORG_NAME
     * 备注: 
     * 默认值：无
     */
    private String orgName;
    /**
     * 字段名：USERID
     * 备注: 
     * 默认值：无
     */
    private String userid;
    /**
     * 字段名：NAME
     * 备注: 
     * 默认值：无
     */
    private String name;
    /**
     * 字段名：SEX
     * 备注: 
     * 默认值：无
     */
    private String sex;
    /**
     * 字段名：PHONE
     * 备注: 
     * 默认值：无
     */
    private Integer phone;
    /**
     * 字段名：EMAIL
     * 备注: 
     * 默认值：无
     */
    private String email;
    /**
     * 字段名：ENTRY_DATE
     * 备注: 
     * 默认值：无
     */
    private Date entryDate;
    /**
     * 字段名：WORK_NAME
     * 备注: 
     * 默认值：无
     */
    private String workName;
    /**
     * 字段名：WORK_LEVEL
     * 备注: 
     * 默认值：无
     */
    private String workLevel;
    /**
     * 字段名：SATIS
     * 备注: 
     * 默认值：无
     */
    private String satis;
    /**
     * 字段名：SCORE
     * 备注: 
     * 默认值：无
     */
    private Integer score;
    /**
     * 字段名：TRAIN_WAY
     * 备注: 
     * 默认值：无
     */
    private String trainWay;
    /**
     * 字段名：UNIT
     * 备注: 
     * 默认值：无
     */
    private String unit;
    /**
     * 字段名：TOTAL_SCORE
     * 备注: 
     * 默认值：无
     */
    private Integer totalScore;
    /**
     * 字段名：CITY_MONEY
     * 备注: 
     * 默认值：无
     */
    private Short cityMoney;
    /**
     * 字段名：TRAFFIC_MONEY
     * 备注: 
     * 默认值：无
     */
    private Short trafficMoney;
    /**
     * 字段名：HOTEL_MONEY
     * 备注: 
     * 默认值：无
     */
    private Short hotelMoney;
    /**
     * 字段名：EAT_MONEY
     * 备注: 
     * 默认值：无
     */
    private Short eatMoney;
    /**
     * 字段名：OTHER_MONEY
     * 备注: 
     * 默认值：无
     */
    private Short otherMoney;
    /**
     * 字段名：TOTAL_MONEY
     * 备注: 
     * 默认值：无
     */
    private Short totalMoney;
    /**
     * 字段名：REMARK
     * 备注: 
     * 默认值：无
     */
    private String remark;
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

    public TrainTeacher (){

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
   * 字段名：YEAR
   * get方法
   * 备注: 
   */
   public Integer getYear(){

        return year;
   }

   /**
   * 字段名：YEAR
   * set方法
   * 备注: 
   */
   public void setYear(Integer year){
        this.year = year;
   }
   /**
   * 字段名：MOUTH
   * get方法
   * 备注: 
   */
   public String getMouth(){

        return mouth;
   }

   /**
   * 字段名：MOUTH
   * set方法
   * 备注: 
   */
   public void setMouth(String mouth){
        this.mouth = mouth;
   }
   /**
   * 字段名：YEAR_MOUTH
   * get方法
   * 备注: 
   */
   public String getYearMouth(){

        return yearMouth;
   }

   /**
   * 字段名：YEAR_MOUTH
   * set方法
   * 备注: 
   */
   public void setYearMouth(String yearMouth){
        this.yearMouth = yearMouth;
   }
   /**
   * 字段名：MOUTH_DATE
   * get方法
   * 备注: 
   */
   public String getMouthDate(){

        return mouthDate;
   }

   /**
   * 字段名：MOUTH_DATE
   * set方法
   * 备注: 
   */
   public void setMouthDate(String mouthDate){
        this.mouthDate = mouthDate;
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
   * 字段名：COURSE_TITLE
   * get方法
   * 备注: 
   */
   public String getCourseTitle(){

        return courseTitle;
   }

   /**
   * 字段名：COURSE_TITLE
   * set方法
   * 备注: 
   */
   public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
   }
   /**
   * 字段名：COURSE_TIME
   * get方法
   * 备注: 
   */
   public Short getCourseTime(){

        return courseTime;
   }

   /**
   * 字段名：COURSE_TIME
   * set方法
   * 备注: 
   */
   public void setCourseTime(Short courseTime){
        this.courseTime = courseTime;
   }
   /**
   * 字段名：ORG_NAME
   * get方法
   * 备注: 
   */
   public String getOrgName(){

        return orgName;
   }

   /**
   * 字段名：ORG_NAME
   * set方法
   * 备注: 
   */
   public void setOrgName(String orgName){
        this.orgName = orgName;
   }
   /**
   * 字段名：USERID
   * get方法
   * 备注: 
   */
   public String getUserid(){

        return userid;
   }

   /**
   * 字段名：USERID
   * set方法
   * 备注: 
   */
   public void setUserid(String userid){
        this.userid = userid;
   }
   /**
   * 字段名：NAME
   * get方法
   * 备注: 
   */
   public String getName(){

        return name;
   }

   /**
   * 字段名：NAME
   * set方法
   * 备注: 
   */
   public void setName(String name){
        this.name = name;
   }
   /**
   * 字段名：SEX
   * get方法
   * 备注: 
   */
   public String getSex(){

        return sex;
   }

   /**
   * 字段名：SEX
   * set方法
   * 备注: 
   */
   public void setSex(String sex){
        this.sex = sex;
   }
   /**
   * 字段名：PHONE
   * get方法
   * 备注: 
   */
   public Integer getPhone(){

        return phone;
   }

   /**
   * 字段名：PHONE
   * set方法
   * 备注: 
   */
   public void setPhone(Integer phone){
        this.phone = phone;
   }
   /**
   * 字段名：EMAIL
   * get方法
   * 备注: 
   */
   public String getEmail(){

        return email;
   }

   /**
   * 字段名：EMAIL
   * set方法
   * 备注: 
   */
   public void setEmail(String email){
        this.email = email;
   }
   /**
   * 字段名：ENTRY_DATE
   * get方法
   * 备注: 
   */
   public Date getEntryDate(){

        return entryDate;
   }

   /**
   * 字段名：ENTRY_DATE
   * set方法
   * 备注: 
   */
   public void setEntryDate(Date entryDate){
        this.entryDate = entryDate;
   }
   /**
   * 字段名：WORK_NAME
   * get方法
   * 备注: 
   */
   public String getWorkName(){

        return workName;
   }

   /**
   * 字段名：WORK_NAME
   * set方法
   * 备注: 
   */
   public void setWorkName(String workName){
        this.workName = workName;
   }
   /**
   * 字段名：WORK_LEVEL
   * get方法
   * 备注: 
   */
   public String getWorkLevel(){

        return workLevel;
   }

   /**
   * 字段名：WORK_LEVEL
   * set方法
   * 备注: 
   */
   public void setWorkLevel(String workLevel){
        this.workLevel = workLevel;
   }
   /**
   * 字段名：SATIS
   * get方法
   * 备注: 
   */
   public String getSatis(){

        return satis;
   }

   /**
   * 字段名：SATIS
   * set方法
   * 备注: 
   */
   public void setSatis(String satis){
        this.satis = satis;
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
   * 字段名：TRAIN_WAY
   * get方法
   * 备注: 
   */
   public String getTrainWay(){

        return trainWay;
   }

   /**
   * 字段名：TRAIN_WAY
   * set方法
   * 备注: 
   */
   public void setTrainWay(String trainWay){
        this.trainWay = trainWay;
   }
   /**
   * 字段名：UNIT
   * get方法
   * 备注: 
   */
   public String getUnit(){

        return unit;
   }

   /**
   * 字段名：UNIT
   * set方法
   * 备注: 
   */
   public void setUnit(String unit){
        this.unit = unit;
   }
   /**
   * 字段名：TOTAL_SCORE
   * get方法
   * 备注: 
   */
   public Integer getTotalScore(){

        return totalScore;
   }

   /**
   * 字段名：TOTAL_SCORE
   * set方法
   * 备注: 
   */
   public void setTotalScore(Integer totalScore){
        this.totalScore = totalScore;
   }
   /**
   * 字段名：CITY_MONEY
   * get方法
   * 备注: 
   */
   public Short getCityMoney(){

        return cityMoney;
   }

   /**
   * 字段名：CITY_MONEY
   * set方法
   * 备注: 
   */
   public void setCityMoney(Short cityMoney){
        this.cityMoney = cityMoney;
   }
   /**
   * 字段名：TRAFFIC_MONEY
   * get方法
   * 备注: 
   */
   public Short getTrafficMoney(){

        return trafficMoney;
   }

   /**
   * 字段名：TRAFFIC_MONEY
   * set方法
   * 备注: 
   */
   public void setTrafficMoney(Short trafficMoney){
        this.trafficMoney = trafficMoney;
   }
   /**
   * 字段名：HOTEL_MONEY
   * get方法
   * 备注: 
   */
   public Short getHotelMoney(){

        return hotelMoney;
   }

   /**
   * 字段名：HOTEL_MONEY
   * set方法
   * 备注: 
   */
   public void setHotelMoney(Short hotelMoney){
        this.hotelMoney = hotelMoney;
   }
   /**
   * 字段名：EAT_MONEY
   * get方法
   * 备注: 
   */
   public Short getEatMoney(){

        return eatMoney;
   }

   /**
   * 字段名：EAT_MONEY
   * set方法
   * 备注: 
   */
   public void setEatMoney(Short eatMoney){
        this.eatMoney = eatMoney;
   }
   /**
   * 字段名：OTHER_MONEY
   * get方法
   * 备注: 
   */
   public Short getOtherMoney(){

        return otherMoney;
   }

   /**
   * 字段名：OTHER_MONEY
   * set方法
   * 备注: 
   */
   public void setOtherMoney(Short otherMoney){
        this.otherMoney = otherMoney;
   }
   /**
   * 字段名：TOTAL_MONEY
   * get方法
   * 备注: 
   */
   public Short getTotalMoney(){

        return totalMoney;
   }

   /**
   * 字段名：TOTAL_MONEY
   * set方法
   * 备注: 
   */
   public void setTotalMoney(Short totalMoney){
        this.totalMoney = totalMoney;
   }
   /**
   * 字段名：REMARK
   * get方法
   * 备注: 
   */
   public String getRemark(){

        return remark;
   }

   /**
   * 字段名：REMARK
   * set方法
   * 备注: 
   */
   public void setRemark(String remark){
        this.remark = remark;
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