package com.example.survivalpack.urunactivity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.survivalpack.R;

public class AtesDusurucu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atesdusurucu);
        getWindow().setStatusBarColor(ContextCompat.getColor(AtesDusurucu.this, R.color.arkaplanrengi));
    }
}