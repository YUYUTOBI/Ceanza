package yuansu;

import org.itheima.game.DrawUtils;

import java.io.IOException;

public class TuQ extends YuanSu {
    private int xueliang = 2;
    private String srcPath = "Tankgame/res/img/wall.gif";

    public TuQ(int x, int y) {
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