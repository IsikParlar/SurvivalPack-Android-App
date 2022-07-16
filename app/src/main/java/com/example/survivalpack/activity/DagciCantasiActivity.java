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


public class DagciCantasiActivity extends AppCompatActivity {

private Button buttonCakmak,buttonCokAmacliCaki,buttonDuduk,buttonElFeneri,buttonHarita,buttonIsaretFisegi,buttonKiyafet,buttonPetSu,buttonPusula,buttonTermalOrtu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagci_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(DagciCantasiActivity.this, R.color.arkaplanrengi));

        buttonCakmak = findViewById(R.id.buttonCakmak);
        buttonCokAmacliCaki = findViewById(R.id.buttonCokAmacliCaki);
        buttonDuduk = findViewById(R.id.buttonDuduk);
        buttonElFeneri = findViewById(R.id.buttonElFeneri);
        buttonHarita = findViewById(R.id.buttonHarita);
        buttonIsaretFisegi = findViewById(R.id.buttonIsaretFisegi);
        buttonKiyafet = findViewById(R.id.buttonKiyafet);
        buttonPetSu = findViewById(R.id.buttonPetSu);
        buttonPusula = findViewById(R.id.buttonPusula);
        buttonTermalOrtu = findViewById(R.id.buttonTermalOrtu);



    }
}