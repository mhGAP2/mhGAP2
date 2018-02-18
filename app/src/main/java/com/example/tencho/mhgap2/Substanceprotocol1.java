package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Substanceprotocol1 extends AppCompatActivity {
    TextView bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substanceprotocol1);
        bt1=(TextView) findViewById(R.id.t1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancepro1);
            }
        });
        bt2=(TextView) findViewById(R.id.t2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substanceprot1);
            }
        });

        bt3=(TextView) findViewById(R.id.t3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.dep_caution);
            }
        });
        bt4=(TextView)findViewById(R.id.t4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.substancespecial);
            }
        });

    }
}
