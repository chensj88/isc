package com.winning.isc.dao;



import java.util.List;  

import org.springframework.dao.DataAccessException;  

import com.winning.isc.model.IscSuggest;



import org.springframework.stereotype.Repository;
/**
* @author HLHT
* @title DAO接口
* @email Winning Health
* @package com.winning.isc.dao
* @date 2018-47-02 09:47:03
*/
@Repository
public interface IscSuggestDao {

    public int insertIscSuggest(IscSuggest iscSuggest) throws DataAccessException;

    public int updateIscSuggest(IscSuggest iscSuggest) throws DataAccessException;

    public int deleteIscSuggest(IscSuggest iscSuggest) throws DataAccessException;

    public IscSuggest selectIscSuggest(IscSuggest iscSuggest) throws DataAccessException;

    public Object selectIscSuggestCount(IscSuggest iscSuggest) throws DataAccessException;

    public List<IscSuggest> selectIscSuggestList(IscSuggest iscSuggest) throws DataAccessException;

    public List<IscSuggest> selectIscSuggestPageList(IscSuggest iscSuggest) throws DataAccessException;
}