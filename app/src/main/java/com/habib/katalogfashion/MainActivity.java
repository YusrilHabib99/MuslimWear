package com.habib.katalogfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnMuslim, btnMuslimah;
    public static final String JENIS_GALERY_KEY = "JENIS GALERY" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView() {
        btnMuslim = findViewById(R.id.btn_buka_kategori_muslim);
        btnMuslimah = findViewById(R.id.btn_buka_kategori_muslimah);
        btnMuslim.setOnClickListener(view -> bukaGaleri("Muslim"));
        btnMuslimah.setOnClickListener(view -> bukaGaleri("Muslimah"));
    }

    private void bukaGaleri(String jenisFashion) {
        Log.d("MAIN", "Buka activity Muslim");
        Intent intent = new Intent(this, GaleryActivity.class);
        intent.putExtra(JENIS_GALERY_KEY, jenisFashion);
        startActivity(intent);
    }
}