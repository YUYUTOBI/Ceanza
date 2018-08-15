package Dome_8;

import java.io.*;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

/*
第一题:
         BufferedOutputStream  bos=new BufferedOutputStream(new FileOutputStream("C:/d.txt"));
         bos.write(12);
        bos.close();
第二题:
          BufferedOutputStream  bos=new BufferedOutputStream(new FileOutputStream("C:/e.txt"));
          byte [] len=("i,love,java".getBytes());
           bos.write(len);
           bos.close();
第三题:
         BufferedInputStream   bis=new BufferedInputStream(new FileInputStream("C:/c.png"));
        BufferedOutputStream  bos=new BufferedOutputStream(new FileOutputStream("D:/"));
        byte[] len=new byte[1];
        while ((bis.read(len))!=-1){
            bos.write(len);
        }
          bos.close();
          bis.close();
第四题:
         BufferedWriter bw = new BufferedWriter(new FileWriter("D:/data.txt"));
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入三个字符串验证码:");
        boolean add = list.add(sc.nextLine());
        boolean add1 = list.add(sc.nextLine());
        boolean add2 = list.add(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
            bw.newLine();
        }
        System.out.println("录入成功,已上传");
        bw.close();
        System.out.println("请输入验证码");
        String arr3 = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (arr3.equals(list.get(i))) {
                System.out.println("恭喜您,验证通过");
                return;
            }
        }
        System.out.println("验证失败,请重试");
第五题:

描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
要求：使用gbk编码保存。
注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。

* */
public class Dome_1 {
    public static void main(String[] args) throws IOException {
    OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"));
        osw.write("我爱Java");
        osw.close();
        OutputStreamWriter osw1=new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
       osw1.write("我爱JAVA");



    }

}





