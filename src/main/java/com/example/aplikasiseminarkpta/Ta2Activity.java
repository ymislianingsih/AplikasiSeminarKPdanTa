package com.example.aplikasiseminarkpta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ta2Activity extends AppCompatActivity {

    private EditText editTextKemampuan, editTextPenguasaan, editTextUrgensi, editTextMetodologi;
    Button buttonHitung22;

    private TextView textViewHasil22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta2);

        editTextKemampuan = findViewById(R.id.editTextKemampuan);
        editTextPenguasaan = findViewById(R.id.editTextPenguasaan);
        editTextUrgensi = findViewById(R.id.editTextUrgensi);
        editTextMetodologi = findViewById(R.id.editTextMetodologi);
        buttonHitung22 = findViewById(R.id.buttonHitung22);
        textViewHasil22 = findViewById(R.id.textViewHasil22);

        buttonHitung22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungDanTampilkanHasil();
            }
        });

    }
    private void hitungDanTampilkanHasil(){
        String kemampuan = editTextKemampuan.getText().toString();
        String penguasaan = editTextPenguasaan.getText().toString();
        String urgensi = editTextUrgensi.getText().toString();
        String metodologi = editTextMetodologi.getText().toString();

        int kemampuan1 = Integer.parseInt(kemampuan);
        int penguasaan2 = Integer.parseInt(penguasaan);
        int urgensi3 = Integer.parseInt(urgensi);
        int metodologi4 = Integer.parseInt(metodologi);

        int hasil = kemampuan1 + penguasaan2 + urgensi3 + metodologi4;
        textViewHasil22.setText(String.valueOf(hasil));
    }
}