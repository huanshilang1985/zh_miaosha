package com.zh.miaosha.entity.vo;

import com.zh.miaosha.entity.domain.MiaoshaUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsDetailVo {

    private int miaoshaStatus = 0;

    private int remainSeconds = 0;

    private GoodsVo goods;

    private MiaoshaUser user;

}
