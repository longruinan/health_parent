package com.itheima.service.impl;


import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @项目: dubbo_parent
 * @包名: com.itheima.service.impl
 * @
 * @作者: long rui nan
 * @日期: 2021-01-04 11:58
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findById(int id) {

        return userDao.findById(id);
    }
}
