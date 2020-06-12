package com.dts.aplikasikalkulator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kalkulator extends AppCompatActivity {

    EditText angkaPertama, angkaKedua;
    Button plus, minus, bagi, kali, clear;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angkaPertama = findViewById(R.id.angkaPertama);
        angkaKedua = findViewById(R.id.angkaKedua);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        clear = findViewById(R.id.clear);
        hasil = findViewById(R.id.hasil);

        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() >= 0) && angkaKedua.getText().length() >= 0) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0) && angkaKedua.getText().length() > 0) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Mohon masukkan angka terlebih dahulu", Toast.LENGTH_LONG);
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
