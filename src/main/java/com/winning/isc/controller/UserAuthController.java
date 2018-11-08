package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.model.SysModPopedom;
import com.winning.isc.model.SysModule;
import com.winning.isc.model.SysUserInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package cn.com.winning.ssgj.web.controller.admin
 * @date: 2018-11-01 15:55
 */
@RestController
@RequestMapping(value = "/auth")
public class UserAuthController extends BaseController {




    @RequestMapping(value = "/initBtnList")
    @ResponseBody
    public Map<String, Object> initBtnList(String modUrl){
        SysUserInfo userInfo = (SysUserInfo) SecurityUtils.getSubject().getPrincipal();
        Set<String> roles = (Set<String>) userInfo.getMap().get("roles");
        Map<String, Object> result = new HashMap<String, Object>();
        if(roles == null || roles.size() == 0 ){
            result.put("status", Constants.SUCCESS);
            result.put("data", modUrl);
        }else{
            SysModPopedom modPopedom = new SysModPopedom();
            modPopedom.setModUrl(modUrl+"");
            modPopedom.getMap().put("pks",roles);
            SysModule module = new SysModule();
            module.setModUrl(modUrl+"");
            //获取全部按钮
            Set<String> allBtnList = getFacade().getSysModuleService().getBtnModuleListByModuleURL(module);
            //获取具有权限的按钮
            Set<String> authBtnList = getFacade().getSysModPopedomService().getButtonFlagForPageByModUrlAndRoles(modPopedom);
            result.put("status", Constants.SUCCESS);
            result.put("allData", allBtnList);
            result.put("authData", authBtnList);
            //result.put("roles", roles);
        }
        return result;

    }
}
