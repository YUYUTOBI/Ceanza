package Dome_3;

public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                System.out.println("子线程1-100所有的偶数"+i);
            }

        }
    }
}
