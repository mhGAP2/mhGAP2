package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class oth_assessment extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn, mfalsebtn,othbtn;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_oth_assessment);

        YesQuestions = getResources().getStringArray(R.array.OTH_Ass_Yes);
        NoQuestions = getResources().getStringArray(R.array.OTH_Ass_No);

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
                if(othbtn.getText().toString().equals("Home"))
                {
                    Intent intent = new Intent(oth_assessment.this, HomeActivity.class);
                    startActivity(intent);
                }

                if(othbtn.getText().toString().equals("GOTO Protocols"))
                {
                    Intent intent = new Intent(oth_assessment.this, oth_management.class);
                    startActivity(intent);
                }
            }
        });
    }
    private void updateYesquestion()
    {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
        {
            mquestion.setText(YesQuestions[1]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("Home");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[0]))
        {
            mquestion.setText(YesQuestions[2]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("Home");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[1]))
            mquestion.setText(YesQuestions[4]);
        else if(mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(YesQuestions[5]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("GOTO Protocols");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }


    }
    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
            mquestion.setText(NoQuestions[0]);
        else if(mquestion.getText().toString().equals(NoQuestions[0]))
            mquestion.setText(NoQuestions[1]);
        else if(mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText(NoQuestions[2]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("Home");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[2]))
        {
            mquestion.setText(NoQuestions[3]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("Home");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(NoQuestions[3]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("GOTO Protocols");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
}