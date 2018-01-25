package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Dep_assesment extends AppCompatActivity {

    private TextView mquestion;
    private Button mtruebtn, mfalsebtn,othbtn;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dep_assesment);

        YesQuestions = getResources().getStringArray(R.array.yq);
        NoQuestions = getResources().getStringArray(R.array.nq);

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
                if(othbtn.getText().toString().equalsIgnoreCase("Go to step 3, then to protocol 2"))
                {
                    mquestion.setText(YesQuestions[8]);
                    othbtn.setText("Go to Protocol 2");
                }
                else if(othbtn.getText().toString().equalsIgnoreCase("Go to Protocol 2"))
                {
                    Intent intent =new Intent(Dep_assesment.this,depression3.class);
                    startActivity(intent);
                    othbtn.setVisibility(View.GONE);
                }
                else if(othbtn.getText().toString().equalsIgnoreCase("Home"))
                {
                    Intent intent =new Intent(Dep_assesment.this,HomeActivity.class);
                    startActivity(intent);
                    othbtn.setVisibility(View.GONE);
                }
                else if(othbtn.getText().toString().equalsIgnoreCase("Go to step 3, then to protocol 1"))
                {
                    mquestion.setText(YesQuestions[8]);
                    othbtn.setText("Go to Protocol 1");
                }
                else if(othbtn.getText().toString().equalsIgnoreCase("Go to Protocol 1"))
                {
                    Intent intent =new Intent(Dep_assesment.this,depression3.class);
                    startActivity(intent);
                    othbtn.setVisibility(View.GONE);
                }

            }
        });
    }
    private void updateYesquestion()
    {
        if(mquestion.getText().toString().equals(YesQuestions[0]))
            mquestion.setText(YesQuestions[1]);
        else if(mquestion.getText().toString().equals(YesQuestions[1]))
            mquestion.setText(YesQuestions[2]);
        else if(mquestion.getText().toString().equals(YesQuestions[2]))
            mquestion.setText(YesQuestions[3]);
        else if(mquestion.getText().toString().equals(YesQuestions[3]))
            mquestion.setText(YesQuestions[4]);
        else if(mquestion.getText().toString().equals(YesQuestions[4]))
            mquestion.setText(YesQuestions[5]);
        else if(mquestion.getText().toString().equals(YesQuestions[5]))
        {
            mquestion.setText(YesQuestions[6]);
            othbtn.setText("Go to step 3, then to protocol 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(YesQuestions[6]))
            mquestion.setText(YesQuestions[7]);
        else if(mquestion.getText().toString().equals(YesQuestions[7]))
        {
            mquestion.setText(YesQuestions[8]);
            othbtn.setText("Go to Protocol 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(YesQuestions[7]);
        else if(mquestion.getText().toString().equals(NoQuestions[5]))
        {
            mquestion.setText(YesQuestions[8]);
            othbtn.setText("Go to Protocol 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[2]))
        {
            mquestion.setText(YesQuestions[6]);
            othbtn.setText("Go to step 3, then to protocol 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }

    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(YesQuestions[0]) ||mquestion.getText().toString().equals(YesQuestions[1])||mquestion.getText().toString().equals(YesQuestions[2]))
        {
            mquestion.setText(NoQuestions[0]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);

        }
        else if(mquestion.getText().toString().equals(YesQuestions[3]))
            mquestion.setText(NoQuestions[2]);
        else if(mquestion.getText().toString().equals(YesQuestions[5]))
            mquestion.setText(NoQuestions[3]);
        else if(mquestion.getText().toString().equals(NoQuestions[3]))
        {
            mquestion.setText(NoQuestions[4]);
            othbtn.setText("Go to Step 3, then to protocol 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);

        }
        else if(mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(NoQuestions[1]);
            othbtn.setText("Go to Protocol 1");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if(mquestion.getText().toString().equals(YesQuestions[7]))
            mquestion.setText(NoQuestions[5]);
        else if(mquestion.getText().toString().equals(NoQuestions[5]))
        {
            mquestion.setText(NoQuestions[6]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);

        }
    }
}
