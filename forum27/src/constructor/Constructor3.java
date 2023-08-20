/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author ASUS
 */
public class Constructor3 {
    String warna, merk;
    
    public Constructor3(String paramWarna, String paramMerk) {
        warna = paramWarna;
        merk  = paramMerk;
    }
    
    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }

    public static void main(String[] args) {
        Constructor3 mobilSaya = new Constructor3("Putih", "Honda");

        mobilSaya.maju();
        mobilSaya.mundur();
    }
}