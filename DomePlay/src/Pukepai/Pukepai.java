package Pukepai;
import java.util.ArrayList;
import java.util.Collections;
public class Pukepai {
    public static void main(String[] args) {
        ArrayList<String> pukebork = new ArrayList<>();//创建一个集合存储牌
        ArrayList<String> huase = new ArrayList<>();//创建一个集合存储花色
        ArrayList<String> paimianzhi = new ArrayList<>();//创建一个集合存储牌面值
        //添加花色到花色集合中
        huase.add("♤");
        huase.add("♥");
        huase.add("♣");
        huase.add("♦");
        //添加牌面值到集合中
        for (int i = 2; i <= 10; i++) {
            paimianzhi.add(i + "");
        }
        paimianzhi.add("J");
        paimianzhi.add("Q");
        paimianzhi.add("K");
        paimianzhi.add("A");
        //利用增强for循环进行牌和花色的拼接
        for (String h : huase) {
            for (String p : paimianzhi) {
                String pukeBOX = h + p;
                pukebork.add(pukeBOX);
            }
        }
        //添加大小王到集合中
        pukebork.add("大王");
        pukebork.add("小王");
        System.out.println(pukebork);
        System.out.println(pukebork.size());
        Collections.shuffle(pukebork);
        System.out.println(pukebork);
        System.out.println(pukebork.size());
        //定义四个集合来存储3个玩家发的牌和底牌
        ArrayList<String> play1=new ArrayList<String >();
        ArrayList<String> play2=new ArrayList<String >();
        ArrayList<String> play3=new ArrayList<String >();
        ArrayList<String> dipai=new ArrayList<String >();
        //遍历牌并分配牌给玩家
        for (int i = 0; i <pukebork.size(); i++) {
            String fp=pukebork.get(i);
            if(i>=pukebork.size()-3){
                dipai.add(fp);
            }else if(i%3==0){
                play1.add(fp);
            }else if(i%3==1){
                play2.add(fp);
            }else{
                play3.add(fp);
            }
        }
        System.out.println("玩家1"+play1);
        System.out.println("玩家1"+play1.size());
        System.out.println("玩家2"+play2);
        System.out.println("玩家2"+play2.size());
        System.out.println("玩家3"+play3);
        System.out.println("玩家3"+play3.size());


    }
}
