package com.study.demo;



import com.google.common.util.concurrent.Striped;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {



    class Super{
            int flag=1;
    Super(){
        test();
    }
    void test(){
        System.out.println("Super.test() flag="+flag);
    }
} class Sub extends Super{

    Sub(int i){  flag=i;
        System.out.println("Sub.Sub()flag="+flag);
    }

    void test(){
        System.out.println("Sub.test()flag="+flag);
    }
}

public static void main(String[] args) {
     //   new Demo().new Sub(5);

        String s1 =new String();
        char[] value =new char[1];



    Striped<Lock> lock = Striped.lazyWeakLock(127);
    Lock lock1 = lock.get("uid" + 123);







    System.out.println(new char[0].toString() );
    }
}