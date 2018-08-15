package RiLi;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class RiLi {
    public static void main(String []args) throws ParseException {
        System.out.println(new Date(0L));//创建日期对象,获取系统默认时间值
        Date dat = new Date();//获取当天的时间
        System.out.println(dat);
        //创建SimpleDateFormat对象,写日期模式按指定格式
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String str = format.format(dat);// format作用:   Date(日期) 转String(字符串)对象
        System.out.println(str);
        String str1 = "2088年8月8日";
        Date date = format.parse(str1);// parse作用:    String(字符串) 转Date(日期)对象
        System.out.println(date);
        long str2 = dat.getTime();//getTime作用:    获取系统默认时间到今天的所有毫秒数
        System.out.println(str2);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);//设置年
        int month = cal.get(Calendar.MONTH) + 1;//设置月
        int dayofMonth = cal.get(Calendar.DAY_OF_MONTH);//设置日
        System.out.println(year + "年" + month + "月" + dayofMonth + "日");
        long start = System.currentTimeMillis();//获取当前的毫秒值
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            long end = System.currentTimeMillis();
            System.out.println("共耗时毫秒" + (end - start));

        }
        date();
    }
       // function();

    public static void   function() throws ParseException {
        System.out.println("请输入出生日期   格式 yyyy-MM-dd");
        String arr = new Scanner(System.in).next();
        SimpleDateFormat tt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = tt.parse(arr);
        Date dd = new Date();
        long l1 = date.getTime();
        long l2 = dd.getTime();
        long l3 = l1 - l2;
        if (l3 < 0) {
            System.out.println("还没出生呢");
        } else {
            System.out.println(l3 / 1000 / 60 / 60 / 24);
        }
    }
    public static void date(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//设置格式
        Calendar  cal=Calendar.getInstance();//日历
        cal.set(Calendar.YEAR,2088);//设置日历时间      年
        cal.set(Calendar.MONTH,7);//设置日历           月
        cal.set(Calendar.DAY_OF_MONTH,8);//设置日历  日
        Date date = cal.getTime();// 拿到对应的Date对象
        System.out.println(sdf.format(date));
    }
}
