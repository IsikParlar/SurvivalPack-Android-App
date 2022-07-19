package com.example.survivalpack.activity;


import com.example.survivalpack.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UrunAdapter extends RecyclerView.Adapter<UrunAdapter.MyViewHolder> {

    Context context;
    ArrayList<Urun> list;

    public UrunAdapter(Context context, ArrayList<Urun> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Urun urun = list.get(position);
        holder.urunAdi.setText(urun.getUrunAdi());
        //holder.urunUrl.setText(urun.getUrunUrl());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView urunAdi, urunUrl;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            urunAdi = itemView.findViewById(R.id.textViewUrunAdi);
            //urunUrl = itemView.findViewById(R.id.imageViewUrunFoto);
        }
    }
}
