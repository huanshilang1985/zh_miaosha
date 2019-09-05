package com.zh.miaosha.service;

import com.zh.miaosha.dao.UserDao;
import com.zh.miaosha.entity.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author zhanghe
 * Desc: User的Service
 * Date 2019/8/11 8:19
 */
@Slf4j
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }

    @Transactional
    public boolean tx() {
        try {
            User u1= new User();
            u1.setId(2);
            u1.setName("2222");
            userDao.insert(u1);

            User u2= new User();
            u2.setId(1);
            u2.setName("11111");
            userDao.insert(u2);
        } catch (Exception e) {
            log.error("tx Exception", e);
            return false;
        }
        return true;
    }

}
