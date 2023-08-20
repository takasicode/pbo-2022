/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author ASUS
 */
class Overloading1 {
    public void tambah() {
    int a = 8, b = 10;
        System.out.println("Hasil Pertambahann dari metod tambah1 ke-1 = " + (a + b));
    }
    
    public void tambah1(int x, int y) {
        System.out.println("Hasil Pertambahann dari metod tambah1 ke-2 = " + (x + y));
    }
    
    public static void main(String[] args) {
        Overloading1 cetak;
        cetak = new Overloading1();
        cetak.tambah();
        cetak.tambah1(8, 5);
    }

}