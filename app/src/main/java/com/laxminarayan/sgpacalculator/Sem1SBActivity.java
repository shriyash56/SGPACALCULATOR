package com.laxminarayan.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Sem1SBActivity extends AppCompatActivity {

    Button bcalculate;
    Spinner sChe, sM2, sPPS, sMP, sPC;
    String s;
    float SumCG = 0, SumC = 0, SGPA = 0;
    int CG=0;
    String[] sValue = {"A+","A","B+","B","C+","C","D","F"};
    TextView tvSgpa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_sb);


        SumC = 18;


        sChe = (Spinner) findViewById(R.id.spinnerChemistry1);
        sM2 = (Spinner) findViewById(R.id.spinnerM21);
        sPPS = (Spinner) findViewById(R.id.spinnerPPS1);
        sMP = (Spinner) findViewById(R.id.spinnerMP1);
        sPC = (Spinner) findViewById(R.id.spinnerPC1);
        tvSgpa = (TextView) findViewById(R.id.tVSGPA11);
        bcalculate = (Button) findViewById(R.id.buttonCalculate111);



        ArrayAdapter<String> adapter = new ArrayAdapter<>(Sem1SBActivity.this, android.R.layout.simple_list_item_1, sValue);
        sChe.setAdapter(adapter);
        sM2.setAdapter(adapter);
        sPPS.setAdapter(adapter);
        sMP.setAdapter(adapter);
        sPC.setAdapter(adapter);




        bcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CG=0;
                if (sChe.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sChe.getSelectedItem()=="A")
                    CG=4*9;
                else if(sChe.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sChe.getSelectedItem()=="B")
                    CG=4*7;
                else if(sChe.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sChe.getSelectedItem()=="C")
                    CG=4*5;
                else if(sChe.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=CG;

                CG=0;
                if (sM2.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sM2.getSelectedItem()=="A")
                    CG=4*9;
                else if(sM2.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sM2.getSelectedItem()=="B")
                    CG=4*7;
                else if(sM2.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sM2.getSelectedItem()=="C")
                    CG=4*5;
                else if(sM2.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sPPS.getSelectedItem() == "A+")
                    CG = 4 * 10;
                else if(sPPS.getSelectedItem()=="A")
                    CG=4*9;
                else if(sPPS.getSelectedItem()=="B+")
                    CG=4*8;
                else if(sPPS.getSelectedItem()=="B")
                    CG=4*7;
                else if(sPPS.getSelectedItem()=="C+")
                    CG=4*6;
                else if(sPPS.getSelectedItem()=="C")
                    CG=4*5;
                else if(sPPS.getSelectedItem()=="D")
                    CG=4*4;
                else
                    CG=4*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sMP.getSelectedItem() == "A+")
                    CG = 3 * 10;
                else if(sMP.getSelectedItem()=="A")
                    CG=3*9;
                else if(sMP.getSelectedItem()=="B+")
                    CG=3*8;
                else if(sMP.getSelectedItem()=="B")
                    CG=3*7;
                else if(sMP.getSelectedItem()=="C+")
                    CG=3*6;
                else if(sMP.getSelectedItem()=="C")
                    CG=3*5;
                else if(sMP.getSelectedItem()=="D")
                    CG=3*4;
                else
                    CG=3*0;
                SumCG=SumCG+CG;

                CG=0;
                if (sPC.getSelectedItem() == "A+")
                    CG = 3 * 10;
                else if(sPC.getSelectedItem()=="A")
                    CG=3*9;
                else if(sPC.getSelectedItem()=="B+")
                    CG=3*8;
                else if(sPC.getSelectedItem()=="B")
                    CG=3*7;
                else if(sPC.getSelectedItem()=="C+")
                    CG=3*6;
                else if(sPC.getSelectedItem()=="C")
                    CG=3*5;
                else if(sPC.getSelectedItem()=="D")
                    CG=3*4;
                else
                    CG=3*0;
                SumCG=SumCG+CG;


                SGPA=SumCG/SumC;

                tvSgpa.setText("SGPA="+Math.round(SGPA*100.0)/100.0);
            }
        });



    }
}
