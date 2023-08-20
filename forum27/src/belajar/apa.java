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
class Komputer {
    String cekInfo() { 
        return "Ini berasal dari class Komputer"; 
    }
}

class Laptop extends Komputer {
    String cekInfo() { 
        return "Ini berasal dari class Laptop"; 
    }
}

class BelajarJava {
    public static void main(String args[]){

    Laptop laptopAndi = new Laptop();
    System.out.println(laptopAndi.cekInfo());

    }
}