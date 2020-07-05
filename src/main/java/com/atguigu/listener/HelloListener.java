package com.atguigu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("应用启动了！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("应该用销毁了！");
    }
}
