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
import com.example.survivalpack.urunactivity.Aspirin;
import com.example.survivalpack.urunactivity.Bandaj;
import com.example.survivalpack.urunactivity.Dezenfektan;
import com.example.survivalpack.urunactivity.GazliBez;
import com.example.survivalpack.urunactivity.Ilac;
import com.example.survivalpack.urunactivity.IslakMendil;
import com.example.survivalpack.urunactivity.Tenturdiyot;
import com.example.survivalpack.urunactivity.YaraBandi;

public class IlkYardimCantasiActivity extends AppCompatActivity {

    private Button buttonAgriKesici,buttonAspirin,buttonBandaj,buttonDezenfektan,buttonGazliBez,buttonIslakMendil,buttonIlac,buttonTenturdiyot,buttonYaraBandi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_yardim_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(IlkYardimCantasiActivity.this, R.color.arkaplanrengi));


        buttonAgriKesici = findViewById(R.id.buttonAgriKesici);
        buttonAspirin = findViewById(R.id.buttonAspirin);
        buttonBandaj = findViewById(R.id.buttonBandaj);
        buttonDezenfektan = findViewById(R.id.buttonDezenfektan);
        buttonGazliBez = findViewById(R.id.buttonGazliBez);
        buttonIslakMendil = findViewById(R.id.buttonIslakMendil);
        buttonIlac = findViewById(R.id.buttonIlac);
        buttonTenturdiyot= findViewById(R.id.buttonTenturdiyot);
        buttonYaraBandi = findViewById(R.id.buttonYaraBandi);


        buttonAgriKesici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, AgriKesici.class);
                startActivity(intent);
            }
        });

        buttonAspirin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, Aspirin.class);
                startActivity(intent);
            }
        });
        buttonBandaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, Bandaj.class);
                startActivity(intent);
            }
        });
        buttonDezenfektan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, Dezenfektan.class);
                startActivity(intent);
            }
        });
        buttonGazliBez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, GazliBez.class);
                startActivity(intent);
            }
        });
        buttonIslakMendil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, IslakMendil.class);
                startActivity(intent);
            }
        });
        buttonIlac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, Ilac.class);
                startActivity(intent);
            }
        });
        buttonTenturdiyot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, Tenturdiyot.class);
                startActivity(intent);
            }
        });
        buttonYaraBandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkYardimCantasiActivity.this, YaraBandi.class);
                startActivity(intent);
            }
        });

    }
}