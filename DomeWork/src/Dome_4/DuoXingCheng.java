package Dome_4;
public class DuoXingCheng extends Thread {
    @Override
    public void run() {
        System.out.println("子线程的名称是:"+getName());
    }
}
