/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ASUS
 */
class KonversiDetik{
    int inputDetik;
    
    public KonversiDetik(int inputDetik){
        this.inputDetik = inputDetik;
    }
    
    public void hitungDetik(){
        int hari = this.inputDetik / 86400;
        int jam = (this.inputDetik % 86400) / 3600;
        int menit = (this.inputDetik % 3600) / 60;
        int detik = (this.inputDetik % 60);
        
        System.out.println("Detik   : " + inputDetik);
        System.out.println("Hari    : " + hari);
        System.out.println("Jam     : " + jam);
        System.out.println("Menit   : " + menit);
        System.out.println("Detik   : " + detik);
    }
}

public class KonversiDetikDemo {
   public static void main(String[] args) throws Exception{
       KonversiDetik hasil = new KonversiDetik(180061);
       hasil.hitungDetik();
   } 
}
