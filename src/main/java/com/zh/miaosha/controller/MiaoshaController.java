package com.zh.miaosha.controller;

import com.zh.miaosha.common.bean.CodeMsg;
import com.zh.miaosha.entity.domain.MiaoshaOrder;
import com.zh.miaosha.entity.domain.MiaoshaUser;
import com.zh.miaosha.entity.vo.GoodsVo;
import com.zh.miaosha.service.GoodsService;
import com.zh.miaosha.service.OrderService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author zhanghe
 * Desc: 秒杀活动Controller
 * Date 2019/8/16 0:06
 */
@Controller
@RequestMapping("/miaosha")
public class MiaoshaController implements InitializingBean {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private OrderService orderService;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public String list(Model model, MiaoshaUser user,
                       @RequestParam("goodsId") long goodsid){
        model.addAttribute("user", user);
        if(user == null){
            return "login";
        }
        //判断库存
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsid);
        int stock = goods.getGoodsStock();
        if(stock <= 0){
            model.addAttribute("errmsg", CodeMsg.MIAO_SHA_OVER.getMsg()) ;
            return "miaosha_fail";
        }
        //判断是否已经秒杀过了
        MiaoshaOrder order = orderService.getMiaoshaOrderByUserIdGoodsId(user.getId(), goodsid);
        if(order != null){
            model.addAttribute("errmsg", CodeMsg.REPEATE_MIAOSHA.getMsg())；
            return "miaosha_fail";
        }

        // 减库存，下订单，写入秒杀订单

        return "";
    }

















}
