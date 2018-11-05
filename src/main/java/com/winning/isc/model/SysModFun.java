package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author HLHT
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-47-02 09:47:07
 */
@Alias("sysModFun")
public class SysModFun extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：MOD_ID
     * 备注: 
     * 默认值：无
     */
    private Long modId;
    /**
     * 字段名：FUN_ID
     * 备注: 
     * 默认值：无
     */
    private Long funId;

    public SysModFun (){

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
   * 字段名：FUN_ID
   * get方法
   * 备注: 
   */
   public Long getFunId(){

        return funId;
   }

   /**
   * 字段名：FUN_ID
   * set方法
   * 备注: 
   */
   public void setFunId(Long funId){
        this.funId = funId;
   }

}