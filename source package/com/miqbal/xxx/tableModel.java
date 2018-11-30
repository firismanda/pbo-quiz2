package com.miqbal.xxx;
 import javax.swing.table.*;
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author Asus ROG
 */
public class tableModel extends DefaultTableModel {
    private String[] columns; // variabel columns untuk menyimpan nama kolom
     public tableModel() { //konstruktor
        this.columns = new String[]{
            "Nama","Harga","Jumlah"
        };
    }
    
    public String[] getColumnName(){ //getter untuk nama kolom
        return this.columns;
    }
    
    
}