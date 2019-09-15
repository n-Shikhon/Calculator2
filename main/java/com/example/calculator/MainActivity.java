package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.cardview.widget.CardView;
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

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private TextView text;
    private EditText etext;
    private EditText edtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button) findViewById(R.id.button);
        minus = (Button) findViewById(R.id.button2);
        multiply = (Button) findViewById(R.id.button3);
        divide = (Button) findViewById(R.id.button4);
        text = (TextView)findViewById(R.id.textView2);
        etext = (EditText) findViewById(R.id.editText3);
        edtext = (EditText) findViewById(R.id.editText4);


        plus.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        double val1 = Double.parseDouble(etext.getText().toString());
                                        double val2 = Double.parseDouble(edtext.getText().toString());
                                        double sum = val1+ val2;
                                        text.setText(Double.toString(sum));


                                    }
                                }
        );
        minus.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         double val1 = Double.parseDouble(etext.getText().toString());
                                         double val2 = Double.parseDouble(edtext.getText().toString());
                                         double sub = val1- val2;
                                         text.setText(Double.toString(sub));


                                     }
                                 }
        );
        multiply.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            double val1 = Double.parseDouble(etext.getText().toString());
                                            double val2 = Double.parseDouble(edtext.getText().toString());
                                            double mul = val1* val2;
                                            text.setText(Double.toString(mul));


                                        }
                                    }
        );
        divide.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          double val1 = Double.parseDouble(etext.getText().toString());
                                          double val2 = Double.parseDouble(edtext.getText().toString());
                                          double div = val1/val2;
                                          text.setText(Double.toString(div));


                                      }
                                  }
        );







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
        getMenuInflater().inflate(R.menu.main, menu);
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

        } else if (id == R.id.cal2) {

            Intent intent = new Intent(MainActivity.this, calcu.class);
            startActivity(intent);
        }

        else if (id == R.id.converter) {

            Intent intent = new Intent(MainActivity.this, converter.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
