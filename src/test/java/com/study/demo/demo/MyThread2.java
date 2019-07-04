package com.study.demo.demo;

import java.util.concurrent.Callable;

/**
 * @Description ${PROJECT-NAME}
 * @auther Mr.Zheng
 * @create 2019-03-07 10:00
 */
public class MyThread2  implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return 1;
    }
}
