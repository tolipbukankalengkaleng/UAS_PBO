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
public class RotiManisV2 extends RotiManis implements Interface {
    
    String nama = "Roti Manis Varian 2";
    
    @Override
    public double topping() {
        double selai  = this.hargaSelai() * 10;
        double harga = selai;
        return harga;
    }
    
    public double hitungRedBean(){
        double redBean = 10 * pesanan;
        return redBean;
    }
    
    public double hitungKrimVanilla(){
        double krimVanilla = 5 * pesanan;
        return krimVanilla;
    }
    
    

    @Override
    public double filling() {
        double krim = this.hargaKrim() * 5;
        double harga = krim;
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
        System.out.println("Harga " + nama + " = Rp " + (int)hargaVarian() + " /pcs");
    }
}
