package com.example.survivalpack.activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.NonNull;
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
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anaekran);

        //statüs barın rengini değiştir
        getWindow().setStatusBarColor(ContextCompat.getColor(AnaEkranActivity.this,R.color.arkaplanrengi));

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
                Intent intent = new Intent(AnaEkranActivity.this,IlkYardimCantasiActivity.class);
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
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(AnaEkranActivity.this,LoginActivity.class);
                startActivity(intent);
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
}
