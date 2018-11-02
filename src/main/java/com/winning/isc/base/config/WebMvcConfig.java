package com.winning.isc.base.config;

import com.winning.isc.base.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author chensj
 * @title 注册全局拦截器注册器等
 * @email chensj@winning.com.cn
 * @package com.winning.isc.base.config
 * @date: 2018-10-30 16:49
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 配置静态资源资源映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/assets/");
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/resources/");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//       registry.addInterceptor(getLoginInterceptor());
//    }

//    @Bean
//    public HandlerInterceptor getLoginInterceptor(){
//        return new LoginInterceptor();
//    }
}
