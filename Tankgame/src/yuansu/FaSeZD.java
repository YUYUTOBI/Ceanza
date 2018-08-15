package yuansu;

import org.itheima.game.AnJian;
import org.itheima.game.DrawUtils;

import java.io.IOException;

public class FaSeZD extends YuanSu {

    private String srcPath1 = "Tankgame/res/img/bullet_u.gif";
    private String srcPath2 = "Tankgame/res/img/bullet_d.gif";
    private String srcPath3 = "Tankgame/res/img/bullet_l.gif";
    private String srcPath4 = "Tankgame/res/img/bullet_r.gif";
    private int SheS =2;
    private AnJian anJian;


    public FaSeZD(MyTank mt) {
        int tx = mt.x;
        int ty = mt.y;
        int tw = mt.kuan;
        int th = mt.gao;
        this.anJian = mt.anJian;
        switch (mt.anJian) {
            case UP:
                try {
                    int[] arr = DrawUtils.getSize(srcPath1);
                    this.kuan = arr[0];
                    this.gao = arr[1];
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.x = tx + (tw - this.kuan) / 2;
                this.y = ty - this.gao;
                break;
            case DOWN:
                try {
                    int[] arr = DrawUtils.getSize(srcPath2);
                    this.kuan = arr[0];
                    this.gao = arr[1];
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.x = tx + (tw - this.kuan) / 2;
                this.y = ty + th;
                break;
            case LEFT:
                try {
                    int[] arr = DrawUtils.getSize(srcPath3);
                    this.kuan = arr[0];
                    this.gao = arr[1];
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.x = tx - this.kuan;
                this.y = ty + (th - this.gao) / 2;
                break;
            case RIGHT:
                try {
                    int[] arr = DrawUtils.getSize(srcPath4);
                    this.kuan = arr[0];
                    this.gao = arr[1];
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.x = tx + tw;
                this.y = ty + (th - this.gao) / 2;
                break;
        }
    }
    @Override
    public void huihua() {
        switch (this.anJian) {
            case UP:
                try {
                    DrawUtils.draw(srcPath1, x, y);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case DOWN:
                try {
                    DrawUtils.draw(srcPath2, x, y);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case LEFT:
                try {
                    DrawUtils.draw(srcPath3, x, y);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case RIGHT:
                try {
                    DrawUtils.draw(srcPath4, x, y);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}