package com.itheima.game;




import org.itheima.game.AnJian;
import org.itheima.game.SoundUtils;
import org.itheima.game.Window;
import org.lwjgl.input.Keyboard;
import yuansu.*;

import java.io.IOException;
import java.util.ArrayList;


import static com.itheima.game.Config.BTG;
import static com.itheima.game.Config.BTK;

public class WinodGame extends Window {
   ArrayList<YuanSu> list1=new ArrayList<YuanSu>();
    MyTank  mt;

    public WinodGame(String title, int width, int height, int fps) {
        super(title, width, height, fps);
    }

    @Override
    protected void onCreate() {
        for (int i = 0; i < BTK / 64; i++) {
            TuQ tuQiang1 = new TuQ(i * 64, 64 * 1);
            list1.add(tuQiang1);
        }
        for (int i = 0; i < BTK / 64; i++) {
            TuQ tuQiang2 = new TuQ(i * 64, 64 * 2);
            list1.add(tuQiang2);
        }
        for (int i = 0; i < BTK / 64; i++) {
            if (i < 1) {
                CaoQ caoQiang = new CaoQ(i * 64, 64 * 3);
                list1.add(caoQiang);
            }
        }
        for (int i = 1; i < BTK / 64; i++) {
            ShuiQ shuiQiang = new ShuiQ(i * 64, 64 * 3);
            list1.add(shuiQiang);
        }
        for (int i = 0; i < BTK / 64; i++) {
            TuQ tuQiang2 = new TuQ(i * 64, 64 * 4);
            list1.add(tuQiang2);
        }
        for (int i = 0; i < BTK / 64 - 1; i++) {
            TieQ tieQiang = new TieQ(i * 64, 64 * 5);
            list1.add(tieQiang);
        }
        for (int i = 0; i < BTK / 64; i++) {
            if (i == 14) {
                CaoQ caoQiang = new CaoQ(i * 64, 64 * 5);
                list1.add(caoQiang);
            }
        }
        for (int i = 1; i < BTK / 64; i++) {
            CaoQ caoQiang = new CaoQ(i * 64, 64 * 6);
            list1.add(caoQiang);}

            for (int i = 2; i < BTK / 64; i++) {
                TieQ tieQiang = new TieQ(i * 64, 64 * 7);
                list1.add(tieQiang);
            }
            for (int i = 0; i < BTK / 64; i++) {
                if (i == 1) {
                    CaoQ caoQiang = new CaoQ(i * 64, 64 * 7);
                    list1.add(caoQiang);
                }
            }
            for (int i = 0; i < BTK / 64 - 1; i++) {
                if (i == 0) {
                    TieQ tieQiang = new TieQ(i * 64, 64 * 6);
                    list1.add(tieQiang);
                }
            }
            for (int i = 0; i < BTK / 64 - 1; i++) {
                if (i == 0) {
                    TieQ tieQiang = new TieQ(i * 64, 64 * 7);
                    list1.add(tieQiang);
                }
            }
            for (int i = 0; i < BTK / 64 - 1; i++) {
                if (i == 0) {
                    TieQ tieQiang = new TieQ(i * 64, 64 * 8);
                    list1.add(tieQiang);
                }
            }
            for (int i = 1; i < BTK / 64; i++) {
                CaoQ caoQiang = new CaoQ(i * 64, 64 * 8);
                list1.add(caoQiang);
            }
             mt=new MyTank(BTK/2,BTG-64);
             list1.add(mt);


        try {
                SoundUtils.play("Tankgame/res/snd/start.wav");
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

        @Override
        protected void onMouseEvent ( int key, int x, int y){

        }

        @Override
        protected void onKeyEvent (int key) {
            if (key == Keyboard.KEY_UP) {
              mt.move(AnJian.UP);
            } else if (key == Keyboard.KEY_DOWN) {
                 mt.move(AnJian.DOWN);
            } else if (key == Keyboard.KEY_LEFT) {
               mt.move(AnJian.LEFT);
            } else if (key == Keyboard.KEY_RIGHT) {
                mt.move(AnJian.RIGHT);
            }else if(key==Keyboard.KEY_SPACE){
                FaSeZD faSeZD=mt.FaS();
                list1.add(faSeZD);
            }
        }

        @Override
        protected void onDisplayUpdate () {
            for (YuanSu su : list1) {
                su.huihua();
            }

            }
            }



