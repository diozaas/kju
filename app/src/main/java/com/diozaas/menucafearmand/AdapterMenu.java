package com.diozaas.menucafearmand;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.MenuViewHolder> {

    Context context;
    List<Menu> listMenu;

    public AdapterMenu(Context context, List<Menu> listMenu) {
        this.context = context;
        this.listMenu = listMenu;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
        View view = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, final int position) {
        holder.kode.setText(listMenu.get(position).kode);
        holder.jenis.setText(listMenu.get(position).jenis);
        holder.nama.setText(listMenu.get(position).nama);
        holder.desc.setText(listMenu.get(position).desc);
        holder.harga.setText(listMenu.get(position).harga);
//
////        holder.gambar.setImageResource(listMakanan.get(position).photo);
////        Glide.with(context).load(listMenu.get(position).getPhoto()).into(holder.gambar);
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context, DetailMakanan.class);
//                intent.putExtra("nama",listMenu.get(position).getNama());
//                intent.putExtra("gambar",listMenu.get(position).getPhoto());
//                intent.putExtra("detail",listMenu.get(position).getDetail());
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        TextView kode, jenis, nama, desc, harga;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);

//            gambar = itemView.findViewById(R.id.image_makanan);
            kode = itemView.findViewById(R.id.kode_menu);
            jenis = itemView.findViewById(R.id.jenis);
            nama = itemView.findViewById(R.id.nama_makanan);
            desc = itemView.findViewById(R.id.deskripsi);
            harga = itemView.findViewById(R.id.harga);
        }
    }
}
