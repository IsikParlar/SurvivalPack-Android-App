package com.example.survivalpack.activity;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.survivalpack.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    Context context;
    private Button buttonBasla, buttonFacebook, buttonInstagram, buttonTwitter;
    private TextView tvRegisterHere;
    private long backPressedTime;
    private Toast backToast;
    //İnternet kontrolü sonrası uygulamaya geçişte 3 saniyelik bekleme süresi
    private static int beklemeSuresi = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.arkaplanrengi));

        mAuth = FirebaseAuth.getInstance();
        mAuth.getCurrentUser();

        if (mAuth.getCurrentUser()!=null){
            Intent intent = new Intent(MainActivity.this,AnaEkranActivity.class);
            startActivity(intent);
        }
        buttonBasla=findViewById(R.id.buttonBasla);
        buttonFacebook=findViewById(R.id.buttonFacebook);
        buttonTwitter=findViewById(R.id.buttonTwitter);
        buttonInstagram=findViewById(R.id.buttonInstagram);
        tvRegisterHere=findViewById(R.id.tvForgotPassword);

        tvRegisterHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });

        //Başla butonuna tıklanıldığında kullanıcı uygulamanın anasayfasına yönlendirilir

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //sosyal medya hesaplarına erişim
        buttonInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com");
            }
        });

        buttonTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.twitter.com");
            }
        });

        buttonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com");
            }
        });

    }

    //istenilen URL'e geçiş için gerekli metod
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

    //Uyguluma her açılışta bu metot çalışır. İnternet bağlantısının olup olmadığı bu metotarla kontrol edilir.
    //İnternet bağlantısı varsa uygulama açılır, wifi ayarları açılır
    //İnternet bağlantısı sağlandıktan 3 saniye sonra uygulamaya geçiş sağlanır
    private boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    protected void onResume(){
        super.onResume();
        CheckInternet();
    }

    protected void CheckInternet(){

        if (isConnected()){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                }
            }, beklemeSuresi);
        }
        else {
            startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
        }
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}


