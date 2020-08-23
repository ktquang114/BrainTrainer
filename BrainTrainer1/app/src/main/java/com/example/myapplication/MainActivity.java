package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button goButton;
    TextView score,timer,sum;

    public void start(View view)
    {
        goButton.setVisibility(view.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();


    }



    void findViewById(){
        goButton = findViewById(R.id.goButton);
        score = findViewById(R.id.scoreTextView);
        timer = findViewById(R.id.timerTextView);
        sum = findViewById(R.id.sumTextView);
    }
}