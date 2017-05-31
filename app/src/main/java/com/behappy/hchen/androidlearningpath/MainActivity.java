package com.behappy.hchen.androidlearningpath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.behappy.hchen.androidlearningpath.buttonclickcounter.ButtonClickCounter;
import com.behappy.hchen.androidlearningpath.calculator.Calculator;
import com.behappy.hchen.androidlearningpath.top10downloader.Top10Downloader;

public class MainActivity extends AppCompatActivity {

    private Button buttonClickCounter;
    private Button calculator;
    private Button top10downloader;
    private Button wechatsdklearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickCounter = (Button) findViewById(R.id.buttonclickcounter);

        buttonClickCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButtonClickCounter.class);
                startActivity(intent);
            }
        });


        calculator = (Button) findViewById(R.id.calculator);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });

        top10downloader = (Button) findViewById(R.id.top10downloader);

        top10downloader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Top10Downloader.class);
                startActivity(intent);
            }
        });
    }
}
