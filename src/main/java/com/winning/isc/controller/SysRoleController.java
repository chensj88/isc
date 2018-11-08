package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.model.SysRoleInfo;
import com.winning.isc.model.support.NodeTree;
import com.winning.isc.model.support.Row;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ChenKuai
 * @create 2018-01-24 上午 9:27
 **/
@Controller
@RequestMapping("/admin/role")
public class SysRoleController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);





    @RequestMapping(value = "/list")
    @ResponseBody
    public Map<String, Object> sysRoleList(SysRoleInfo role, Row row) {
        role.setRow(row);
        role.setIsDel(Constants.STATUS_UNUSE);
        List<SysRoleInfo> roleInfos = super.getFacade().getSysRoleInfoService().getSysRoleInfoPageList(role);
        int total = super.getFacade().getSysRoleInfoService().getSysRoleInfoCount(role);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        result.put("total", total);
        result.put("rows", roleInfos);
        return result;
    }


    @RequestMapping("/getById")
    @ResponseBody
    public Map<String, Object> queryRoleById(SysRoleInfo role) {
        role = super.getFacade().getSysRoleInfoService().getSysRoleInfo(role);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", role);
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public Map<String, Object> deleteRoleById(SysRoleInfo role) {
        role.setIsDel(Constants.STATUS_USE);
        super.getFacade().getSysRoleInfoService().modifySysRoleInfo(role);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }


    @RequestMapping("/add")
    @ResponseBody
    public Map<String, Object> addRole(SysRoleInfo roleInfo) {
        roleInfo.setIsDel(Constants.STATUS_UNUSE);
        super.getFacade().getSysRoleInfoService().createSysRoleInfo(roleInfo);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Map<String, Object> updateRole(SysRoleInfo roleInfo) {
        super.getFacade().getSysRoleInfoService().modifySysRoleInfo(roleInfo);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping(value = "/tree")
    @ResponseBody
    public Map<String, Object> queryRoleTree(String roleName) {

        List<NodeTree> roleInfoList = super.getFacade().getSysRoleInfoService().getRoleInfoTree(roleName);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        result.put("data", roleInfoList);
        return result;

    }
}
