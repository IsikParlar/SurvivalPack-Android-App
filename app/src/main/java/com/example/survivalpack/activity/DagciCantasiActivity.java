package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.survivalpack.R;

public class DagciCantasiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String dagciCantasiItems[]={"Çakmak", "Çok Amaçlı Çakı", "Düdük", "El Feneri", "Harita", "İşaret Fişeği", "Kıyafet", "Pet Su", "Pusula", "Termal Örtü"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(DagciCantasiActivity.this, R.color.arkaplanrengi));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter (this,dagciCantasiItems);
        recyclerView.setAdapter(adapter);
    }
}