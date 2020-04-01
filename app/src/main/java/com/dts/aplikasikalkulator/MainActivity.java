package com.dts.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angkaPertama, angkaKedua;
    Button plus, minus, bagi, kali, clear;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaPertama = (EditText)findViewById(R.id.angkaPertama);
        angkaKedua = (EditText)findViewById(R.id.angkaKedua);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        kali  = (Button)findViewById(R.id.kali);
        bagi = (Button)findViewById(R.id.bagi);
        clear = (Button)findViewById(R.id.clear);
        hasil = (TextView)findViewById(R.id.hasil);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0)
                {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0)
                {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0)
                {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0)
                {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaPertama.setText("");
                angkaKedua.setText("");
                hasil.setText("0");
                angkaPertama.requestFocus();
            }
        });
    }
}
