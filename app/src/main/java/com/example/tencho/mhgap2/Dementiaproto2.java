package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dementiaproto2 extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dementiaproto2);
        t1=(TextView)findViewById(R.id.dempro2);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dementiaproto2.this,Essential.class);
                startActivity(intent);
            }
        });
        t2=(TextView)findViewById(R.id.dementia2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dementiaproto2.this,psy_protocol2.class);
                startActivity(intent);
            }
        });
    }
}
