package Dome_3;
import java.lang.annotation.ElementType;
import java.text.ParseException;
/*
第一题:
异常的继承体系:
      1.由异常的根类java.lang.Throwble,和它的两个子类java.lang.Error和java.lang.Exception来封装存放异常;
      2.Error:由系统自身和硬件.软件不兼容等等方面发起的错误,自身无法独立解决;
      3.Expection:由程序员自身因没有遵守JVM的规则和规范操作产生的各种错误,自身可以解决;
      4.RuntimeException:由程序员自身因数据操作和逻辑误区导致程序运行报错;
第二题:
      1.throw:使用在方法内,作用是把异常错误抛出给调用者;
      2.throws:使用在方法的声明上,作用是标识异常,在无捕捉异常的情况下,将异常进行声明后让调用者去处理;
第三题:
      1.两种;分别是:异常抛出(throw)和捕捉异常(try...catch);
      2.1异常抛出:在方法中出现的错误用throw进行抛出给调用者,并结束当前方法的执行;
      2.2捕捉异常:在可能出现异常的代码区写入try代码块中,用catch来给出异常的处理方式;
第四题:
     1.ArrayIndexOutOfBoundsException(数组角标越界异常)原因:角标超出数组最大长度;
     2.NullPointerException(空指针异常)原因:引用为空;
     3.ClassCastException(类型转换异常)原因:
     4.StringIndexOutOfBoundsException(字符串角标越界异常)原因:角标超出字符串最大长度;
第五题:
     5.1结果:空指针异常;
     5.2结果:数组越界异常;
     5.3结果:数学运算异常;
     5.4结果:类型转换异常;
     5.5结果:程序正常;
第六题:
     并行:在同一时间同时发生的事件;
     并发:在同一时间段内发生的事件;
第七题:
     进程:包含所有程序执行代码和数据的一块内存空间;
     线程:进程中的一个可执行单元/路径;
     进程和线程的关系:进程中可以包含多个线程,线程是进程的可执行单元;
* */
public class Dome_5 {
    public static void main(String[] args) {
//第八题:
        Student who = new Student();
        try {
            who.setScore(-1);
        } catch (Myanomly e) {
            e.printStackTrace();
        }
        System.out.println(who.getScore());
//第九题:
          Mythread xc=new Mythread();
        xc.start();
        for (int i = 1; i <100 ; i++) {
            if(i%2!=0){
                System.out.println("主线程1-100的所有奇数"+i);
            }
        }
//第十题:
        Myrole js=new Myrole();
        try {
            js.setShenming(-1);
        }catch (Dome_Yc e){
            e.printStackTrace();
        }
        System.out.println(js.getShenming());
    }
}
