package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.IscTools;


/**
* @author HLHT
* @title ISC_TOOLS
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-46-02 09:46:47
*/
public interface IscToolsService {

    public int createIscTools(IscTools iscTools);

    public int modifyIscTools(IscTools iscTools);

    public int removeIscTools(IscTools iscTools);

    public IscTools getIscTools(IscTools iscTools);

    public int getIscToolsCount(IscTools iscTools);

    public List<IscTools> getIscToolsList(IscTools iscTools);

    public List<IscTools> getIscToolsPageList(IscTools iscTools);
}