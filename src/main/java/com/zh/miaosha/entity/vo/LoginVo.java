package com.zh.miaosha.entity.vo;

import com.zh.miaosha.common.validator.IsMobile;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LoginVo {

    @NotNull  //校验不能为空
    @IsMobile //是手机号
    private String mobile;

    @NotNull
    @Length(min = 32)  //密码长度
    private String password;

    @Override
    public String toString() {
        return "LoginVo [mobile=" + mobile + ", password=" + password + "]";
    }
}
