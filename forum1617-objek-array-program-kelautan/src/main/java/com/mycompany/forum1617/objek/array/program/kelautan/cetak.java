/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum1617.objek.array.program.kelautan;

/**
 *
 * @author ASUS
 */
public class cetak {
    public static void main(String[] args) {
        listLaut fadhil = new listLaut("Fadhil.");
        fadhil.addLaut(new namaLaut("Natuna"));
        fadhil.addLaut(new namaLaut("Arafura"));

        System.out.println("Total "+fadhil.getTotalLaut()+" Laut yang dilewati oleh "+fadhil.getNmList());
        
        listLaut fahmi = new listLaut("Fahmi");
        fahmi.addLaut(new namaLaut("Natuna"));
        fahmi.addLaut(new namaLaut("Arafura"));
        fahmi.addLaut(new namaLaut("Jawa"));
        
        System.out.println("Sedangkan "+fahmi.getNmList()+" melewati "+fahmi.getTotalLaut()+" Laut.");
    } 
}