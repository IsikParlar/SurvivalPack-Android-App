package com.example.survivalpack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favori);
        getWindow().setStatusBarColor(ContextCompat.getColor(FavoriActivity.this, R.color.arkaplanrengi));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.favorite);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.anasayfa:
                        startActivity(new Intent(getApplicationContext(),ActivityAnaEkran.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.cantam:
                        startActivity(new Intent(getApplicationContext(),CantamActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favorite:
                        return true;

                }
                return false;
            }
        });
    }
}