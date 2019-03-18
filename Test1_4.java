package com.hc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test1_4 {
    public static void main(String[] args) {
        ArrayList<Float> list1 = new ArrayList<Float>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Float> list3 = new ArrayList<Float>();
        float random;
        for(int i=0;i<=100;i++){
            random = (float)Math.random()*100;
            list1.add(random);
        }
        System.out.println(list1);
        writeTxtFlieOutFloatArrList(list1,"C:\\Users\\Windows\\Desktop\\宝云java入门自测题目\\random_numbers.txt");
//        maxFive(list1);
        list2=readTxtFileIntoStringArrList("C:\\Users\\Windows\\Desktop\\宝云java入门自测题目\\random_numbers.txt");
        for(int i=0;i<list2.size();i++){
            list3.add(Float.parseFloat(list2.get(i)));//将String转换为float
        }
        Collections.sort(list3);
        writeTxtFlieOutFloatArrList(list3,"C:\\Users\\Windows\\Desktop\\宝云java入门自测题目\\sorted_numbers.txt");

    }

    /**
     * 按从小到大排序
     * 取最后五个数
     * @param list
     */
    public static void maxFive(ArrayList<Float> list){
        int count=0;
        Collections.sort(list);
        for(int i=list.size()-1;count<5;i--) {
            System.out.print(list.get(i)+"  ");
            count++;
        }
    }

    /**
     * 将list写入filePath的txt文件中
     * @param list
     * @param filePath
     */
    public static void writeTxtFlieOutFloatArrList(ArrayList<Float> list,String filePath){
        try{
            String encoding = "GBK";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                OutputStreamWriter out = new OutputStreamWriter(
                        new FileOutputStream(file),encoding);
                for(int i=0;i<list.size()-1;i++){
                    out.write(String.valueOf(list.get(i)));
                    out.write("\r\n");
                }
            out.close();
            }
        }catch (Exception e){
            System.out.println("读取写入内容出错");
            e.printStackTrace();
        }
    }

    /**
     * 读取filePath路径文件的数据
     * 以ArrayList<String>的方式输出
     * @param filePath
     * @return
     */
    public static ArrayList<String> readTxtFileIntoStringArrList(String filePath)
    {
        ArrayList<String> list = new ArrayList<>();
        try
        {
            String encoding = "GBK";
            File file = new File(filePath);
            if (file.isFile() && file.exists())
            { // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;

                while ((lineTxt = bufferedReader.readLine()) != null)
                {
                    list.add(lineTxt);
                }
                bufferedReader.close();
                read.close();
            }
            else
            {
                System.out.println("找不到指定的文件");
            }
        }
        catch (Exception e)
        {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

        return list;
    }
}




