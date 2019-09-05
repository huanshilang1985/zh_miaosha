package com.zh.miaosha.controller;

import com.zh.miaosha.common.bean.Result;
import com.zh.miaosha.entity.vo.LoginVo;
import com.zh.miaosha.service.MiaoshaUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Author zhanghe
 * Desc:
 * Date 2019/8/11 18:25
 */
@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private MiaoshaUserService miaoshaUserService;

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<String> doLogin(HttpServletResponse response, @Valid LoginVo loginVo) {
        log.info(loginVo.toString());
        //登录
        String token = miaoshaUserService.login(response, loginVo);
        return Result.success(token);
    }

}
