package Dome_1;

import java.io.*;
import java.util.ArrayList;

/*
需要完成最终效果，是在控制台完成如下信息打印：
Java基础教程,共计xxx元
深入浅出JavaEE,共计xxx元
MySQL使用指南,共计xxx元
IOS从入门到精通,共计xxx元
Java破天宝典,共计xxx元
图书总金额为:xxx*/
public class Dome {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Book bk = new Book();
        BufferedReader bw = new BufferedReader(new FileReader("DomeWork2/src/Dome_1/book.txt"));
        Integer len;
        while ((len = bw.read()) != -1) {
            String s = bw.readLine();
            list.add(s);
        }
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}