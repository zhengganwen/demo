package com.study.demo.demo;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-07 10:59
 * @Description
 */
public class SyschronizedTest extends  Thread {

    int number=10;
    @Override
    public void run(){

        first();
    }

    public synchronized  void first(){
        System.out.println("执行first的代码");
        ++number;
    }

    public synchronized  void secord() throws InterruptedException {
        System.out.println("执行secord的代码");
        Thread.sleep(1000);
       // this.wait(1000);
        number=number*100;
    }




}
