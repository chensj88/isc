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
 * @date 2018-47-02 09:47:03
 */
@Alias("iscSuggest")
public class IscSuggest extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private String id;
    /**
     * 字段名：TOOL_ID
     * 备注: 
     * 默认值：无
     */
    private String toolId;
    /**
     * 字段名：NAME
     * 备注: 
     * 默认值：无
     */
    private String name;
    /**
     * 字段名：CONTENT
     * 备注: 
     * 默认值：无
     */
    private String content;
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

    public IscSuggest (){

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
   * 字段名：TOOL_ID
   * get方法
   * 备注: 
   */
   public String getToolId(){

        return toolId;
   }

   /**
   * 字段名：TOOL_ID
   * set方法
   * 备注: 
   */
   public void setToolId(String toolId){
        this.toolId = toolId;
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
   * 字段名：CONTENT
   * get方法
   * 备注: 
   */
   public String getContent(){

        return content;
   }

   /**
   * 字段名：CONTENT
   * set方法
   * 备注: 
   */
   public void setContent(String content){
        this.content = content;
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