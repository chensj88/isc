package com.winning.isc.model;

import java.util.Date; 
import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author ISC
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-29-08 17:29:53
 */
@Alias("iscFileType")
public class IscFileType extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：TYPE
     * 备注: 
     * 默认值：无
     */
    private String type;
    /**
     * 字段名：ORG
     * 备注: 
     * 默认值：无
     */
    private Long org;
    /**
     * 字段名：NEW_FILE
     * 备注: 
     * 默认值：无
     */
    private String newFile;
    /**
     * 字段名：NUM
     * 备注: 
     * 默认值：无
     */
    private Integer num;
    /**
     * 字段名：ORDER
     * 备注: 
     * 默认值：无
     */
    private Integer order;
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

    public IscFileType (){

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
   * 字段名：TYPE
   * get方法
   * 备注: 
   */
   public String getType(){

        return type;
   }

   /**
   * 字段名：TYPE
   * set方法
   * 备注: 
   */
   public void setType(String type){
        this.type = type;
   }
   /**
   * 字段名：ORG
   * get方法
   * 备注: 
   */
   public Long getOrg(){

        return org;
   }

   /**
   * 字段名：ORG
   * set方法
   * 备注: 
   */
   public void setOrg(Long org){
        this.org = org;
   }
   /**
   * 字段名：NEW_FILE
   * get方法
   * 备注: 
   */
   public String getNewFile(){

        return newFile;
   }

   /**
   * 字段名：NEW_FILE
   * set方法
   * 备注: 
   */
   public void setNewFile(String newFile){
        this.newFile = newFile;
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
   * 字段名：ORDER
   * get方法
   * 备注: 
   */
   public Integer getOrder(){

        return order;
   }

   /**
   * 字段名：ORDER
   * set方法
   * 备注: 
   */
   public void setOrder(Integer order){
        this.order = order;
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