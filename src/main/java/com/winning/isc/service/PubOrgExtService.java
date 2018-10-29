package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.PubOrgExt;  


/**
* @author ISC [Implementation service center]
* @title PUB_ORG_EXT
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-12-29 16:12:54
*/
public interface PubOrgExtService {

    public int createPubOrgExt(PubOrgExt pubOrgExt);

    public int modifyPubOrgExt(PubOrgExt pubOrgExt);

    public int removePubOrgExt(PubOrgExt pubOrgExt);

    public PubOrgExt getPubOrgExt(PubOrgExt pubOrgExt);

    public int getPubOrgExtCount(PubOrgExt pubOrgExt);

    public List<PubOrgExt> getPubOrgExtList(PubOrgExt pubOrgExt);

    public List<PubOrgExt> getPubOrgExtPageList(PubOrgExt pubOrgExt);

    public void createPubOrgExtByProc(PubOrgExt pubOrgExt);
}