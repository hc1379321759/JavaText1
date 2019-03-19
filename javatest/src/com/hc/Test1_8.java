package com.hc;

public class Test1_8 {
    static class MyThread extends Thread {
        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName());
            }
    }

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            myThreads[i] = new MyThread();
            myThreads[i].start();
        }
    }
}
