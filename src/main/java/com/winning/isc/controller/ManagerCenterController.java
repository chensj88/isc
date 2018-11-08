package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.base.config.FtpConfig;
import com.winning.isc.base.utils.FtpUtils;
import com.winning.isc.base.utils.StringUtil;
import com.winning.isc.model.IscTools;
import com.winning.isc.model.SysUserInfo;
import com.winning.isc.model.support.Row;
import com.winning.isc.service.IscToolsService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/manager")
public class ManagerCenterController extends BaseController {
    @Autowired
    private IscToolsService iscToolsService;

    /**
     * 管理页面
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "views/managerCenter/index";
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public Map add(IscTools iscTools) {
        SysUserInfo userInfo = (SysUserInfo) SecurityUtils.getSubject().getPrincipal();
        iscTools.setCreator(userInfo.getUserid());
        iscTools.setOperater(userInfo.getUserid());
        iscTools.setCreateTime(new Timestamp(new Date().getTime()));
        iscTools.setOperateTime(new Timestamp(new Date().getTime()));
        String toolRar = iscTools.getToolRar();
        String logo = iscTools.getLogo();
        String downLoad = iscTools.getDownLoad();
        if (!StringUtil.isEmptyOrNull(toolRar)) {
            toolRar = FtpConfig.jarRemote + toolRar.substring(toolRar.lastIndexOf("\\")+1);
            iscTools.setToolRar(toolRar);
        }
        if (!StringUtil.isEmptyOrNull(logo)) {
            logo = FtpConfig.logoRemote + logo.substring(logo.lastIndexOf("\\")+1);
            iscTools.setLogo(logo);
        }
        if (!StringUtil.isEmptyOrNull(downLoad)) {
            downLoad = FtpConfig.docRemote + downLoad.substring(downLoad.lastIndexOf("\\")+1);
            iscTools.setDownLoad(downLoad);
        }
        iscToolsService.createIscTools(iscTools);
        resultMap.put("msg", "success");
        return resultMap;
    }

    /**
     * 数据接口
     *
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Map list(IscTools iscTool, Row row) {
        iscTool.setRow(row);
        //获取分页数据集合
        List<IscTools> rows = iscToolsService.getIscToolsPageList(iscTool);
        //获取数据总数
        int total = iscToolsService.getIscToolsCount(iscTool);
        resultMap.put("rows", rows);
        resultMap.put("total", total);
        return resultMap;
    }

    /**
     * logo上传
     *
     * @return
     */
    @PostMapping(value = "/logoUpload")
    @ResponseBody
    public Map upload(@RequestParam MultipartFile file) throws IOException {
        if (file != null && !file.isEmpty()) {
            File newFile = null;
            try {
                String fileName = file.getOriginalFilename();
                String prefix = "isc_";
                newFile = File.createTempFile(prefix, fileName);
                file.transferTo(newFile);
                String remote = FtpConfig.logoRemote + fileName;
                FtpUtils.uploadFile(remote, newFile);
                newFile.delete();
                resultMap.put("msg", "success");
                resultMap.put("logo", remote);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            resultMap.put("msg", "fail");
        }

        return resultMap;
    }

    /**
     * 文案上传
     *
     * @return
     */
    @PostMapping(value = "/docUpload")
    @ResponseBody
    public Map docUpload(@RequestParam MultipartFile file) throws IOException {
        if (file != null && !file.isEmpty()) {
            File newFile = null;
            try {
                String fileName = file.getOriginalFilename();
                String prefix = "isc_";
                newFile = File.createTempFile(prefix, fileName);
                file.transferTo(newFile);
                String remote = FtpConfig.docRemote + fileName;
                FtpUtils.uploadFile(remote, newFile);
                newFile.delete();
                resultMap.put("msg", "success");
                resultMap.put("downLoad", remote);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            resultMap.put("msg", "fail");
        }

        return resultMap;
    }

    /**
     * 工具上传
     *
     * @return
     */
    @PostMapping(value = "/jarUpload")
    @ResponseBody
    public Map jarUpload(@RequestParam MultipartFile file) throws IOException {
        if (file != null && !file.isEmpty()) {
            File newFile = null;
            try {
                String fileName = file.getOriginalFilename();
                String prefix = "isc_";
                newFile = File.createTempFile(prefix, fileName);
                file.transferTo(newFile);
                String remote = FtpConfig.jarRemote + fileName;
                FtpUtils.uploadFile(remote, newFile);
                newFile.delete();
                resultMap.put("msg", "success");
                resultMap.put("toolRar", remote);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            resultMap.put("msg", "fail");
        }
        return resultMap;
    }

    /**
     * 文件上传
     *
     * @return
     */
    @PostMapping(value = "/changeStatus")
    @ResponseBody
    public Map changeStatus(IscTools iscTools) throws IOException {
        if (iscTools.getId() == null || iscTools.getIsStop() == null) {
            resultMap.put("msg", "fail");
        }
        iscToolsService.modifyIscTools(iscTools);
        resultMap.put("msg", "success");
        return resultMap;
    }


}
