package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.model.SysModPopedom;
import com.winning.isc.model.SysModule;
import com.winning.isc.model.support.NodeTree;
import com.winning.isc.model.support.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/module")
public class SysModuleController extends BaseController {

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> listFunction(SysModule module, Row row) {
        module.setRow(row);
        module.setIsDel(Constants.STATUS_UNUSE);
        module.setModLevel(1);
        List<SysModule> moduleList = super.getFacade().getSysModuleService().getSysModulePageList(module);
        int total = super.getFacade().getSysModuleService().getSysModuleCount(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("total", total);
        result.put("rows", moduleList);
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/childList")
    @ResponseBody
    public Map<String, Object> listChildList(SysModule module, Row row) {
        module.setRow(row);
        module.setIsDel(Constants.STATUS_UNUSE);
        List<SysModule> moduleList = super.getFacade().getSysModuleService().getSysModulePageList(module);
        int total = super.getFacade().getSysModuleService().getSysModuleCount(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("total", total);
        result.put("rows", moduleList);
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping(value = "/queryModule")
    @ResponseBody
    public Map<String, Object> queryModule(String modName,int modLevel, int matchCount) {
        SysModule module = new SysModule();
        module.setModName(modName);
        module.setModLevel(modLevel);
        module.setIsDel(Constants.STATUS_UNUSE);
        Row row = new Row(0, matchCount);
        module.setRow(row);
        List<SysModule> moduleList = super.getFacade().getSysModuleService().getSysModulePageList(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        result.put("data", moduleList);
        return result;
    }

    @RequestMapping("/add")
    @ResponseBody
    @Transactional
    public Map<String, Object> addModule(SysModule module) {
        module.setIsDel(Constants.STATUS_UNUSE);
        if (module.getModLevel() == 1) {
            module.setParId(-1L);
        }
        super.getFacade().getSysModuleService().createSysModule(module);
        SysModPopedom modPopedom = new SysModPopedom();
        modPopedom.setRoleId(2L);
        modPopedom.setModId(module.getModId());
        getFacade().getSysModPopedomService().createSysModPopedom(modPopedom);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/update")
    @ResponseBody
    @Transactional
    public Map<String, Object> updateFunction(SysModule module) {
        super.getFacade().getSysModuleService().modifySysModule(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    @Transactional
    public Map<String, Object> deleteFunctionById(SysModule module) {
        module.setIsDel(Constants.STATUS_USE);
        super.getFacade().getSysModuleService().modifySysModule(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public Map<String, Object> queryFunctiontById(SysModule module) {
        module = super.getFacade().getSysModuleService().getSysModule(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", module);
        result.put("status", Constants.SUCCESS);
        return result;
    }

    @RequestMapping("/tree")
    @ResponseBody
    public Map<String, Object> getModuleTree(SysModule module) {
        module.setIsDel(Constants.STATUS_UNUSE);
        List<NodeTree> treeList = super.getFacade().getSysModuleService().getSysModuleNodeTree(module);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", treeList);
        result.put("status", Constants.SUCCESS);
        return result;
    }

}
