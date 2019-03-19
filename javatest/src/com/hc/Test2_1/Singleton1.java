package com.hc.Test2_1;

/**
 * 饿汉式
 */
public class Singleton1 {
    private Singleton1(){//私有构造函数
    }
    private static Singleton1 instance = new Singleton1();//立即调用
    public  static Singleton1 getInstance(){
        return instance;
    }


}
