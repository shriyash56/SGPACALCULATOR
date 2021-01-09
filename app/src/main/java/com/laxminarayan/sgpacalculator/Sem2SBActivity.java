package com.laxminarayan.sgpacalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Sem2SBActivity extends AppCompatActivity {

    Button bcalculate;
    Spinner sPhy, sM1, sBEE, sEG, sEM, sEE;
    String s;
    float SumCG = 0, SumC = 0, SGPA = 0;
    int CG=0;
    String[] sValue = {"A+","A","B+","B","C+","C","D","F"};
    TextView tvSgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_sb);

        SumC = 20;



        sPhy = (Spinner) findViewById(R.id.spinnerPhysics1);
        sM1 = (Spinner) findViewById(R.id.spinnerM11);
        sBEE = (Spinner) findViewById(R.id.spinnerBEE1);
        sEG = (Spinner) findViewById(R.id.spinnerEG1);
        sEM = (Spinner) findViewById(R.id.spinnerEM1);
        sEE = (Spinner) findViewById(R.id.spinnerEE1);
        tvSgpa = (TextView) findViewById(R.id.tVSGPA11);
        bcalculate = (Button) findViewById(R.id.buttonCalculate11);



        ArrayAdapter<String> adapter = new ArrayAdapter<>(Sem2SBActivity.this, android.R.layout.simple_list_item_1, sValue);
        sPhy.setAdapter(adapter);
        sM1.setAdapter(adapter);
        sBEE.setAdapter(adapter);
        sEG.setAdapter(adapter);
        sEM.setAdapter(adapter);
        sEE.setAdapter(adapter);


        bcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CG=0;
                if (sPhy.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sPhy.getSelectedItem()=="A")
                    CG=4*9;
                else if(sPhy.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sPhy.getSelectedItem()=="B")
                    CG=4*7;
                else if(sPhy.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sPhy.getSelectedItem()=="C")
                    CG=4*5;
                else if(sPhy.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=CG;

                CG=0;
                if (sM1.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sM1.getSelectedItem()=="A")
                    CG=4*9;
                else if(sM1.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sM1.getSelectedItem()=="B")
                    CG=4*7;
                else if(sM1.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sM1.getSelectedItem()=="C")
                    CG=4*5;
                else if(sM1.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sBEE.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sBEE.getSelectedItem()=="A")
                    CG=4*9;
                else if(sBEE.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sBEE.getSelectedItem()=="B")
                    CG=4*7;
                else if(sBEE.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sBEE.getSelectedItem()=="C")
                    CG=4*5;
                else if(sBEE.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sEG.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sEG.getSelectedItem()=="A")
                    CG=4*9;
                else if(sEG.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sEG.getSelectedItem()=="B")
                    CG=4*7;
                else if(sEG.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sEG.getSelectedItem()=="C")
                    CG=4*5;
                else if(sEG.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sEM.getSelectedItem() == "A+")
                    CG = 2 * 10;
                else if(sEM.getSelectedItem()=="A")
                    CG=2*9;
                else if(sEM.getSelectedItem()=="B+")
                    CG=2*8;
                else if(sEM.getSelectedItem()=="B")
                    CG=2*7;
                else if(sEM.getSelectedItem()=="C+")
                    CG=2*6;
                else if(sEM.getSelectedItem()=="C")
                    CG=2*5;
                else if(sEM.getSelectedItem()=="D")
                    CG=2*4;
                else
                    CG=2*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sEE.getSelectedItem() == "A+")
                    CG = 2 * 10;
                else if(sEE.getSelectedItem()=="A")
                    CG=2*9;
                else if(sEE.getSelectedItem()=="B+")
                    CG=2*8;
                else if(sEE.getSelectedItem()=="B")
                    CG=2*7;
                else if(sEE.getSelectedItem()=="C+")
                    CG=2*6;
                else if(sEE.getSelectedItem()=="C")
                    CG=2*5;
                else if(sEE.getSelectedItem()=="D")
                    CG=2*4;
                else
                    CG=2*0;
                SumCG=SumCG+CG;

                SGPA=SumCG/SumC;

                tvSgpa.setText("SGPA="+Math.round(SGPA*100.0)/100.0);
            }
        });
    }
}
