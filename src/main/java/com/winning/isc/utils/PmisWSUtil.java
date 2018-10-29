package com.winning.isc.utils;

import com.winning.isc.ws.client.*;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenshijie
 * @title
 * @email chensj@winning.com.cm
 * @package cn.com.winning.ssgj.base.util
 * @date 2018-02-05 13:19
 */
public class PmisWSUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmisWSUtil.class);

    private static LBEBusinessService lbeBusinessService = null;

    /**
     * 获取登录结果，主要提取结果中sessionId用户后续查询使用
     * @return
     */
    public static LoginResult createLoginResult() {

        LoginResult result = createLBEBusinessService().login(Constants.PmisWSConstants.WS_USER,
                            Constants.PmisWSConstants.WS_PASSWORD,
                            "",
                            Constants.PmisWSConstants.WS_ALGORITHM,
                           "");
        LOGGER.info("WebService用户"+Constants.PmisWSConstants.WS_USER+"登录系统："+result.getMessage());

        return result;
    }

    /**
     * 退出登录解决超时问题
     */
    public static void createLogoutResult(LoginResult result) {
       LogoutResult logoutResult = createLBEBusinessService().logout(result.getSessionId());
       LOGGER.info("WebService用户"+Constants.PmisWSConstants.WS_USER+"退出登录："+logoutResult.getMessage());
    }

    /**
     * 获取WS服务 LBEBusinessService
     * @return
     */
    public static LBEBusinessService createLBEBusinessService() {
        if (lbeBusinessService == null) {
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
            factory.setServiceClass(LBEBusinessService.class);
            factory.setAddress(Constants.PmisWSConstants.WS_URL);
            lbeBusinessService = factory.create(LBEBusinessService.class);
        }
        return lbeBusinessService;
    }

    /**
     * 用户登录验证参数
     * @param userid
     * @param password
     * @return
     */
    public static List<LbParameter> createUserLoginLbParameter(String userid, String password) {
        List<LbParameter> params = new ArrayList<>();
        LbParameter param = new LbParameter();
        param.setName("Puserid");
        param.setValue(userid);
        params.add(param);
        param = new LbParameter();
        param.setName("Ppassword");
        param.setValue(password);
        params.add(param);
        param = new LbParameter();
        param.setName("Ptype");
        param.setValue("2");
        params.add(param);
        return params;
    }
}
