package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Substance_healthsec extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substance_healthsec);
        btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this,Substance_management.class);
                startActivity(intent);
            }
        });
        btn3 = (Button) findViewById(R.id.button2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this,Substance_management.class);
                startActivity(intent);
            }
        });
        btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substance_healthsec.this, Dep_followup.class);
                startActivity(intent);
            }
        });
    }
}
