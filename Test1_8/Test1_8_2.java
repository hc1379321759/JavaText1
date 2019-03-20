package com.hc.Test1_8;

public class Test1_8_2 {
    public static void main(String[] args) {
        LockObject lockObject = new LockObject(0);
        MyThread[] mythreads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            mythreads[i] = new MyThread(lockObject, i);
            mythreads[i].start();
        }
    }

    /**
     * 锁对象
     * 设定一个value，根据value安排线程打印顺序
     */
    static class LockObject{
        private int value;
        private final int maxValue=9;

        public LockObject(int value) {
            this.value=value;
        }

        public int getMaxValue() {
            return maxValue;
        }
    }

     static class MyThread extends Thread{
        private LockObject lockObject;

        private int myNum;

         /**
          * myNum是给每个线程配置一个id
          * @param lockObject
          * @param myNum
          */
        public MyThread(LockObject lockObject, int myNum) {
            this.lockObject = lockObject;
            this.myNum = myNum;
        }

        @Override
        public void run() {
            synchronized (lockObject) { //判断资源是否空闲
                while (lockObject.value <= lockObject.getMaxValue()) {
                    if (lockObject.value == myNum) { //当线程id和value值相等时，该线程打印
                        System.out.println(
                                Thread.currentThread().getName() + " " + lockObject.value);
                        lockObject.value++;
                        lockObject.notifyAll();//打印完后，唤醒所有线程
                    } else {
                        try {//否则等待
                            lockObject.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
