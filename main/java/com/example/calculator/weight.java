package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class weight extends AppCompatActivity {

    private Button btnp,btnk;
    private TextView resultW;
    private EditText enterWt;
    double result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        btnp = findViewById(R.id.btnp);
        btnk = findViewById(R.id.btnk);
        resultW  = findViewById(R.id.resultW);
        enterWt = findViewById(R.id.enterWt);

        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(enterWt.getText().toString());
                result1 = (weight * 2.2);
                resultW.setText(String.valueOf(result1));
            }
        });

        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(enterWt.getText().toString());
                result1 = (weight / 2.2);
                resultW.setText(String.valueOf(result1));
            }
        });
    }
}
