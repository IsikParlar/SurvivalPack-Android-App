package com.example.survivalpack.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.survivalpack.R;

public class UrunDetayActivity extends AppCompatActivity {

    TextView tvUrunDetayBaslik,tvUrunDetayAciklama;
    Button buttonSepeteEkle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detay);
        getWindow().setStatusBarColor(ContextCompat.getColor(UrunDetayActivity.this, R.color.arkaplanrengi));
    }
}
