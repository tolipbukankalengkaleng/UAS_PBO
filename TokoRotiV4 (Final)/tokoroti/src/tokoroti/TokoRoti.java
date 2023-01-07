/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoroti;
import rotimanis.*;
import rotitawar.*;
import pizza.*;
import beban.BebanBahan;

/**
 *
 * @author Lenovo
 */
public class TokoRoti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      INSTANTIASI PRODUK

        RotiManisV1 rm1 = new RotiManisV1();
        RotiManisV2 rm2 = new RotiManisV2();
        RotiManisV3 rm3 = new RotiManisV3();
        RotiTawarV1 rt1 = new RotiTawarV1();
        RotiTawarV2 rt2 = new RotiTawarV2();
        PizzaV1 p1  = new PizzaV1(); 
      
//      VARIABEL JUMLAH PESANAN TIAP PRODUK      

        rm1.pesanan = 50;
        rm2.pesanan = 100;
        rm3.pesanan = 70;
        rt1.pesanan = 20;
        rt2.pesanan = 15;
        p1.pesanan = 10;
        
               
//      HITUNG KEBUTUHAN TIAP BAHAN   
     
        double kebutuhanTepung = rm1.hitungTerigu() + rm2.hitungTerigu() + rm3.hitungTerigu() + rt1.hitungTerigu() + rt2.hitungTerigu() + p1.hitungTerigu();
        double kebutuhanGula = rm1.hitungGula () + rm2.hitungGula() + rm3.hitungGula() + rt1.hitungGula() + rt2.hitungGula() + p1.hitungGula();
        double kebutuhanButter = rm1.hitungButter () + rm2.hitungButter() + rm3.hitungButter() + rt1.hitungButter() + rt2.hitungButter() + p1.hitungButter();
        double kebutuhanRagi = rm1.hitungRagi() + rm2.hitungRagi() + rm3.hitungRagi() + rt1.hitungRagi() + rt2.hitungRagi() + p1.hitungRagi();
        double kebutuhanSusuBubuk = rm1.hitungSusuBubuk() + rm2.hitungSusuBubuk() + rm3.hitungSusuBubuk() + rt1.hitungSusuBubuk() + rt2.hitungSusuBubuk() + p1.hitungSusuBubuk();
        double kebutuhanSusuCair = rm1.hitungSusuCair() + rm2.hitungSusuCair() + rm3.hitungSusuCair() + rt1.hitungSusuCair() + rt2.hitungSusuCair() + p1.hitungSusuCair();
        double kebutuhanTelur = rm1.hitungTelur() + rm2.hitungTelur() + rm3.hitungTelur() + rt1.hitungTelur() + rt2.hitungTelur() + p1.hitungTelur();
        double kebutuhanEs = rm1.hitungEs() + rm2.hitungEs() + rm3.hitungEs() + rt1.hitungEs() + rt2.hitungEs() + p1.hitungEs();
        double kebutuhanCoklat = rm1.hitungCoklat() + rt1.hitungCoklat();
        double kebutuhanKeju = rm1.hitungKeju() + rm3.hitungKeju() + rt2.hitungKeju() + p1.hitungKeju();
        double kebutuhanRedBean = rm2.hitungRedBean();
        double kebutuhanKrimVanilla = rm2.hitungKrimVanilla();
        double kebutuhanSosis = rm3.hitungSosis() + p1.hitungSosis();
        double kebutuhanBeef = p1.hitungBeef();
        double kebutuhanBawang = p1.hitungBawang();
        
        
//      TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

        BebanBahan brt = new BebanBahan();
        
//      TAMPILKAN HASIL
        
        System.out.print("Kebutuhan Tepung          = ");brt.berat(kebutuhanTepung);
        System.out.print("Kebutuhan Gula            = ");brt.berat(kebutuhanGula);
        System.out.print("Kebutuhan Butter          = ");brt.berat(kebutuhanButter);
        System.out.print("Kebutuhan Ragi            = ");brt.berat(kebutuhanRagi);
        System.out.print("Kebutuhan Susu Bubuk      = ");brt.berat(kebutuhanSusuBubuk);
        System.out.print("Kebutuhan Susu Cair       = ");brt.berat(kebutuhanSusuCair ); 
        System.out.print("Kebutuhan Telur           = ");brt.berat(kebutuhanTelur);
        System.out.print("Kebutuhan Es Batu         = ");brt.berat(kebutuhanEs);
        System.out.print("Kebutuhan Coklat          = ");brt.berat(kebutuhanCoklat);
        System.out.print("Kebutuhan Keju            = ");brt.berat(kebutuhanKeju);
        System.out.print("Kebutuhan Krim Vanilla    = ");brt.berat(kebutuhanKrimVanilla);
        System.out.print("Kebutuhan Selai Red Bean  = ");brt.berat(kebutuhanRedBean);
        System.out.print("Kebutuhan Sosis           = ");brt.berat(kebutuhanSosis);
        System.out.print("Kebutuhan Smoked Beef     = ");brt.berat(kebutuhanBeef);
        System.out.print("Kebutuhan Bawang Bombay   = ");brt.berat(kebutuhanBawang);
        System.out.println("--------------------------");

//      HARGA TIAP VARIAN PRODUK

        rm1.harga();
        rm2.harga();
        rm3.harga();
        rt1.harga();
        rt2.harga();
        p1.harga();    
    }
    
}
