package com.winning.isc.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author chensj
 * @title 加载FTP参数
 * @email chensj@winning.com.cn
 * @package com.winning.isc.base.config
 * @date: 2018-11-02 11:35
 */
@Component("ftpConfig")
@PropertySource("classpath:ftp.properties")
@ConfigurationProperties(prefix = "ftp")
public class FtpConfig {

    //@Value("${isenabledftpupload}")
    public static boolean isEnableFtpUpload;
    //@Value("${switch}")
    public static boolean switchStatus;
    //@Value("${username}")
    public static String username;
    //@Value("${password}")
    public static String password;
    //@Value("${server}")
    public static String server;
    //@Value("${share}")
    public static String share;
    //@Value("${port}")
    public static String port;

    public static String logoRemote;

    public static String jarRemote;

    public static String docRemote;

    public static String getJarRemote() {
        return jarRemote;
    }

    public void setJarRemote(String jarRemote) {
        FtpConfig.jarRemote = jarRemote;
    }

    public static String getDocRemote() {
        return docRemote;
    }

    public void setDocRemote(String docRemote) {
        FtpConfig.docRemote = docRemote;
    }


    public static String getLogoRemote() {
        return logoRemote;
    }

    public void setLogoRemote(String logoRemote) {
        FtpConfig.logoRemote = logoRemote;
    }

    public static boolean isIsEnableFtpUpload() {
        return isEnableFtpUpload;
    }

    public void setIsEnableFtpUpload(boolean isEnableFtpUpload) {
        FtpConfig.isEnableFtpUpload = isEnableFtpUpload;
    }

    public static boolean isSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(boolean switchStatus) {
        FtpConfig.switchStatus = switchStatus;
    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        FtpConfig.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        FtpConfig.password = password;
    }

    public static String getServer() {
        return server;
    }

    public void setServer(String server) {
        FtpConfig.server = server;
    }

    public static String getShare() {
        return share;
    }

    public void setShare(String share) {
        FtpConfig.share = share;
    }

    public static String getPort() {
        return port;
    }

    public void setPort(String port) {
        FtpConfig.port = port;
    }
}
