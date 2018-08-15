package yuansu;

import org.itheima.game.DrawUtils;

import java.io.IOException;


public class ShuiQ extends YuanSu {

    private String srcPath = "Tankgame/res/img/water.gif";

    public ShuiQ(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            int[] arr = DrawUtils.getSize(srcPath);
            this.kuan = arr[0];
            this.gao = arr[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void huihua() {
        try {
            DrawUtils.draw(srcPath,x,y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}