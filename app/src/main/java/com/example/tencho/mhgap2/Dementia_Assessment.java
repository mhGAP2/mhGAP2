package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Dementia_Assessment extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, othbtn;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dementia__assessment);

        YesQuestions = getResources().getStringArray(R.array.Dementia_Assessment_Yes);
        NoQuestions = getResources().getStringArray(R.array.Dementia_Assessment_No);

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
                if (othbtn.getText().toString().equalsIgnoreCase("Home"))
                {
                    Intent intent = new Intent(Dementia_Assessment.this, HomeActivity.class);
                    startActivity(intent);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Go to protocol 2"))
                {
                    Intent intent = new Intent(Dementia_Assessment.this, Dementia_Management.class);
                    startActivity(intent);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Go to protocol 1"))
                {
                    Intent intent = new Intent(Dementia_Assessment.this, Dementia_Management.class);
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
            mquestion.setText(YesQuestions[3]);
        else if (mquestion.getText().toString().equals(YesQuestions[3]))
        {
            mquestion.setText(YesQuestions[4]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);

        }
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText(YesQuestions[5]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(YesQuestions[6]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[3]))
        {
            mquestion.setText(YesQuestions[6]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[4]))
            mquestion.setText(YesQuestions[7]);
        else if (mquestion.getText().toString().equals(NoQuestions[5]))
            mquestion.setText(YesQuestions[8]);
        else if (mquestion.getText().toString().equals(YesQuestions[7]))
            mquestion.setText(YesQuestions[8]);
        else if (mquestion.getText().toString().equals(YesQuestions[8]))
            mquestion.setText(YesQuestions[9]);
        else if (mquestion.getText().toString().equals(NoQuestions[6]))
            mquestion.setText(YesQuestions[9]);
        else if (mquestion.getText().toString().equals(YesQuestions[9]))
            mquestion.setText(YesQuestions[10]);
        else if (mquestion.getText().toString().equals(NoQuestions[7]))
            mquestion.setText(YesQuestions[10]);
        else if (mquestion.getText().toString().equals(NoQuestions[8]))
            mquestion.setText(YesQuestions[11]);
        else if (mquestion.getText().toString().equals(YesQuestions[10]))
            mquestion.setText(YesQuestions[11]);
        else if (mquestion.getText().toString().equals(YesQuestions[11]))
        {
            mquestion.setText(YesQuestions[12]);
            othbtn.setText("Go to protocol 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[9]))
        {
            mquestion.setText(YesQuestions[12]);
            othbtn.setText("Go to protocol 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }


    private void updateNoquestion() {
        if (mquestion.getText().toString().equals(YesQuestions[0])) {
            mquestion.setText(NoQuestions[0]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[1])) {
            mquestion.setText(NoQuestions[0]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[2]))
            mquestion.setText(NoQuestions[1]);
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
            mquestion.setText(YesQuestions[3]);
        else if (mquestion.getText().toString().equals(YesQuestions[3]))
            mquestion.setText(NoQuestions[3]);
        else if (mquestion.getText().toString().equals(YesQuestions[4]))
            mquestion.setText(NoQuestions[4]);
        else if (mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(NoQuestions[4]);
        else if (mquestion.getText().toString().equals(NoQuestions[4]))
            mquestion.setText(NoQuestions[5]);
        else if (mquestion.getText().toString().equals(NoQuestions[5]))
            mquestion.setText(NoQuestions[6]);
        else if (mquestion.getText().toString().equals(YesQuestions[7]))
            mquestion.setText(NoQuestions[6]);
        else if (mquestion.getText().toString().equals(NoQuestions[6]))
            mquestion.setText(NoQuestions[7]);
        else if (mquestion.getText().toString().equals(YesQuestions[8]))
            mquestion.setText(NoQuestions[7]);
        else if (mquestion.getText().toString().equals(YesQuestions[9]))
            mquestion.setText(NoQuestions[8]);
        else if (mquestion.getText().toString().equals(NoQuestions[7]))
            mquestion.setText(NoQuestions[8]);
        else if (mquestion.getText().toString().equals(NoQuestions[8]))
            mquestion.setText(NoQuestions[9]);
        else if (mquestion.getText().toString().equals(YesQuestions[10]))
            mquestion.setText(NoQuestions[9]);
        else if (mquestion.getText().toString().equals(YesQuestions[11]))
        {
            mquestion.setText(NoQuestions[10]);
            othbtn.setText("Go to protocol 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[9]))
        {
            mquestion.setText(NoQuestions[10]);
            othbtn.setText("Go to protocol 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
}
