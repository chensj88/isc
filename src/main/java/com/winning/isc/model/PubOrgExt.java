package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author ISC [Implementation service center]
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-12-29 16:12:54
 */
@Alias("pubOrgExt")
public class PubOrgExt extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ORG_ID
     * 备注: 
     * 默认值：无
     */
    private Long orgId;
    /**
     * 字段名：ORG_NAME
     * 备注: 
     * 默认值：无
     */
    private String orgName;
    /**
     * 字段名：ORG_CODE
     * 备注: 
     * 默认值：无
     */
    private String orgCode;
    /**
     * 字段名：ORG_NAME_EXT
     * 备注: 
     * 默认值：无
     */
    private String orgNameExt;

    public PubOrgExt (){

    }

   /**
   * 字段名：ORG_ID
   * get方法
   * 备注: 
   */
   public Long getOrgId(){

        return orgId;
   }

   /**
   * 字段名：ORG_ID
   * set方法
   * 备注: 
   */
   public void setOrgId(Long orgId){
        this.orgId = orgId;
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
   * 字段名：ORG_CODE
   * get方法
   * 备注: 
   */
   public String getOrgCode(){

        return orgCode;
   }

   /**
   * 字段名：ORG_CODE
   * set方法
   * 备注: 
   */
   public void setOrgCode(String orgCode){
        this.orgCode = orgCode;
   }
   /**
   * 字段名：ORG_NAME_EXT
   * get方法
   * 备注: 
   */
   public String getOrgNameExt(){

        return orgNameExt;
   }

   /**
   * 字段名：ORG_NAME_EXT
   * set方法
   * 备注: 
   */
   public void setOrgNameExt(String orgNameExt){
        this.orgNameExt = orgNameExt;
   }

}