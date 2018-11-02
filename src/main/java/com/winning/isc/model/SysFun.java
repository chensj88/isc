package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-47-02 09:47:06
 */
@Alias("sysFun")
public class SysFun extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：FUN_CODE
     * 备注: 
     * 默认值：无
     */
    private String funCode;
    /**
     * 字段名：FUN_NAME
     * 备注: 
     * 默认值：无
     */
    private String funName;
    /**
     * 字段名：ICON_PATH
     * 备注: 
     * 默认值：无
     */
    private String iconPath;
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

    public SysFun (){

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
   * 字段名：FUN_CODE
   * get方法
   * 备注: 
   */
   public String getFunCode(){

        return funCode;
   }

   /**
   * 字段名：FUN_CODE
   * set方法
   * 备注: 
   */
   public void setFunCode(String funCode){
        this.funCode = funCode;
   }
   /**
   * 字段名：FUN_NAME
   * get方法
   * 备注: 
   */
   public String getFunName(){

        return funName;
   }

   /**
   * 字段名：FUN_NAME
   * set方法
   * 备注: 
   */
   public void setFunName(String funName){
        this.funName = funName;
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