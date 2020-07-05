package com.atguigu.component;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeComponent {


    //@Scheduled(fixedDelay = 3000)
    @Scheduled(cron ="0 0 12 * * ?")
    public void myTask(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
