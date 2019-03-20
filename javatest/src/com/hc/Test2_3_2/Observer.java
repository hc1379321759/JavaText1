package com.hc.Test2_3_2;

/**
 * 观察者接口
 */
public interface Observer {
    //接受到被观察者发出的信息后，观察者需要做出改变
    void update(String message);
}
