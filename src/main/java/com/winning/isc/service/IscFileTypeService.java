package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.IscFileType;  


/**
* @author ISC
* @title ISC_FILE_TYPE
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-29-08 17:29:53
*/
public interface IscFileTypeService {

    public int createIscFileType(IscFileType iscFileType);

    public int modifyIscFileType(IscFileType iscFileType);

    public int removeIscFileType(IscFileType iscFileType);

    public IscFileType getIscFileType(IscFileType iscFileType);

    public int getIscFileTypeCount(IscFileType iscFileType);

    public List<IscFileType> getIscFileTypeList(IscFileType iscFileType);

    public List<IscFileType> getIscFileTypePageList(IscFileType iscFileType);
}