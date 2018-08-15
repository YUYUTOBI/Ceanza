package Dome_3;
public class Myrole {
    private  String   xingming;
    private double   shenming;

    public Myrole() {
    }

    public Myrole(String xingming, double shenming) {

        this.xingming = xingming;
        this.shenming = shenming;
    }

    public String getXingming() {

        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public double getShenming() {
        return shenming;
    }

    public void setShenming(double shenming) {
        if (shenming < 0) {
            throw  new Dome_Yc("生命过低,已死亡");
        }
        this.shenming = shenming;
    }}


