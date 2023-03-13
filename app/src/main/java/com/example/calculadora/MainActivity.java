package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtVal1, txtVal2;
    TextView tvRes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVal1 = (EditText)findViewById(R.id.etVal1);
        txtVal2 = (EditText)findViewById(R.id.etVal2);
        tvRes1 = (TextView) findViewById(R.id.tvRes);
    }

    public void sumar(View view){
        String val1string = txtVal1.getText().toString();
        String val2string = txtVal2.getText().toString();

        int val1int = Integer.parseInt(val1string);
        int val2int = Integer.parseInt(val2string);
        int resint = val1int+val2int;
        tvRes1.setText(""+resint);
    }
    public void restar(View view){
        String val1string = txtVal1.getText().toString();
        String val2string = txtVal2.getText().toString();

        int val1int = Integer.parseInt(val1string);
        int val2int = Integer.parseInt(val2string);
        int resint = val1int-val2int;
        tvRes1.setText(""+resint);
    }
    public void multiplicar(View view){
        String val1string = txtVal1.getText().toString();
        String val2string = txtVal2.getText().toString();

        int val1int = Integer.parseInt(val1string);
        int val2int = Integer.parseInt(val2string);
        int resint = val1int*val2int;
        tvRes1.setText(""+resint);
    }
    public void dividir(View view){
        String val1string = txtVal1.getText().toString();
        String val2string = txtVal2.getText().toString();

        double val1int = Double.parseDouble(val1string);
        double val2int = Double.parseDouble(val2string);
        double resultado = 0;
        if (val2int!=0){
            resultado = val1int/val2int;
        } else {
            Toast.makeText(this, "Operación no válida", Toast.LENGTH_LONG).show();
        }
        tvRes1.setText(""+resultado);
    }
}