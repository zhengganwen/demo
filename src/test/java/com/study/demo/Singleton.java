package com.study.demo;


import org.junit.Test;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:2019/03/02
 */
public class Singleton {
    private static Singleton singleton =null;
    /**
     * 声明私有的构造方法
     */
  //  private Singleton(){}

    /**
     * 单例模式双重锁模式
     * @return   Singleton
     */
    public static Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return  singleton;
    }


    public  String[] stringSort(String [] s) {
        List<String> list = new ArrayList<String>(s.length);
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        Collections.sort(list);
        return list.toArray(s);
    }


    @Test
    public  void test() {
        String[] s = new String[]{"secret", "1470820198", "123412"};
        s = stringSort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }


    public static String getSha1(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    public void  testSHA1() {
        String sha1 = getSha1("1234121470820198secret");

        System.out.println(sha1);

        int i = 0;
        int j = i++ + ++i;
        int k = --i + i--;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


        String abd = new String("abc");
        String string = new String("abc");

        System.out.println(abd==string);

        char a ='A';
        short s =15;

        System.out.println(a+s);

        TreeMap<String, Object> stringObjectTreeMap = new TreeMap<>();

    }

}
