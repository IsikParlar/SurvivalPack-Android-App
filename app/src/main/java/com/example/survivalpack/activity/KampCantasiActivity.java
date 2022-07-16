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

public class KampCantasiActivity extends AppCompatActivity {

    private Button buttonCakmak,buttonCokAmacliCaki,buttonElFeneri,buttonKiyafet,buttonPetSu,buttonPusula,buttonTermalOrtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamp_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(KampCantasiActivity.this, R.color.arkaplanrengi));

    }
}