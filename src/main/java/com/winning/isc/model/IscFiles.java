package com.winning.isc.model;

import java.util.Date; 
import java.util.Date; 
import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-46-02 09:46:57
 */
@Alias("iscFiles")
public class IscFiles extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private String id;
    /**
     * 字段名：FILE_NAME
     * 备注: 
     * 默认值：无
     */
    private String fileName;
    /**
     * 字段名：USER_NAME
     * 备注: 
     * 默认值：无
     */
    private String userName;
    /**
     * 字段名：DEPT
     * 备注: 
     * 默认值：无
     */
    private String dept;
    /**
     * 字段名：DOWM_NUM
     * 备注: 
     * 默认值：((0))
     */
    private Integer dowmNum;
    /**
     * 字段名：VIEW_NUM
     * 备注: 
     * 默认值：((0))
     */
    private Integer viewNum;
    /**
     * 字段名：DOWN_LOAD
     * 备注: 
     * 默认值：无
     */
    private String downLoad;
    /**
     * 字段名：DOWN_CONTENT
     * 备注: 
     * 默认值：无
     */
    private String downContent;
    /**
     * 字段名：VERSION
     * 备注: 
     * 默认值：无
     */
    private Integer version;
    /**
     * 字段名：PHONE
     * 备注: 
     * 默认值：无
     */
    private Integer phone;
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
    /**
     * 字段名：IS_STOP
     * 备注: 
     * 默认值：((0))
     */
    private Integer isStop;

    public IscFiles (){

    }

   /**
   * 字段名：ID
   * get方法
   * 备注: 
   */
   public String getId(){

        return id;
   }

   /**
   * 字段名：ID
   * set方法
   * 备注: 
   */
   public void setId(String id){
        this.id = id;
   }
   /**
   * 字段名：FILE_NAME
   * get方法
   * 备注: 
   */
   public String getFileName(){

        return fileName;
   }

   /**
   * 字段名：FILE_NAME
   * set方法
   * 备注: 
   */
   public void setFileName(String fileName){
        this.fileName = fileName;
   }
   /**
   * 字段名：USER_NAME
   * get方法
   * 备注: 
   */
   public String getUserName(){

        return userName;
   }

   /**
   * 字段名：USER_NAME
   * set方法
   * 备注: 
   */
   public void setUserName(String userName){
        this.userName = userName;
   }
   /**
   * 字段名：DEPT
   * get方法
   * 备注: 
   */
   public String getDept(){

        return dept;
   }

   /**
   * 字段名：DEPT
   * set方法
   * 备注: 
   */
   public void setDept(String dept){
        this.dept = dept;
   }
   /**
   * 字段名：DOWM_NUM
   * get方法
   * 备注: 
   */
   public Integer getDowmNum(){

        return dowmNum;
   }

   /**
   * 字段名：DOWM_NUM
   * set方法
   * 备注: 
   */
   public void setDowmNum(Integer dowmNum){
        this.dowmNum = dowmNum;
   }
   /**
   * 字段名：VIEW_NUM
   * get方法
   * 备注: 
   */
   public Integer getViewNum(){

        return viewNum;
   }

   /**
   * 字段名：VIEW_NUM
   * set方法
   * 备注: 
   */
   public void setViewNum(Integer viewNum){
        this.viewNum = viewNum;
   }
   /**
   * 字段名：DOWN_LOAD
   * get方法
   * 备注: 
   */
   public String getDownLoad(){

        return downLoad;
   }

   /**
   * 字段名：DOWN_LOAD
   * set方法
   * 备注: 
   */
   public void setDownLoad(String downLoad){
        this.downLoad = downLoad;
   }
   /**
   * 字段名：DOWN_CONTENT
   * get方法
   * 备注: 
   */
   public String getDownContent(){

        return downContent;
   }

   /**
   * 字段名：DOWN_CONTENT
   * set方法
   * 备注: 
   */
   public void setDownContent(String downContent){
        this.downContent = downContent;
   }
   /**
   * 字段名：VERSION
   * get方法
   * 备注: 
   */
   public Integer getVersion(){

        return version;
   }

   /**
   * 字段名：VERSION
   * set方法
   * 备注: 
   */
   public void setVersion(Integer version){
        this.version = version;
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
   /**
   * 字段名：IS_STOP
   * get方法
   * 备注: 
   */
   public Integer getIsStop(){

        return isStop;
   }

   /**
   * 字段名：IS_STOP
   * set方法
   * 备注: 
   */
   public void setIsStop(Integer isStop){
        this.isStop = isStop;
   }

}