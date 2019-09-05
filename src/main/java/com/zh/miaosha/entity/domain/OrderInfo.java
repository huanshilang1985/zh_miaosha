package com.zh.miaosha.entity.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 订单信息表
 */
@Getter
@Setter
public class OrderInfo {

	private Long id;

	private Long userId;

	private Long goodsId;

	private Long deliveryAddrId;

	private String goodsName;

	private Integer goodsCount;

	private Double goodsPrice;

	private Integer orderChannel;

	private Integer status;

	private Date createDate;

	private Date payDate;

}
