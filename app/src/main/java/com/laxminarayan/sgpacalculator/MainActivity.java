package com.laxminarayan.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] sStructure = {"SELECT","A","B"};
    String[] sSem = {"SELECT","I","II"};
    Spinner spinnerStructure,spinnerSem;
    Button bCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerStructure=(Spinner)findViewById(R.id.spinnerStructure);
        spinnerSem=(Spinner) findViewById(R.id.spinnerSemester);
        bCalculate=(Button)findViewById(R.id.buttonProceed);

        Toast.makeText(getApplicationContext(),"Please Click On Proceed Button",Toast.LENGTH_LONG).show();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, sStructure);
        spinnerStructure.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, sSem);
        spinnerSem.setAdapter(adapter1);


        bCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(spinnerSem.getSelectedItem()=="SELECT" | spinnerStructure.getSelectedItem()=="SELECT")
                    Toast.makeText(getApplicationContext(), "PLEASE SELECT PROPERLY", Toast.LENGTH_SHORT).show();
                else
                {
                    if(spinnerStructure.getSelectedItem()=="A" && spinnerSem.getSelectedItem()=="I")
                    {
                        Intent i = new Intent(getApplicationContext(),Sem1Activity.class);
                        startActivity(i);
                    }
                    else if (spinnerStructure.getSelectedItem()=="A" && spinnerSem.getSelectedItem()=="II")
                    {
                        Intent i = new Intent(getApplicationContext(),Sem2Activity.class);
                        startActivity(i);
                    }else if(spinnerStructure.getSelectedItem()=="B" && spinnerSem.getSelectedItem()=="I")
                    {
                        Intent i = new Intent(getApplicationContext(),Sem1SBActivity.class);
                        startActivity(i);
                    }else if(spinnerStructure.getSelectedItem()=="B" && spinnerSem.getSelectedItem()=="II")
                    {
                        Intent i = new Intent(getApplicationContext(),Sem2SBActivity.class);
                        startActivity(i);
                    }
                    else
                        Toast.makeText(getApplicationContext(),"PLEASE SELECT PROPERLY",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
