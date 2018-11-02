package com.winning.isc.model;

import java.util.Date; 
import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-47-02 09:47:25
 */
@Alias("sysOrganization")
public class SysOrganization extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：FID
     * 备注: 
     * 默认值：无
     */
    private Long fid;
    /**
     * 字段名：GRADE
     * 备注: 
     * 默认值：无
     */
    private Long grade;
    /**
     * 字段名：JGLX
     * 备注: 
     * 默认值：((0))
     */
    private Integer jglx;
    /**
     * 字段名：ORGCODE
     * 备注: 
     * 默认值：无
     */
    private String orgcode;
    /**
     * 字段名：NAME
     * 备注: 
     * 默认值：无
     */
    private String name;
    /**
     * 字段名：JGQC
     * 备注: 
     * 默认值：无
     */
    private String jgqc;
    /**
     * 字段名：PY
     * 备注: 
     * 默认值：无
     */
    private String py;
    /**
     * 字段名：FDNCODE
     * 备注: 
     * 默认值：无
     */
    private String fdncode;
    /**
     * 字段名：BBXH
     * 备注: 
     * 默认值：无
     */
    private String bbxh;
    /**
     * 字段名：YJBM
     * 备注: 
     * 默认值：无
     */
    private Long yjbm;
    /**
     * 字段名：SSGS
     * 备注: 
     * 默认值：无
     */
    private Long ssgs;
    /**
     * 字段名：ZT
     * 备注: 
     * 默认值：((1))
     */
    private Integer zt;
    /**
     * 字段名：GXSJ
     * 备注: 
     * 默认值：无
     */
    private Date gxsj;

    public SysOrganization (){

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
   * 字段名：FID
   * get方法
   * 备注: 
   */
   public Long getFid(){

        return fid;
   }

   /**
   * 字段名：FID
   * set方法
   * 备注: 
   */
   public void setFid(Long fid){
        this.fid = fid;
   }
   /**
   * 字段名：GRADE
   * get方法
   * 备注: 
   */
   public Long getGrade(){

        return grade;
   }

   /**
   * 字段名：GRADE
   * set方法
   * 备注: 
   */
   public void setGrade(Long grade){
        this.grade = grade;
   }
   /**
   * 字段名：JGLX
   * get方法
   * 备注: 
   */
   public Integer getJglx(){

        return jglx;
   }

   /**
   * 字段名：JGLX
   * set方法
   * 备注: 
   */
   public void setJglx(Integer jglx){
        this.jglx = jglx;
   }
   /**
   * 字段名：ORGCODE
   * get方法
   * 备注: 
   */
   public String getOrgcode(){

        return orgcode;
   }

   /**
   * 字段名：ORGCODE
   * set方法
   * 备注: 
   */
   public void setOrgcode(String orgcode){
        this.orgcode = orgcode;
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
   * 字段名：JGQC
   * get方法
   * 备注: 
   */
   public String getJgqc(){

        return jgqc;
   }

   /**
   * 字段名：JGQC
   * set方法
   * 备注: 
   */
   public void setJgqc(String jgqc){
        this.jgqc = jgqc;
   }
   /**
   * 字段名：PY
   * get方法
   * 备注: 
   */
   public String getPy(){

        return py;
   }

   /**
   * 字段名：PY
   * set方法
   * 备注: 
   */
   public void setPy(String py){
        this.py = py;
   }
   /**
   * 字段名：FDNCODE
   * get方法
   * 备注: 
   */
   public String getFdncode(){

        return fdncode;
   }

   /**
   * 字段名：FDNCODE
   * set方法
   * 备注: 
   */
   public void setFdncode(String fdncode){
        this.fdncode = fdncode;
   }
   /**
   * 字段名：BBXH
   * get方法
   * 备注: 
   */
   public String getBbxh(){

        return bbxh;
   }

   /**
   * 字段名：BBXH
   * set方法
   * 备注: 
   */
   public void setBbxh(String bbxh){
        this.bbxh = bbxh;
   }
   /**
   * 字段名：YJBM
   * get方法
   * 备注: 
   */
   public Long getYjbm(){

        return yjbm;
   }

   /**
   * 字段名：YJBM
   * set方法
   * 备注: 
   */
   public void setYjbm(Long yjbm){
        this.yjbm = yjbm;
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
   * 字段名：ZT
   * get方法
   * 备注: 
   */
   public Integer getZt(){

        return zt;
   }

   /**
   * 字段名：ZT
   * set方法
   * 备注: 
   */
   public void setZt(Integer zt){
        this.zt = zt;
   }
   /**
   * 字段名：GXSJ
   * get方法
   * 备注: 
   */
   public Date getGxsj(){

        return gxsj;
   }

   /**
   * 字段名：GXSJ
   * set方法
   * 备注: 
   */
   public void setGxsj(Date gxsj){
        this.gxsj = gxsj;
   }

}