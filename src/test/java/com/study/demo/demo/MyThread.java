package com.study.demo.demo;

/**
 * @Description ${PROJECT-NAME}
 * @auther Mr.Zheng
 * @create 2019-03-06 17:55
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());

    }


}
