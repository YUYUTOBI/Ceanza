package Dome_4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
第一题:
      Therad类中的start()方法是:线程的开始执行方法,而run()方法是:线程中要执行的代码块;
第二题:
     1.通过创建Thread类的子类来重写类中的run方法,通过创建的子类对象调用start(),来执行程序;
     2.通过定义Runnable接口的实现类,并实现该接口的run方法,创建Therad对象,通过对象调用start()方法来执行程序;
第四题:
     优势:1.适合多个相同的程序代码的线程去共享同一个资源。
          2.可以避免java中的单继承的局限性。
          3.增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
          4.线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类.
第五题:
       1.新建;2.可运行;3锁阻塞4.无限等待;5.计时等待;6.被终止;


* */
public class Dome1 {
    public static void main(String[] args) throws InterruptedException {
//第三题:
       /* Thread th = new Thread();
        System.out.println("主线程的名称是:" + th.getName());
        DuoXingCheng zi = new DuoXingCheng();
        zi.start();
        Dxc xc = new Dxc();
        Thread rh = new Thread(xc, "OX11901");
        rh.start();
        System.out.println("子线程的名称是:" + rh.getName());*/
//第六题:
       /*Thread hh=new Thread(new Runnable() {
           @Override
           public void run() {
               while (true){
                   System.out.println("子线程执行");
               }
           }
       });
       hh.start();
       while (true ){
            System.out.println("主线程执行");
        }*/
//第七题:
       /* Thread  th=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                System.out.println("显示画面");}
            }
        });
        th.start();
        while (true){
            System.out.println("播放背景音乐");
        }*/
//第八题:
        Thread tt=new Thread(new Runnable() {
            @Override
            public void run() {
              synchronized (Dome1.class){ for (int i = 1; i <20 ; i++) {
                    System.out.println("子线程循环"+i+"次");
                }
            }}
        });
        tt.start();
        synchronized (Dome1.class){
        for (int i =1; i <20 ; i++) {
            System.out.println("主线程循环"+i+"次");
        }}
//第九题:
      Thread  hr=new Thread();
        Thread  hr1=new Thread(hr,"张一旦");
        Thread  hr2=new Thread(hr,"张二旦");
        Thread  hr3=new Thread(hr,"张三旦");
        Thread  hr4=new Thread(hr,"张四旦");
        Thread  hr5=new Thread(hr,"张五旦");
        Thread  hr6=new Thread(hr,"张六旦");
        Thread  hr7=new Thread(hr,"张七旦");
        Thread  hr8=new Thread(hr,"张八旦");
        Thread  hr9=new Thread(hr,"张九旦");
        Thread  hr10=new Thread(hr,"张十旦");
      }
      }








