package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.survivalpack.R;

public class DepremCantasiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String depremCantasiItems[]={"Aspirin", "Ateş Düşürücü", "Bandaj", "Çakmak", "Düdük", "El Feneri", "Kağıt", "Kalem", "Kıyafet", "Kibrit",
    "Maske", "Pil", "Pet Su", "Powerbank", "Radyo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(DepremCantasiActivity.this, R.color.arkaplanrengi));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter (this,depremCantasiItems);
        recyclerView.setAdapter(adapter);
    }
}