package com.example.gojek_cloneapp.ui.pesanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gojek_cloneapp.databinding.FragmentPesananBinding;

public class pesananFragment extends Fragment {

    private FragmentPesananBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pesananViewModel pesananViewModel =
                new ViewModelProvider(this).get(pesananViewModel.class);

        binding = FragmentPesananBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}