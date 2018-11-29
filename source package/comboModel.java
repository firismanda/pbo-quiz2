
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus ROG
 */
public class comboModel {
     private HashMap<String,Float> items = new HashMap<>();
     
     public comboModel(){
         this.items.put("Kopi",new Float(4000));
         this.items.put("Susu",new Float(5000));
         this.items.put("Gula",new Float(3000));
     }
}
