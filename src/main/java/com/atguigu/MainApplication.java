package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启声明式事务
@ServletComponentScan
@EnableScheduling//启动任务调度 spring底层集成Quertz组件 定时任务
@MapperScan("com.atguigu.dao")
@SpringBootApplication//生成dao的代理对象,将dao代理对象交给Spring IOC容器进行管理。
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }

}
