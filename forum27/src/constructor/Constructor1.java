/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author ASUS
 */
public class Constructor1 {
    private String nama;
    private String nim;
    
    public Constructor1(){
        System.out.println("Ini adalah Constructor");
    }
}

class Mhs{
    public static void main(String[] args){
        Constructor1 mhs = new Constructor1();
    }
}