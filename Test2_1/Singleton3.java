package com.hc.Test2_1;

/**
 * 静态内部类实现单例模式
 */
public class Singleton3 {
    private Singleton3(){
    }
    private static class SingletonInnerClass{//静态内部类
        private static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return  SingletonInnerClass.instance;
    }

}
