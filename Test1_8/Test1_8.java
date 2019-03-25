package com.hc.Test1_8;

public class Test1_8 {
    static int THREADS_NUMBERS=10;

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            }
    }

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[THREADS_NUMBERS];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread();
            myThreads[i].start();
        }
    }
}
