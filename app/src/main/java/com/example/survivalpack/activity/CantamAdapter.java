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

public class CantamAdapter extends RecyclerView.Adapter<CantamAdapter.MyViewHolder> {

    Context context;
    ArrayList<CantamModel> list;

    public CantamAdapter(Context context, ArrayList<CantamModel> list) {
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
        CantamModel cantamModel = list.get(position);
        holder.cantamAdi.setText(cantamModel.getCantam_ad());
        //holder.urunUrl.setText(urun.getUrunUrl());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView cantamAdi;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cantamAdi = itemView.findViewById(R.id.textViewCantamAdi);
            //urunUrl = itemView.findViewById(R.id.imageViewUrunFoto);
            int position = this.getAdapterPosition();
        }
    }
}

