/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Televisi;

/**
 *
 * @author ASUS
 */
public class Televisi {
    private String nmChannel;
    private int ukuran;

    protected String getNmChannel() {
        return nmChannel;
    }
    protected void setNmChannel(String nmChannel) {
        this.nmChannel = nmChannel;
    }

    protected int getUkuran() {
        return ukuran;
    }
    protected void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
        protected void menyalakan(){
        System.out.println("televisi dinyalakan");
    }
    protected void mematikan(){
        System.out.println("televisi dimatikan");
    }
    protected void menontonFilm(){
        System.out.println("sedang menonton film ");
    }
    
    public static void main(String[] args){
        Panasonic panasonic = new Panasonic();
        Polytron polytron = new Polytron();
        
        // Overriding
        panasonic.menontonFilm();
        
        // Overloading
        polytron.menontonFilm();
        polytron.menontonFilm("Trans TV");
        polytron.menontonFilm("Trans TV", 32);
    }
}
