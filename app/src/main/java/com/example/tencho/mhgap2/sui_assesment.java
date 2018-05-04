package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class sui_assesment extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn, mfalsebtn,othbtn;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sui_assesment);

        YesQuestions = getResources().getStringArray(R.array.Suicide_Assessment_Yes);
        NoQuestions = getResources().getStringArray(R.array.Suicide_Assessment_No);

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
                if(othbtn.getText().toString().equals("PROTOCOL 1"))
                {
                    mquestion.setText(getResources().getString(R.string.sucide_protocol1));
                    othbtn.setText("Return to step 2");
                }
                else if(othbtn.getText().toString().equals("Return to step 2"))
                {
                    mquestion.setText(YesQuestions[2]);
                    othbtn.setVisibility(View.GONE);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                }
                else if(othbtn.getText().toString().equals("PROTOCOL 2"))
                {
                    mquestion.setText(getResources().getString(R.string.sucide_protocol2));
                    othbtn.setText("Return to step 3");
                }
                else if(othbtn.getText().toString().equals("Return to step 3"))
                {
                    mquestion.setText(NoQuestions[1]);
                    othbtn.setVisibility(View.GONE);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                }
                else if(othbtn.getText().toString().equals("PROTOCOL 3"))
                {
                    mquestion.setText(getResources().getString(R.string.sucide_protocol3));
                    othbtn.setText("Return to step 3");
                }
                else if(othbtn.getText().toString().equals("Go to OTH"))
                {
                    Intent intent = new Intent(sui_assesment.this, HomeActivity.class);
                    startActivity(intent);
                }
                else if(othbtn.getText().toString().equals("follow Up"))
                {
                    Intent intent = new Intent(sui_assesment.this, suicide1.class);
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
            othbtn.setText("PROTOCOL 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(YesQuestions[2]))
        {
            mquestion.setText(YesQuestions[3]);
            othbtn.setText("PROTOCOL 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[0]))
        {
            mquestion.setText(YesQuestions[4]);
            othbtn.setText("PROTOCOL 3");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[1]))
            mquestion.setText(YesQuestions[5]);
        else if(mquestion.getText().toString().equals(NoQuestions[2]))
            mquestion.setText(YesQuestions[5]);
        else if(mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(YesQuestions[6]);
        else if(mquestion.getText().toString().equals(YesQuestions[5]))
            mquestion.setText(YesQuestions[6]);
        else if(mquestion.getText().toString().equals(YesQuestions[6]))
        {
            mquestion.setText(YesQuestions[7]);
            othbtn.setVisibility(View.VISIBLE);
            othbtn.setText("Go to OTH");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

        else if(mquestion.getText().toString().equals(NoQuestions[4]))
        {
            mquestion.setText(YesQuestions[7]);
            othbtn.setText("Go to OTH");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }

    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
            mquestion.setText(YesQuestions[2]);
        else if(mquestion.getText().toString().equals(YesQuestions[2]))
            mquestion.setText(NoQuestions[0]);
        else if(mquestion.getText().toString().equals(NoQuestions[0]))
            mquestion.setText(NoQuestions[2]);
        else if(mquestion.getText().toString().equals(NoQuestions[0]))
            mquestion.setText(NoQuestions[2]);
        else if(mquestion.getText().toString().equals(NoQuestions[2]))
            mquestion.setText(NoQuestions[3]);
        else if(mquestion.getText().toString().equals(NoQuestions[1]))
            mquestion.setText(NoQuestions[3]);
        else if(mquestion.getText().toString().equals(YesQuestions[5]))
            mquestion.setText(NoQuestions[4]);
        else if(mquestion.getText().toString().equals(YesQuestions[5]))
            mquestion.setText(NoQuestions[5]);
        else if(mquestion.getText().toString().equals(YesQuestions[6]))
        {
            mquestion.setText(NoQuestions[5]);
            mquestion.setText("Go for follow Up");
            othbtn.setText("follow Up");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(NoQuestions[4]);
        else if(mquestion.getText().toString().equals(NoQuestions[4])) {
            mquestion.setText("Go for follow Up");
            othbtn.setText("follow Up");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
}
