package com.winning.isc.controller;

import com.winning.isc.base.utils.Constants;
import com.winning.isc.base.utils.MD5;
import com.winning.isc.base.utils.PasswordUtils;
import com.winning.isc.base.utils.StringUtil;
import com.winning.isc.controller.BaseController;
import com.winning.isc.model.SysUserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.controller.admin
 * @date: 2018-10-30 15:28
 */
@RestController
public class LoginController extends BaseController {


    @PostMapping(value = "/admin/login/check")
    public Map<String, Object> checkUserAndPassword(HttpServletRequest request, String username, String password){

        String message = login(username,password);
        Map<String, Object> result = new HashMap<String, Object>();
        if(StringUtil.isEmptyOrNull(message)){
            result.put("status", Constants.SUCCESS);
            result.put("message","登录成功");
            request.getSession().setAttribute(Constants.USER_FLAG,username);
        }else{
            result.put("status", Constants.FAIL);
            result.put("message",message);
        }
        return result;
    }

    private String login(String userid, String password) {
        String error = null;
        String decodePassword = null;
        try {
            decodePassword = PasswordUtils.decryptPasswordByBase64(password);
        } catch (Exception e) {
            e.printStackTrace();
            error = "密码解密失败";
        }
        if (error == null) {
            UsernamePasswordToken token = new UsernamePasswordToken(userid, MD5.stringMD5(decodePassword));
            Subject subject = SecurityUtils.getSubject();
            try {
                subject.login(token);
            } catch (UnknownAccountException e) {
                error = "用户名/密码错误";
            } catch (IncorrectCredentialsException e) {
                error = "用户名/密码错误";
            } catch (AuthenticationException e) {
                error = "其他错误：" + e.getMessage();
            }
        }

        return error;
    }
}
