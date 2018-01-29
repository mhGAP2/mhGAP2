package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Suicideproto1_2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suicideproto1_2);
         tv=(TextView)findViewById(R.id.textVie);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Suicideproto1_2.this,Essential.class);
                startActivity(intent);
            }
        });
    }
}
