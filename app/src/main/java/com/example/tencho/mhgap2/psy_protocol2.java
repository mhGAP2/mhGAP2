package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class psy_protocol2 extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_psy_protocol2);



        tv1=(TextView) findViewById(R.id.textView30);
        tv1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_protocol2.this,psy_medication.class);
                        startActivity(intent);
                    }
                });
        tv2=(TextView) findViewById(R.id.textView31);
        tv2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_protocol2.this,psy_medication.class);
                        startActivity(intent);
                    }
                });


        tv3=(TextView) findViewById(R.id.textView25);
        tv3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_protocol2.this,Essential.class);
                        startActivity(intent);
                    }
                });
        tv4=(TextView) findViewById(R.id.textVie25);
        tv4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_protocol2.this,psy_medication.class);
                        startActivity(intent);
                    }
                });

    }
}
