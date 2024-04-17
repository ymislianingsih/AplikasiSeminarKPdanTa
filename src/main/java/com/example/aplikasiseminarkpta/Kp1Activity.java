package com.example.aplikasiseminarkpta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kp1Activity extends AppCompatActivity {

    private EditText editTextUsaha, editTextKreativitas, editTextTanggung, editTextKomunikasi;
    private Button buttonHitung1;

    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kp1);

        editTextUsaha = findViewById(R.id.editTextUsaha);
        editTextKreativitas = findViewById(R.id.editTextKreativitas);
        editTextTanggung = findViewById(R.id.editTextTanggung);
        editTextKomunikasi = findViewById(R.id.editTextKomunikasi);
        buttonHitung1 = findViewById(R.id.buttonHitung1);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungDanTampilkanHasil();
            }
        });
    }

    private void hitungDanTampilkanHasil(){
        String usaha = editTextUsaha.getText().toString();
        String kreativitas = editTextKreativitas.getText().toString();
        String tanggung = editTextTanggung.getText().toString();
        String komunikasi = editTextKomunikasi.getText().toString();

        int usaha1 = Integer.parseInt(usaha);
        int kreativitas2 = Integer.parseInt(kreativitas);
        int tanggung3 = Integer.parseInt(tanggung);
        int komuunikasi4 = Integer.parseInt(komunikasi);

        int hasil = usaha1 + kreativitas2 + tanggung3 + komuunikasi4;
        textViewHasil.setText(String.valueOf(hasil));
    }
}
