package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;


public class temperature extends AppCompatActivity {

    private Button btncTOF,btnfTOc;
    private TextView result;
    private EditText enterTemp;
    double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        btncTOF = findViewById(R.id.btncTOf);
        btnfTOc = findViewById(R.id.btnfTOc);
        result  = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        btncTOF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp * 1.8) + 32;
                result.setText(String.valueOf(result0));
            }
        });

        btnfTOc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp - 32)/1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}
