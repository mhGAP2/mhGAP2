package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Substanceprot2 extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substanceprot2);
        tv1=(TextView)findViewById(R.id.t);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Substanceprot2.this,Substanceprotocol5.class);
                startActivity(intent);
            }
        });
        tv2=(TextView)findViewById(R.id.t3);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Substanceprot2.this,Substanceprotocol4.class);
                startActivity(intent);
            }
        });
        tv3=(TextView)findViewById(R.id.t4);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro6);
            }
        });
        tv4=(TextView)findViewById(R.id.t5);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Substanceprot2.this,Substanceprotcol3.class);
                startActivity(intent);
            }
        });
        tv5=(TextView)findViewById(R.id.t6);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancetable);
            }
        });
        tv6=(TextView)findViewById(R.id.t9);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substanceprot1);
            }
        });
    }
}
