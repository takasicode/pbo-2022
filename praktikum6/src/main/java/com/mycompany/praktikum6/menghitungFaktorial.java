/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6;

/**
 *
 * @author ASUS
 */
public class menghitungFaktorial {
    protected menghitungFaktorial(int n){
        int i, u;
        int faktorial = 1;
        System.out.println("Bilangan : " + n);
        for(i=2; i<=n; i++){
            u = faktorial;
            faktorial = faktorial * i;
            System.out.println(u + " x " + i + " = " + faktorial);
        }
    }
    
    public static void main(String[] args){
        menghitungFaktorial pbo = new menghitungFaktorial(5);               
    }       
}
