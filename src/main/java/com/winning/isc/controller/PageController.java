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

    @GetMapping(value = "/")
    public String gotoLogin(){
        return  "login";
    }

    @GetMapping(value = "/index")
    public String gotoIndex(){
        return  "index";
    }

    @GetMapping(value = "/welcome")
    public String gotoWelcomePage(){
        return  "welcome";
    }


    @GetMapping(value = "/admin")
    public String gotoAdminLogin(){
        return  "admin/login";
    }

}
