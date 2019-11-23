package com.diozaas.menucafearmand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LihatMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterMenu adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_menu);

        adapter = new AdapterMenu(getApplicationContext(), dataMakanan());

        recyclerView = findViewById(R.id.recycler_makanan);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        // 3 merupakan jumlah item yang ingin ditampilkan per row gridnya
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Menu> dataMakanan(){
        return DummyMenu.listMakanan();
    }
}
