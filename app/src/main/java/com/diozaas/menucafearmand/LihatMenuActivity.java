package com.diozaas.menucafearmand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class LihatMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterMenu adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_menu);

        Toast.makeText(this, "Ini lihat menu", Toast.LENGTH_SHORT).show();

        adapter = new AdapterMenu(getApplicationContext(), dataMakanan());


        recyclerView = findViewById(R.id.recycler_makanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        // 3 merupakan jumlah item yang ingin ditampilkan per row gridnya
//        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Menu> dataMakanan(){
        return DummyMenu.listMakanan();
    }
}
