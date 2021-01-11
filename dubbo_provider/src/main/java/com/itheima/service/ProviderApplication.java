package com.itheima.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p>
 * 服务提供者的启动类
 * </p>
 *
 * @author: Eric
 * @since: 2021/1/3
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
        // 阻塞，不让线程结束，保证提供一直在运行者
        System.in.read();
    }
}
