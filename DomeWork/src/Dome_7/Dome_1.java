package Dome_7;
/*
第一题:
         FileOutputStream fis=new FileOutputStream("D:a.txt");
        fis.write('a');
        fis.close();
        System.out.println("搞定");
第二题:
        FileOutputStream fis=new FileOutputStream("D:a.txt");
        byte[] arr={i,love, java};
        fis.write(arr);
        fis.close();
        System.out.println("搞定");
第三题:
         FileInputStream fis = new FileInputStream("D:/c.txt");
        FileOutputStream sif = new FileOutputStream("C:/c.txt", true);
        fis.read("i,love,java".getBytes());
        fis.read("\r\n".getBytes());
        fis.read("i,love,java".getBytes());
        fis.read("\r\n".getBytes());
        fis.read("i,love,java".getBytes());
        fis.read("\r\n".getBytes());
        fis.read("i,love,java".getBytes());
        fis.read("\r\n".getBytes());
        fis.read("i,love,java".getBytes());
        int len;
        while ((len = fis.read()) != -1) {
            sif.write(len);
        }
        fis.close();sif.close();
        System.out.println("搞定");

第四题:
        FileInputStream fis = new FileInputStream("D:/a.txt");
        int len;
        while((len=fis.read())!=-1){
            System.out.println(len);
            fis.close();
        System.out.println("搞定");
第五题:
         FileInputStream fis = new FileInputStream("D:/b.txt");
        byte[] arr=new byte[1024*8];
        int len;
        while((len=fis.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }fis.close();
        System.out.println("搞定");
第六题:
         FileInputStream fis = new FileInputStream("E:/a.png");
        FileOutputStream sif=new FileOutputStream("D:/a.png");
        int len;
        while((len=fis.read())!=-1){
            sif.write(len);
    }    fis.close();
        sif.close();
        System.out.println("搞定");
第七题:
        Scanner sc = new Scanner(System.in);
        FileWriter fis = new FileWriter("D:/info,txt", true);
        String ss = "886";
        System.out.println("请输入一条信息");
        while (true) {
            if (ss.equals(sc.nextLine())) {
                break;
            } else {
                fis.write(sc.nextLine());
                fis.write("\r\n");
            }
            fis.close();
            System.out.println("搞定");

* */
import java.io.*;
import java.net.SocketTimeoutException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Dome_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("D:/score.txt");
         Properties pt=new Properties();
         String ss="lisi";
           pt.load(fi);
        Set<String> enumeration = pt.stringPropertyNames();
        for (String key:enumeration){
            if(key.equals(ss)){
                pt.put("lisi",100);
            }
        }
        pt.store(new FileWriter("D:/score.txt"),"王国强修改");
        fi.close();
    }
    }




