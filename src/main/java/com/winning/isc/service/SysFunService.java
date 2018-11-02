package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.SysFun;


/**
* @author HLHT
* @title SYS_FUN
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:06
*/
public interface SysFunService {

    public int createSysFun(SysFun sysFun);

    public int modifySysFun(SysFun sysFun);

    public int removeSysFun(SysFun sysFun);

    public SysFun getSysFun(SysFun sysFun);

    public int getSysFunCount(SysFun sysFun);

    public List<SysFun> getSysFunList(SysFun sysFun);

    public List<SysFun> getSysFunPageList(SysFun sysFun);
}