/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harga;
import dough.TopFill;

/**
 *
 * @author Lenovo
 */
public class Harga implements TopFill{
    
    int tepungTerigu() {
        return 40000;
    }

    
    int gulaPasir() {
        return 25000;
    }

   
    int butter() {
        return 23000;
    }

   
    int ragi() {
        return 5000;
    }

   
    int susuBubuk() {
        return 39000;
    }

    
    int susuCair() {
        return 24000;
    }

    
    int telur() {
        return 23000;
    }

   
    int esBatu() {
        return 2000;
    }
    
    // HARGA TOPPING dan FILLING
    
  
    @Override
    public int keju() {
        return 31000; 
    }

    
    @Override
    public int coklat() {
        return 29000;
    }

   
    @Override
    public int krim() {
        return 30000;
    }

    
    @Override
    public int selai() {
        return 25000;
    }

    
    @Override
    public int sosis() {
        return 80000;
    }

   
    @Override
    public int beef() {
        return 90000;
    }

    
    @Override
    public int bawang() {
        return 40000;
    }
}
