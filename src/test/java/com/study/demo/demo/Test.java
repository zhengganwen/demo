package com.study.demo.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description ${PROJECT-NAME}
 * @auther Mr.Zheng
 * @create 2019-03-06 18:06
 */
public class Test {

    @org.junit.Test
    public void test1() {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    @org.junit.Test
    public void test2() {
        MyThread1 myThread1 = new MyThread1();
        Thread myThread11 = new Thread(myThread1);
        myThread11.start();
    }

    @org.junit.Test
    public void test3() {
      /*  new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        ).start();*/

    }

    @org.junit.Test
    public void test4() throws ExecutionException, InterruptedException {

        Callable<Integer> callable = new MyThread2();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(callable);
        new Thread(integerFutureTask, "callThread").start();

        System.out.println(integerFutureTask.get());
    }

    @org.junit.Test
    public void tset4() throws InterruptedException {
        SyschronizedTest syschronizedTest = new SyschronizedTest();
        syschronizedTest.start();

        syschronizedTest.secord();
        Thread.sleep(10);
        System.out.println(syschronizedTest.number);


    }

    @org.junit.Test
    public void test5(){
        MyThread1 myThread1 = new MyThread1();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread1);
        Thread thread3 = new Thread(myThread1);
        thread1.start();
        thread2.start();
        thread3.start();

    }



}
