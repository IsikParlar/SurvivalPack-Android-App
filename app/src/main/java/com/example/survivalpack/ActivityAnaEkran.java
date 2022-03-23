package com.example.survivalpack;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ActivityAnaEkran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anaekran);
        getWindow().setStatusBarColor(ContextCompat.getColor(ActivityAnaEkran.this,R.color.white));
    }
}
