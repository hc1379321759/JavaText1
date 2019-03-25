package com.hc.Test1_7;

public class Test1_7 {
    public static void main(String[] args) {
        String str="hello";
        char[] chars = new char[str.length()];
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        Reversal(chars,0);
        for(int i=0;i<str.length();i++){
            System.out.print(chars[i]);
        }

    }

    /**
     * 将数组的第i位和最后chars.length-1-i位交换
     * 由count控制，当count=chars.length/2时递归结束，完成反转
     * @param chars
     * @param count
     * @return
     */
    public static char[] Reversal(char[] chars,int count){
        char temp;
        if(count<chars.length/2){//递归体
            temp = chars[count];
            chars[count] = chars[chars.length-count-1];
            chars[chars.length-count-1] = temp;
            count++;
            Reversal(chars,count);
        }
        return chars;
    }

}
