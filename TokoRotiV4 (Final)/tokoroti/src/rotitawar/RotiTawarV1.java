/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotitawar;
import modal.RotiTawar;
import harga.Interface;

/**
 *
 * @author Asus
 */
public class RotiTawarV1 extends RotiTawar implements Interface{
    String nama = "Roti Tawar varian 1";


    @Override
    public double topping() {
        double harga = 0;
        return harga;
    }
    
    public double hitungCoklat(){
        double coklat = 80 * pesanan;
        return coklat;
    }
    

    @Override
    public double filling() {
        double coklat = this.hargaCoklat()*80;
        double harga= coklat;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filling()+ this.topping();
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
