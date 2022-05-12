package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.survivalpack.R;

public class OzelCantaActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String ozelCantaItems[]={"Ürün 1", "Ürün 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(OzelCantaActivity.this, R.color.arkaplanrengi));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter (this,ozelCantaItems);
        recyclerView.setAdapter(adapter);
    }
}