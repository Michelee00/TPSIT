package com.example.miche.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView text =findViewById(R.id.textView);
        Button restart = findViewById(R.id.restart);
        restart.setOnClickListener((View view) -> {
            TTT.clear();
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        });
        if(getIntent().getCharExtra("winner",' ')=='n') text.setText("Draw");
        else text.setText("Won the player "+getIntent().getCharExtra("winner",' '));
    }
}
