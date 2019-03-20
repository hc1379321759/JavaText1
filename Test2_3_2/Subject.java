package com.hc.Test2_3_2;

/**
 * 被观察者接口
 */
public interface Subject {
    //添加观察者
    void addObserver(Observer obs);
    //删除观察者
    void deleteObserver(Observer obs);
    //通知观察者
    void notifyObserver();
}
