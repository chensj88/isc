package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.IscSuggest;


/**
* @author HLHT
* @title ISC_SUGGEST
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-47-02 09:47:03
*/
public interface IscSuggestService {

    public int createIscSuggest(IscSuggest iscSuggest);

    public int modifyIscSuggest(IscSuggest iscSuggest);

    public int removeIscSuggest(IscSuggest iscSuggest);

    public IscSuggest getIscSuggest(IscSuggest iscSuggest);

    public int getIscSuggestCount(IscSuggest iscSuggest);

    public List<IscSuggest> getIscSuggestList(IscSuggest iscSuggest);

    public List<IscSuggest> getIscSuggestPageList(IscSuggest iscSuggest);
}