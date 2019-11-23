package com.diozaas.menucafearmand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_buat_pesanan, btn_lihat_pesanan, btn_lihat_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_buat_pesanan = findViewById(R.id.btn_buat_pesanan);
        btn_lihat_pesanan = findViewById(R.id.btn_lihat_pesanan);
        btn_lihat_menu = findViewById(R.id.btn_lihat_menu);

        btn_buat_pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_lihat_menu = new Intent(MainActivity.this, BuatPesananActivity.class).putExtra("status","create");
                startActivity(intent_lihat_menu);
            }
        });

        btn_lihat_pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent_lihat_menu = new Intent(MainActivity.this, LihatMenuActivity.class);
                Intent intent_list_pesanan = new Intent(MainActivity.this, ListPesanan.class);
                startActivity(intent_list_pesanan);
            }
        });

        btn_lihat_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_lihat_menu = new Intent(MainActivity.this, LihatMenuActivity.class);
                startActivity(intent_lihat_menu);
            }
        });

    }
}
