package com.example.miche.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int j=0;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(this,ActivityTwo.class);
        TTT.clear();
    }
    public void onClickListener(View view){
        Button clicked = (Button)(view);
        char pressed;
        if (j % 2 == 0) { clicked.setText("X"); pressed='X'; }
        else { clicked.setText("O"); pressed='O'; }
        clicked.setEnabled(false);
        j++;
        switch (view.getId()) {
            case R.id.one: TTT.set(view,pressed); break;
            case R.id.two: TTT.set(view,pressed); break;
            case R.id.three: TTT.set(view,pressed); break;
            case R.id.four: TTT.set(view,pressed); break;
            case R.id.five: TTT.set(view,pressed); break;
            case R.id.six: TTT.set(view,pressed); break;
            case R.id.seven: TTT.set(view,pressed); break;
            case R.id.eight: TTT.set(view,pressed); break;
            case R.id.nine: TTT.set(view,pressed); break;
        }
        if(j<9 && TTT.checkVictory(i)) { startActivity(i); finish(); }
        if(j==9) { TTT.draw(i); startActivity(i); finish();}
    }

}
