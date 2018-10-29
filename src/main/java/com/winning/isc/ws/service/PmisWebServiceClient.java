package com.winning.isc.ws.service;


import com.winning.isc.utils.Constants;
import com.winning.isc.utils.PmisWSUtil;
import com.winning.isc.ws.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenshijie
 * @title PMIS接口表导入数据表
 * @email chensj@winning.com.cm
 * @package cn.com.winning.ssgj.ws.service
 * @date 2018-02-05 13:09
 */
@Component
public class PmisWebServiceClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmisWebServiceClient.class);

    /**
     * 用户登录(PMIS验证)
     * @param userid 工号
     * @param password 密码(MD5)
     * @return
     */
    public QueryResult userLoginValidateByPmis(String userid, String password){
        LBEBusinessService lbeBusinessService = PmisWSUtil.createLBEBusinessService();
        LoginResult loginResult = PmisWSUtil.createLoginResult();
        List<LbParameter> params = PmisWSUtil.createUserLoginLbParameter(userid,password);
        QueryResult queryResult = lbeBusinessService.query(
                loginResult.getSessionId(),
                Constants.PmisWSConstants.USER_LOGIN_WS_SERVICE_OBJECT_NAME,
                params,
                "",
                new QueryOption());
        PmisWSUtil.createLogoutResult(loginResult);
        return queryResult;
    }
}
