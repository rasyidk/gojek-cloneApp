package com.example.gojek_cloneapp.ui.promo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gojek_cloneapp.R;
import com.example.gojek_cloneapp.databinding.FragmentPromoBinding;
import com.example.gojek_cloneapp.ui.home.MainAdapter;
import com.example.gojek_cloneapp.ui.home.MainModel;

import java.util.ArrayList;

public class promoFragment extends Fragment {

    private FragmentPromoBinding binding;
    RecyclerView recyclerView;

    ArrayList<promoModel> promoModels;
    promoAdapter promoAdapterxxx;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        promoViewModel promoViewModel =
                new ViewModelProvider(this).get(promoViewModel.class);

        binding = FragmentPromoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        recyclerView = binding.promoRv;

        Integer[] langLogo = {R.drawable.food_h,R.drawable.food_g,R.drawable.food_a,R.drawable.food_b,R.drawable.food_d,R.drawable.food_e};
        String [] langName = {"Nasi Rames Kalirase","Batagor Mang Ujang","Sate Cak Romi","Bakso Bodronoyo","Nasi Goreng Sedap Malam", "Perkedel Pasar Sleman"};
        String[] langDisctance = {"1 km","800m","1.5 km","2 km","3 km", "3.5 km"};
        String[] langRating = {"5.0","4.7","4.8","4.7 km", "4.9", "4.6"};
        String[] langDiskon = {"14k off","30%","10k off","20%", "10k off", "40%"};

        promoModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++){
            promoModel model = new promoModel(langLogo[i],langName[i], langDisctance[i],langRating[i], langDiskon[i]);
            promoModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                getActivity(), LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        promoAdapterxxx = new promoAdapter(getActivity(), promoModels);

        recyclerView.setAdapter(promoAdapterxxx);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}