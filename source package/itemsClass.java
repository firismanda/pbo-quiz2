/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus ROG
 */
public class itemsClass {
    String  nama;           //variabel untuk menyimpan nama item yang terdaftar 
    float   harga;          //variabel untuk menyimpan harga item yang terdaftar
    int     banyakItems;    //variabel untuk menyimpan banyak item yang dibeli

    public itemsClass(String nama, float harga, int banyakItems) { //membuat konstruktor
        this.nama = nama;
        this.harga = harga;
        this.banyakItems = banyakItems;
    }


    
}
