/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;
import modal.Pizza;
import harga.Interface;

/**
 *
 * @author AWN.RIZKY
 */
public class PizzaV1 extends Pizza implements Interface{
    String nama = "Pizza Varian 1";
    
    @Override
    public double topping() {
        double keju  = this.hargaKeju()* 30;
        double sosis  = this.hargaSosis()* 50;
        double beef  = this.hargaBeef()* 50;
        double bawang  = this.hargaBawang()* 30;
        double harga = keju + sosis + beef + bawang;
        return harga;
    }
    
    public double hitungKeju(){
        double keju = 30 * pesanan;
        return keju;
    }
    
    public double hitungSosis(){
        double sosis = 50 * pesanan;
        return sosis;
    }
    
    public double hitungBeef(){
        double beef = 50 * pesanan;
        return beef;
    }
    
    public double hitungBawang(){
        double bawang = 30 * pesanan;
        return bawang;
    }
    

    @Override
    public double filling() {
        double harga = 0;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filling() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double modalTotal = hargaBahan + hargaTopFill;
        return modalTotal;
    }
    
    @Override
    public double hargaVarian(){
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return Math.round(harga);
    }
    
    @Override
    public void harga(){
        System.out.println("Harga " + nama  + " = Rp " + (int)hargaVarian() + " /pcs");
    }

    
    
}
