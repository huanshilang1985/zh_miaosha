package com.zh.miaosha.common.config;

import com.zh.miaosha.common.access.AccessInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * Author zhanghe
 * Desc:
 * Date 2019/8/11 22:34
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Autowired
    private UserArgumentResolver userArgumentResolver;
    @Autowired
    private AccessInterceptor accessInterceptor;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(userArgumentResolver);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessInterceptor);
    }

    /**
     * 放行静态资源
     * yml增加配置：
     *  spring.mvc.static-path-pattern
     *  spring.resources.static-locations
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //重写这个方法，映射静态资源文件
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

}
