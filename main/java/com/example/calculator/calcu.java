package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calcu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    EditText et_input;
    TextView tv_answer;
    Button b_sin,b_cos,b_tan,b_root,b_pow2,b_fac;
    double input,answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);

        et_input = (EditText) findViewById(R.id.et_input);
        tv_answer = (TextView) findViewById(R.id.tv_answer);
        b_sin = (Button) findViewById(R.id.b_sin);
        b_cos = (Button) findViewById(R.id.b_cos);
        b_tan = (Button) findViewById(R.id.b_tan);
        b_root = (Button) findViewById(R.id.b_root);
        b_pow2 =(Button) findViewById(R.id.b_pow2);
        b_fac =(Button) findViewById(R.id.b_fac);

        b_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A;
                A=et_input.getText().toString();
                if(A.isEmpty()){
                    Toast.makeText(calcu.this, "No Number Entered in input field", Toast.LENGTH_SHORT).show();
                    return;
                }
                input = Double.parseDouble(et_input.getText().toString());
                answer= Math.sin(input);
                tv_answer.setText(""+answer);
            }
        });

        b_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A;
                A=et_input.getText().toString();
                if(A.isEmpty()){
                    Toast.makeText(calcu.this, "No Number Entered in input field", Toast.LENGTH_SHORT).show();
                    return;
                }
                input = Double.parseDouble(et_input.getText().toString());
                answer= Math.cos(input);
                tv_answer.setText(""+ answer);
            }
        });

        b_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A;
                A=et_input.getText().toString();
                if(A.isEmpty()){
                    Toast.makeText(calcu.this, "No Number Entered in input field", Toast.LENGTH_SHORT).show();
                    return;
                }
                input = Double.parseDouble(et_input.getText().toString());
                answer= Math.tan(input);
                tv_answer.setText(""+answer);
            }
        });

        b_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A;
                A=et_input.getText().toString();
                if(A.isEmpty()){
                    Toast.makeText(calcu.this, "No Number Entered in input field", Toast.LENGTH_SHORT).show();
                    return;
                }

                input = Double.parseDouble(et_input.getText().toString());
                answer= Math.sqrt(input);
                tv_answer.setText(""+answer);
            }
        });

        b_pow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A;
                A=et_input.getText().toString();
                if(A.isEmpty()){
                    Toast.makeText(calcu.this, "No Number Entered in input field", Toast.LENGTH_SHORT).show();
                    return;
                }

                input = Double.parseDouble(et_input.getText().toString());
                answer= Math.pow(input,2);
                tv_answer.setText(""+answer);
            }
        });

        b_fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A;
                A=et_input.getText().toString();
                if(A.isEmpty()){
                    Toast.makeText(calcu.this, "No Number Entered in input field", Toast.LENGTH_SHORT).show();
                    return;
                }

                input = Double.parseDouble(et_input.getText().toString());
                answer= input;
                for(int i =(int)input;i>1;i--)
                {
                    answer=answer*i;
                }
                tv_answer.setText(""+answer);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calcu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.cal1) {
            // Handle the camera action
            Intent intent = new Intent(calcu.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.cal2) {

        }
        else if (id == R.id.converter)
        {
            Intent intent = new Intent(calcu.this, converter.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
