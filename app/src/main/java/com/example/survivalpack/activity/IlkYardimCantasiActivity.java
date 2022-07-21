package com.example.survivalpack.activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;

import com.example.survivalpack.R;
import com.example.survivalpack.activity.Urun;
import com.example.survivalpack.activity.UrunAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class IlkYardimCantasiActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    UrunAdapter urunAdapter;
    ArrayList<Urun> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_list);

        recyclerView = findViewById(R.id.urunList);
        database= FirebaseDatabase.getInstance().getReference("IlkYardimCantasiUrunler");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        urunAdapter = new UrunAdapter(this,list);
        recyclerView.setAdapter(urunAdapter);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){

                    Urun urun = dataSnapshot.getValue(Urun.class);
                    list.add(urun);
                    Log.d("Deneme", String.valueOf(snapshot.getValue()));
                }
                urunAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
    }
}