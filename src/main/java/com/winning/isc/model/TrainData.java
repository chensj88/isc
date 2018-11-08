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
 * @date 2018-19-08 09:19:47
 */
@Alias("trainData")
public class TrainData extends BaseDomain implements Serializable {

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
     * 字段名：DATA_NAME
     * 备注: 
     * 默认值：无
     */
    private String dataName;
    /**
     * 字段名：SOURCE_DEPT
     * 备注: 
     * 默认值：无
     */
    private String sourceDept;
    /**
     * 字段名：OWNER
     * 备注: 
     * 默认值：无
     */
    private String owner;
    /**
     * 字段名：DATA_LINK
     * 备注: 
     * 默认值：无
     */
    private String dataLink;
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

    public TrainData (){

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
   * 字段名：DATA_NAME
   * get方法
   * 备注: 
   */
   public String getDataName(){

        return dataName;
   }

   /**
   * 字段名：DATA_NAME
   * set方法
   * 备注: 
   */
   public void setDataName(String dataName){
        this.dataName = dataName;
   }
   /**
   * 字段名：SOURCE_DEPT
   * get方法
   * 备注: 
   */
   public String getSourceDept(){

        return sourceDept;
   }

   /**
   * 字段名：SOURCE_DEPT
   * set方法
   * 备注: 
   */
   public void setSourceDept(String sourceDept){
        this.sourceDept = sourceDept;
   }
   /**
   * 字段名：OWNER
   * get方法
   * 备注: 
   */
   public String getOwner(){

        return owner;
   }

   /**
   * 字段名：OWNER
   * set方法
   * 备注: 
   */
   public void setOwner(String owner){
        this.owner = owner;
   }
   /**
   * 字段名：DATA_LINK
   * get方法
   * 备注: 
   */
   public String getDataLink(){

        return dataLink;
   }

   /**
   * 字段名：DATA_LINK
   * set方法
   * 备注: 
   */
   public void setDataLink(String dataLink){
        this.dataLink = dataLink;
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