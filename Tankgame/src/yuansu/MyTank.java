package yuansu;

import com.itheima.game.Config;
import org.itheima.game.AnJian;
import org.itheima.game.DrawUtils;

import java.io.IOException;
import java.util.function.Predicate;

public class MyTank extends YuanSu {
    private int ShuD = 32;
    private int xueliang = 6;
    private String srcPath1 = "Tankgame/res/img/tank_u.gif";
    private String srcPath2 = "Tankgame/res/img/tank_d.gif";
    private String srcPath3 = "Tankgame/res/img/tank_l.gif";
    private String srcPath4 = "Tankgame/res/img/tank_r.gif";
    public AnJian anJian = AnJian.UP;


    public MyTank(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            int[] arr = DrawUtils.getSize(srcPath1);
            this.kuan = arr[0];
            this.gao = arr[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void move(AnJian anJian) {
        this.anJian = anJian;
        switch (anJian) {
            case UP:
                y -= ShuD;
                break;
            case DOWN:
                y += ShuD;
                break;
            case LEFT:
                x -= ShuD;
                break;
            case RIGHT:
                x += ShuD;
                break;
        }
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        if (x > Config.BTK - 64) {
            x = Config.BTK - 64;
        }
        if (y > Config.BTG - 64) {
            y = Config.BTG - 64;
        }
    }

    @Override
    public void huihua() {
        String srcPath = "";
        switch (anJian) {
            case UP:
                srcPath = srcPath1;
                break;
            case DOWN:
                srcPath = srcPath2;
                break;
            case LEFT:
                srcPath = srcPath3;
                break;
            case RIGHT:
                srcPath = srcPath4;
                break;
        }
        try {
            DrawUtils.draw(srcPath, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FaSeZD FaS() {
        return new FaSeZD(this);

    }

    public void YiD() {

    }

}