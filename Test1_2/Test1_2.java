package com.hc.Test1_2;

import java.util.ArrayList;
import java.util.List;

public class Test1_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //int a=(int)(Math.random() * 10e4); //不一定生成5位数
        int a = (int) ((Math.random() * 9+1)*10000);
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));//直接将十进制转成二进制，但不能是负数
        while (true){
            list.add(a%2);
            a=a>>1;
            if(a==0){
                break;
            }
        }
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}


