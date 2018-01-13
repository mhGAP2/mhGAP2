package com.example.tencho.mhgap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dep_assesment extends AppCompatActivity {

    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, homebtn, othbtn,othbtn2;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_assesment);

        YesQuestions = getResources().getStringArray(R.array.yq);
        NoQuestions = getResources().getStringArray(R.array.nq);

        mquestion = (TextView) findViewById(R.id.question);
        mtruebtn = (Button) findViewById(R.id.yes);
        mfalsebtn = (Button) findViewById(R.id.no);

        homebtn = (Button) findViewById(R.id.home);
        othbtn = (Button) findViewById(R.id.oth);
        othbtn2 = (Button) findViewById(R.id.oth2);
        homebtn.setVisibility(View.GONE);
        othbtn.setVisibility(View.GONE);
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
            exitQuest();
        }

        else if(mquestion.getText().toString().equals(YesQuestions[6]))
            mquestion.setText(YesQuestions[7]);
        else if(mquestion.getText().toString().equals(YesQuestions[7]))
        {
            mquestion.setText(YesQuestions[8]);
            mtruebtn.setVisibility(View.GONE);
            mfalsebtn.setVisibility(View.GONE);
            othbtn2.setVisibility(View.VISIBLE);
        }
        else if(mquestion.getText().toString().equals(NoQuestions[3]))
            mquestion.setText(YesQuestions[7]);
        else if(mquestion.getText().toString().equals(NoQuestions[5]))
            mquestion.setText(YesQuestions[8]);
        else if(mquestion.getText().toString().equals(NoQuestions[2]))
        {
            mquestion.setText(YesQuestions[6]);
            exitQuestoth();
        }

    }

    private void updateNoquestion() {
        if(mquestion.getText().toString().equals(YesQuestions[0]) ||mquestion.getText().toString().equals(YesQuestions[1])||mquestion.getText().toString().equals(YesQuestions[2]))
        {
            mquestion.setText(NoQuestions[0]);
            exitQuest();
        }
        else if(mquestion.getText().toString().equals(YesQuestions[3]))
            mquestion.setText(NoQuestions[2]);
        else if(mquestion.getText().toString().equals(YesQuestions[5]))
            mquestion.setText(NoQuestions[3]);
        else if(mquestion.getText().toString().equals(NoQuestions[3]))
        {
            mquestion.setText(NoQuestions[4]);
            exitQuest();
        }
        else if(mquestion.getText().toString().equals(YesQuestions[4]))
        {
            mquestion.setText(NoQuestions[1]);
            exitQuest();
        }
        else if(mquestion.getText().toString().equals(YesQuestions[7]))
            mquestion.setText(NoQuestions[5]);
        else if(mquestion.getText().toString().equals(NoQuestions[5]))
        {
            mquestion.setText(NoQuestions[6]);
            exitQuestoth();
        }

    }

    public void exitQuest() {
        homebtn.setVisibility(View.VISIBLE);
        mtruebtn.setVisibility(View.GONE);
        mfalsebtn.setVisibility(View.GONE);
    }
    public void exitQuestoth() {
        othbtn.setVisibility(View.VISIBLE);
        mtruebtn.setVisibility(View.GONE);
        mfalsebtn.setVisibility(View.GONE);
    }
}
