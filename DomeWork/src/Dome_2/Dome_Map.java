package Dome_2;
import java.nio.channels.Channel;
import java.util.*;
/*
第一题:
     Map的特点:
                1.都是以键值对的方式存储值
                2.键是不能重复的,如果重复就会覆盖该键,但值是可以重复的
                3都是通过键去取值的
第二题:
    Entry遍历Map的原理:
               1.把Map集合中的键值对,封装在一个对象中;
               2.通过Entry提供的getKey()方法来获取集合中的所有键;
               3 同时通过getValue()方法来获取和每个键所对应的值;
* */
public class Dome_Map {
    public static void main(String[] args) {
    //第三题:
        HashMap<String,String>  hm=new HashMap();//创建一个String类型的Map集合
        hm.put("冯宝宝","张楚岚");//添加一个键值对到集合中
        String name = hm.remove("冯宝宝");//删除一个键对值
        hm.get("冯宝宝");//通过键获取里面的值
    //第四题:
         HashMap<String,String>  list=new HashMap<>();
         list.put("冯宝宝","张楚岚");
         list.put("冯小宝","张小宝");
         list.put("冯二宝","张二宝");
         list.put("冯三宝","张三宝");
        Set<String> set = list.keySet();
        for (String s : set) {
            String s1 = list.get(s);
            System.out.println(s+"的CP是"+s1);
        }
        Iterator<String> iterator = set.iterator();
       while (iterator.hasNext()){
           String next = iterator.next();
           System.out.println(next+":"+list.get(next));
       }
    //第五题:
        Dome_5Car car1=new Dome_5Car("土豆");
        Dome_5Car car2=new Dome_5Car("白菜");
        Dome_5Car car3=new Dome_5Car("青椒");
       HashMap<Dome_5Car,String>  list1=new HashMap<>();
       list1.put(car1,"3.58");
       list1.put(car2,"2.38");
       list1.put(car3,"1.28");
        Set<Dome_5Car> sc = list1.keySet();
        for (Dome_5Car car : sc) {
            String s = list1.get(car);
            System.out.println("菜名是:"+car+"价格是:"+s+"元");
        }
        System.out.println("=======================================");
        Set<Map.Entry<Dome_5Car, String>> entries = list1.entrySet();
        for (Map.Entry<Dome_5Car, String> entry : entries) {
            Dome_5Car key = entry.getKey();
            String value = entry.getValue();
            System.out.println("菜名是:"+key+"价格是:"+value+"元");
        }
//第六题:
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        Set<Integer> mp = map.keySet();
        for (Integer mm : mp) {
            String s = map.get(mm);
            System.out.println("编号是:"+mm+"姓名是:"+s);
        }
//第七题:
        String [] arr1={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String [] arr2={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String, String> hmp=new HashMap<>();
        for (int i = 0; i <arr1.length ; i++) {
            hmp.put(arr1[i],arr2[i]);
        }
        System.out.println(hmp);
//第八题:
       List<String> aar=new ArrayList<>();
       Scanner lr=new Scanner(System.in);
        System.out.println("请输入数据");
        String zf = lr.next();
        char[] df = zf.toCharArray();
        LinkedHashMap<Character,Integer> lh=new LinkedHashMap<>();
        for (int i = 0; i <df.length ; i++) {
            if(!lh.containsKey(df[i])){
                lh.put(df[i],1);
            }else{
                Integer sun=lh.get(df[i]);
                lh.put(df[i],++sun);
            }
        }
        System.out.println(lh);
//第九题:
       LinkedHashMap<Integer,String>  gj=new LinkedHashMap<>();
       gj.put(1930,	"乌拉圭");
       gj.put(1934,	"意大利");
       gj.put(1938,	"意大利");
       gj.put(1950,	"乌拉圭");
       gj.put(1954,	"西德");
       gj.put(1958,	"巴西");
       gj.put(1962,	"巴西");
       gj.put(1966,	"英格兰");
       gj.put(1970,	"巴西");
       gj.put(1974,	"西德");
       gj.put(1978,	"阿根廷");
       gj.put(1982,	"意大利");
       gj.put(1986,	"阿根廷");
       gj.put(1990,	"西德");
       gj.put(1994,	"巴西");
       gj.put(1998,	"法国");
       gj.put(2002,	"巴西");
       gj.put(2006,	"意大利");
       gj.put(2010,	"西班牙");
       gj.put(2014,	"德国");
        Scanner nf=new Scanner(System.in);
        System.out.println("请输入年份");
        int i = nf.nextInt();

        Set<Integer> inte = gj.keySet();
        for (Integer integer : inte) {
            String s = gj.get(integer);
            if(nf.nextInt()==integer.intValue()){
                System.out.println("该年的世界杯冠军是:"+s);
            }else{
                System.out.println("没有举办世界杯");
            }
        }



    }
    }




