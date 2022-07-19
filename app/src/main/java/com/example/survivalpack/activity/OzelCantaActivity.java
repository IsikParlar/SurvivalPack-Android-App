package com.example.survivalpack.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.survivalpack.R;

public class OzelCantaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozel_canta);
        getWindow().setStatusBarColor(ContextCompat.getColor(OzelCantaActivity.this, R.color.arkaplanrengi));



    }
}