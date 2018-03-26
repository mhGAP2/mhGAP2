package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class epi_followupp extends AppCompatActivity {

    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, othbtn;

    String[] YesQuestions;
    String[] NoQuestions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_epi_followupp);

        YesQuestions = getResources().getStringArray(R.array.Epi_FollowUp_Yes);
        NoQuestions = getResources().getStringArray(R.array.Epi_FollowUp_No);

        mquestion = (TextView) findViewById(R.id.question);
        mtruebtn = (Button) findViewById(R.id.yes);
        mfalsebtn = (Button) findViewById(R.id.no);


        othbtn = (Button) findViewById(R.id.oth);
        othbtn.setVisibility(View.GONE);


        mtruebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateYesquestion();

            }
        });
        mfalsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateNoquestion();
            }
        });
        othbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(othbtn.getText().toString().equalsIgnoreCase("GO TO Protocol 1"))
                {
                    Intent intent =new Intent(epi_followupp.this,epilipsy2.class);
                    startActivity(intent);
                }
                else if(othbtn.getText().toString().equalsIgnoreCase("Home"))
                {
                    Intent intent =new Intent(epi_followupp.this,HomeActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
    private void updateYesquestion()
    {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
            mquestion.setText(YesQuestions[1]);
        else if(mquestion.getText().toString().equals(YesQuestions[1]))
        {
            mquestion.setText(YesQuestions[2]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

    }

    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
        {
            mquestion.setText(NoQuestions[0]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(YesQuestions[1]))
        {
            mquestion.setText(NoQuestions[1]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
}