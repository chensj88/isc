package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.PubUserInfo;  


/**
* @author ISC [Implementation service center]
* @title PUB_USER_INFO
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-12-29 16:12:50
*/
public interface PubUserInfoService {

    public int createPubUserInfo(PubUserInfo pubUserInfo);

    public int modifyPubUserInfo(PubUserInfo pubUserInfo);

    public int removePubUserInfo(PubUserInfo pubUserInfo);

    public PubUserInfo getPubUserInfo(PubUserInfo pubUserInfo);

    public int getPubUserInfoCount(PubUserInfo pubUserInfo);

    public List<PubUserInfo> getPubUserInfoList(PubUserInfo pubUserInfo);

    public List<PubUserInfo> getPubUserInfoPageList(PubUserInfo pubUserInfo);
}