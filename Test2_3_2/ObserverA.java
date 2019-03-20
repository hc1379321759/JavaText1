package com.hc.Test2_3_2;

public class ObserverA implements Observer {
    //观察者的名字
    private String name;

    public ObserverA(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name+"接受到消息："+message);
    }
}
