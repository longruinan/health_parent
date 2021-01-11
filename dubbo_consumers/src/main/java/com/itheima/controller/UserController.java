package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @项目: dubbo_parent
 * @包名: com.ithema.controller
 * @
 * @作者: long rui nan
 * @日期: 2021-01-04 19:26
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findById")
    public User findById(int id){
        return userService.findById(id);

    }
}
