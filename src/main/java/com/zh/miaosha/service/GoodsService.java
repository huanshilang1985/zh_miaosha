package com.zh.miaosha.service;

import com.zh.miaosha.dao.GoodsDao;
import com.zh.miaosha.entity.domain.MiaoshaGoods;
import com.zh.miaosha.entity.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author zhanghe
 * Desc: 商品Service
 * Date 2019/8/12 17:36
 */
@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    /**
     * 查询商品列表
     */
    public List<GoodsVo> listGoodsVo() {
        return goodsDao.listGoodsVo();
    }

    /**
     * 根据ID查询商品
     */
    public GoodsVo getGoodsVoByGoodsId(long goodsId) {
        return goodsDao.getGoodsVoByGoodsId(goodsId);
    }


    /**
     * 更新商品库存
     */
    public boolean reduceStock(GoodsVo goods) {
        MiaoshaGoods g = new MiaoshaGoods();
        g.setGoodsId(goods.getId());
        int ret = goodsDao.reduceStock(g);
        return ret > 0;
    }

    /**
     * 批量更新商品库存
     */
    public void resetStock(List<GoodsVo> goodsList) {
        for (GoodsVo goods : goodsList) {
            MiaoshaGoods g = new MiaoshaGoods();
            g.setGoodsId(goods.getId());
            g.setStockCount(goods.getStockCount());
            goodsDao.resetStock(g);
        }
    }


}
