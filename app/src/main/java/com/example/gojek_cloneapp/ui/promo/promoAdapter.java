package com.example.gojek_cloneapp.ui.promo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gojek_cloneapp.R;
import com.example.gojek_cloneapp.ui.home.MainAdapter;
import com.example.gojek_cloneapp.ui.home.MainModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class promoAdapter extends RecyclerView.Adapter<promoAdapter.ViewHolder> {

    ArrayList<promoModel> promoModels;
    Context context;

    public promoAdapter(Context context, ArrayList<promoModel> promoModels){
        this.context = context;
        this.promoModels = promoModels;
    }


    @NonNull
    @Override
    public promoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_promo, parent, false);
        return new promoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull promoAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(promoModels.get(position).getLangLogo());
        holder.tv_menu.setText(promoModels.get(position).getLangName());
        holder.tv_distance.setText(promoModels.get(position).getLangDistance());
        holder.tv_rating.setText(promoModels.get(position).getLangRating());
        holder.tv_promo.setText(promoModels.get(position).getLangDiskon());
    }

    @Override
    public int getItemCount() {
        return promoModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tv_menu, tv_distance,tv_rating,tv_promo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.promo_menu_image);
            tv_menu = itemView.findViewById(R.id.promo_menu_utama);
            tv_distance = itemView.findViewById(R.id.promo_menu_dsitance);
            tv_rating = itemView.findViewById(R.id.promo_menu_rating);
            tv_promo = itemView.findViewById(R.id.promo_menu_promo);
        }
    }
}
