package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;


public class temperature extends AppCompatActivity {

    private Button btncenTom,btnmTocen;
    private TextView result;
    private EditText enterlen;
    double result00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_c);

        btncenTom = findViewById(R.id.btncenTom);
        btnfmTocen = findViewById(R.id.btnmTocen);
        result  = findViewById(R.id.result);
        enterlen = findViewById(R.id.enterlen);

        btncenTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double length = Double.parseDouble(enterlen.getText().toString());
                result00 = (length /100);
                result.setText(String.valueOf(result00));
            }
        });

        btnmTocen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double length = Double.parseDouble(enterlen.getText().toString());
                result00 = (length*100);
                result.setText(String.valueOf(result00));
            }
        });
        }


    }
}
