package com.hc;

public class Test1_3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10e8);
        System.out.println(a);
        changeString(a);
    }

    /**
     * 将数字转化为字符串并逐个输出
     * @param a
     */
    static void changeString(int a){
        String str = String.valueOf(a);
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

}
