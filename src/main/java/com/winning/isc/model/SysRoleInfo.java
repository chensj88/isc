package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-47-02 09:47:28
 */
@Alias("sysRoleInfo")
public class SysRoleInfo extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：ROLE_NAME
     * 备注: 
     * 默认值：无
     */
    private String roleName;
    /**
     * 字段名：ROLE_DESC
     * 备注: 
     * 默认值：无
     */
    private String roleDesc;
    /**
     * 字段名：ORDER_VALUE
     * 备注: 
     * 默认值：((0))
     */
    private Integer orderValue;
    /**
     * 字段名：IS_LOCK
     * 备注: 
     * 默认值：((0))
     */
    private Integer isLock;
    /**
     * 字段名：is_del
     * 备注: 
     * 默认值：((0))
     */
    private Integer isDel;

    public SysRoleInfo (){

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
   * 字段名：ROLE_NAME
   * get方法
   * 备注: 
   */
   public String getRoleName(){

        return roleName;
   }

   /**
   * 字段名：ROLE_NAME
   * set方法
   * 备注: 
   */
   public void setRoleName(String roleName){
        this.roleName = roleName;
   }
   /**
   * 字段名：ROLE_DESC
   * get方法
   * 备注: 
   */
   public String getRoleDesc(){

        return roleDesc;
   }

   /**
   * 字段名：ROLE_DESC
   * set方法
   * 备注: 
   */
   public void setRoleDesc(String roleDesc){
        this.roleDesc = roleDesc;
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
   * 字段名：IS_LOCK
   * get方法
   * 备注: 
   */
   public Integer getIsLock(){

        return isLock;
   }

   /**
   * 字段名：IS_LOCK
   * set方法
   * 备注: 
   */
   public void setIsLock(Integer isLock){
        this.isLock = isLock;
   }
   /**
   * 字段名：is_del
   * get方法
   * 备注: 
   */
   public Integer getIsDel(){

        return isDel;
   }

   /**
   * 字段名：is_del
   * set方法
   * 备注: 
   */
   public void setIsDel(Integer isDel){
        this.isDel = isDel;
   }

}