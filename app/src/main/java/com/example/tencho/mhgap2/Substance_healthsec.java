package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Substance_healthsec extends AppCompatActivity {
    Button btn1,btn01,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substance_healthsec);
        btn1 = (Button) findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this,Substanceuse_Assessment_Emergency.class);
                startActivity(intent);
            }
        });
        btn01 = (Button) findViewById(R.id.b01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this,Substanceuse_Assessment.class);
                startActivity(intent);
            }
        });
        btn2 = (Button) findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this,Substance_management.class);
                startActivity(intent);
            }
        });
        btn3 = (Button) findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this, Substanceuse_followup.class);
                startActivity(intent);
            }
        });
    }
}
