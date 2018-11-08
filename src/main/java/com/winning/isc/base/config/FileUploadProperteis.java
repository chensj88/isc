package com.winning.isc.base.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * tomcat设置虚拟目录,映射到ftp文件夹
 */
@Component
@ConfigurationProperties(prefix = "file")
public class FileUploadProperteis {
    //静态资源对外暴露的访问路径
    private String staticAccessPath;

    //文件上传目录
    private String uploadFolder;

    public String getStaticAccessPath() {
        return staticAccessPath;
    }

    public void setStaticAccessPath(String staticAccessPath) {
        this.staticAccessPath = staticAccessPath;
    }

    public String getUploadFolder() {
        return uploadFolder;
    }

    public void setUploadFolder(String uploadFolder) {
        this.uploadFolder = uploadFolder;
    }
}
