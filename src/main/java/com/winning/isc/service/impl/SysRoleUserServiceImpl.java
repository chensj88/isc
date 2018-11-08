package com.winning.isc.service.impl;

import com.winning.isc.base.utils.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.winning.isc.model.SysRoleUser;

import com.winning.isc.dao.SysRoleUserDao;

import com.winning.isc.service.SysRoleUserService;


/**
* @author HLHT
* @title SYS_ROLE_USER
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:26
*/
@Service
public class SysRoleUserServiceImpl implements  SysRoleUserService {

    @Autowired
    private SysRoleUserDao sysRoleUserDao;

    public int createSysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.insertSysRoleUser(sysRoleUser);
    }

    public int modifySysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.updateSysRoleUser(sysRoleUser);
    }

    public int removeSysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.deleteSysRoleUser(sysRoleUser);
    }

    public SysRoleUser getSysRoleUser(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.selectSysRoleUser(sysRoleUser);
    }

    public int getSysRoleUserCount(SysRoleUser sysRoleUser){
        return (Integer)this.sysRoleUserDao.selectSysRoleUserCount(sysRoleUser);
    }

    public List<SysRoleUser> getSysRoleUserList(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.selectSysRoleUserList(sysRoleUser);
    }

    public List<SysRoleUser> getSysRoleUserPageList(SysRoleUser sysRoleUser){
        return this.sysRoleUserDao.selectSysRoleUserPageList(sysRoleUser);
    }

    @Override
    public List<Long> getRoleIdList(SysRoleUser roleUser) {
        List<SysRoleUser> roleUserList = this.sysRoleUserDao.selectSysRoleUserList(roleUser);
        List<Long> roleIdList = new ArrayList<Long>();
        for (SysRoleUser sysRoleUser : roleUserList) {
            roleIdList.add(sysRoleUser.getRoleId());
        }
        return roleIdList;
    }

    @Override
    public void createSysRoleUserByIdString(String idStr) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("ids", StringUtil.generateDeleteSqlString(idStr, "USER_ID"));
        System.out.println(StringUtil.generateDeleteSqlString(idStr, "USER_ID"));
        this.sysRoleUserDao.deleteSysRoleUserForIds(param);
        List<String> addUserRoleInfo = StringUtil.generateStringList(idStr);
        for (String s : addUserRoleInfo) {
            SysRoleUser info = new SysRoleUser();
            info.setUserId(Long.valueOf(s.split(",")[0]));
            info.setRoleId(Long.valueOf(s.split(",")[1]));
            this.sysRoleUserDao.insertSysRoleUser(info);
        }
    }
}