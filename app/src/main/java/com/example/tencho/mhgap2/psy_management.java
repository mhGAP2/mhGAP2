package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class psy_management extends AppCompatActivity {


    Button btn1;
    Button btn2;
    Button btn4;
    Button btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_psy_management);


        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psy_management.this,psy_protocol1.class);
                startActivity(intent);
            }
        });


        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_management.this,psy_protocol2.class);
                        startActivity(intent);
                    }
                });


        btn4=(Button)findViewById(R.id.button3);
        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_management.this,psy_special_population.class);
                        startActivity(intent);
                    }
                });
        btn5=(Button)findViewById(R.id.button5);
        btn5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_management.this,psy_medication.class);
                        startActivity(intent);
                    }
                });
    }
}
