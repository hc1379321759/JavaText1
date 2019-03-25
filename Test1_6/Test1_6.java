package com.hc.Test1_6;


import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1_6 {
    public static void main(String[] args) {
        String str="you're Your news feed helps you keep up with recent activity on repositories you watch and people you follow. ";
        countWords(str);
    }

    /**
     * 传入字符串，输出字符中每个单词出现的个数
     * @param str
     */
    static void countWords(String str){
        Pattern pattern = Pattern.compile("[a-z]+");//定义正则表达式匹配单词
        str= str.toLowerCase();//全部小写
        Matcher matcher =pattern.matcher(str);//定义str2的匹配器
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
