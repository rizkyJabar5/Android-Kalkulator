package com.dts.aplikasikalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnMahasiswa;
    Button btnKalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMahasiswa = findViewById(R.id.btnMahasiswa);
        btnMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mahasiswa.class);
                startActivity(intent);
            }
        });

        btnKalkulator = findViewById(R.id.btnKalkulator);
        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(intent);
            }
        });
    }
}