package com.example.tencho.mhgap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bev_assesment extends AppCompatActivity {

    private TextView mquestion;
    private Button mtruebtn, mfalsebtn, homebtn, othbtn,othbtn2;

    String[] YesQuestions;
    String[] NoQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bev_assesment);

        YesQuestions = getResources().getStringArray(R.array.yq);
        NoQuestions = getResources().getStringArray(R.array.nq);

        mquestion = (TextView) findViewById(R.id.question);
        mtruebtn = (Button) findViewById(R.id.yes);
        mfalsebtn = (Button) findViewById(R.id.no);

        homebtn = (Button) findViewById(R.id.home);
        othbtn = (Button) findViewById(R.id.oth);
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


    }

    private void updateNoquestion() {


    }
}
