package yuansu;

public abstract class YuanSu {
    protected  int x;
    protected  int y;
    protected  int kuan;
    protected  int gao;
    protected  int xueliang;


    public YuanSu() {
    }

    public YuanSu(int x, int y) {

        this.x = x;
        this.y = y;
    }
    public abstract void  huihua();

}
