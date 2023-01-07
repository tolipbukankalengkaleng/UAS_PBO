/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotimanis;
import modal.RotiManis;
import harga.Interface;

/**
 *
 * @author Lenovo
 */
public class RotiManisV1 extends RotiManis implements Interface {
    
    String nama = "Roti Manis Varian 1";
    
    @Override
    public double topping() {
        double coklat  = this.hargaCoklat() * 5;
        double harga = coklat;
        return harga;
    }
    
    public double hitungCoklat(){
        double coklat = 10 * pesanan;
        return coklat;
    }
    
    public double hitungKeju(){
        double keju = 5 * pesanan;
        return keju;
    }
   
    @Override
    public double filling() {
        double keju = this.hargaKeju() * 5;
        double coklat  = this.hargaCoklat() * 5;
        double harga = keju + coklat;
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
