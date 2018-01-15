package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dep_followup extends AppCompatActivity {
    Button yesbtn,nobtn,hmbtn;
    TextView mquestion;
    String [] Yesfollowquestions;
    String [] Nofollowquestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_followup);

        Yesfollowquestions = getResources().getStringArray(R.array.depfollowyes);
        Nofollowquestions = getResources().getStringArray(R.array.depfollowno);


        yesbtn=(Button)findViewById(R.id.yes);
        nobtn=(Button)findViewById(R.id.no);
        hmbtn=(Button)findViewById(R.id.home);
        hmbtn.setVisibility(View.GONE);

        mquestion=(TextView)findViewById(R.id.question);

        yesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateYesquestion();

            }
        });
        nobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateNoquestion();
            }
        });
        hmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dep_followup.this,depression2.class);
                startActivity(intent);
            }
        });

    }

    private void updateYesquestion()
    {
        if(mquestion.getText().toString().equals("follow up"))
            mquestion.setText(Yesfollowquestions[0]);
        else if(mquestion.getText().toString().equals(Yesfollowquestions[0]))
            mquestion.setText(Yesfollowquestions[1]);
        else if(mquestion.getText().toString().equals(Yesfollowquestions[1]))
            mquestion.setText(Yesfollowquestions[2]);
        else if(mquestion.getText().toString().equals(Nofollowquestions[0]))
        {
            mquestion.setText(Yesfollowquestions[3]);
            yesbtn.setVisibility(View.GONE);
            nobtn.setVisibility(View.GONE);
            hmbtn.setVisibility(View.VISIBLE);
        }

        else if(mquestion.getText().toString().equals(Yesfollowquestions[2]))
        {
            mquestion.setText(Yesfollowquestions[3]);
            yesbtn.setVisibility(View.GONE);
            nobtn.setVisibility(View.GONE);
            hmbtn.setVisibility(View.VISIBLE);
        }

    }

    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(Yesfollowquestions[0]))
            mquestion.setText(Nofollowquestions[0]);
        else if(mquestion.getText().toString().equals(Nofollowquestions[0]))
            mquestion.setText(Yesfollowquestions[2]);
        else if(mquestion.getText().toString().equals(Yesfollowquestions[2]))
        {
            mquestion.setText(Nofollowquestions[1]);
            hmbtn.setVisibility(View.VISIBLE);
        }




    }
}
