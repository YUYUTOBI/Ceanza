package Dome_5;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
第一题:
     线程池的概念:就是一个用来存储线程的容器,其中的线程可以反复使用,
     不用不断的创建新的线程,能大大的减少内存资源
第二题:
      线程池的优点:1.减少资源消耗;
                   2.提升响应速度;
                   3.提高线程的可管理性;
第三题:
      Lambda语法的省略规则:1.当小括号内的参数类型可以省略;
                           2. 如果小括号内有且只有一个参,小括号可以省略;
                           3.如果大括号内有且只有一条语句,大括号可以省略;
第四题:
      Lambda表达式由3部分组成:1.一些参数 ()(小括号内的语法参数类型和传统的参数语法一致,无参留空,有参用逗号分隔);
                              2.一个箭头  -> (新的一种引入语法格式,代表指向动作);
                              3.一段代码组成 {}(大括号内的语法和传统的方法体基本一致);
 第五题:
    Lambda表达式的使用前提:1.使用Lambda必须具有接口,接口内有且只有一个抽象方法;
                           2. 使用Lambda必须具有上下文推断;
第六题:
        public class Test06 {
        public int start = 1;
        public int end = 99;
        public static void main (String[] args) {
            new Test06().method();
        }
        public void method() {
       //请在此处插t入代码，实现功能
         Runnable a=()->{
             for (int i = start; i <end ; i++) {
                 System.out.println(i); } };
            Thread t = new Thread( a );
            t.start();
        }
    }
}
第七题:
     1.在编译时就会报错,因为test7没有重写Runndble接口中的run()方法;
     2.Runnable接口中的run()方法,参数列表为空,是没有参数的;
* */
public class Dome1 {
    public static void main(String[] args) {

/*
第八题:
        ExecutorService   service= Executors.newFixedThreadPool(2);
    MyRunnable  myRunnable=new MyRunnable();
    service.submit(myRunnable);
    service.submit(myRunnable);
    service.submit(myRunnable);
    service.shutdown();
    System.out.println(service);*/
//第九题:
 /*     invokeDirect(()-> System.out.println("导演拍电影啦"));
    }
    public static void  invokeDirect(Director director){
        director.makeMovie();
    }*/
//第十题:
/*
          //标准版
         invokecalc(60,20,(int a,int b)->{return a-b;});
        //省略版
        invokecalc(50,10,(a,b)->a-b);
        }
public static  void invokecalc(int a,int b,Calculator calculator ){
        int result=calculator.calc(a,b);
        System.out.println("结果是:"+result);
*/
        Student[] arr = {
                new Student("小红",80),
                new Student("小白",60),
                new Student("小绿",100),};
        Arrays.sort(arr,(s1,s2)->s1.getScore()-s2.getScore());
        for (Student student : arr) {
            System.out.println(student);
        }



    }
}