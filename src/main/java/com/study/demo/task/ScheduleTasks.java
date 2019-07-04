package com.study.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTasks {


    /**
     * 上一次执行开始五秒后执行
     */

   // @Scheduled(fixedRate = 5000)
    public  void test1(){
        System.out.println(12344);

    }

    /**
     * 上一次执行完毕3秒开始执行
     */
    //@Scheduled(fixedDelay = 3000)
    public void test2(){
        System.out.println(123);

    }

    /**
     * 第一次1秒后执行，接下来上一次执行开始五秒后执行
     */
    //@Scheduled(initialDelay = 1000,fixedRate = 3000)
    public void test3(){
        System.out.println(123);

    }

    /**
     * cron表达式，每五秒执行一次
     */
    //@Scheduled(cron="*/5 * * * * *" )
    public void test4(){
        System.out.println(123);

    }






}
