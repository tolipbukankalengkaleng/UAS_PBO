/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoroti;
import rotimanis.*;
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
      
//      VARIABEL JUMLAH PESANAN TIAP PRODUK      

        rm1.pesanan = 50;
        rm2.pesanan = 100;
        
//      HITUNG KEBUTUHAN TIAP BAHAN   
     
        double kebutuhanTepung = rm1.hitungTerigu() + rm2.hitungTerigu();
        double kebutuhanGula = rm1.hitungGula() + rm2.hitungGula();
        double kebutuhanButter = rm1.hitungButter() + rm2.hitungButter();
        double kebutuhanRagi = rm1.hitungRagi() + rm2.hitungRagi();
        double kebutuhanSusuBubuk = rm1.hitungSusuBubuk() + rm2.hitungSusuBubuk();
        double kebutuhanSusuCair = rm1.hitungSusuCair() + rm2.hitungSusuCair();
        double kebutuhanTelur = rm1.hitungTelur() + rm2.hitungTelur();
        double kebutuhanEs = rm1.hitungEs() + rm2.hitungEs();
        
//      TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

        BebanBahan brt = new BebanBahan();
        
//      TAMPILKAN HASIL
        
        System.out.print("Kebutuhan Tepung = ");brt.berat(kebutuhanTepung);
        System.out.print("Kebutuhan Gula = ");brt.berat(kebutuhanGula);
        System.out.print("Kebutuhan Butter = ");brt.berat(kebutuhanButter);
        System.out.print("Kebutuhan Ragi = ");brt.berat(kebutuhanRagi);
        System.out.print("Kebutuhan Susu Bubuk = ");brt.berat(kebutuhanSusuBubuk);
        System.out.print("Kebutuhan Susu Cair = ");brt.berat(kebutuhanSusuCair ); 
        System.out.print("Kebutuhan Telur = ");brt.berat(kebutuhanTelur);
        System.out.print("Kebutuhan Es Batu = ");brt.berat(kebutuhanEs);
        System.out.println("----");

//      HARGA TIAP VARIAN PRODUK

        rm1.harga();
        rm2.harga();
        
    }
    
}
