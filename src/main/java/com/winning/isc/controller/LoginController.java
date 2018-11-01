package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.base.utils.MD5;
import com.winning.isc.base.utils.PasswordUtils;
import com.winning.isc.base.utils.StringUtil;
import com.winning.isc.controller.BaseController;
import com.winning.isc.model.SysUserInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/login")
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request, String username, String password) {
        String message = null;
        //admin登录不验密
//        if ("admin".equals(username)) {
//            message = "";
//        } else {
            String decodePassword = null;
            try {
                decodePassword = PasswordUtils.decryptPasswordByBase64(password);
            } catch (Exception e) {
                e.printStackTrace();
                message = "密码解密失败";
            }
            if (message == null) {
                UsernamePasswordToken token = new UsernamePasswordToken(username, MD5.stringMD5(decodePassword));
                Subject subject = SecurityUtils.getSubject();
                try {
                    subject.login(token);
                } catch (UnknownAccountException e) {
                    message = "用户名/密码错误";
                } catch (IncorrectCredentialsException e) {
                    message = "用户名/密码错误";
                } catch (AuthenticationException e) {
                    message = "其他错误：" + e.getMessage();
                }
            }
      //  }

        Map<String, Object> result = new HashMap<String, Object>();
        if (StringUtil.isEmptyOrNull(message)) {
            result.put("status", Constants.LOGIN_SUCCESS);
            result.put("message", "登录成功");
            result.put("userId", username);
            request.getSession().setAttribute(Constants.USER_FLAG, username);
        } else {
            result.put("status", Constants.LOGIN_FAIL);
            result.put("message", message);
        }
        return result;
    }

}
