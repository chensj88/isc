package com.winning.isc.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

import com.winning.isc.model.BaseDomain;

import lombok.Data;

/**
 * @author ISC [Implementation service center]
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-51-30 15:51:22
 */
@Alias("sysUserInfo")
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUserInfo extends BaseDomain implements Serializable {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Long getSsgs() {
        return ssgs;
    }

    public void setSsgs(Long ssgs) {
        this.ssgs = ssgs;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}