package com.winning.isc.service.impl;

import com.winning.isc.dao.SysModuleDao;
import com.winning.isc.model.SysModule;
import com.winning.isc.model.support.ZTreeNode;
import com.winning.isc.service.ZTreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.service.impl
 * @date: 2018-11-08 9:29
 */
@Service
public class ZTreeNodeServiceImpl implements ZTreeNodeService {

    @Autowired
    private SysModuleDao sysModuleDao;


    @Override
    public List<ZTreeNode> createModuleParentTree() {
        return sysModuleDao.selectSysModuleParentTree();
    }

    @Override
    public List<ZTreeNode> createModuleChildTree(SysModule module) {
        return sysModuleDao.selectSysModuleChildTree(module);
    }

    @Override
    public List<ZTreeNode> createModuleTree() {
        return sysModuleDao.selectSysModuleTree();
    }
}
