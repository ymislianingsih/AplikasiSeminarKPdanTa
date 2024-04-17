package com.example.aplikasiseminarkpta;

import static com.example.aplikasiseminarkpta.R.id.editTextJawab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kp2Activity extends AppCompatActivity {

    private EditText editTextJawab, editTextMateri, editTextWaktu, editTextKualitas;

    private Button buttonHitung2;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kp2);

        editTextJawab= findViewById(R.id.editTextJawab);
        editTextMateri = findViewById(R.id.editTextMateri);
        editTextWaktu = findViewById(R.id.editTextWaktu);
        editTextKualitas = findViewById(R.id.editTextKualitas);
        buttonHitung2 = findViewById(R.id.buttonHitung2);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungdanTampilkanHasil();
            }
        });
    }

    private void hitungdanTampilkanHasil(){
        String jawab = editTextJawab.getText().toString();
        String materi = editTextMateri.getText().toString();
        String waktu = editTextWaktu.getText().toString();
        String kualitas = editTextKualitas.getText().toString();

        int jawab1 = Integer.parseInt(jawab);
        int materi1 = Integer.parseInt(materi);
        int waktu1 = Integer.parseInt(waktu);
        int kualitas1 = Integer.parseInt(kualitas);

        int hasil = jawab1 + materi1 + waktu1 + kualitas1;
        textViewHasil.setText(String.valueOf(hasil));
    }
}
