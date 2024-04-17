package com.example.aplikasiseminarkpta;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.aplikasiseminarkpta.databinding.ActivityInputKpactivityBinding;
import com.example.aplikasiseminarkpta.databinding.ActivityInputTaactivityBinding;
import com.example.aplikasiseminarkpta.model.Mahasiswa;

public class InputTAActivity extends AppCompatActivity {
    private ActivityInputTaactivityBinding binding;
    static String EXTRA_MAHASISWA = "extra_mahasiswa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInputTaactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setData();

        binding.btNilaiBimbinganKP.setOnClickListener(v -> {
            Intent i = new Intent(InputTAActivity.this, Ta1Activity.class);
            startActivity(i);
        });

        binding.btNilaiSeminarKP.setOnClickListener(v -> {
            Intent intent = new Intent(InputTAActivity.this, Ta2Activity.class);
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
            binding.tvJudulTa.setText(mahasiswa.getJudul());
        }
    }
}