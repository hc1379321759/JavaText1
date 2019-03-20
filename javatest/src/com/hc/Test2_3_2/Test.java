package com.hc.Test2_3_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String message;
        SubjectA subjectA = new SubjectA();

        ObserverA a1= new ObserverA("张三");
        ObserverA a2= new ObserverA("李四");
        ObserverA a3= new ObserverA("王五");
        ObserverA a4= new ObserverA("小明");
        ObserverA a5= new ObserverA("小红");

        subjectA.addObserver(a1);
        subjectA.addObserver(a2);
        subjectA.addObserver(a3);

        System.out.println("请输入要推送的消息");
        message = s.nextLine();
        subjectA.setMessage(message);

        subjectA.addObserver(a4);
        subjectA.addObserver(a5);
    }
}
