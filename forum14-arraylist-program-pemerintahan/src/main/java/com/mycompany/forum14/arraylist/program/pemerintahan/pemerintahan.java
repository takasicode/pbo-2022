/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum14.arraylist.program.pemerintahan;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class pemerintahan {
    public static void main(String[] args){
        ArrayList nama = new ArrayList();
        
        nama.add("Joko Widodo & Muhammad Jusuf Kalla");
        nama.add("Prabowo Subianto & Hatta Rajasa");
        
        System.out.println("=================================================");
        System.out.println(nama.size() + " calon pilpres 2014, yaitu:");
        for(int calon = 0; calon < nama.size(); calon++){
            System.out.println("> " + nama.get(calon));
        }
        
        nama.remove("Prabowo Subianto & Hatta Rajasa");
        
        System.out.println("=================================================");
        System.out.println(nama.size() + " pemenang pilpres 2014, yaitu:");
        for(int resmi = 0; resmi < nama.size(); resmi++){
            System.out.println("> " + nama.get(resmi));
        }
        System.out.println("=================================================");
    }
}