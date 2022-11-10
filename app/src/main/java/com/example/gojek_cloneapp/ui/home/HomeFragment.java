package com.example.gojek_cloneapp.ui.home;

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
import com.example.gojek_cloneapp.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView recyclerView;

    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = binding.recyclerView;
        Integer[] langLogo = {R.drawable.food_a,R.drawable.food_b,R.drawable.food_c,R.drawable.food_d,R.drawable.food_e,R.drawable.food_f};
        String [] langName = {"Sate Pak Djumadi","Bakso Pak Soleh","Rendang Mantap","Nasi Goreng Notaris","Perkedel Bu Jum","Geprek Bu Rum"};
        String[] langDesc = {"Sate Kambing Kualitas nomer 1","Bakso Sapi Original","Rendang Sapi", "Nasi Goreng Kari","Perkedel Kentang", "Geprek Ayam Krispi"};
        String[] langRating = {"5.0","4.8","4.9","4.6","4.5","5.0"};

        mainModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++){
            MainModel model = new MainModel(langLogo[i],langName[i], langDesc[i],langRating[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                getActivity(), LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(getActivity(), mainModels);

        recyclerView.setAdapter(mainAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}