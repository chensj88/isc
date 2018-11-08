package com.winning.isc.service;

import com.winning.isc.model.SysModule;
import com.winning.isc.model.support.ZTreeNode;

import java.util.List;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.service
 * @date: 2018-11-08 9:28
 */
public interface ZTreeNodeService {

    public List<ZTreeNode> createModuleParentTree();

    public List<ZTreeNode> createModuleChildTree(SysModule module);

    public List<ZTreeNode> createModuleTree();
}
