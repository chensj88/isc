package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.model.SysModule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package cn.com.winning.ssgj.web.controller.admin
 * @date: 2018-11-06 14:02
 */
@RestController
@RequestMapping(value = "/admin/ztree")
public class ZTreeNodeController extends BaseController {

    @RequestMapping(value = "/moduleParent")
    @ResponseBody
    public Map<String, Object> loadRoleZtreeParentNode(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        result.put("data", getFacade().getZTreeNodeService().createModuleParentTree());
        return result;
    }

    @RequestMapping(value = "/moduleChild")
    @ResponseBody
    public Map<String, Object> loadRoleZtreeChildNode(SysModule module){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        result.put("data", getFacade().getZTreeNodeService().createModuleChildTree(module));
        return result;
    }

    @RequestMapping(value = "/moduleTree")
    @ResponseBody
    public Map<String, Object> loadModuleTreeNode(SysModule module){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        result.put("data", getFacade().getZTreeNodeService().createModuleTree());
        return result;
    }
}
