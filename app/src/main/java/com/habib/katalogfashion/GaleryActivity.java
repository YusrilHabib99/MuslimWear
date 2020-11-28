package com.habib.katalogfashion;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.habib.katalogfashion.model.Fashion;

public class GaleryActivity extends AppCompatActivity {

    List<Fashion> fashions;
    int indeksTampil = 0;
    String jenisFashion;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txMerek,txHarga,txDetail,txJudul;
    ImageView ivFotoFashion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_catalog);
        Intent intent = getIntent();
        jenisFashion = intent.getStringExtra(MainActivity.JENIS_GALERY_KEY);
        fashions = DataProvider.getFashionsByTipe(this,jenisFashion);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> fashionPertama());
        btnTerakhir.setOnClickListener(view -> fashionTerakhir());
        btnSebelumnya.setOnClickListener(view -> fashionSebelumnya());
        btnBerikutnya.setOnClickListener(view -> fashionBerikutnya());

        txMerek = findViewById(R.id.textMerek);
        txHarga = findViewById(R.id.textHarga);
        txDetail = findViewById(R.id.textDetail);
        ivFotoFashion = findViewById(R.id.gambarBaju);

        txJudul = findViewById(R.id.teksjudul);
        txJudul.setText("Katalog Fashion "+jenisFashion);
    }


    private void tampilkanProfil() {
        Fashion f = fashions.get(indeksTampil);
        Log.d("Muslim", "Menampilkan Fashion Muslim "+f.getMerek());
        txMerek.setText(f.getMerek());
        txHarga.setText(f.getHarga());
        txDetail.setText(f.getDetail());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ivFotoFashion.setImageDrawable(this.getDrawable(f.getDrawableRes()));
        }
    }

    private void fashionPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void fashionTerakhir() {
        int posAkhir = fashions.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void fashionBerikutnya() {
        if (indeksTampil == fashions.size() - 1) {
            Toast.makeText(this, "Sudah di posis terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void fashionSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}