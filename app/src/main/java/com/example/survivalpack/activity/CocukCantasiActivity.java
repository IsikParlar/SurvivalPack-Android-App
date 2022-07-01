package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.survivalpack.R;
import com.example.survivalpack.urunactivity.BebekBezi;
import com.example.survivalpack.urunactivity.BebekMamasi;
import com.example.survivalpack.urunactivity.Biberon;
import com.example.survivalpack.urunactivity.Emzik;
import com.example.survivalpack.urunactivity.IslakMendil;

public class CocukCantasiActivity extends AppCompatActivity {

    private Button buttonBebekBezi,buttonBebekMamasi,buttonEmzik,buttonBiberon,buttonIslakMendil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuk_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(CocukCantasiActivity.this, R.color.arkaplanrengi));

        buttonBebekBezi = findViewById(R.id.buttonBebekBezi);
        buttonBebekMamasi = findViewById(R.id.buttonBebekMamasi);
        buttonEmzik = findViewById(R.id.buttonEmzik);
        buttonBiberon = findViewById(R.id.buttonBiberon);
        buttonIslakMendil = findViewById(R.id.buttonIslakMendil);

        buttonBebekBezi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CocukCantasiActivity.this, BebekBezi.class);
                startActivity(intent);
            }
        });

        buttonBebekMamasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CocukCantasiActivity.this, BebekMamasi.class);
                startActivity(intent);
            }
        });

        buttonEmzik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CocukCantasiActivity.this, Emzik.class);
                startActivity(intent);
            }
        });

        buttonBiberon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CocukCantasiActivity.this, Biberon.class);
                startActivity(intent);
            }
        });

        buttonIslakMendil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CocukCantasiActivity.this, IslakMendil.class);
                startActivity(intent);
            }
        });


    }
}