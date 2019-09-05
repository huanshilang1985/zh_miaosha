package com.zh.miaosha.entity.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 秒杀商品表
 */
@Getter
@Setter
public class MiaoshaGoods {
    private Long id;
    private Long goodsId;
    private Integer stockCount;  //秒杀数量
    private Date startDate;
    private Date endDate;

}
