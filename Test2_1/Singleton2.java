package com.hc.Test2_1;

/**
 * 懒汉式
 */
public class Singleton2 {
    private Singleton2(){
    }
    private static Singleton2 instance;
    public static synchronized Singleton2 getInstance(){//需要同步，并发效率低
        if(instance==null)
            instance=new Singleton2();
        return  instance;
    }
}
