/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handphone;

/**
 *
 * @author ASUS
 */
public class Handphone {
    private String warna;
    private int internal;

    protected String getWarna() {
        return warna;
    }
    protected void setWarna(String warna) {
        this.warna = warna;
    }

    protected int getInternal() {
        return internal;
    }
    protected void setInternal(int internal) {
        this.internal = internal;
    }
    
    protected void menyalakan(){
        System.out.println("Handphone dinyalakan");
    }
    protected void mematikan(){
        System.out.println("Handphone dimatikan");
    }
    protected void mengirimPesan(){
        System.out.println("Mengirim pesan ");
    }
    
    public static void main(String[] args){
        Samsung samsung = new Samsung();
        Realme realme = new Realme();
        
        // Overriding
        samsung.mengirimPesan();
        
        // Overloading
        realme.mengirimPesan();
        realme.mengirimPesan("Hitam");
        realme.mengirimPesan("Hitam", 128);
    }
}
