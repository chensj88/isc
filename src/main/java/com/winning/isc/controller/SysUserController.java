package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.base.utils.MD5;
import com.winning.isc.base.utils.StringUtil;
import com.winning.isc.model.SysUserInfo;
import com.winning.isc.model.support.Row;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

/**
 * 用户信息处理Controller
 *
 * @author thinkpad
 * @date 2018-01-04
 */
@RestController
@RequestMapping(value = "/admin/user")
public class SysUserController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(SysUserController.class);
    
    /**
     * 用户信息列表
     *
     * @param row
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Map<String, Object> list(Row row, SysUserInfo userInfo) {
        userInfo.setRow(row);
        userInfo.setStatus(Constants.PMIS_STATUS_USE);
        userInfo.setYhmc(StringUtil.isEmptyOrNull(userInfo.getYhmc()) ? null : userInfo.getYhmc());
        userInfo.setUserid(StringUtil.isEmptyOrNull(userInfo.getUserid()) ? null : userInfo.getUserid());
        userInfo.setTelephone(StringUtil.isEmptyOrNull(userInfo.getTelephone()) ? null : userInfo.getTelephone());
        List<SysUserInfo> userInfos = getFacade().getSysUserInfoService().getSysUserInfoPageList(userInfo);
        int total = getFacade().getSysUserInfoService().getSysUserInfoCount(userInfo);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", userInfos);
        map.put("total", total);
        map.put("status", Constants.SUCCESS);
        return map;
    }

    /**
     * 通过用户ID查询用户信息
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/getById")
    @ResponseBody
    public Map<String, Object> getUserByUserId(SysUserInfo user) {
        user = super.getFacade().getSysUserInfoService().getSysUserInfo(user);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", user);
        map.put("status", Constants.SUCCESS);
        return map;
    }

    /**
     * 通过用户ID删除用户信息
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/deleteById")
    @ResponseBody
    @Transactional
    public Map<String, Object> deleteUserById(SysUserInfo user) {
        user.setStatus(Integer.valueOf(Constants.User.USER_STATUS_LOCKED));
        getFacade().getSysUserInfoService().modifySysUserInfo(user);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", Constants.SUCCESS);
        return map;
    }

    /**
     * 添加用户
     *
     * @return
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    @Transactional
    public Map<String, Object> addUser(SysUserInfo user) {
        /*System.out.println(email);*/
        //医院用户需要新建时候需要重置密码
        if (Constants.User.USER_TYPE_HOSPITAL.equals(user.getUserType())) {
            user.setPassword(MD5.stringMD5(user.getUserid()));
        }
        user.setName(user.getYhmc() + "(" + user.getUserid() + ")");
        super.getFacade().getSysUserInfoService().createSysUserInfo(user);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", Constants.SUCCESS);
        return map;
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    @Transactional
    public Map<String, Object> updateUser(SysUserInfo user) {
        getFacade().getSysUserInfoService().modifySysUserInfo(user);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", Constants.SUCCESS);
        return map;
    }

}
