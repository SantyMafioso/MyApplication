package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv1 = (TextView) findViewById(R.id.tv2);
        tv1 = (TextView) findViewById(R.id.tv3);
        tv1 = (TextView) findViewById(R.id.tv4);
        tv1 = (TextView) findViewById(R.id.tv5);
        tv1 = (TextView) findViewById(R.id.tv6);

        String dato = getIntent().getStringExtra( "dato");
        tv1.setText(dato);

        String dato2 = getIntent().getStringExtra( "dato2");
        tv2.setText(dato2);

        String dato3 = getIntent().getStringExtra( "dato3");
        tv3.setText(dato3);

        String dato4 = getIntent().getStringExtra( "dato4");
        tv4.setText(dato4);

        String dato5 = getIntent().getStringExtra( "dato5");
        tv5.setText(dato5);




    }
    //metodo para el boton regresar
    public void Regresar2 (View View){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }
}