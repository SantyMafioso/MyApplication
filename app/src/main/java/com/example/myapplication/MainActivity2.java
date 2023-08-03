package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 =(EditText) findViewById(R.id.et1);
        et2 =(EditText) findViewById(R.id.et2);
        et3 =(EditText) findViewById(R.id.et3);
        et4 =(EditText) findViewById(R.id.et4);
        et5 =(EditText) findViewById(R.id.et5);
    }

    //metodo para el boton enviar
    public void Liquidar(View View){
        Intent i = new Intent(this, MainActivity3.class);
        i.putExtra("dato", et1.getText().toString() );
        i.putExtra("dato2", et2.getText().toString() );
        i.putExtra("dato3", et3.getText().toString() );
        i.putExtra("dato4", et4.getText().toString() );
        i.putExtra("dato5", et5.getText().toString() );
        startActivity(i);


    }
        public void Regresar (View View){
            Intent i = new Intent (this, MainActivity.class);
            startActivity(i);
    }
}