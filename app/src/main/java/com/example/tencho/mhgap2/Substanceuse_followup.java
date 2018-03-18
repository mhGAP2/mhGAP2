package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Substanceuse_followup extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn;

    String YesQuestions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substanceuse_followup);

        YesQuestions = getString(R.string.DISORDERS_followup);

        mquestion = (TextView) findViewById(R.id.question);
        mtruebtn = (Button) findViewById(R.id.yes);

        mtruebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Substanceuse_followup.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}