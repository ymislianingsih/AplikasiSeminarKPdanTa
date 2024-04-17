package com.example.aplikasiseminarkpta;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aplikasiseminarkpta.adapter.TAKPAdapter;
import com.example.aplikasiseminarkpta.databinding.FragmentKpBinding;
import com.example.aplikasiseminarkpta.databinding.FragmentTaBinding;
import com.example.aplikasiseminarkpta.model.Mahasiswa;

import java.util.ArrayList;

public class TaFragment extends Fragment {
    private FragmentTaBinding binding;
    private final TAKPAdapter TAKPAdapter = new TAKPAdapter();

    private final ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTaBinding.inflate(inflater, container, false);

        addMahasiswa();
        setRecyclerView();

        return binding.getRoot();
    }

    private void addMahasiswa() {
        mahasiswaList.clear();

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Yuliana Mislianingsih");
        mahasiswa1.setNim("12250123497");
        mahasiswa1.setJudul("Judul TA 1");


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Mahasiswa ke-2");
        mahasiswa2.setNim("000000000");
        mahasiswa2.setJudul("Judul TA 2");

        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
    }


    private void setRecyclerView() {
        TAKPAdapter.setList(mahasiswaList);
        TAKPAdapter.setOnUserClick(mahasiswa -> {
            Intent iInputKP = new Intent(requireActivity(), InputTAActivity.class);
            iInputKP.putExtra(InputKPActivity.EXTRA_MAHASISWA, mahasiswa);
            startActivity(iInputKP);
        });
        binding.rvKp.setAdapter(TAKPAdapter);
        binding.rvKp.setLayoutManager(new LinearLayoutManager(requireActivity()));
    }
}