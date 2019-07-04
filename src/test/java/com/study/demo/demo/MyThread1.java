package com.study.demo.demo;

/**
 * @Description ${PROJECT-NAME}
 * @auther Mr.Zheng
 * @create 2019-03-07 9:34
 */
public class MyThread1 implements  Runnable {
    private int ticket=10;

    @Override
    public void run() {
      //  System.out.println(Thread.currentThread().getName());

        for(int i=0;i<20;i++){
            if(this.ticket>0){
                System.out.println(Thread.currentThread().getName()+" 卖票：ticket"+this.ticket--);
            }

        }

    }
}
