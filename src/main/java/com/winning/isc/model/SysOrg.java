package com.winning.isc.model;

import java.util.Date; 
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
 * @date 2018-51-30 15:51:27
 */
@Alias("sysOrg")
@Data
@EqualsAndHashCode(callSuper = false)
public class SysOrg extends BaseDomain implements Serializable {

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
}