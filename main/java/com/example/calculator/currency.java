package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class currency extends AppCompatActivity {
    private Button btn1,btn2;
    private TextView resultT;
    private EditText enterTk;
    double result2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        resultT  = findViewById(R.id.resultT);
        enterTk = findViewById(R.id.enterTk);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double TK = Double.parseDouble(enterTk.getText().toString());
                result2 = (TK * 80.0);
                resultT.setText(String.valueOf(resultT));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double TK = Double.parseDouble(enterTk.getText().toString());
                result2 = (TK / 80.0);
                resultT.setText(String.valueOf(result2));
            }
        });
    }
}
