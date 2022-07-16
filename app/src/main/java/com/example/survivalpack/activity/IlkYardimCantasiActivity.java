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

public class IlkYardimCantasiActivity extends AppCompatActivity {

    private Button buttonAgriKesici,buttonAspirin,buttonBandaj,buttonDezenfektan,buttonGazliBez,buttonIslakMendil,buttonIlac,buttonTenturdiyot,buttonYaraBandi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_yardim_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(IlkYardimCantasiActivity.this, R.color.arkaplanrengi));



    }
}