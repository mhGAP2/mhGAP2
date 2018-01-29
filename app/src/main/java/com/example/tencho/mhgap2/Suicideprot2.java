package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Suicideprot2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suicideprot2);
        tv=(TextView)findViewById(R.id.textView9);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Suicideprot2.this,Suicideproto1_2.class);
                startActivity(intent);
            }
        });
    }
}
