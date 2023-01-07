/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotitawar;

import harga.Interface;
import modal.RotiTawar;

/**
 *
 * @author Asus
 */
public class RotiTawarV2 extends RotiTawar implements Interface{
    String nama = "Roti Tawar varian 2";


    @Override
    public double topping() {
        double harga = 0;
        return harga;
    }
    
    public double hitungKeju(){
        double keju = 80 * pesanan;
        return keju;
    }

    @Override
    public double filling() {
        double keju = this.hargaKeju()*80;
        double harga= keju;
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
    public double hargaVarian() {
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return Math.round(harga);
    }

    @Override
    public void harga() {
        System.out.println("Harga " + nama  + " = Rp " + (int)hargaVarian() + " /pcs");
    }

    
    
}
