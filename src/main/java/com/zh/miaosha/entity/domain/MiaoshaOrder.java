package com.zh.miaosha.entity.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 秒杀订单表
 */
@Getter
@Setter
public class MiaoshaOrder {

	private Long id;

	private Long userId;

	private Long orderId;

	private Long goodsId;

}
