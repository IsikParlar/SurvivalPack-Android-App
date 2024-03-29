package com.example.survivalpack.activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.example.survivalpack.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AnaEkranActivity extends AppCompatActivity {

    //tasarımda kullanacağımız öğeleri tanımlıyoruz
    public Button btnbackpackdeprem, btnbackpackx, btnbackpackilkyardim, btnbackpackcocuk,btnbackpackkamp,btnbackpackozel,buttonSignOut;

    private ListView listView;
    private FirebaseDatabase database;
    private DatabaseReference myRef;
    FirebaseAuth mAuth;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anaekran);
        getWindow().setStatusBarColor(ContextCompat.getColor(AnaEkranActivity.this,R.color.arkaplanrengi));
        
        //hideNavigationBar();

        //tanımlanan öğeleri bağlıyoruz
        btnbackpackcocuk = findViewById(R.id.btnbackpackcocuk);
        btnbackpackx = findViewById(R.id.btnbackpackx);
        btnbackpackdeprem = findViewById(R.id.btnbackpackdeprem);
        btnbackpackilkyardim = findViewById(R.id.btnbackpackilkyardim);
        btnbackpackkamp = findViewById(R.id.btnbackpackkamp);
        btnbackpackozel = findViewById(R.id.btnbackpackozel);
        buttonSignOut = findViewById(R.id.buttonSignOut);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Urunler");
        mAuth = FirebaseAuth.getInstance();
        builder = new AlertDialog.Builder(this);

        listView = (ListView) findViewById(com.google.android.material.R.id.layout);


        //Tıklanılma özelliğini veriyoruz ve bulunulan sayfadan yeni sayfaya geçişi sağlıyoruz.
        //Geçiş sağlanırken kullanıcıya toast mesaj gönderiliyor.
        btnbackpackozel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaEkranActivity.this,"Özel Çantaya Tıklanıldı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnaEkranActivity.this,OzelCantaActivity.class);
                startActivity(intent);
            }
        });

        btnbackpackcocuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaEkranActivity.this,"Çocuk Çantasına Tıklanıldı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnaEkranActivity.this,CocukCantasiActivity.class);
                startActivity(intent);
            }
        });

        btnbackpackkamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaEkranActivity.this,"Kamp Çantasına Tıklanıldı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnaEkranActivity.this,KampCantasiActivity.class);
                startActivity(intent);
            }
        });

        btnbackpackx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaEkranActivity.this,"Dağcı Çantasına Tıklanıldı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnaEkranActivity.this,DagciCantasiActivity.class);
                startActivity(intent);
            }
        });

        btnbackpackilkyardim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaEkranActivity.this,"İlk Yardım Çantasına Tıklanıldı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnaEkranActivity.this, IlkYardimCantasiActivity.class);
                startActivity(intent);
            }
        });

        btnbackpackdeprem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaEkranActivity.this,"Deprem Çantasına Tıklanıldı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnaEkranActivity.this,DepremCantasiActivity.class);
                startActivity(intent);
            }
        });


        buttonSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*FirebaseAuth.getInstance().getCurrentUser();
                Intent intent = new Intent(AnaEkranActivity.this,LoginActivity.class);
                startActivity(intent);*/
                builder.setTitle("Do You Really Want To Logout?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                FirebaseAuth.getInstance().getCurrentUser();
                                FirebaseAuth.getInstance().signOut();
                                Intent intent = new Intent(AnaEkranActivity.this,LoginActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        }).show();

            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.anasayfa);

       /* bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.anasayfa:
                        startActivity(new Intent(getApplicationContext(), AnaEkranActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.cantam:
                        startActivity(new Intent(getApplicationContext(), CantamActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favorite:
                        startActivity(new Intent(getApplicationContext(), FavoriActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });*/


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.anasayfa:
                        startActivity(new Intent(getApplicationContext(), AnaEkranActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.cantam:
                        startActivity(new Intent(getApplicationContext(), CantamActivity.class));
                        overridePendingTransition(0,0);
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

   /* @Override
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }*/

    /*private void hideNavigationBar() {
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }*/

    @Override
    public void onBackPressed(){
        builder.setTitle("Do You Really Want To Logout?")
                .setCancelable(true)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        FirebaseAuth.getInstance().getCurrentUser();
                        Intent intent = new Intent(AnaEkranActivity.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
    }
}
