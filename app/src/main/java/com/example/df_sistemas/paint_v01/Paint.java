package com.example.df_sistemas.paint_v01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class Paint extends AppCompatActivity implements View.OnClickListener{

    ImageButton negro;
    ImageButton rojo;
    ImageButton azul;
    ImageButton verde;
    ImageButton amarillo;
    Lienzo lienso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //enlaze de butones
        negro = (ImageButton)findViewById(R.id.negro);
        rojo = (ImageButton)findViewById(R.id.rojo);
        azul = (ImageButton)findViewById(R.id.azul);
        verde = (ImageButton)findViewById(R.id.verde);
        amarillo = (ImageButton)findViewById(R.id.amarillo);

        negro.setOnClickListener(this);
        rojo.setOnClickListener(this);
        azul.setOnClickListener(this);
        verde.setOnClickListener(this);
        amarillo.setOnClickListener(this);

        lienso = (Lienzo)findViewById(R.id.lienzo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_paint, menu);
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

    @Override
    public void onClick(View view) {
        String color;
        switch (view.getId()){
            case R.id.negro:
                color = view.getTag().toString();
                lienso.setColor(color);
                break;
            case R.id.rojo:
                color = view.getTag().toString();
                lienso.setColor(color);
                break;
            case R.id.azul:
                color = view.getTag().toString();
                lienso.setColor(color);
                break;
            case R.id.verde:
                color = view.getTag().toString();
                lienso.setColor(color);
                break;
            case R.id.amarillo:
                color = view.getTag().toString();
                lienso.setColor(color);
                break;
            default:

                break;
        }
    }
}
