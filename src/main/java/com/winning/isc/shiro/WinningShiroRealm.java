package com.winning.isc.shiro;

import com.winning.isc.base.utils.Constants;
import com.winning.isc.dao.SysOrgExtDao;
import com.winning.isc.dao.SysUserInfoDao;
import com.winning.isc.model.SysUserInfo;
import com.winning.isc.ws.client.QueryResult;
import com.winning.isc.ws.service.PmisWebServiceClient;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.shiro
 * @date: 2018-10-30 15:43
 */
public class WinningShiroRealm extends AuthorizingRealm {


    @Autowired
    private SysUserInfoDao sysUserInfoDao; //需要查询用户基本信息及权限的dao接口
    @Autowired
    private SysOrgExtDao sysOrgExtDao;
    @Autowired
    private PmisWebServiceClient pmisWebServiceClient;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();// 取得用户登录名
        SimpleAuthorizationInfo auth = new SimpleAuthorizationInfo();
	/*	try {
			auth.setRoles(userdao.listRolesByMEember(username));// 获取所有的角色
			auth.setStringPermissions(userdao.listActionsByMEember(username));// 获取所有的权限
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
        return auth;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userid = (String) token.getPrincipal();
        SysUserInfo userInfo = new SysUserInfo();
        userInfo.setUserid(userid);
        userInfo.setStatus(Constants.PMIS_STATUS_USE);
        userInfo = sysUserInfoDao.selectSysUserInfo(userInfo);//获取用户基本信息
        if (userInfo == null) {
            throw new UnknownAccountException("该用户不存在");
        } else {
            String password = new String((char[]) token.getCredentials());
            QueryResult result = pmisWebServiceClient.userLoginValidateByPmis(userid,password);
            //通过返回值中记录record中记录信息来验证登录是否错误
            int resultNum = Integer.parseInt(result.getRecords().get(0).getValues().get(0).toString());
            if( resultNum == userInfo.getId().intValue()){
                return new SimpleAuthenticationInfo(userInfo, password, "memberRealm");
            }else{
                throw new IncorrectCredentialsException(result.getRecords().get(0).getValues().get(2).toString());
            }
        }
    }
}
