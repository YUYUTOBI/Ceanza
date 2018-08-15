package Dome_9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Fuwuqi_1 {
    public static void main(String[] args) throws IOException {
//       思路:
//        1.创建ServerSocket对象
        ServerSocket sst=new ServerSocket(6666);
        while(true){
            //       2.使用该对象调用accept()方法,等待连接,连接成功就返回一个对应的socket
            Socket accept = sst.accept();
            try {
//       3.通过socket对象获取输入流
                InputStream is = accept.getInputStream();
//       4.使用输入流读取浏览器发送过来的请求信息
                BufferedReader br=new BufferedReader(new InputStreamReader(is));
                String line=br.readLine();
//    5.解析读取到的请求信息 ---> 指定页面的路径
                String[] arr=line.split("D:\\课件与软件/javaSE加强\\day11_网络编程\\02_资料\\上课资源文件\\web");
                String path=arr[1].substring(1);
                //       6.创建输入流对象,封装数据源文件
                FileInputStream fis=new FileInputStream(path);
                //      7.通过socket对象获取输出流
                OutputStream os=accept.getOutputStream();
                //       8.使用输入流对象,循环读取该页面的数据
                byte[] bys=new byte[8192];
                int len;
                // 写入HTTP协议响应头,固定写法
                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content-Type:text/html\r\n".getBytes());
                // 必须要写入空行,否则浏览器不解析
                os.write("\r\n".getBytes());
                while((len=fis.read(bys))!=-1){
                    //       9.使用输出流写出读取到的页面数据给浏览器
                    os.write(bys,0,len);}
                //       10.关闭流,释放资源*/

                os.close();fis.close();br.close();is.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            new Thread(()->{
          }).start();
      }
    }
}
