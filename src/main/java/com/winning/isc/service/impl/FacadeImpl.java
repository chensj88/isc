package com.winning.isc.service.impl;

import com.winning.isc.service.Facade;
import com.winning.isc.service.PubOrgExtService;
import com.winning.isc.service.PubOrgService;
import com.winning.isc.service.PubUserInfoService;
import com.winning.isc.ws.service.PmisWebServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chensj
 * @title FacadeImpl
 * @email chensj@winning.com.cn
 * @package com.winning.hic.service.impl;
 * @date 2018-05-23 09:05:16
 */
@Component
public class FacadeImpl implements Facade {

    @Autowired
    private PmisWebServiceClient pmisWebServiceClient;

    @Override
    public PmisWebServiceClient getPmisWebServiceClient() {
        return pmisWebServiceClient;
    }

    @Autowired
    PubUserInfoService pubUserInfoService;

    @Autowired
    PubOrgService pubOrgService;

    @Autowired
    PubOrgExtService pubOrgExtService;


    public PubUserInfoService getPubUserInfoService(){
        return pubUserInfoService;
    }

    public PubOrgService getPubOrgService(){
        return pubOrgService;
    }

    public PubOrgExtService getPubOrgExtService(){
        return pubOrgExtService;
    }
}