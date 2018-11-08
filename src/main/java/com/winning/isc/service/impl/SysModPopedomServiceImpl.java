package com.winning.isc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

import com.winning.isc.model.SysModPopedom;

import com.winning.isc.dao.SysModPopedomDao;

import com.winning.isc.service.SysModPopedomService;


/**
* @author HLHT
* @title SYS_MOD_POPEDOM
* @email Winning Health
* @package com.winning.isc.service.impl
* @date 2018-47-02 09:47:09
*/
@Service
public class SysModPopedomServiceImpl implements  SysModPopedomService {

    @Autowired
    private SysModPopedomDao sysModPopedomDao;

    public int createSysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.insertSysModPopedom(sysModPopedom);
    }

    public int modifySysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.updateSysModPopedom(sysModPopedom);
    }

    public int removeSysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.deleteSysModPopedom(sysModPopedom);
    }

    public SysModPopedom getSysModPopedom(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.selectSysModPopedom(sysModPopedom);
    }

    public int getSysModPopedomCount(SysModPopedom sysModPopedom){
        return (Integer)this.sysModPopedomDao.selectSysModPopedomCount(sysModPopedom);
    }

    public List<SysModPopedom> getSysModPopedomList(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.selectSysModPopedomList(sysModPopedom);
    }

    public List<SysModPopedom> getSysModPopedomPageList(SysModPopedom sysModPopedom){
        return this.sysModPopedomDao.selectSysModPopedomPageList(sysModPopedom);
    }

    @Override
    public Set<String> getButtonFlagForPageByModUrlAndRoles(SysModPopedom modPopedom) {
        return this.sysModPopedomDao.selectButtonFlagForPageByModUrlAndRoles(modPopedom);
    }

    @Override
    public List<Long> getModuleIdList(SysModPopedom modPopedom) {
        return this.sysModPopedomDao.selectModuleIdList(modPopedom);
    }

    @Override
    public void createSysModPopedomByList(List<SysModPopedom> modPopedomList) {
        long roleId  = modPopedomList.get(0).getRoleId();
        SysModPopedom rolePopedom = new SysModPopedom();
        rolePopedom.setRoleId(roleId);
        this.sysModPopedomDao.deleteSysModPopedom(rolePopedom);
        for (SysModPopedom popedom : modPopedomList) {
            this.sysModPopedomDao.insertSysModPopedom(popedom);
        }
    }

    @Override
    public void modifyModPopedomMapping(String idList) {
        if(idList.contains(":")){
            String[] modPopeInfoList = idList.split(";");
            for (String s : modPopeInfoList) {
                String[] modPope = s.split(":");
                SysModPopedom mod = new SysModPopedom();
                mod.setId(Long.parseLong(modPope[0]));
                mod.setModId(Long.parseLong(modPope[1]));
                mod.setRoleId(Long.parseLong(modPope[2]));
                mod.setPopedomCode(modPope[3]);
                this.sysModPopedomDao.updateSysModPopedom(mod);
            }
        }else{
            SysModPopedom mod = new SysModPopedom();
            mod.setRoleId(Long.parseLong(idList));
            mod.setPopedomCode(null);
            this.sysModPopedomDao.updateSysModPopedomAllPopedomCode(mod);
        }
    }

    @Override
    public List<SysModPopedom> getSysModPopedomHasPopedomList(SysModPopedom modPopedom) {
        return this.sysModPopedomDao.selectSysModPopedomHasPopedomList(modPopedom);
    }
}