package com.zh.miaosha.dao;

import com.zh.miaosha.entity.domain.MiaoshaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Author zhanghe
 * Desc: 秒杀用户
 * Date 2019/8/11 18:29
 */
@Repository
@Mapper
public interface MiaoshaUserDao {

    @Select("select * from miaosha_user where id = #{id}")
    MiaoshaUser getById(@Param("id")long id);

    @Update("update miaosha_user set password = #{password} where id = #{id}")
    int update(MiaoshaUser toBeUpdate);

}
