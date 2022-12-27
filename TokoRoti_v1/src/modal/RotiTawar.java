/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;
import dough.KomposisiRotiTawar;

/**
 *
 * @author Asus
 */
public class RotiTawar extends KomposisiRotiTawar implements Modal{

    @Override
    public int beratDough() {
        return 400;
    }

    @Override
    public double rotiPerAdonan() {
        return this.hitungKomposisi() / this.beratDough();
    }
    
    public int pesanan;

    @Override
    public double hitungTerigu() {
        double hitung = this.tepungTerigu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPasir() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butter()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragi() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubuk() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCair() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.telur() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esBatu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hitungModal() {
        double modal = this.tepungTerigu() * this.hargaTepung() + this.gulaPasir() * this.hargaGulaPasir() + this.butter() * this.hargaButter() + this.esBatu() * this.hargaEsBatu() + this.ragi() * this.hargaRagi() + (this.susuBubuk() * this.hargaSusuBubuk()) + (this.susuCair() * this.hargaSusuCair()) + (this.telur() * this.hargaTelur());
        return modal;
    }
    
    
}
