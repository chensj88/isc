package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.base.utils.MD5;
import com.winning.isc.base.utils.PasswordUtils;
import com.winning.isc.base.utils.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/tool")
public class ToolController extends BaseController {

    /**
     * 工具页面
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "views/tool/index";
    }

    /**
     * 工具说明
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/info")
    @ResponseBody
    public Map info(Integer id) {
        if (id == null) {
            return null;
        }
        String html = "<div class=\"container\">\n" +
                "\n" +
                "\n" +
                "    开发工程师：陈蒯、陈世杰、陈枫 （自定义内容）\n" +
                "\n" +
                "    <p style='color:red'>上线时间：2018年5月30日<p>\n" +
                "\n" +
                "\n" +
                "    背景介绍：\n" +
                "\n" +
                "    为了进一步加强卫生信息标准推广与应用，国家组织开展医疗健康信息互联互通标准化成熟度测试，主要是通过对电子病历与医院信息平台标准符合性测试以及互联互通实际应用效果的评价，\n" +
                "    构建医院信息互联互通成熟度分级评价体系，以测促用、以测促改、以测促建、促进信息共享。\n" +
                "\n" +
                "    解决问题：\n" +
                "\n" +
                "    通过工具化解决数据抽取的问题，从而减少模板组在工作中的重复劳动、以及不必要的人工核查等工作，促使互联互通测评高效的完成。\n" +
                "\n" +
                "</div>";
        resultMap.put("html", html);
        return resultMap;
    }

}
