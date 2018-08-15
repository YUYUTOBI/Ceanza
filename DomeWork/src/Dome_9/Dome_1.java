package Dome_9;

import com.sun.jdi.PathSearchingVirtualMachine;

/*
第一题:
    IP:标记设备,是计算机设备的唯一编号;
    端口:标记进程(应用程序),是进程的唯一编号;
第二题:
     UDP协议:是错误的,因为UDP协议在无连接的情况下,不管对方设备在不在线都会发送数据,
             这样就很容易造成数据丢失;
第三题:
     TCP协议:第一次握手,客户端向服务器发送连接请求,等待服务器确认;
             第二次握手,服务器回应客户端表示收到连接请求并确认;
             第三次握手,客户端再次向服务器发送连接请求,完成连接;
第四题:
       以下哪个方法是ServerSocket类用于接收来自客户端请求：(B)
             A.receive()
            B.accept()
            C.set()
            D.send()
* */
public class Dome_1 {
    public static void main(String[] args) {

    }
}
