package com.winning.isc.model;

import java.io.Serializable; 

import org.apache.ibatis.type.Alias; 

import com.winning.isc.model.BaseDomain;



/**
 * @author ISC
 * @title 
 * @email Winning Health
 * @package com.winning.isc.model
 * @date 2018-21-08 09:21:42
 */
@Alias("sysDictInfo")
public class SysDictInfo extends BaseDomain implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 字段名：DICT_CODE
     * 备注: 
     * 默认值：无
     */
    private String dictCode;
    /**
     * 字段名：DICT_VALUE
     * 备注: 
     * 默认值：无
     */
    private String dictValue;
    /**
     * 字段名：DICT_LABEL
     * 备注: 
     * 默认值：无
     */
    private String dictLabel;
    /**
     * 字段名：DICT_SORT
     * 备注: 
     * 默认值：无
     */
    private String dictSort;
    /**
     * 字段名：DICT_DESC
     * 备注: 
     * 默认值：无
     */
    private String dictDesc;
    /**
     * 字段名：PY_CODE
     * 备注: 
     * 默认值：无
     */
    private String pyCode;

    public SysDictInfo (){

    }

   /**
   * 字段名：DICT_CODE
   * get方法
   * 备注: 
   */
   public String getDictCode(){

        return dictCode;
   }

   /**
   * 字段名：DICT_CODE
   * set方法
   * 备注: 
   */
   public void setDictCode(String dictCode){
        this.dictCode = dictCode;
   }
   /**
   * 字段名：DICT_VALUE
   * get方法
   * 备注: 
   */
   public String getDictValue(){

        return dictValue;
   }

   /**
   * 字段名：DICT_VALUE
   * set方法
   * 备注: 
   */
   public void setDictValue(String dictValue){
        this.dictValue = dictValue;
   }
   /**
   * 字段名：DICT_LABEL
   * get方法
   * 备注: 
   */
   public String getDictLabel(){

        return dictLabel;
   }

   /**
   * 字段名：DICT_LABEL
   * set方法
   * 备注: 
   */
   public void setDictLabel(String dictLabel){
        this.dictLabel = dictLabel;
   }
   /**
   * 字段名：DICT_SORT
   * get方法
   * 备注: 
   */
   public String getDictSort(){

        return dictSort;
   }

   /**
   * 字段名：DICT_SORT
   * set方法
   * 备注: 
   */
   public void setDictSort(String dictSort){
        this.dictSort = dictSort;
   }
   /**
   * 字段名：DICT_DESC
   * get方法
   * 备注: 
   */
   public String getDictDesc(){

        return dictDesc;
   }

   /**
   * 字段名：DICT_DESC
   * set方法
   * 备注: 
   */
   public void setDictDesc(String dictDesc){
        this.dictDesc = dictDesc;
   }
   /**
   * 字段名：PY_CODE
   * get方法
   * 备注: 
   */
   public String getPyCode(){

        return pyCode;
   }

   /**
   * 字段名：PY_CODE
   * set方法
   * 备注: 
   */
   public void setPyCode(String pyCode){
        this.pyCode = pyCode;
   }

}