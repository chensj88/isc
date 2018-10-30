package com.winning.isc.base.interceptor;

import com.winning.isc.base.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.base.interceptor
 * @date: 2018-10-30 16:46
 */
public class LoginInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    /**
     * 如果HttpRequest请求的是/view/**路径访，并且没有带有session则转跳到登陆页面
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getServletPath().startsWith("/pages/")){
            logger.info("拦截器: 拦截访问路径'" + request.getRequestURI() + "'，该URL处于/pages，需要进行session验证。");
            HttpSession session = request.getSession();
            if (session.getAttribute(Constants.USER_FLAG) == null) {
                logger.info("拦截器:session中没有用户信息，该页面无法继续访问，转跳到/页面");
                response.sendRedirect("/");
                return false;
            }else{
                logger.info("拦截器: session中存在用户信息，该页面可以继续访问， userName = " + session.getAttribute(Constants.USER_FLAG) + ", session = " + session.getId());
                return true;
            }
        }else{
            logger.info("拦截器： 拦截访问路径'" + request.getRequestURI() + "'， 不在/view之下,非访问控制路径， 无需从session中获取用户信息...");
            return true;
        }
    }

    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
