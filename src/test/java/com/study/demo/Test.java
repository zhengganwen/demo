package com.study.demo;

import java.math.BigDecimal;

public class Test {
     static  boolean s1;

    public static  void main(String[] args ){
        System.out.println(s1);

        float a =1.0f -0.9f;
        float b = 0.9f - 0.8f;
        if(a==b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        String param ="null";
        switch (param){
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
        }


        BigDecimal ba = new BigDecimal(0.1);
        System.out.println("ba="+ba);

        BigDecimal bb = new BigDecimal("0.1");
        System.out.println("bb="+bb);



    }
}
