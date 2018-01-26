package com.example.tencho.mhgap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Substance_management extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substance_management);
        btn1=(Button)findViewById(R.id.bt1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro1);
            }
        });
        btn2=(Button)findViewById(R.id.bt2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro2);
            }
        });

        btn3=(Button)findViewById(R.id.bt3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro3);
            }
        });
        btn4=(Button)findViewById(R.id.bt4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro4);
            }
        });

        btn5=(Button)findViewById(R.id.bt5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro5);
            }
        });
        btn6=(Button)findViewById(R.id.bt6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro6);
            }
        });
        btn7=(Button)findViewById(R.id.bt7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancespecial);
            }
        });
        btn8=(Button)findViewById(R.id.bt8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancetable);
            }
        });

    }
}
