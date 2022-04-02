package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.survivalpack.R;

public class IlkYardimCantasiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String ilkYardimCantasiItems[]={"Ağrı Kesici", "Aspirin", "Bandaj", "Dezenfektan", "Gazlı Bez", "Islak Mendil", "İlaç", "Tentürdiyot", "Yara Bandı"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(IlkYardimCantasiActivity.this, R.color.arkaplanrengi));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter (this,ilkYardimCantasiItems);
        recyclerView.setAdapter(adapter);
    }
}