package com.zh.miaosha.dao;

import com.zh.miaosha.entity.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Author zhanghe
 * Desc: User对象的Mapper
 * Date 2019/8/11 8:17
 */
@Repository
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User getById(@Param("id") int id);

    @Insert("insert into user(id, name)values(#{id}, #{name})")
    int insert(User user);


}
