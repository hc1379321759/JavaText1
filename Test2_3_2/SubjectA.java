package com.hc.Test2_3_2;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject {
    //用来存放观察者
    private List<Observer> observers = new ArrayList<>();

    //这是要发送给观察者的信息
    private String message;

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void deleteObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if(i>=0)
            observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for (int i=0;i<observers.size();i++){
            Observer o = (Observer)observers.get(i);
            o.update(message);
        }
    }

    /**
     * 向观察者推送消息
     * @param message
     */
    public void setMessage(String message){
        this.message=message;
        System.out.println("推送消息："+message);
        this.notifyObserver();
    }

}
