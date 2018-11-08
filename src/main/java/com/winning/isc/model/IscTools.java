package com.winning.isc.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * @author HLHT
 * @title
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-46-02 09:46:47
 */
@Alias("iscTools")
public class IscTools extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注:
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：NAME
     * 备注:
     * 默认值：无
     */
    private String name;
    /**
     * 字段名：LOGO
     * 备注:
     * 默认值：无
     */
    private String logo;
    /**
     * 字段名：LEADER
     * 备注:
     * 默认值：无
     */
    private String leader;
    /**
     * 字段名：PHONE
     * 备注:
     * 默认值：无
     */
    private Integer phone;
    /**
     * 字段名：TOOL_RAR
     * 备注:
     * 默认值：无
     */
    private String toolRar;
    /**
     * 字段名：CONTENT
     * 备注:
     * 默认值：无
     */
    private String content;
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
     * 字段名：LINK_HTTP
     * 备注:
     * 默认值：无
     */
    private String linkHttp;
    /**
     * 字段名：VIEW_NUM
     * 备注:
     * 默认值：((0))
     */
    private Integer viewNum;
    /**
     * 字段名：DOWM_NUM
     * 备注:
     * 默认值：((0))
     */
    private Integer dowmNum;
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
    private Timestamp createTime;
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
    private Timestamp operateTime;
    /**
     * 字段名：IS_STOP
     * 备注:
     * 默认值：((0))
     */
    private Integer isStop;

    private Integer type;

    private Long fileTypeId;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public IscTools() {

    }

    /**
     * 字段名：ID
     * get方法
     * 备注:
     */
    public Long getId() {

        return id;
    }

    /**
     * 字段名：ID
     * set方法
     * 备注:
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 字段名：NAME
     * get方法
     * 备注:
     */
    public String getName() {

        return name;
    }

    /**
     * 字段名：NAME
     * set方法
     * 备注:
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 字段名：LOGO
     * get方法
     * 备注:
     */
    public String getLogo() {

        return logo;
    }

    /**
     * 字段名：LOGO
     * set方法
     * 备注:
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 字段名：LEADER
     * get方法
     * 备注:
     */
    public String getLeader() {

        return leader;
    }

    /**
     * 字段名：LEADER
     * set方法
     * 备注:
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 字段名：PHONE
     * get方法
     * 备注:
     */
    public Integer getPhone() {

        return phone;
    }

    /**
     * 字段名：PHONE
     * set方法
     * 备注:
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 字段名：TOOL_RAR
     * get方法
     * 备注:
     */
    public String getToolRar() {

        return toolRar;
    }

    /**
     * 字段名：TOOL_RAR
     * set方法
     * 备注:
     */
    public void setToolRar(String toolRar) {
        this.toolRar = toolRar;
    }

    /**
     * 字段名：CONTENT
     * get方法
     * 备注:
     */
    public String getContent() {

        return content;
    }

    /**
     * 字段名：CONTENT
     * set方法
     * 备注:
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 字段名：DOWN_LOAD
     * get方法
     * 备注:
     */
    public String getDownLoad() {

        return downLoad;
    }

    /**
     * 字段名：DOWN_LOAD
     * set方法
     * 备注:
     */
    public void setDownLoad(String downLoad) {
        this.downLoad = downLoad;
    }

    /**
     * 字段名：DOWN_CONTENT
     * get方法
     * 备注:
     */
    public String getDownContent() {

        return downContent;
    }

    /**
     * 字段名：DOWN_CONTENT
     * set方法
     * 备注:
     */
    public void setDownContent(String downContent) {
        this.downContent = downContent;
    }

    /**
     * 字段名：LINK_HTTP
     * get方法
     * 备注:
     */
    public String getLinkHttp() {

        return linkHttp;
    }

    /**
     * 字段名：LINK_HTTP
     * set方法
     * 备注:
     */
    public void setLinkHttp(String linkHttp) {
        this.linkHttp = linkHttp;
    }

    /**
     * 字段名：VIEW_NUM
     * get方法
     * 备注:
     */
    public Integer getViewNum() {

        return viewNum;
    }

    /**
     * 字段名：VIEW_NUM
     * set方法
     * 备注:
     */
    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    /**
     * 字段名：DOWM_NUM
     * get方法
     * 备注:
     */
    public Integer getDowmNum() {

        return dowmNum;
    }

    /**
     * 字段名：DOWM_NUM
     * set方法
     * 备注:
     */
    public void setDowmNum(Integer dowmNum) {
        this.dowmNum = dowmNum;
    }

    /**
     * 字段名：CREATOR
     * get方法
     * 备注:
     */
    public String getCreator() {

        return creator;
    }

    /**
     * 字段名：CREATOR
     * set方法
     * 备注:
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 字段名：CREATE_TIME
     * get方法
     * 备注:
     */
    public Timestamp getCreateTime() {

        return createTime;
    }

    /**
     * 字段名：CREATE_TIME
     * set方法
     * 备注:
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * 字段名：OPERATER
     * get方法
     * 备注:
     */
    public String getOperater() {

        return operater;
    }

    /**
     * 字段名：OPERATER
     * set方法
     * 备注:
     */
    public void setOperater(String operater) {
        this.operater = operater;
    }

    /**
     * 字段名：OPERATE_TIME
     * get方法
     * 备注:
     */
    public Timestamp getOperateTime() {

        return operateTime;
    }

    /**
     * 字段名：OPERATE_TIME
     * set方法
     * 备注:
     */
    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 字段名：IS_STOP
     * get方法
     * 备注:
     */
    public Integer getIsStop() {

        return isStop;
    }

    /**
     * 字段名：IS_STOP
     * set方法
     * 备注:
     */
    public void setIsStop(Integer isStop) {
        this.isStop = isStop;
    }

    public Long getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Long fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

}