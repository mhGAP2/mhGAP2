package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class psy_medication extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_psy_medication);


        tv2=(TextView) findViewById(R.id.text10);
        tv2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_medication.this,substance.class);
                        startActivity(intent);
                    }
                });
        tv3=(TextView) findViewById(R.id.textVi9);
        tv3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_medication.this,psychoses.class);
                        startActivity(intent);
                    }
                });
        tv1=(TextView) findViewById(R.id.textVi10);
        tv1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(psy_medication.this,substance.class);
                        startActivity(intent);
                    }
                });


    }
}
