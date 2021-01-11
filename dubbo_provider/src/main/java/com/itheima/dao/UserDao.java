package com.itheima.dao;

import com.itheima.pojo.User;

/**
 * @项目: dubbo_parent
 * @包名: com.itheima.dao
 * @
 * @作者: long rui nan
 * @日期: 2021-01-04 11:55
 */
public interface UserDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(int id);
}