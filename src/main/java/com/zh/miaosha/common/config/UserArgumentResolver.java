package com.zh.miaosha.common.config;

import com.zh.miaosha.common.access.UserContext;
import com.zh.miaosha.entity.domain.MiaoshaUser;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Service
public class UserArgumentResolver implements HandlerMethodArgumentResolver {

    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> clazz = parameter.getParameterType(); //获取参数类型
        return clazz == MiaoshaUser.class;
    }

    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return UserContext.getUser();
    }



}
