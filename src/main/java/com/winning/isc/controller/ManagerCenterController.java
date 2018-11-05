package com.winning.isc.controller;

import com.winning.isc.base.utils.FtpUtils;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Controller
@RequestMapping(value = "/manager")
public class ManagerCenterController extends BaseController {
    /**
     * 工具页面
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "views/managerCenter/index";
    }

    /**
     * 文件上传
     *
     * @return
     */
    @PostMapping(value = "/upload")
    @ResponseBody
    public Map upload(HttpServletRequest request, @RequestParam MultipartFile logoFile) throws IOException {
        if (logoFile != null && !logoFile.isEmpty()) {
            File file = null;
            try {
                String fileName = logoFile.getOriginalFilename();
                String prefix="isc_";
                file = file = File.createTempFile(prefix, fileName);
                logoFile.transferTo(file);
                String remote = "/isc/logo/" + fileName;
                FtpUtils.uploadFile(remote, file);
                file.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return resultMap;
    }

}
