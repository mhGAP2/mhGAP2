package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Substanceuse_Assessment extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, othbtn;
    String[] YesQuestions;
    String[] NoQuestions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substanceuse__assessment);

        YesQuestions = getResources().getStringArray(R.array.DISORDERS_Asessment_yes);
        NoQuestions = getResources().getStringArray(R.array.DISORDERS_Asessment_No);

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
                if (othbtn.getText().toString().equals("Proceed to PROTOCOL 2"))
                {
                    Intent intent = new Intent(Substanceuse_Assessment.this, Substance_management.class);
                    startActivity(intent);
                }

                else if (othbtn.getText().toString().equals("EXIT"))
                {
                    Intent intent = new Intent(Substanceuse_Assessment.this, Substance_management.class);
                    startActivity(intent);
                }

                else if (othbtn.getText().toString().equals("Proceed to PROTOCOL 1"))
                {
                    Intent intent = new Intent(Substanceuse_Assessment.this, Substance_management.class);
                    startActivity(intent);
                }
            }

        });
    }

    private void updateYesquestion() {
        if (mquestion.getText().toString().equals(YesQuestions[0]))
            mquestion.setText(YesQuestions[1]);
        else if (mquestion.getText().toString().equals(YesQuestions[1]))
            mquestion.setText(YesQuestions[2]);
        else if (mquestion.getText().toString().equals(YesQuestions[2]))
        {
            mquestion.setText("Proceed to PROTOCOL 2");
            othbtn.setText("Proceed to PROTOCOL 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText("Proceed to PROTOCOL 1");
            othbtn.setText("Proceed to PROTOCOL 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

    }
    private void updateNoquestion() {
        if (mquestion.getText().toString().equals(YesQuestions[0]))
        {
            mquestion.setText(NoQuestions[0]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("EXIT");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[1]))
            mquestion.setText(YesQuestions[2]);
        else if (mquestion.getText().toString().equals(YesQuestions[2]))
            mquestion.setText(NoQuestions[1]);
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText(NoQuestions[2]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("EXIT");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
}
