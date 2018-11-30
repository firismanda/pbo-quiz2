import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus ROG
 */
public class xxTransaksi {
    private String code; //variabel untuk menyimpan Kode Transaksi
    private ArrayList<itemsClass> items = new ArrayList<>(); //variabel untuk menyimpan itemsClass
    private float total; // variabel untuk menyimpan total

    public xxTransaksi(String code, float total) { // Konstruktor
        this.code = code;
        this.total = total;
    }
     
    public void setTotal(){ //setter untuk setTotal
        float total = 0;
        for(itemsClass item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    public String Detail(){ //method untuk outputannya
        setTotal();
        String str = "";
        str += "Kode\t\t: "+this.code+" \n";
        str += "List Barang Belanja : \n";
        for(itemsClass item : this.items){
            str += "\t" + item.getNama() + "(x" + item.getBanyakItems() + ") : " + item.getTotal() + "\n";
        }
        str += "Total\t\t : " + this.total;
        return str;
    }
}
