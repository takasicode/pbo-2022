/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author ASUS
 */
class suhu {
    double celcius;
    double kelvin, fahrenheit, rankine, delisle,newton, reaumur, romer;
    
    void konversi(double celcius) {
        kelvin      = celcius + 273.15;
        fahrenheit  = celcius * 1.8 + 32;
        rankine     = celcius * 1.8 + 491.67;
        delisle     = (100 - celcius) * 1.5;
        newton      = celcius * 33 / 100;
        reaumur     = celcius * 0.8;
        romer       = celcius * 21 / 40 + 7.5;
    }
    void hasil(){
        System.out.println("Berikut adalah hasil konversi suhu 27°C ke skala lain:");
        System.out.println("• Kelvin     : " + kelvin + "°K");
        System.out.println("• Fahrenheit : " + fahrenheit + "°F");
        System.out.println("• Rankine    : " + rankine + "°Ra");
        System.out.println("• Delisle    : " + delisle + "°De");
        System.out.println("• Newton`    : " + newton + "°N");
        System.out.println("• Reaumur    : " + reaumur + "°Re");
        System.out.println("• Romer      : " + romer + "°Ro");
    }
}
public class konversiSuhu{
    public static void main (String[] args){
        suhu cetak = new suhu();
        
        cetak.konversi(27);
        cetak.hasil();
    }
}