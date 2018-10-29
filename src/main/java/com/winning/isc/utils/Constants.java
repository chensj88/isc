package com.winning.isc.utils;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.utils
 * @date: 2018-10-29 15:05
 */
public class Constants {

    public class PmisWSConstants {
        /**
         * PMIS WS URL
         */
        public static final String WS_URL = "http://203.110.176.178:9089/service/LBEBusiness?wsdl";
        /**
         * PMIS 工作底稿 WS URL
         */
        public static final String WS_TEST_URL = "http://203.110.176.178:9083/service/LBEBusiness?wsdl";
        /**
         * PMIS WS 用户
         */
        public static final String WS_USER = "sszhb";
        /**
         * PMIS WS 密码
         */
        public static final String WS_PASSWORD = "abc123";
        /**
         * PMIS WS 密码加密方式 plain 不加密
         */
        public static final String WS_ALGORITHM = "plain";
        /**
         * 用户登录服务
         */
        public static final String USER_LOGIN_WS_SERVICE_OBJECT_NAME = "PUB_DS_YHXY";

    }
}
