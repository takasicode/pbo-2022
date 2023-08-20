/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author ASUS
 */
class setData{
    String kode, nama;
    int harga, jumlah;
    
    public setData(String kode, String nama, int harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    int getTotalPembelian(){
        int total = harga * jumlah;
        
        return total;
    }
    
    String getBonus(){
        String Bonus;
        if(getTotalPembelian() >= 50000 && this.jumlah > 5){
            Bonus = "Setrika";
        }
        else if(getTotalPembelian() >= 100000 && this.jumlah > 3){
            Bonus = "Payung";
        }
        else if(getTotalPembelian() >= 50000 && this.jumlah > 2){
            Bonus = "Ballpoint";
        }
        else{
            Bonus = "Tidak mendapatkan Bonus";
        }
        return Bonus;
    }
    
    void cetakNota(){
        System.out.println("======= NOTA PEMEBELANJAAN ANDA =======");
        System.out.println("Kode Transaksi  : " + this.kode);
        System.out.println("Nama Barang     : " + this.nama);
        System.out.println("Harga Barang    : " + this.harga);
        System.out.println("Jumlah Barang   : " + this.jumlah);
        System.out.println("Total Transaksi : " + getTotalPembelian());
        System.out.println("Bonus Transaksi : " + getBonus());
        System.out.println("======================================="); 
    }
}

public class Penjualan{
    public static void main(String[] args){
        setData transaksi = new setData("A-001", "Tas Sekolah", 50000, 3);
        transaksi.cetakNota();
    } 
}
