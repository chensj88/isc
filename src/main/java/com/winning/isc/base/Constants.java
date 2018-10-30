package com.winning.isc.base;

import com.winning.isc.base.utils.FtpPropertiesLoader;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.utils
 * @date: 2018-10-29 15:05
 */
public class Constants {

    public static final String DRIVE_CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static int FTP_PORT = Integer.valueOf(FtpPropertiesLoader.getProperty("ftp.port")).intValue();
    public static String FTP_SERVER = FtpPropertiesLoader.getProperty("ftp.server");
    public static String FTP_SHARE_SERVER = FtpPropertiesLoader.getProperty("ftp.share");
    public static String FTP_SHARE_FLODER = "http://" + FTP_SHARE_SERVER + ":8081/shareFolder";
    public static String HTTP_SERVER = "http://" + FTP_SHARE_SERVER + ":8081/ssgjm";

    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";
    public static final String USER_FLAG = "username";
    public static final Integer PMIS_STATUS_USE = 1;
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
        /**
         * PMIS WS 服务节点名称 数据导入
         */
        public static final String PMIS_DATA_LOAD_WS_SERVICE_OBJECT_NAME = "WS_DS_CXJCXX";

        /**
         * PMIS WS 服务类型  1 用户
         */
        public static final String WS_SERVICE_QUERY_USER = "1";
        /**
         * PMIS WS 服务类型 组织机构
         */
        public static final String WS_SERVICE_QUERY_ORG = "8";
        /**
         * PMIS WS 服务类型 用户登录验证
         */
        public static final String WS_SERVICE_OBJECT_NAME_USER_LOGIN = "PUB_DS_YHXY";
        /**
         * PMIS WS 返回结果码, <=0失败
         */
        public static final int RESULT_CODE_FAIL = 0;

        /**
         * PMIS WS 返回结果码,>0 成功
         */
        public static final int RESULT_CODE_SUCCESS = 1;

        /**
         * PMIS WS 查询类别名称
         */
        public static final String QUERY_TYPE_NAME = "Ptype";
        /**
         * PMIS WS 第一次查询的数量
         */
        public static final int QUERY_FIRST_BATCH_SIZE = 1;

        /**
         * PMIS WS 每次查询的数量
         */
        public static final int QUERY_BATCH_SIZE = 1000;

    }
}
