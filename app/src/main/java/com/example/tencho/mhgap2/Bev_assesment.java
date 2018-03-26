package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Bev_assesment extends AppCompatActivity {

    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, othbtn,othbtn2;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bev_assesment);

        YesQuestions = getResources().getStringArray(R.array.CMH_Asse_Yes);
        NoQuestions = getResources().getStringArray(R.array.CMH_Asse_No);

        mquestion = (TextView) findViewById(R.id.question);
        mtruebtn = (Button) findViewById(R.id.yes);
        mfalsebtn = (Button) findViewById(R.id.no);


        othbtn = (Button) findViewById(R.id.oth);
        othbtn.setVisibility(View.GONE);

        othbtn2 = (Button) findViewById(R.id.oth2);
        othbtn2.setVisibility(View.GONE);


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
        othbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (othbtn2.getText().toString().equalsIgnoreCase("Go to Protocol 2"))
                {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                }

                else if (othbtn2.getText().toString().equalsIgnoreCase("GO TO Protocol 5")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                }
            }
        });
        othbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (othbtn.getText().toString().equalsIgnoreCase("GO TO Protocol 1")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);

                } else if (othbtn.getText().toString().equalsIgnoreCase("GO TO Protocol 3")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                } else if (othbtn.getText().toString().equalsIgnoreCase("GO TO Protocol 4")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                }else if (othbtn.getText().toString().equalsIgnoreCase("GO TO Protocol 5")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("GO TO Protocol 6")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                } else if (othbtn.getText().toString().equalsIgnoreCase("Go to Management 2.6 (Carer support)")) {
                    Intent intent = new Intent(Bev_assesment.this, behavioural2.class);
                    startActivity(intent);
                } else if (othbtn.getText().toString().equalsIgnoreCase("Skip to step 2")) {
                    mquestion.setText(NoQuestions[1]);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                    othbtn.setVisibility(View.GONE);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Skip to step 3")) {
                    mquestion.setText(NoQuestions[5]);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                    othbtn.setVisibility(View.GONE);
                    othbtn2.setVisibility(View.GONE);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Skip to step 4")) {
                    mquestion.setText(NoQuestions[9]);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                    othbtn.setVisibility(View.GONE);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Skip to step 5")) {
                    mquestion.setText(NoQuestions[13]);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                    othbtn.setVisibility(View.GONE);
                    othbtn2.setVisibility(View.GONE);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Home")) {
                    Intent intent = new Intent(Bev_assesment.this, HomeActivity.class);
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
        else if (mquestion.getText().toString().equals(YesQuestions[2])) {
            mquestion.setText(YesQuestions[3]);
            othbtn.setText("Go to Protocol 1");
            othbtn.setVisibility(View.VISIBLE);
        } else if (mquestion.getText().toString().equals(YesQuestions[3])) {
            othbtn.setVisibility(View.GONE);
            mquestion.setText(YesQuestions[4]);
        } else if (mquestion.getText().toString().equals(YesQuestions[4]))
            mquestion.setText(YesQuestions[5]);
        else if (mquestion.getText().toString().equals(YesQuestions[5])) {
            mquestion.setText(YesQuestions[6]);
            othbtn.setText("Go to Protocol 3");
            othbtn.setVisibility(View.VISIBLE);
        } else if (mquestion.getText().toString().equals(YesQuestions[6])) {
            othbtn.setVisibility(View.GONE);
            mquestion.setText(YesQuestions[7]);
        } else if (mquestion.getText().toString().equals(YesQuestions[7])) {
            mquestion.setText(YesQuestions[8]);
            othbtn.setText("Go to Protocol 4");
            othbtn.setVisibility(View.VISIBLE);
        } else if (mquestion.getText().toString().equals(YesQuestions[8])) {
            othbtn.setVisibility(View.GONE);
            mquestion.setText(YesQuestions[9]);
        } else if (mquestion.getText().toString().equals(YesQuestions[9]))
            mquestion.setText(YesQuestions[10]);
        else if (mquestion.getText().toString().equals(YesQuestions[10]))
            mquestion.setText(YesQuestions[11]);
        else if (mquestion.getText().toString().equals(YesQuestions[11]))
            mquestion.setText(YesQuestions[12]);
        else if (mquestion.getText().toString().equals(YesQuestions[11])) {
            mquestion.setText(YesQuestions[12]);
            othbtn.setText("Go to Protocol 6");
            othbtn.setVisibility(View.VISIBLE);
        } else if (mquestion.getText().toString().equals(YesQuestions[12])) {
            othbtn.setVisibility(View.GONE);
            mquestion.setText(YesQuestions[13]);
        } else if (mquestion.getText().toString().equals(YesQuestions[13]))
            mquestion.setText(YesQuestions[14]);
        else if (mquestion.getText().toString().equals(YesQuestions[14]))
            mquestion.setText(YesQuestions[15]);
        else if (mquestion.getText().toString().equals(YesQuestions[15])) {
            mquestion.setText(YesQuestions[16]);
            othbtn.setText("Go to Management 2.6 (Carer support)");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
            mquestion.setText(YesQuestions[4]);
        else if (mquestion.getText().toString().equals(NoQuestions[5]))
            mquestion.setText(YesQuestions[7]);
        else if (mquestion.getText().toString().equals(NoQuestions[9]))
            mquestion.setText(YesQuestions[9]);
        else if (mquestion.getText().toString().equals(NoQuestions[13]))
            mquestion.setText(YesQuestions[14]);
        else if (mquestion.getText().toString().equals(NoQuestions[2]))
            mquestion.setText(YesQuestions[3]);
    }

    private void updateNoquestion() {
        if (mquestion.getText().toString().equals(YesQuestions[0])) {
            mquestion.setText(NoQuestions[0]);
            othbtn.setText("Skip to step 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        if (mquestion.getText().toString().equals(YesQuestions[1]))
            mquestion.setText(NoQuestions[2]);
        if (mquestion.getText().toString().equals(YesQuestions[3])) {
            mquestion.setText("Skip to step 3");
            othbtn.setText("Skip to step 3");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

        else if (mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(NoQuestions[7]);
            othbtn.setText("Skip to step 3");
            othbtn2.setText("Go to Protocol 2");
            othbtn.setVisibility(View.VISIBLE);
            othbtn2.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[5]))
        {
            mquestion.setText("Go to Protocol 3");
            othbtn.setText("Go to Protocol 3");
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[2]))
        {
            mquestion.setText(NoQuestions[3]);
            mfalsebtn.setText("Go to Protocol 1");
            mtruebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText(NoQuestions[4]);
            othbtn.setText("Skip to step 3");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[5]))
        {
            mquestion.setText(NoQuestions[6]);
            othbtn.setText("Skip to step 4");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[9]))
        {
            mquestion.setText("Skip to step 5");
            othbtn.setText("Skip to step 5");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[9]))
        {
            mquestion.setText(NoQuestions[10]);
            othbtn2.setText("Go to Protocol 5");
            othbtn.setText("Skip to step 5");
            othbtn.setVisibility(View.VISIBLE);
            othbtn2.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[7]))
        {
            mquestion.setText(NoQuestions[9]);
            othbtn.setText("Go to Protocol 2");
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[10]))
        {
            mquestion.setText("Go to Protocol 6");
            othbtn.setText("Go to Protocol 6");
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[11]))
        {
            mquestion.setText("Skip to step 5");
            othbtn.setText("Skip to step 5");
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[12]))
        {
            mquestion.setText(NoQuestions[11]);
            othbtn.setText("Skip to step 5");
            othbtn2.setText("Go to protocol 5");
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[14]))
            mquestion.setText(NoQuestions[15]);
        else if (mquestion.getText().toString().equals(NoQuestions[13]))
            mquestion.setText(NoQuestions[15]);
        else if (mquestion.getText().toString().equals(NoQuestions[15]))
            mquestion.setText(NoQuestions[16]);
        else if (mquestion.getText().toString().equals(NoQuestions[16]))
            mquestion.setText(NoQuestions[17]);
        else if (mquestion.getText().toString().equals(NoQuestions[17]))
            mquestion.setText(NoQuestions[18]);
        else if (mquestion.getText().toString().equals(NoQuestions[18]))
        {
            mquestion.setText(NoQuestions[19]);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
        }

        else if (mquestion.getText().toString().equals(NoQuestions[19]))
        {
            mquestion.setText(NoQuestions[20]);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
        }
    }
}
