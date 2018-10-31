package com.winning.isc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chensj
 * @title 管理员页面跳转页面
 * @email chensj@winning.com.cn
 * @package com.winning.isc.controller
 * @date: 2018-10-30 9:56
 */
@Controller
@RequestMapping(value = "/views")
public class AdminPageController extends BaseController {
    /**
     * 管理员主页面
     * @return
     */
    @GetMapping(value = "/admin")
    public String gotoAdminHomePage(){
        return  "views/admin/home";
    }





}
