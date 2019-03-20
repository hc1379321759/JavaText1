package com.hc.Test1_2;

public class Test1_2 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10e4);
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));//直接将十进制转成二进制，但不能是负数
    }

}
