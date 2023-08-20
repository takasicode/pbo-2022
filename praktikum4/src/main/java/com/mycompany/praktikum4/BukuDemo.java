/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ASUS
 */

//class
class Buku{
    //attribut
    String judul, pengarang, penerbit;
    int tahun;
    
    public Buku(String judul, String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    //method
    public void cetak(){
        System.out.println("Judul     : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Penerbit  : " + this.penerbit);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("==================================================");
    }
}

//object
public class BukuDemo{
    public static void main(String[] ergs) throws Exception{
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        buku1.cetak();
        buku2.cetak();
    }
}
