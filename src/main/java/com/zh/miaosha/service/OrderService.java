package com.zh.miaosha.service;

import com.zh.miaosha.common.redis.OrderKey;
import com.zh.miaosha.dao.OrderDao;
import com.zh.miaosha.entity.domain.MiaoshaOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author zhanghe
 * Desc: 订单Service
 * Date 2019/8/16 0:16
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RedisService redisService;

    public MiaoshaOrder getMiaoshaOrderByUserIdGoodsId(long userId, long goodsId) {
        MiaoshaOrder order = redisService.get(OrderKey.getMiaoshaOrderByUidGid, "" + userId + "_" + goodsId, MiaoshaOrder.class);
        if(order == null){
            orderDao.getMiaoshaOrderByUserIdGoodsId(userId, goodsId);
        }
        return order;
    }

}
