package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView tx1;
    Button bt1, bt2, bt3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        tx1 = findViewById(R.id.textView);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, AutorizationActivity.class);
                startActivity(i);
            }
        });
    }}




