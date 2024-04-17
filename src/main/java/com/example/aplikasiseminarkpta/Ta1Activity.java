package com.example.aplikasiseminarkpta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ta1Activity extends AppCompatActivity {

    private EditText editTextSemangat, editTextKeuletan, editTextJawab, editTextKetepatan;
    Button buttonHitung21;

    private TextView textViewHasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta1);

        editTextSemangat = findViewById(R.id.editTextSemangat);
        editTextKeuletan = findViewById(R.id.editTextKeuletan);
        editTextJawab = findViewById(R.id.editTextJawab);
        editTextKetepatan = findViewById(R.id.editTextKetepatan);
        buttonHitung21 = findViewById(R.id.buttonHitung21);
        textViewHasil2 = findViewById(R.id.textViewHasil2);

        buttonHitung21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungDanTampilkanHasil();
            }
        });

    }
    private void hitungDanTampilkanHasil(){
        String semangat = editTextSemangat.getText().toString();
        String keuletan = editTextKeuletan.getText().toString();
        String jawab = editTextJawab.getText().toString();
        String ketepatan = editTextKetepatan.getText().toString();

        int semangat1 = Integer.parseInt(semangat);
        int keuletan2 = Integer.parseInt(keuletan);
        int jawab3 = Integer.parseInt(jawab);
        int ketepatan4 = Integer.parseInt(ketepatan);

        int hasil = semangat1 + keuletan2 + jawab3 + ketepatan4;
        textViewHasil2.setText(String.valueOf(hasil));
    }
}