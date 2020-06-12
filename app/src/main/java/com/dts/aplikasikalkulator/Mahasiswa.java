package com.dts.aplikasikalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Mahasiswa extends AppCompatActivity {

    EditText editText;
    Button buttonSend;
    TextView getName;
    TextView greetings;
    String greeting = "Halo!";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        editText = findViewById(R.id.editText);
        buttonSend = findViewById(R.id.buttonSend);
        greetings = findViewById(R.id.greetings);
        getName = findViewById(R.id.getName);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                getName.setText(input);
                greetings.setText(greeting);
                editText.getText().clear();
            }
        });
    }
}