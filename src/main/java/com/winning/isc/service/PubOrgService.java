package com.winning.isc.service;

import java.util.List;  

import com.winning.isc.model.PubOrg;  


/**
* @author ISC [Implementation service center]
* @title PUB_ORG
* @email Winning Health
* @package com.winning.isc.service
* @date 2018-12-29 16:12:53
*/
public interface PubOrgService {

    public int createPubOrg(PubOrg pubOrg);

    public int modifyPubOrg(PubOrg pubOrg);

    public int removePubOrg(PubOrg pubOrg);

    public PubOrg getPubOrg(PubOrg pubOrg);

    public int getPubOrgCount(PubOrg pubOrg);

    public List<PubOrg> getPubOrgList(PubOrg pubOrg);

    public List<PubOrg> getPubOrgPageList(PubOrg pubOrg);
}