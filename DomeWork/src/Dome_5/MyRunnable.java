package Dome_5;

import Dome_3.Dome_5;

public class MyRunnable extends Thacher implements Runnable {
    @Override
    public void run() {
       synchronized (Dome_5.class){
           System.out.println("我需要一个老师");
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("指导我的老师是:"+Thread.currentThread().getName());
           System.out.println("教我JAVA,教完后,老师回到了办公室");
       }
       }
}
