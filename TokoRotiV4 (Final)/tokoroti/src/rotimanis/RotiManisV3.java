/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotimanis;
import modal.RotiManis;
import harga.Interface;

/**
 *
 * @author AWN.RIZKY
 */
public class RotiManisV3 extends RotiManis implements Interface {
    String nama = "Roti Manis Varian 3";
    
           
    @Override
    public double filling() {
        double keju = this.hargaKeju() * 10;
        double sosis  = this.hargaCoklat() * 10;
        double harga = keju + sosis;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filling();
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

    @Override
    public double topping() {
        return 0.0;
    }
    
    public double hitungKeju(){
        double keju = 10 * pesanan;
        return keju;
    }
    
    public double hitungSosis(){
        double sosis = 10 * pesanan;
        return sosis;
    }
}
