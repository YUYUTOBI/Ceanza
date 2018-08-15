package Dome_6;
import java.io.IOException;
/*第一题:
相对路径:
           File file1=new File("bbb.java");
绝对路径:
          File file=new File("D:\\bbb");
第二题:
创建文件:
          File  file=new File("D:\\a.txt");
          System.out.println( file.createNewFile());
第三题:
创建文件夹:
         File file=new File("D:\\ccc" );
         System.out.println(file.mkdir());
第四题:
创建多级文件夹:
          File  file =new File("D:\\ccc\\bbb\\aaa");
          System.out.println(file.mkdirs(););
第五题:
删除文件
          File  file =new File("D:\\aaa\\a.txt");
           System.out.println( file.delete());
第六题:
        new File("D:\\aaa").mkdir();
        new  File("D:/aaa/b.txt").createNewFile();
        File file =new File("D:/aaa/b.txt");
        System.out.println("文件名是:"+file.getName());
        System.out.println("文件的大小"+file.length());
        System.out.println("文件的绝对路径是:"+file.getAbsolutePath());
        System.out.println("文件的父路径是:"+file.getParent());
第七题:
         File  file=new File("D:/xxx.txt");
         if (file.isFile()){
        System.out.println(file.getName()+"是一个文件");}
        else{
             System.out.println(file.getName()+"不是一个文件");
         }
        File  filea=new File("D:/xxx");
        if (filea.isFile()){
            System.out.println(filea.getName()+"是一个文件");}
        else{
            System.out.println(filea.getName()+"不是一个文件");
        }
第八题:
         Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件的名字");
        File  file=new File(sc.nextLine());
        if(file.exists()){
            if(file.isDirectory()){
                File[] arr=file.listFiles();
                if(arr!=null){
                    for (File s : arr) {
                        if(s.isFile()){
                            System.out.println("文件名是:"+s.getName());
                        }
                    }
                }else {
                    System.out.println("该文件夹为空");
                }
            }else {
                System.out.println("该路径为文件");
            }
        }else {
            System.out.println("该文件路径不存在");
        }

* */
public class Dome1 {
    public static void main(String[] args) throws IOException {
/*        Scanner sc=new Scanner(System.in);
        System.out.print("请输入文件的名字");
        while(true){
        File  file=new File(sc.nextLine());
        File[] files=file.listFiles();
        if(file.isFile()){
            System.out.println("文件的大小是:"+file.length());
            break;
        }if(file.isDirectory()){
            for (File file1 : files) {
                System.out.println("所有文件的总和是:"+file1.length());
                break;
            }
            }else{
            System.out.println("路径无效,请重新输入");
        }}*/
        //System.out.println(Mouth(24));
        System.out.println(taozi(1));
    }

    public static int Mouth(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return (Mouth((a - 2)) + Mouth(a - 1));
        }

    }

    public static int taozi(int day) {
        if (day==10){
            return 1;
        }
        day++;
            return taozi(day)*2+1;
    }
}