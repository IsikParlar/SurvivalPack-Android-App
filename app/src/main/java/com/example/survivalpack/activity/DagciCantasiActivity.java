package com.example.survivalpack.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.survivalpack.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class DagciCantasiActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    UrunAdapter urunAdapter;
    ArrayList<Urun> list;
    private Button buttonEkle;
    private NotificationHelper mNotificationHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_list);
        getWindow().setStatusBarColor(ContextCompat.getColor(DagciCantasiActivity.this,R.color.arkaplanrengi));

        buttonEkle = findViewById(R.id.buttonEkle);
        recyclerView = findViewById(R.id.urunList);
        database= FirebaseDatabase.getInstance().getReference("DagciCantasiUrunler");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mNotificationHelper = new NotificationHelper(this);

        list = new ArrayList<>();
        urunAdapter = new UrunAdapter(this,list);
        recyclerView.setAdapter(urunAdapter);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){

                    Urun urun = dataSnapshot.getValue(Urun.class);
                    list.add(urun);
                }
                urunAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });

        buttonEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("AddedBags");
                CantamModel cantamModel1 = new CantamModel("Dağcı Çantası");
                myRef.push().setValue(cantamModel1);
                sendOnChannel1("Survival Pack","Çantanızdaki Ürünlerin SKT'si dolmak üzere");
            }
        });
    }
    public void sendOnChannel1(String title, String message) {
        NotificationCompat.Builder nb = mNotificationHelper.getChanngel1Notification(title,message);
        mNotificationHelper.getManager().notify(1,nb.build());
    }
}