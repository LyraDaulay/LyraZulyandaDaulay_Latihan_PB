package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText vall, val2;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vall = findViewById(R.id.vall);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.tvhasil);

        Button buttonTambah = findViewById(R.id.buttonTambah);
        Button buttonKurang = findViewById(R.id.buttonKurang);
        Button buttonKali = findViewById(R.id.buttonKali);
        Button buttonBagi = findViewById(R.id.buttonBagi);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('+');
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('-');
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('*');
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('/');
            }
        });
    }

    private void hitung(char operator) {
        int value1 = Integer.parseInt(vall.getText().toString());
        int value2 = Integer.parseInt(val2.getText().toString());
        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = value1 + value2;
                break;
            case '-':
                hasil = value1 - value2;
                break;
            case '*':
                hasil = value1 * value2;
                break;
            case '/':
                if (value2 != 0) { // Pastikan tidak terjadi pembagian dengan nol
                    hasil = value1 / value2;
                } else {


                    return;
                }
                break;
        }

        // Set hasil operasi ke TextView
        result.setText(String.valueOf(hasil));


    }
}