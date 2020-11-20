package com.example.demospringboot.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

//@Component
@Slf4j
public class MyScheduleTask {
    @Scheduled(fixedRate = 5000)
    public void fiveSecondExport(){
        System.out.println("每5秒执行一次：" + new Date());
//        log.debug("每5秒执行一次：" + new Date());
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void twoSecondExport(){
        System.out.println("每2秒执行一次：" + new Date());
//        log.debug("每2秒执行一次：" + new Date());
    }
}
