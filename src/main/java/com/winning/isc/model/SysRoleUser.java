package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-47-02 09:47:26
 */
@Alias("sysRoleUser")
public class SysRoleUser extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：ID
     * 备注: 
     * 默认值：无
     */
    private Long id;
    /**
     * 字段名：ROLE_ID
     * 备注: 
     * 默认值：无
     */
    private Long roleId;
    /**
     * 字段名：USER_ID
     * 备注: 
     * 默认值：无
     */
    private Long userId;

    public SysRoleUser (){

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
   * 字段名：ROLE_ID
   * get方法
   * 备注: 
   */
   public Long getRoleId(){

        return roleId;
   }

   /**
   * 字段名：ROLE_ID
   * set方法
   * 备注: 
   */
   public void setRoleId(Long roleId){
        this.roleId = roleId;
   }
   /**
   * 字段名：USER_ID
   * get方法
   * 备注: 
   */
   public Long getUserId(){

        return userId;
   }

   /**
   * 字段名：USER_ID
   * set方法
   * 备注: 
   */
   public void setUserId(Long userId){
        this.userId = userId;
   }

}