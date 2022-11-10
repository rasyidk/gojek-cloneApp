package com.example.gojek_cloneapp.ui.pesanan;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.gojek_cloneapp.databinding.FragmentPesananBinding;
import com.google.android.material.tabs.TabLayout;

public class pesananFragment extends Fragment {

    private FragmentPesananBinding binding;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pesananViewModel pesananViewModel =
                new ViewModelProvider(this).get(pesananViewModel.class);

        binding = FragmentPesananBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        tabLayout = binding.tablayout;
        viewPager= binding.viewpager;


        tabLayout.setupWithViewPager(viewPager);
        VPAdapter vpAdapter = new VPAdapter(getActivity().getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(),"Riwayat");
        vpAdapter.addFragment(new Fragment2(),"Dalam Proses");
        vpAdapter.addFragment(new Fragment3(),"Terjadwal");
        viewPager.setAdapter(vpAdapter);

        Log.d("HAHA","HEHEHE");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}