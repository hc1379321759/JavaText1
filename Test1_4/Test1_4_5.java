package com.hc.Test1_4;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Test1_4_5  {
    static int STUDENTS_NUMBERS=100;

    public static void main(String[] args) {
        Test1_4_5 t =new Test1_4_5();
        ArrayList<Student> students = new ArrayList<>();
        int height;
        for(int i=1;i<=STUDENTS_NUMBERS;i++){
            height =(int)(Math.random()*100+100);
            students.add(new Student(i,height));
        }
        System.out.println(students);
        Collections.sort(students,t.new CompareHeight(true));
        System.out.println(students);
        writeStudentOutTxt(students,"C:\\Users\\Windows\\Desktop\\宝云java入门自测题目\\students.txt");
    }


    public static void writeStudentOutTxt(ArrayList<Student> students,String filePath){
        try{
            String encoding = "UTF-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                OutputStreamWriter out = new OutputStreamWriter(
                        new FileOutputStream(file),encoding);
                for(int i=0;i<students.size()-1;i++){
                    out.write(String.valueOf(students.get(i)));
                    out.write("\r\n");
                }
                out.close();
            }
        }catch (Exception e){
            System.out.println("读取写入内容出错");
            e.printStackTrace();
        }
    }

    public static class Student{
        private Integer id;
        private Integer height;

        public Student(Integer id,Integer height) {
            this.id=id;
            this.height=height;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", height=" + height +
                    '}';
        }
    }

    public class CompareHeight implements Comparator<Student>{
        boolean is_asc;
        public CompareHeight(boolean b){
            is_asc=b;
        }

        @Override
        public int compare(Student o1, Student o2) {
            return  o1.getHeight()-o2.getHeight();
        }
        }
    }

