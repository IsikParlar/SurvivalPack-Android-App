package com.example.survivalpack.activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.survivalpack.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CantamActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference database;
    FirebaseAuth mAuth;
    CantamAdapter cantamAdapter;
    ArrayList<CantamModel> list;
    private TextView textViewSayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantam);
        getWindow().setStatusBarColor(ContextCompat.getColor(CantamActivity.this, R.color.arkaplanrengi));

        textViewSayac = (TextView) findViewById(R.id.textViewSayac);
        recyclerView = findViewById(R.id.recyclerView);
        database = FirebaseDatabase.getInstance().getReference("AddedBags");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAuth = FirebaseAuth.getInstance();

        list = new ArrayList<>();
        cantamAdapter = new CantamAdapter(this, list);
        recyclerView.setAdapter(cantamAdapter);


        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    CantamModel cantamModel = dataSnapshot.getValue(CantamModel.class);
                    list.add(cantamModel);
                }
                cantamAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });




/*
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.cantam);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.anasayfa:
                        startActivity(new Intent(getApplicationContext(), AnaEkranActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.cantam:
                        return true;
                    case R.id.favorite:
                        startActivity(new Intent(getApplicationContext(), FavoriActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    //Sayfa hafızadan silinir ve geri tuşuna basıldığında istenilen sayfaya yönlendirilir
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(CantamActivity.this,AnaEkranActivity.class));
    }

 */
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(CantamActivity.this,AnaEkranActivity.class));
    }

   /* @Override
    protected void onStart() {
        super.onStart();
        new CountDownTimer(50000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                textViewSayac.setText("Kalan Süre :" +millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                textViewSayac.setText("Bitti");
            }
        }.start();
    }*/
}