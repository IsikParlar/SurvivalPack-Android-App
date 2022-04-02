package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.survivalpack.R;

public class KampCantasiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String kampCantasiItems[]={"Çakmak", "Çok Amaçlı Çakı", "El Feneri", "Kıyafaet", "Pet Su", "Pusula", "Termal Örtü"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(KampCantasiActivity.this, R.color.arkaplanrengi));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter (this,kampCantasiItems);
        recyclerView.setAdapter(adapter);
    }
}