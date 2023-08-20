/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum15.arraylist.program.kelautan;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class kalautan {
    public static void main(String[] args){
        ArrayList<String> laut = new ArrayList<>();
        ArrayList<Integer> luas = new ArrayList<>();
        
        laut.add("Natuna");
        laut.add("Arafura");
        laut.add("Flores");
        
        luas.add(264198);
        luas.add(650000);
        luas.add(240000);
        
        System.out.println("=================================================");
        System.out.println(laut.size() + " Jenis Laut di Indonesia, yaitu:");
        System.out.println("=================================================");
        for(int i = 0; i < laut.size(); i++){
            System.out.println("\nArray ke - " + i);
            System.out.println("Laut : " + laut.get(i));
            System.out.println("Luas : " + luas.get(i));
        }
        
        laut.set(1, "Jawa");
        luas.set(1, 320000);
        
        laut.remove(2);
        luas.remove(2);
        
        System.out.println("\n=================================================");
        for(int i = 0; i < laut.size(); i++){
            System.out.println("\nArray ke - " + i);
            System.out.println("Laut : " + laut.get(i));
            System.out.println("Luas : " + luas.get(i));
        }
        System.out.println("\n=================================================");
    }
}