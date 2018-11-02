package com.winning.isc.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author chensj
 * @title 加载FTP参数
 * @email chensj@winning.com.cn
 * @package com.winning.isc.base.config
 * @date: 2018-11-02 11:35
 */
@Configuration
@ConfigurationProperties(prefix="ftp")
public class FtpConfig {

    @Value("${isenabledftpupload}")
    public static  boolean isEnableFtpUpload;
    @Value("${switch}")
    public static  boolean switchStatus;
    @Value("${username}")
    public static  String username;
    @Value("${password}")
    public static  String password;
    @Value("${server}")
    public static  String server;
    @Value("${share}")
    public static  String share;
    @Value("${port}")
    public static  String port;
    
}
