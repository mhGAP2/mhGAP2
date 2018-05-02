package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dementiaprot1 extends AppCompatActivity {
TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dementiaprot1);
        tv=(TextView)findViewById(R.id.textView8);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dementiaprot1.this,Essential.class);
                startActivity(intent);
            }
        });
        tv1=(TextView)findViewById(R.id.textView11);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dementiaprot1.this,Dementiaprot1.class);
                startActivity(intent);
            }
        });
    }
}
