package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.survivalpack.R;
import com.example.survivalpack.urunactivity.AgriKesici;
import com.example.survivalpack.urunactivity.Cakmak;
import com.example.survivalpack.urunactivity.CokAmacliCaki;
import com.example.survivalpack.urunactivity.ElFeneri;
import com.example.survivalpack.urunactivity.Kiyafet;
import com.example.survivalpack.urunactivity.Petsu;
import com.example.survivalpack.urunactivity.Pusula;
import com.example.survivalpack.urunactivity.TermalOrtu;

public class KampCantasiActivity extends AppCompatActivity {

    private Button buttonCakmak,buttonCokAmacliCaki,buttonElFeneri,buttonKiyafet,buttonPetSu,buttonPusula,buttonTermalOrtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamp_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(KampCantasiActivity.this, R.color.arkaplanrengi));

        buttonCakmak = findViewById(R.id.buttonCakmak);
        buttonCokAmacliCaki = findViewById(R.id.buttonCokAmacliCaki);
        buttonElFeneri = findViewById(R.id.buttonElFeneri);
        buttonKiyafet = findViewById(R.id.buttonKiyafet);
        buttonPetSu = findViewById(R.id.buttonPetSu);
        buttonPusula = findViewById(R.id.buttonPusula);
        buttonTermalOrtu = findViewById(R.id.buttonTermalOrtu);

        buttonCakmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, Cakmak.class);
                startActivity(intent);
            }
        });

        buttonCokAmacliCaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, CokAmacliCaki.class);
                startActivity(intent);
            }
        });
        buttonElFeneri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, ElFeneri.class);
                startActivity(intent);
            }
        });
        buttonKiyafet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, Kiyafet.class);
                startActivity(intent);
            }
        });
        buttonPetSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, Petsu.class);
                startActivity(intent);
            }
        });
        buttonPusula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, Pusula.class);
                startActivity(intent);
            }
        });
        buttonTermalOrtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KampCantasiActivity.this, TermalOrtu.class);
                startActivity(intent);
            }
        });
    }
}