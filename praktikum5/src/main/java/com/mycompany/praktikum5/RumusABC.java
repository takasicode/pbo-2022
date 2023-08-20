/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author ASUS
 */
class setRumus{
    String x1, x2;
    int a, b, c;
    double determinan;
    
    public setRumus(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA(int a){
        return this.a;
    }
    public int getB(int b){
        return this.b;
    }
    public int getC(int c){
        return this.c;
    }
    
    public double getDeterminan(double determinan){
        return this.determinan = (this.b * this.b) - (4 * this.a * this.c);
    }
    
    public String getX1(String x1){
        double temp = this.getDeterminan(this.determinan);
        
        if(temp > 0){
            this.x1 = "(-" + this.b +" + V" + this.determinan +") /2" + this.a;
        }
        else if(temp == 0){
            this.x1 = "(-" + this.b +") / 2" + this.a;
        }
        else if(temp < 0){
            this.x1 = "(-" + this.b +") + (V-(" + this.determinan +"))i) / 2" + this.a;
        }
        return this.x1;
    }
    public String getX2(String x2){
        double temp = this.getDeterminan(this.determinan);
        
        if(temp > 0){
            this.x2 = "(-" + this.b +" - V" + this.determinan +") /2" + this.a;
        }
        else if(temp == 0){
            this.x2 = "(-" + this.b +") / 2" + this.a;
        }
        else if(temp < 0){
            this.x2 = "(-" + this.b +") - (V-(" + this.determinan +"))i) / 2" + this.a;
        }
        return this.x2;
    }
    
    void cetakPersamaan(){
        System.out.println("====================================================");
        System.out.println("A : " + this.a);
        System.out.println("B : " + this.b);
        System.out.println("C : " + this.c);
        System.out.println("====================================================");
        System.out.println("Persamaan Kuadrat : " + this.a + "x² + " + this.b + "x + " + this.c);
        System.out.println("Determinan        : " + this.getDeterminan(this.determinan));
        System.out.println("X1                : " + this.getX1(this.x1));
        System.out.println("X2                : " + this.getX2(this.x2));
        System.out.println("===================================================="); 
    }
}

public class RumusABC{
    public static void main(String[] args){
        setRumus rumus = new setRumus(3, 6, 9);
        rumus.cetakPersamaan();
    } 
}
