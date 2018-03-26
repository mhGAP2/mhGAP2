package com.example.tencho.mhgap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Substanceuse_Assessment_Emergency extends AppCompatActivity {
    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, othbtn;

    String[] YesQuestions;
    String[] NoQuestions;
    String[] accessQ;
    String[] accessQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_substanceuse__assessment__emergency);

        YesQuestions = getResources().getStringArray(R.array.Disorder_emergency_yes);
        NoQuestions = getResources().getStringArray(R.array.Disorder_emergency_no);
        accessQ = getResources().getStringArray(R.array.AcessA_D);
        accessQ2 = getResources().getStringArray(R.array.AssesA_C);

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
                if (othbtn.getText().toString().equalsIgnoreCase("Skip to step 2")) {
                    mquestion.setText(NoQuestions[1]);
                    othbtn.setVisibility(View.GONE);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                } else if (othbtn.getText().toString().equalsIgnoreCase("Access from A to D")) {
                    mquestion.setText(accessQ[0]);
                    othbtn.setText("next");
                    mtruebtn.setVisibility(View.GONE);
                    mfalsebtn.setVisibility(View.GONE);
                }else if (othbtn.getText().toString().equalsIgnoreCase("Access from A to C")) {
                    mquestion.setText(accessQ2[0]);
                    othbtn.setText("Continue");
                    mtruebtn.setVisibility(View.GONE);
                    mfalsebtn.setVisibility(View.GONE);
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("next")) {
                        if (mquestion.getText().toString().equals(YesQuestions[5]))
                        {
                            mquestion.setText(accessQ[1]);
                            othbtn.setText("next");
                        }
                        else if (mquestion.getText().toString().equals(accessQ[0]))
                            mquestion.setText(accessQ[1]);
                        else if (mquestion.getText().toString().equals(accessQ[1]))
                            mquestion.setText(accessQ[2]);
                        else if (mquestion.getText().toString().equals(accessQ[2]))
                            mquestion.setText(accessQ[3]);
                        else if (mquestion.getText().toString().equals(accessQ[3]))
                        {
                            mquestion.setText(YesQuestions[6]);
                            othbtn.setVisibility(View.GONE);
                            mtruebtn.setVisibility(View.VISIBLE);
                            mfalsebtn.setVisibility(View.VISIBLE);
                        }
                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Continue"))
                {
                    if (mquestion.getText().toString().equals(accessQ2[0]))
                        mquestion.setText(accessQ2[1]);
                    else if (mquestion.getText().toString().equals(accessQ2[1]))
                    {
                        mquestion.setText(accessQ2[2]);
                        othbtn.setText("Home");
                        othbtn.setVisibility(View.VISIBLE);
                        mtruebtn.setVisibility(View.GONE);
                        mfalsebtn.setVisibility(View.GONE);
                    }

                }
                else if (othbtn.getText().toString().equalsIgnoreCase("Skip to step 3")) {
                    mquestion.setText(YesQuestions[6]);
                    othbtn.setVisibility(View.GONE);
                    mtruebtn.setVisibility(View.VISIBLE);
                    mfalsebtn.setVisibility(View.VISIBLE);
                }
                else if (othbtn.getText().toString().equals("Home"))
                {
                    Intent intent = new Intent(Substanceuse_Assessment_Emergency.this, HomeActivity.class);
                    startActivity(intent);
                }
                else if (othbtn.getText().toString().equals("GOTO Assessment"))
                {
                    Intent intent = new Intent(Substanceuse_Assessment_Emergency.this, Substance_healthsec.class);
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
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText(YesQuestions[5]);
            othbtn.setText("Access from A to D");
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[2]))
            mquestion.setText(YesQuestions[4]);
        else if (mquestion.getText().toString().equals(NoQuestions[2]))
            mquestion.setText(YesQuestions[3]);
        else if (mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(YesQuestions[4]);
        else if (mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(YesQuestions[5]);
            othbtn.setText("Access from A to D");
            othbtn.setVisibility(View.VISIBLE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[5]))
        {
            mquestion.setText(YesQuestions[6]);
            othbtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[6]))
            mquestion.setText(YesQuestions[7]);
        else if (mquestion.getText().toString().equals(YesQuestions[7]))
        {
            mquestion.setText(NoQuestions[6]);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals("ASSESS AND MANAGE FROM A to C"))
        {
            mquestion.setText(accessQ2[0]);
            mfalsebtn.setVisibility(View.GONE);
            mtruebtn.setText("NEXT");
        }
        else if (mquestion.getText().toString().equals(accessQ2[0]))
        {
            mquestion.setText(accessQ2[1]);
        }
        else if (mquestion.getText().toString().equals(accessQ2[1]))
        {
            mquestion.setText(accessQ2[2]);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
            othbtn.setText("Home");
            othbtn.setVisibility(View.VISIBLE);
        }
    }
    private void updateNoquestion() {
        if (mquestion.getText().toString().equals(YesQuestions[0])) {
            mquestion.setText(NoQuestions[0]);
            othbtn.setText("Skip to step 2");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(NoQuestions[1]))
        {
            mquestion.setText("Skip to step 3");
            othbtn.setText("Skip to step 3");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[1]))
            mquestion.setText(NoQuestions[2]);
        else if (mquestion.getText().toString().equals(NoQuestions[2]))
            mquestion.setText(NoQuestions[3]);
        else if (mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(NoQuestions[4]);
        else if (mquestion.getText().toString().equals(YesQuestions[2]))
            mquestion.setText(NoQuestions[4]);
        else if (mquestion.getText().toString().equals(YesQuestions[5]))
        {
            mquestion.setText(NoQuestions[6]);
            othbtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(NoQuestions[6]);
            othbtn.setText("Skip to step 3");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

        else if (mquestion.getText().toString().equals(YesQuestions[6]))
        {
            mquestion.setText(NoQuestions[5]);
            othbtn.setText("GOTO Assessment");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }

        else if (mquestion.getText().toString().equals(NoQuestions[4]))
        {
            mquestion.setText(NoQuestions[6]);
            othbtn.setText("Skip to step 3");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
        else if (mquestion.getText().toString().equals(YesQuestions[6]))
            mquestion.setText(YesQuestions[7]);
        else if (mquestion.getText().toString().equals(YesQuestions[7]))
        {
            mquestion.setText("ASSESS AND MANAGE FROM A to C");
            othbtn.setText("Access from A to C");
            othbtn.setVisibility(View.VISIBLE);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
        }
    }
}
