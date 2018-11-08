package com.winning.isc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chensj
 * @title 前台页面跳转页面
 * @email chensj@winning.com.cn
 * @package com.winning.isc.controller
 * @date: 2018-10-30 9:56
 */
@Controller
public class PageController extends BaseController {
    /**
     * 登陆信息
     * @return
     */
    @GetMapping(value = "/")
    public String gotoLogin(){
        return  "login";
    }

    /**
     * 登陆信息
     * @return
     */
    @GetMapping(value = "/login")
    public String gotoLoginPage(){
        return  "login";
    }

    /**
     * 登陆成功后页面
     * @return
     */
    @GetMapping(value = "/views/index")
    public String gotoIndex(){
        return  "views/index";
    }

    /**
     * 登陆成功后欢迎页面
     * @return
     */
    @GetMapping(value = "/views/welcome")
    public String gotoWelcomePage(){
        return  "views/welcome";
    }

    /**
     * 设置页面
     * @return
     */
    @GetMapping(value = "/views/skin-config")
    public String gotoSkinConfigPage(){
        return  "views/skin-config";
    }

    /**
     * 没有权限页面
     * @return
     */
    @GetMapping(value = "/403")
    public String gotoNoAuthPage(){
        return  "403";
    }

    /**
     * 错误信息页面
     * @return
     */
    @GetMapping(value = "/error")
    public String gotoErrorPage(){
        return  "error";
    }

    /**
     * 管理员-用户功能
     * @param request
     * @param model
     * @return
     */
    @GetMapping(value = "/admin/user")
    public String userinfoPage(HttpServletRequest request, Model model) {
        return "views/admin/user";
    }

    /**
     * 管理员-菜单管理
     * @param request
     * @param model
     * @return
     */
    @GetMapping(value = "/admin/module")
    public String getFuncInfoPage(HttpServletRequest request, Model model) {
        return "views/admin/module";
    }

    /**
     * 管理员-角色管理
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/admin/role")
    public String getRoleInfoPage(HttpServletRequest request, Model model) {
        return "views/admin/role";
    }


    /**
     * 管理员-数据同步功能
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/admin/data")
    public String getSynDataPage(HttpServletRequest request, Model model) {
        return "views/admin/syndata";
    }


}
