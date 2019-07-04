package com.study.demo.demo;


import org.junit.Test;

import java.util.concurrent.*;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-07 17:49
 * @Description
 */
public class ExecutorTest {

    //构造一个线程池
    public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(1),
            new ThreadPoolExecutor.DiscardOldestPolicy());


    public static ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(2);

    //static ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(2);





    public Long test() {

        System.out.println(2222);
        long l = System.currentTimeMillis() / 1000;
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {

                System.out.println("time:" + System.currentTimeMillis());
            }
        }, 10, TimeUnit.SECONDS);
        long l1 = System.currentTimeMillis() / 1000;



        return l1-l;
    }


    @Test
    public void test1(){

        Long integer = test();
        System.out.println(integer);

    }

    @Test
    public void test2(){

       Future<String> futureTask = threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {

                System.out.println("张三是一个很有趣的人");

                return "newss";
            }
        });

        String s = null;
        try {
            s = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s);


    }


}
