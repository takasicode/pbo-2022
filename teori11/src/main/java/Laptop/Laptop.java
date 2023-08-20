/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laptop;

/**
 *
 * @author ASUS
 */
public class Laptop {
    private String cpu;
    private int ram;

    protected String getCpu() {
        return cpu;
    }
    protected void setCpu(String cpu) {
        this.cpu = cpu;
    }

    protected int getRam() {
        return ram;
    }
    protected void setRam(int ram) {
        this.ram = ram;
    }
    
    protected void menyalakan(){
        System.out.println("laptop dinyalakan");
    }
    protected void mematikan(){
        System.out.println("laptop dimatikan");
    }
    protected void menontonFilm(){
        System.out.println("sedang menonton film ");
    }
    
    public static void main(String[] args){
        Lenovo lenovo = new Lenovo();
        Asus asus = new Asus();
        
        // Overriding
        lenovo.menontonFilm();
        
        // Overloading
        asus.menontonFilm();
        asus.menontonFilm("AMD Ryzen 5");
        asus.menontonFilm("AMD Ryzen 5", 8);
    }
}
