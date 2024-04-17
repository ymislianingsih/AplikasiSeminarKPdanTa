package com.example.aplikasiseminarkpta.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aplikasiseminarkpta.databinding.ItemMahasiswaBinding;
import com.example.aplikasiseminarkpta.model.Mahasiswa;
import java.util.ArrayList;

public class TAKPAdapter extends RecyclerView.Adapter<TAKPAdapter.ViewHolder> {
    private final ArrayList<Mahasiswa> listUsers = new ArrayList<>();
    private OnUserClickListener onUserClick;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<Mahasiswa> listUser) {
        listUsers.clear();
        listUsers.addAll(listUser);
        notifyDataSetChanged();
    }

    public void setOnUserClick(OnUserClickListener listener) {
        onUserClick = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemMahasiswaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return listUsers.size();
    }

    public interface OnUserClickListener {
        void onUserClick(Mahasiswa mahasiswa);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemMahasiswaBinding binding;

        public ViewHolder(ItemMahasiswaBinding itemBinding) {
            super(itemBinding.getRoot());
            binding = itemBinding;

            binding.cardMahasiswa.setOnClickListener(v -> {
            if (onUserClick != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    onUserClick.onUserClick(listUsers.get(position));
                }
            }
        });
        }

        public void bind(Mahasiswa user) {
            binding.tvName.setText(user.getNama());
            binding.tvNim.setText(user.getNim());
            binding.tvJudulKp.setText(user.getJudul());
        }
    }
}
