package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class weight extends AppCompatActivity {

    private Button btnkTOg,btngTOk;
    private TextView resultW;
    private EditText enterWt;
    double result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        btnkTOg = findViewById(R.id.btnkTOg);
        btngTOk = findViewById(R.id.btngTOk);
        resultW  = findViewById(R.id.resultW);
        enterWt = findViewById(R.id.enterWt);

        btnkTOg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(enterWt.getText().toString());
                result1 = (weight * 1000);
                resultW.setText(String.valueOf(result1));
            }
        });

        btngTOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(enterWt.getText().toString());
                result1 = (weight / 1000);
                resultW.setText(String.valueOf(result1));
            }
        });
    }
}
