/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6;

/**
 *
 * @author ASUS
 */
public class Latihan2 {
    protected Latihan2(int n) {
        int i;
        int limit = 0;
        System.out.println("Bilangan : " + n);
        for (i = 1; i <= n; i++) {
            System.out.print(i + "  ");
            limit++;
            if (limit == 5) {
                System.out.println();
                limit = 0;
            }
        }
        System.out.println("==================");
        System.out.println("Dipecahkan : 3");
        for (i = 1; i <= n; i++) {
            System.out.print(i + "  ");
            limit++;
            if (limit == 3) {
                System.out.println();
                limit = 0;
            }
        }
    }

    public static void main(String[] args) {
        Latihan2 pbo = new Latihan2(20);
    }
}
