package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.survivalpack.R;
import com.example.survivalpack.urunactivity.Aspirin;
import com.example.survivalpack.urunactivity.AtesDusurucu;
import com.example.survivalpack.urunactivity.Bandaj;
import com.example.survivalpack.urunactivity.Cakmak;
import com.example.survivalpack.urunactivity.Duduk;
import com.example.survivalpack.urunactivity.ElFeneri;
import com.example.survivalpack.urunactivity.Kagit;
import com.example.survivalpack.urunactivity.Kalem;
import com.example.survivalpack.urunactivity.Kibrit;
import com.example.survivalpack.urunactivity.Kiyafet;
import com.example.survivalpack.urunactivity.Maske;
import com.example.survivalpack.urunactivity.Petsu;
import com.example.survivalpack.urunactivity.Pil;
import com.example.survivalpack.urunactivity.Powerbank;
import com.example.survivalpack.urunactivity.Radyo;

public class DepremCantasiActivity extends AppCompatActivity {

    private Button buttonAspirin,buttonAtesDusurucu,buttonBandaj,buttonCakmak,buttonDuduk,buttonElFeneri,buttonKagit,buttonKalem,buttonKiyafet,
            buttonKibrit,buttonMaske,buttonPil,buttonPetSu,buttonPowerbank,buttonRadyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deprem_cantasi);
        getWindow().setStatusBarColor(ContextCompat.getColor(DepremCantasiActivity.this, R.color.arkaplanrengi));

        buttonAspirin = findViewById(R.id.buttonAspirin);
        buttonAtesDusurucu = findViewById(R.id.buttonAtesDusurucu);
        buttonBandaj = findViewById(R.id.buttonBandaj);
        buttonCakmak = findViewById(R.id.buttonCakmak);
        buttonDuduk = findViewById(R.id.buttonDuduk);
        buttonElFeneri = findViewById(R.id.buttonElFeneri);
        buttonKagit = findViewById(R.id.buttonKagit);
        buttonKalem = findViewById(R.id.buttonKalem);
        buttonKiyafet = findViewById(R.id.buttonKiyafet);
        buttonKibrit = findViewById(R.id.buttonKibrit);
        buttonMaske = findViewById(R.id.buttonMaske);
        buttonPil = findViewById(R.id.buttonPil);
        buttonPetSu = findViewById(R.id.buttonPetSu);
        buttonPowerbank = findViewById(R.id.buttonPowerBank);
        buttonRadyo = findViewById(R.id.buttonRadyo);

        buttonAspirin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Aspirin.class);
                startActivity(intent);
            }
        });
        buttonAtesDusurucu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, AtesDusurucu.class);
                startActivity(intent);
            }
        });
        buttonBandaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Bandaj.class);
                startActivity(intent);
            }
        });
        buttonCakmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Cakmak.class);
                startActivity(intent);
            }
        });
        buttonDuduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Duduk.class);
                startActivity(intent);
            }
        });
        buttonElFeneri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, ElFeneri.class);
                startActivity(intent);
            }
        });
        buttonKagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Kagit.class);
                startActivity(intent);
            }
        });
        buttonKalem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Kalem.class);
                startActivity(intent);
            }
        });
        buttonKiyafet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Kiyafet.class);
                startActivity(intent);
            }
        });
        buttonKibrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Kibrit.class);
                startActivity(intent);
            }
        });
        buttonMaske.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Maske.class);
                startActivity(intent);
            }
        });
        buttonPil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Pil.class);
                startActivity(intent);
            }
        });
        buttonPetSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Petsu.class);
                startActivity(intent);
            }
        });
        buttonPowerbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Powerbank.class);
                startActivity(intent);
            }
        });
        buttonRadyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepremCantasiActivity.this, Radyo.class);
                startActivity(intent);
            }
        });

    }
}