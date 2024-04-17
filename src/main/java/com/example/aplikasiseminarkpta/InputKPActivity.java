package com.example.aplikasiseminarkpta;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasiseminarkpta.databinding.ActivityInputKpactivityBinding;
import com.example.aplikasiseminarkpta.model.Mahasiswa;

public class InputKPActivity extends AppCompatActivity {
    private ActivityInputKpactivityBinding binding;
    static String EXTRA_MAHASISWA = "extra_mahasiswa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInputKpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setData();

        binding.btNilaiBimbinganKP.setOnClickListener(v -> {
            Intent i = new Intent(InputKPActivity.this, Kp1Activity.class);
            startActivity(i);
        });

        binding.btNilaiSeminarKP.setOnClickListener(v -> {
            Intent intent = new Intent(InputKPActivity.this, Kp2Activity.class);
            startActivity(intent);
        });
    }

    private void setData() {
        Mahasiswa mahasiswa;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            mahasiswa = getIntent().getParcelableExtra(EXTRA_MAHASISWA, Mahasiswa.class);
        } else {
            mahasiswa = getIntent().getParcelableExtra(EXTRA_MAHASISWA);
        }

        if (mahasiswa != null) {
            binding.tvName.setText(mahasiswa.getNama());
            binding.tvNim.setText(mahasiswa.getNim());
            binding.tvJudulKp.setText(mahasiswa.getJudul());

        }
    }
}