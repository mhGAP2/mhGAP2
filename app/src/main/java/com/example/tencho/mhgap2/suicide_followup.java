package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class suicide_followup extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn, mfalsebtn,othbtn;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suicide_followup);

        YesQuestions = getResources().getStringArray(R.array.Suicide_FollowUp_Yes);
        NoQuestions = getResources().getStringArray(R.array.Suicide_FollowUp_No);

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
                if(othbtn.getText().toString().equals("Goto Assessment"))
                {
                    Intent intent = new Intent(suicide_followup.this, suicide2.class);
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
            othbtn.setText("Goto Assessment");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
        {
            mquestion.setText(NoQuestions[0]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("Goto Assessment");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

    }

}
