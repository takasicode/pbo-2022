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
class Induk{
    public void panggilAku(){
        System.out.println("Hallo, ini induk yang dipanggil");
    }
}

class opo{
    //method sama dengan method induk atau override
    public void panggilAku(){
        System.out.println("Hallo, ini anak yang dipanggil");
    }
}

class DemoOverride{
    public static void main(String args[]){
        Induk a= new Induk();
        a.panggilAku();
    }
 }