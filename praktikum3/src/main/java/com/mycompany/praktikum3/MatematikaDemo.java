/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author ASUS
 */
class matematika {
    int x;
    int y;
    int hasil;

    void pertambahan (int x, int y) {
        hasil = x + y;
        System.out.println("Pertambahan : " + x + " + " + y + " = " + hasil);
    }
    void pengurangan (int x, int y){
        hasil = x - y;
        System.out.println("Pengurangan : " + x + " - " + y + "  = " + hasil);
    }
    void perkalian (int x, int y) {
        hasil = x * y;
        System.out.println("Perkalian   : " + x + " x " + y + " = " + hasil);
    }
    void pembagian (int x, int y) {
        hasil = x / y;
        System.out.println("Pembagian   : " + x + " / " + y + "  = " + hasil);
    }
}
public class MatematikaDemo {
    public static void main(String[] args) {
        matematika cetak = new matematika();
        cetak.x = 0;
        cetak.y = 0;
        cetak.pertambahan (20, 20);
        cetak.pengurangan (10, 5);
        cetak.perkalian (10, 20);
        cetak.pembagian (20, 2);
    }
}