/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;

/**
 *
 * @author ASUS
 */
class Mobil2 {
    String warna;
    int tahunProduksi; 
    
    public void hidupkanMobil(String Warna){
        System.out.println("Hidupkan Mobil  : " + warna);
    }
    public void ubahGigi(String Warna){
        System.out.println("Ubah Gigi       : " + warna);
    }  
    public void matikanMobil(String Warna){
        System.out.println("Matikan Mobil   : " + warna);
    }      
}
public class MobilDemo{
    public static void main(String[] args){
        Mobil2 mobilku = new Mobil2();
        Mobil2 mobilmu = new Mobil2();

        mobilku.warna =  "Hitam";
        mobilku.tahunProduksi = 2006;
        mobilmu.warna = "Hijau";
        mobilmu.tahunProduksi = 2010;

        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun : " + mobilku.tahunProduksi);

        System.out.println("Warna : " + mobilmu.warna);
        System.out.println("Tahun : " + mobilmu.tahunProduksi);

        mobilku.hidupkanMobil(mobilku.warna);
        mobilku.ubahGigi(mobilku.warna);
        mobilku.matikanMobil(mobilku.warna);
    }
}