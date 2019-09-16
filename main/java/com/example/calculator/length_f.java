package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;


public class temperature extends AppCompatActivity {

    private Button btnftoi,btnmitof;
    private TextView result_f;
    private EditText enterlen_f;
    double result00f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_f);

        btnftoi = findViewById(R.id.btnftoi);
        btnitof = findViewById(R.id.btnitof);
        result_f  = findViewById(R.id.result_f);
        enterlen_f = findViewById(R.id.enterlen_f);

        btnftoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double length_f = Double.parseDouble(enterlen_f.getText().toString());
                result00f = (length_f*12);
                result_f.setText(String.valueOf(result00f));
            }
        });

        btnitof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double length_f = Double.parseDouble(enterlen_f.getText().toString());
                result00f = (length_f/12);
                result_f.setText(String.valueOf(result00f));
            }
        });
        }


    }
}
