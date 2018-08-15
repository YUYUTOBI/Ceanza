package Dome_1;

import java.util.*;

/*第一题:
List接口的特点:1元素的存取是有序的
               2每个元素都有索引
               3集合中可以有重复的元素
第二题:
     1重写hashCode方法,把系统默认的比较地址值更改为比较属性.
     2重写equals方法,比较它们之间的属性,如果相同就不添加.
第三题:
     1栈        特点:先入后出,栈的出入口都在栈的顶端;
     2队列      特点:先入先出,队列的出入口各占一端;
     3数组      特点:查询快,增删慢;
     4链表      特点:查询慢,增删快;
     5红黑树    特点:小的存储在左边,相等的就不存,大的存右边
第四题:
      Comparable是内部比较器
          内部比较器是系统默认比较,规则是定好的不方便使用
      Comparator是外部比较器
           外部比较器是自定义的,可以灵活的更改规则
* */
public class Dome_1 {
    public static void main(String[] args) {
//第五题:(1)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(32);//添加元素
        list.set(0, 13);//指定位置更改
        list.get(0);//获取指定位置的元素
        list.remove(0);//删除指定位置的元素
        list.clear();//清空集合
        list.size();//获取大小
        System.out.println(list);
//第五题:(2)
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addFirst(32);//添加元素在第一位
        list1.addLast(43);//添加元素在最后一位
        list1.getFirst();//获取元素第一个
        list1.getLast();//获取元素最后一个
        list1.removeFirst();//删除第一个元素
        list1.removeLast();//删除最后一个元素
        list1.push(24);//在栈中顶部添加一个元素
        list1.pop();//弹出栈中顶部元素
        list1.clear();//清空集合
        System.out.println(list1);
//第六题:
        Mankind mk1 = new Mankind("张三", 25);
        Mankind mk2 = new Mankind("张三", 25);
        Mankind mk3 = new Mankind("甲乙", 24);
        Mankind mk4 = new Mankind("丙丁", 23);
        HashSet<Mankind> hmd = new HashSet<>();
        Collections.addAll(hmd, mk1, mk2, mk3, mk4);
        System.out.println(hmd);
//第七题:
        ArrayList<String> name = new ArrayList<>();
        Collections.addAll(name, "张三", "李四", "王五", "二丫", "钱六", "孙七");
        name.set(3, "王小丫");
        System.out.println(name);
//第八题:
        LinkedHashSet<String> lh = new LinkedHashSet<>();
        Collections.addAll(lh, "王昭君", "王昭君", "西施", "杨玉环");
        Iterator<String> iterator = lh.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        for (String ss : lh) {
            System.out.println(ss);
        }
//第九题:
        ArrayList<Integer> man = new ArrayList<>();
        Collections.addAll(man, 33, 11, 77, 55);
        Collections.sort(man);
        System.out.println(man);
//第十题:
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list2 = new LinkedList<>();
        Collections.addAll(list2,strs);
        HashSet<String> arr=new HashSet<>();
        arr.addAll(list2);
        Iterator<String> it = arr.iterator();
        while (it.hasNext()) {
            String sss = it.next();
            System.out.println(sss);
        }
        for (String qq : arr) {
            System.out.println(qq);
        }
    }
}



