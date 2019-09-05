package com.zh.miaosha.entity.vo;

import com.zh.miaosha.entity.domain.OrderInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailVo {

    private GoodsVo goods;

    private OrderInfo order;

}
