package com.example.miche.tic_tac_toe;

import android.content.Intent;
import android.view.View;

public class TTT {
    private static char[][] btn;
    private static boolean victory;
    public static void set(View view,char pressed){
        switch (view.getId()) {
            case R.id.one: btn[0][0] = pressed; break;
            case R.id.two: btn[0][1] = pressed; break;
            case R.id.three: btn[0][2] = pressed; break;
            case R.id.four: btn[1][0] = pressed; break;
            case R.id.five: btn[1][1] = pressed; break;
            case R.id.six: btn[1][2] = pressed; break;
            case R.id.seven: btn[2][0] = pressed; break;
            case R.id.eight: btn[2][1] = pressed; break;
            case R.id.nine: btn[2][2] = pressed; break;
        }
    }
    public static boolean checkVictory(Intent i){
        victory=false;
        if(btn[0][0]==btn[0][1] && btn[0][0]==btn[0][2] && btn[0][0]!=' ') { i.putExtra("winner",btn[0][0]) ; victory=true; }
        if(btn[1][0]==btn[1][1] && btn[1][0]==btn[1][2] && btn[1][0]!=' ') { i.putExtra("winner",btn[1][0]) ; victory=true; }
        if(btn[2][0]==btn[2][1] && btn[2][0]==btn[2][2] && btn[2][0]!=' ') { i.putExtra("winner",btn[2][0]) ; victory=true; }
        if(btn[0][0]==btn[1][0] && btn[0][0]==btn[2][0] && btn[0][0]!=' ') { i.putExtra("winner",btn[0][0]) ; victory=true; }
        if(btn[0][1]==btn[1][1] && btn[0][1]==btn[2][1] && btn[0][1]!=' ') { i.putExtra("winner",btn[0][1]) ; victory=true; }
        if(btn[0][2]==btn[1][2] && btn[0][2]==btn[2][2] && btn[0][2]!=' ') { i.putExtra("winner",btn[0][2]) ; victory=true; }
        if(btn[0][0]==btn[1][1] && btn[0][0]==btn[2][2] && btn[0][0]!=' ') { i.putExtra("winner",btn[0][0]) ; victory=true; }
        if(btn[0][2]==btn[1][1] && btn[0][2]==btn[2][0] && btn[0][2]!=' ') { i.putExtra("winner",btn[0][2]) ; victory=true; }
        return victory;
    }
    public static void draw(Intent i){
        i.putExtra("winner",'n');
    }
    public static void clear(){
        btn= new char[][] {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };
        victory=false;
    }
}
