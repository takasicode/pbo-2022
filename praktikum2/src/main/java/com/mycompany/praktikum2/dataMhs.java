/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;

/**
 *
 * @author ASUS
 */
class nilaiMhs{
    String nama;
    int nim;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    double pnilaiTugas, pnilaiUTS, pnilaiUAS;
    
    public void Nilai(double y, double x, double z){
        pnilaiTugas = y * 20/100;
        pnilaiUTS   = x * 35/100;
        pnilaiUAS   = z * 45/100;
        nilaiAkhir  = pnilaiTugas + pnilaiUTS + pnilaiUAS  ;
    }
    public void cetakNilai(){
        System.out.println("Nilai Tugas : " + nilaiTugas + " 20% : " + pnilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS + " 35% : " + pnilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS + " 45% : " + pnilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
public class dataMhs {
    public static void main(String[] args) {
        nilaiMhs data = new nilaiMhs();
        data.nim = 12544;
        data.nama = "Fadhil";
        data.nilaiTugas = 80.0;
        data.nilaiUTS = 90.0;
        data.nilaiUAS = 87.0;
        
        System.out.println("NIM     : " + data.nim);
        System.out.println("Nama    : " + data.nama);
        
        data.Nilai( data.nilaiTugas, data.nilaiUTS, data.nilaiUAS);
        data.cetakNilai();
    }
}