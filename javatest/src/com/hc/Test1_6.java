package com.hc;


import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1_6 {
    public static void main(String[] args) {
        String str1="you're Your news feed helps you keep up with recent activity on repositories you watch and people you follow. ";
        Pattern pattern = Pattern.compile("[a-z]+");//定义正则表达式匹配单词
        String str2= str1.toLowerCase();//全部小写
        Matcher matcher =pattern.matcher(str2);//定义str2的匹配器
        HashMap<String,Integer> words = new HashMap<>();
        String word = null;//出现的单词
        while (matcher.find()){
            word = matcher.group();
            if(words.get(word)==null) {
                words.put(word, 1);
            }
            else {
                words.put(word, words.get(word)+1);
            }
        }
        System.out.println(words);

    }
}
