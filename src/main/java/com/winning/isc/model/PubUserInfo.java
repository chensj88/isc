package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author ISC [Implementation service center]
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-12-29 16:12:50
 */
@Alias("pubUserInfo")
public class PubUserInfo extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：STATUS
     * 备注: 
     * 默认值：((1))
     */
    private Integer status;
    /**
     * 字段名：USERID
     * 备注: 
     * 默认值：无
     */
    private String userid;
    /**
     * 字段名：YHMC
     * 备注: 
     * 默认值：无
     */
    private String yhmc;
    /**
     * 字段名：NAME
     * 备注: 
     * 默认值：无
     */
    private String name;
    /**
     * 字段名：Email
     * 备注: 
     * 默认值：无
     */
    private String email;
    /**
     * 字段名：MOBILE
     * 备注: 
     * 默认值：无
     */
    private String mobile;
    /**
     * 字段名：TELEPHONE
     * 备注: 
     * 默认值：无
     */
    private String telephone;
    /**
     * 字段名：PASSWORD
     * 备注: 
     * 默认值：无
     */
    private String password;
    /**
     * 字段名：ORGID
     * 备注: 
     * 默认值：无
     */
    private Long orgid;
    /**
     * 字段名：SSGS
     * 备注: 
     * 默认值：无
     */
    private Long ssgs;
    /**
     * 字段名：USER_TYPE
     * 备注: 
     * 默认值：('0')
     */
    private String userType;
    /**
     * 字段名：LINK_ID
     * 备注: 
     * 默认值：无
     */
    private String linkId;
    /**
     * 字段名：OPEN_ID
     * 备注: 
     * 默认值：无
     */
    private String openId;

    public PubUserInfo (){

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
   * 字段名：STATUS
   * get方法
   * 备注: 
   */
   public Integer getStatus(){

        return status;
   }

   /**
   * 字段名：STATUS
   * set方法
   * 备注: 
   */
   public void setStatus(Integer status){
        this.status = status;
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
   * 字段名：YHMC
   * get方法
   * 备注: 
   */
   public String getYhmc(){

        return yhmc;
   }

   /**
   * 字段名：YHMC
   * set方法
   * 备注: 
   */
   public void setYhmc(String yhmc){
        this.yhmc = yhmc;
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
   * 字段名：Email
   * get方法
   * 备注: 
   */
   public String getEmail(){

        return email;
   }

   /**
   * 字段名：Email
   * set方法
   * 备注: 
   */
   public void setEmail(String email){
        this.email = email;
   }
   /**
   * 字段名：MOBILE
   * get方法
   * 备注: 
   */
   public String getMobile(){

        return mobile;
   }

   /**
   * 字段名：MOBILE
   * set方法
   * 备注: 
   */
   public void setMobile(String mobile){
        this.mobile = mobile;
   }
   /**
   * 字段名：TELEPHONE
   * get方法
   * 备注: 
   */
   public String getTelephone(){

        return telephone;
   }

   /**
   * 字段名：TELEPHONE
   * set方法
   * 备注: 
   */
   public void setTelephone(String telephone){
        this.telephone = telephone;
   }
   /**
   * 字段名：PASSWORD
   * get方法
   * 备注: 
   */
   public String getPassword(){

        return password;
   }

   /**
   * 字段名：PASSWORD
   * set方法
   * 备注: 
   */
   public void setPassword(String password){
        this.password = password;
   }
   /**
   * 字段名：ORGID
   * get方法
   * 备注: 
   */
   public Long getOrgid(){

        return orgid;
   }

   /**
   * 字段名：ORGID
   * set方法
   * 备注: 
   */
   public void setOrgid(Long orgid){
        this.orgid = orgid;
   }
   /**
   * 字段名：SSGS
   * get方法
   * 备注: 
   */
   public Long getSsgs(){

        return ssgs;
   }

   /**
   * 字段名：SSGS
   * set方法
   * 备注: 
   */
   public void setSsgs(Long ssgs){
        this.ssgs = ssgs;
   }
   /**
   * 字段名：USER_TYPE
   * get方法
   * 备注: 
   */
   public String getUserType(){

        return userType;
   }

   /**
   * 字段名：USER_TYPE
   * set方法
   * 备注: 
   */
   public void setUserType(String userType){
        this.userType = userType;
   }
   /**
   * 字段名：LINK_ID
   * get方法
   * 备注: 
   */
   public String getLinkId(){

        return linkId;
   }

   /**
   * 字段名：LINK_ID
   * set方法
   * 备注: 
   */
   public void setLinkId(String linkId){
        this.linkId = linkId;
   }
   /**
   * 字段名：OPEN_ID
   * get方法
   * 备注: 
   */
   public String getOpenId(){

        return openId;
   }

   /**
   * 字段名：OPEN_ID
   * set方法
   * 备注: 
   */
   public void setOpenId(String openId){
        this.openId = openId;
   }

}