package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysDictInfo;  


/**
* @author ISC
* @title SYS_DICT_INFO
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-21-08 09:21:42
*/
public interface SysDictInfoService {

    public int createSysDictInfo(SysDictInfo sysDictInfo);

    public int modifySysDictInfo(SysDictInfo sysDictInfo);

    public int removeSysDictInfo(SysDictInfo sysDictInfo);

    public SysDictInfo getSysDictInfo(SysDictInfo sysDictInfo);

    public int getSysDictInfoCount(SysDictInfo sysDictInfo);

    public List<SysDictInfo> getSysDictInfoList(SysDictInfo sysDictInfo);

    public List<SysDictInfo> getSysDictInfoPageList(SysDictInfo sysDictInfo);
}