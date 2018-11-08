package com.winning.isc.model;

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
 * @date 2018-20-08 09:20:00
 */
@Alias("trainStudent")
public class TrainStudent extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：STUDENT_NO
     * 备注: 
     * 默认值：无
     */
    private Integer studentNo;
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
     * 字段名：TRAIN_DETAIL
     * 备注: 
     * 默认值：无
     */
    private String trainDetail;
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
     * 字段名：PLAN_WORKER
     * 备注: 
     * 默认值：无
     */
    private Date planWorker;
    /**
     * 字段名：JOIN_STATUS
     * 备注: 
     * 默认值：无
     */
    private String joinStatus;
    /**
     * 字段名：TOTAL_SCORE
     * 备注: 
     * 默认值：无
     */
    private Short totalScore;
    /**
     * 字段名：RESULT
     * 备注: 
     * 默认值：无
     */
    private String result;
    /**
     * 字段名：IS_GRADE
     * 备注: 
     * 默认值：无
     */
    private String isGrade;
    /**
     * 字段名：JOIN_WAY
     * 备注: 
     * 默认值：无
     */
    private String joinWay;
    /**
     * 字段名：UNIT
     * 备注: 
     * 默认值：无
     */
    private String unit;
    /**
     * 字段名：TOTAL_JION
     * 备注: 
     * 默认值：无
     */
    private Integer totalJion;
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
     * 字段名：HOTEL
     * 备注: 
     * 默认值：无
     */
    private String hotel;
    /**
     * 字段名：IS_WORKER
     * 备注: 
     * 默认值：无
     */
    private String isWorker;
    /**
     * 字段名：WORK_YEAR
     * 备注: 
     * 默认值：无
     */
    private String workYear;
    /**
     * 字段名：WORK_INFO
     * 备注: 
     * 默认值：无
     */
    private String workInfo;
    /**
     * 字段名：TEACHER
     * 备注: 
     * 默认值：无
     */
    private String teacher;
    /**
     * 字段名：TRAIN_WAY
     * 备注: 
     * 默认值：无
     */
    private String trainWay;
    /**
     * 字段名：PEN_SCORE
     * 备注: 
     * 默认值：无
     */
    private Short penScore;
    /**
     * 字段名：PC_SCORE
     * 备注: 
     * 默认值：无
     */
    private Short pcScore;
    /**
     * 字段名：EXPRESSION_SCORE
     * 备注: 
     * 默认值：无
     */
    private Short expressionScore;
    /**
     * 字段名：NOTE_SCORE
     * 备注: 
     * 默认值：无
     */
    private Short noteScore;
    /**
     * 字段名：TEAM_SCORE
     * 备注: 
     * 默认值：无
     */
    private Short teamScore;
    /**
     * 字段名：TOTAL_RANK
     * 备注: 
     * 默认值：无
     */
    private Integer totalRank;
    /**
     * 字段名：SUGGEST
     * 备注: 
     * 默认值：无
     */
    private String suggest;
    /**
     * 字段名：REASON
     * 备注: 
     * 默认值：无
     */
    private String reason;
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

    public TrainStudent (){

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
   * 字段名：STUDENT_NO
   * get方法
   * 备注: 
   */
   public Integer getStudentNo(){

        return studentNo;
   }

   /**
   * 字段名：STUDENT_NO
   * set方法
   * 备注: 
   */
   public void setStudentNo(Integer studentNo){
        this.studentNo = studentNo;
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
   * 字段名：PLAN_WORKER
   * get方法
   * 备注: 
   */
   public Date getPlanWorker(){

        return planWorker;
   }

   /**
   * 字段名：PLAN_WORKER
   * set方法
   * 备注: 
   */
   public void setPlanWorker(Date planWorker){
        this.planWorker = planWorker;
   }
   /**
   * 字段名：JOIN_STATUS
   * get方法
   * 备注: 
   */
   public String getJoinStatus(){

        return joinStatus;
   }

   /**
   * 字段名：JOIN_STATUS
   * set方法
   * 备注: 
   */
   public void setJoinStatus(String joinStatus){
        this.joinStatus = joinStatus;
   }
   /**
   * 字段名：TOTAL_SCORE
   * get方法
   * 备注: 
   */
   public Short getTotalScore(){

        return totalScore;
   }

   /**
   * 字段名：TOTAL_SCORE
   * set方法
   * 备注: 
   */
   public void setTotalScore(Short totalScore){
        this.totalScore = totalScore;
   }
   /**
   * 字段名：RESULT
   * get方法
   * 备注: 
   */
   public String getResult(){

        return result;
   }

   /**
   * 字段名：RESULT
   * set方法
   * 备注: 
   */
   public void setResult(String result){
        this.result = result;
   }
   /**
   * 字段名：IS_GRADE
   * get方法
   * 备注: 
   */
   public String getIsGrade(){

        return isGrade;
   }

   /**
   * 字段名：IS_GRADE
   * set方法
   * 备注: 
   */
   public void setIsGrade(String isGrade){
        this.isGrade = isGrade;
   }
   /**
   * 字段名：JOIN_WAY
   * get方法
   * 备注: 
   */
   public String getJoinWay(){

        return joinWay;
   }

   /**
   * 字段名：JOIN_WAY
   * set方法
   * 备注: 
   */
   public void setJoinWay(String joinWay){
        this.joinWay = joinWay;
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
   * 字段名：TOTAL_JION
   * get方法
   * 备注: 
   */
   public Integer getTotalJion(){

        return totalJion;
   }

   /**
   * 字段名：TOTAL_JION
   * set方法
   * 备注: 
   */
   public void setTotalJion(Integer totalJion){
        this.totalJion = totalJion;
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
   * 字段名：HOTEL
   * get方法
   * 备注: 
   */
   public String getHotel(){

        return hotel;
   }

   /**
   * 字段名：HOTEL
   * set方法
   * 备注: 
   */
   public void setHotel(String hotel){
        this.hotel = hotel;
   }
   /**
   * 字段名：IS_WORKER
   * get方法
   * 备注: 
   */
   public String getIsWorker(){

        return isWorker;
   }

   /**
   * 字段名：IS_WORKER
   * set方法
   * 备注: 
   */
   public void setIsWorker(String isWorker){
        this.isWorker = isWorker;
   }
   /**
   * 字段名：WORK_YEAR
   * get方法
   * 备注: 
   */
   public String getWorkYear(){

        return workYear;
   }

   /**
   * 字段名：WORK_YEAR
   * set方法
   * 备注: 
   */
   public void setWorkYear(String workYear){
        this.workYear = workYear;
   }
   /**
   * 字段名：WORK_INFO
   * get方法
   * 备注: 
   */
   public String getWorkInfo(){

        return workInfo;
   }

   /**
   * 字段名：WORK_INFO
   * set方法
   * 备注: 
   */
   public void setWorkInfo(String workInfo){
        this.workInfo = workInfo;
   }
   /**
   * 字段名：TEACHER
   * get方法
   * 备注: 
   */
   public String getTeacher(){

        return teacher;
   }

   /**
   * 字段名：TEACHER
   * set方法
   * 备注: 
   */
   public void setTeacher(String teacher){
        this.teacher = teacher;
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
   * 字段名：PEN_SCORE
   * get方法
   * 备注: 
   */
   public Short getPenScore(){

        return penScore;
   }

   /**
   * 字段名：PEN_SCORE
   * set方法
   * 备注: 
   */
   public void setPenScore(Short penScore){
        this.penScore = penScore;
   }
   /**
   * 字段名：PC_SCORE
   * get方法
   * 备注: 
   */
   public Short getPcScore(){

        return pcScore;
   }

   /**
   * 字段名：PC_SCORE
   * set方法
   * 备注: 
   */
   public void setPcScore(Short pcScore){
        this.pcScore = pcScore;
   }
   /**
   * 字段名：EXPRESSION_SCORE
   * get方法
   * 备注: 
   */
   public Short getExpressionScore(){

        return expressionScore;
   }

   /**
   * 字段名：EXPRESSION_SCORE
   * set方法
   * 备注: 
   */
   public void setExpressionScore(Short expressionScore){
        this.expressionScore = expressionScore;
   }
   /**
   * 字段名：NOTE_SCORE
   * get方法
   * 备注: 
   */
   public Short getNoteScore(){

        return noteScore;
   }

   /**
   * 字段名：NOTE_SCORE
   * set方法
   * 备注: 
   */
   public void setNoteScore(Short noteScore){
        this.noteScore = noteScore;
   }
   /**
   * 字段名：TEAM_SCORE
   * get方法
   * 备注: 
   */
   public Short getTeamScore(){

        return teamScore;
   }

   /**
   * 字段名：TEAM_SCORE
   * set方法
   * 备注: 
   */
   public void setTeamScore(Short teamScore){
        this.teamScore = teamScore;
   }
   /**
   * 字段名：TOTAL_RANK
   * get方法
   * 备注: 
   */
   public Integer getTotalRank(){

        return totalRank;
   }

   /**
   * 字段名：TOTAL_RANK
   * set方法
   * 备注: 
   */
   public void setTotalRank(Integer totalRank){
        this.totalRank = totalRank;
   }
   /**
   * 字段名：SUGGEST
   * get方法
   * 备注: 
   */
   public String getSuggest(){

        return suggest;
   }

   /**
   * 字段名：SUGGEST
   * set方法
   * 备注: 
   */
   public void setSuggest(String suggest){
        this.suggest = suggest;
   }
   /**
   * 字段名：REASON
   * get方法
   * 备注: 
   */
   public String getReason(){

        return reason;
   }

   /**
   * 字段名：REASON
   * set方法
   * 备注: 
   */
   public void setReason(String reason){
        this.reason = reason;
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