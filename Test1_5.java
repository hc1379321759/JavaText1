package com.hc;

import java.util.HashMap;

public class Test1_5 {


    public static void main(String[] args) {
        String str ="Java is a general-purpose computer-programming language";
        getZimu(str);
    }

    /**
     * 先切换成小写
     * 再利用hashmap计数
     * @param str
     */
    static void getZimu(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        str=str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            Integer count = map.get(c);
            if(c>='a'&&c<='z'){
                if(count==null){
                    map.put(c, 1);
                }else{
                    map.put(c, count+1);
                }
            }
        }
        System.out.println("各字符的个数为："+map);
        }



}
