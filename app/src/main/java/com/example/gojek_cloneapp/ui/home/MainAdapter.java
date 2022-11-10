package com.example.gojek_cloneapp.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gojek_cloneapp.R;


import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<MainModel> mainModels;
    Context context;



    public MainAdapter(Context context, ArrayList<MainModel> mainModels){
        this.context = context;
        this.mainModels = mainModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(mainModels.get(position).getLangLogo());
        holder.tv_menu.setText(mainModels.get(position).getLangName());
        holder.tv_desc.setText(mainModels.get(position).getLangDesc());
        holder.tv_rating.setText(mainModels.get(position).getLangRating());
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tv_menu, tv_desc,tv_rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.home_menu_image);
            tv_menu = itemView.findViewById(R.id.home_menu_utama);
            tv_desc = itemView.findViewById(R.id.home_menu_desc);
            tv_rating = itemView.findViewById(R.id.home_menu_rating);
        }
    }
}
