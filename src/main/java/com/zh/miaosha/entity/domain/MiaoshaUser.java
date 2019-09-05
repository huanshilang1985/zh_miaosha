package com.zh.miaosha.entity.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 秒杀用户表
 */
@Getter
@Setter
public class MiaoshaUser {

    private Long id;

    private String nickname;

    private String password;

    private String salt;

    private String head;

    private Date registerDate;

    private Date lastLoginDate;

    private Integer loginCount;

}
