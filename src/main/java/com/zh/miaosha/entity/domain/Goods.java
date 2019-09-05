package com.zh.miaosha.entity.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品表
 */
@Getter
@Setter
public class Goods {

    private Long id;

    private String goodsName;

    private String goodsTitle;

    private String goodsImg;

    private String goodsDetail;

    private Double goodsPrice;

    private Integer goodsStock;

}
