package com.study.demo.demo;

import java.io.Serializable;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-13 10:41
 * @Description
 */
public class User implements Serializable {
    private String id;
    private String name;
    private  String  adress;

    public User() {
    }

    public User(String id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public User(String id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
