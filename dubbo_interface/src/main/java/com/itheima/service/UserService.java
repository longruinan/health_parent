package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @项目: dubbo_parent
 * @包名: com.itheima.service
 * @
 * @作者: long rui nan
 * @日期: 2021-01-04 11:52
 */

public interface UserService {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(int id);
}