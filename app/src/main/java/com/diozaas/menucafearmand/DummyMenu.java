package com.diozaas.menucafearmand;

import java.util.ArrayList;

public class DummyMenu {

    public static ArrayList<Menu> listMakanan() {
        ArrayList<Menu> menu = new ArrayList<>();

        menu.add(new Menu("B01", "Minuman", "Kopi Hitam" ,"Kopi Hitam dibuat dengan ............", "10000"));
        menu.add(new Menu("B02", "Minuman", "Cappucino" ,"Paduan kopi dengan buih susu kental serta ............", "20000"));
        menu.add(new Menu("M03", "Minuman", "Sparkling Tea" ,"Minuman teh yang menggunakan ............", "15000"));
        menu.add(new Menu("F01", "Makanan", "Batagor" ,"Kopi Hitam dibuat dengan ............", "25000"));
        menu.add(new Menu("F02", "Makanan", "Cireng" ,"Kopi Hitam dibuat dengan ............", "10000"));
        menu.add(new Menu("F03", "Makanan", "Nasi Goreng" ,"Kopi Hitam dibuat dengan ............", "50000"));
        menu.add(new Menu("D01", "Desert", "Cheese Cake" ,"Kopi Hitam dibuat dengan ............", "40000"));
        menu.add(new Menu("D02", "Desert", "Black Salad" ,"Kopi Hitam dibuat dengan ............", "30000"));



        return menu;
    }
}
