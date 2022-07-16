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


public class DepremCantasiActivity extends AppCompatActivity {

    private Button buttonAspirin,buttonAtesDusurucu,buttonBandaj,buttonCakmak,buttonDuduk,buttonElFeneri,buttonKagit,buttonKalem,buttonKiyafet,
            buttonKibrit,buttonMaske,buttonPil,buttonPetSu,buttonPowerbank,buttonRadyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deprem_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(DepremCantasiActivity.this, R.color.arkaplanrengi));



    }
}