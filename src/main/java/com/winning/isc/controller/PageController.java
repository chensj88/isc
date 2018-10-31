package com.winning.isc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chensj
 * @title 页面跳转页面
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
     * 管理员登陆信息
     * @return
     */
    @GetMapping(value = "/admin")
    public String gotoAdminLogin(){
        return  "adminLogin";
    }

    /**
     * 登陆成功后页面
     * @return
     */
    @GetMapping(value = "/pages/index")
    public String gotoIndex(){
        return  "pages/index";
    }

    /**
     * 登陆成功后欢迎页面
     * @return
     */
    @GetMapping(value = "/pages/welcome")
    public String gotoWelcomePage(){
        return  "pages/welcome";
    }

    /**
     * 管理员登录成功页面
     * @return
     */
    @GetMapping(value = "/pages/admin/home")
    public String gotoAdminHomePage(){
        return  "pages/admin/home";
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
     * 没有权限页面
     * @return
     */
    @GetMapping(value = "/pages/admin/skin-config")
    public String gotoSkinConfigPage(){
        return  "pages/admin/skin-config";
    }




}
