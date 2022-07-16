package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.survivalpack.R;

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




    }
}