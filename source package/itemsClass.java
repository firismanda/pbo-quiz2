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

    public itemsClass(){}
    public itemsClass(String nama, float harga, int banyakItems) { //membuat konstruktor
        this.nama = nama;
        this.harga = harga;
        this.banyakItems = banyakItems;
    }

    public String getNama() { //membuat get untuk nama item
        return nama;
    }

    public void setNama(String nama) { //membuat set untuk nama item
        this.nama = nama;
    }

    public float getHarga() { //membuat get untuk harga item
        return harga;
    }

    public void setHarga(float harga) { //membuat set untuk harga item
        this.harga = harga;
    }

    public int getBanyakItems() { //membuat get untuk banyaknya item yang dipesan
        return banyakItems;
    }

    public void setBanyakItems(int banyakItems) { //membuat set untuk banyaknya item yang dipesan
        this.banyakItems = banyakItems;
    }

    public float getTotal(){ //membuat get untuk menghitung biaya total pemesanan item
        return this.harga * this.banyakItems;
    }
    
    public String toString(){
        return this.nama;
    }
    
}
