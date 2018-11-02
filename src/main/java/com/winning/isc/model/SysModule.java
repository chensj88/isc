package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-47-02 09:47:14
 */
@Alias("sysModule")
public class SysModule extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：MOD_ID
     * 备注: 
     * 默认值：无
     */
    private Long modId;
    /**
     * 字段名：PAR_ID
     * 备注: 
     * 默认值：无
     */
    private Long parId;
    /**
     * 字段名：MOD_NAME
     * 备注: 
     * 默认值：无
     */
    private String modName;
    /**
     * 字段名：MOD_DESC
     * 备注: 
     * 默认值：无
     */
    private String modDesc;
    /**
     * 字段名：MOD_LEVEL
     * 备注: 
     * 默认值：无
     */
    private Integer modLevel;
    /**
     * 字段名：MOD_URL
     * 备注: 
     * 默认值：无
     */
    private String modUrl;
    /**
     * 字段名：ICON_PATH
     * 备注: 
     * 默认值：无
     */
    private String iconPath;
    /**
     * 字段名：IS_LEAF
     * 备注: 
     * 默认值：无
     */
    private Integer isLeaf;
    /**
     * 字段名：IS_MANAGER
     * 备注: 
     * 默认值：无
     */
    private Integer isManager;
    /**
     * 字段名：ORDER_VALUE
     * 备注: 
     * 默认值：无
     */
    private Integer orderValue;
    /**
     * 字段名：IS_DEL
     * 备注: 
     * 默认值：无
     */
    private Integer isDel;

    public SysModule (){

    }

   /**
   * 字段名：MOD_ID
   * get方法
   * 备注: 
   */
   public Long getModId(){

        return modId;
   }

   /**
   * 字段名：MOD_ID
   * set方法
   * 备注: 
   */
   public void setModId(Long modId){
        this.modId = modId;
   }
   /**
   * 字段名：PAR_ID
   * get方法
   * 备注: 
   */
   public Long getParId(){

        return parId;
   }

   /**
   * 字段名：PAR_ID
   * set方法
   * 备注: 
   */
   public void setParId(Long parId){
        this.parId = parId;
   }
   /**
   * 字段名：MOD_NAME
   * get方法
   * 备注: 
   */
   public String getModName(){

        return modName;
   }

   /**
   * 字段名：MOD_NAME
   * set方法
   * 备注: 
   */
   public void setModName(String modName){
        this.modName = modName;
   }
   /**
   * 字段名：MOD_DESC
   * get方法
   * 备注: 
   */
   public String getModDesc(){

        return modDesc;
   }

   /**
   * 字段名：MOD_DESC
   * set方法
   * 备注: 
   */
   public void setModDesc(String modDesc){
        this.modDesc = modDesc;
   }
   /**
   * 字段名：MOD_LEVEL
   * get方法
   * 备注: 
   */
   public Integer getModLevel(){

        return modLevel;
   }

   /**
   * 字段名：MOD_LEVEL
   * set方法
   * 备注: 
   */
   public void setModLevel(Integer modLevel){
        this.modLevel = modLevel;
   }
   /**
   * 字段名：MOD_URL
   * get方法
   * 备注: 
   */
   public String getModUrl(){

        return modUrl;
   }

   /**
   * 字段名：MOD_URL
   * set方法
   * 备注: 
   */
   public void setModUrl(String modUrl){
        this.modUrl = modUrl;
   }
   /**
   * 字段名：ICON_PATH
   * get方法
   * 备注: 
   */
   public String getIconPath(){

        return iconPath;
   }

   /**
   * 字段名：ICON_PATH
   * set方法
   * 备注: 
   */
   public void setIconPath(String iconPath){
        this.iconPath = iconPath;
   }
   /**
   * 字段名：IS_LEAF
   * get方法
   * 备注: 
   */
   public Integer getIsLeaf(){

        return isLeaf;
   }

   /**
   * 字段名：IS_LEAF
   * set方法
   * 备注: 
   */
   public void setIsLeaf(Integer isLeaf){
        this.isLeaf = isLeaf;
   }
   /**
   * 字段名：IS_MANAGER
   * get方法
   * 备注: 
   */
   public Integer getIsManager(){

        return isManager;
   }

   /**
   * 字段名：IS_MANAGER
   * set方法
   * 备注: 
   */
   public void setIsManager(Integer isManager){
        this.isManager = isManager;
   }
   /**
   * 字段名：ORDER_VALUE
   * get方法
   * 备注: 
   */
   public Integer getOrderValue(){

        return orderValue;
   }

   /**
   * 字段名：ORDER_VALUE
   * set方法
   * 备注: 
   */
   public void setOrderValue(Integer orderValue){
        this.orderValue = orderValue;
   }
   /**
   * 字段名：IS_DEL
   * get方法
   * 备注: 
   */
   public Integer getIsDel(){

        return isDel;
   }

   /**
   * 字段名：IS_DEL
   * set方法
   * 备注: 
   */
   public void setIsDel(Integer isDel){
        this.isDel = isDel;
   }

}