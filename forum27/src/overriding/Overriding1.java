/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ASUS
 */
public class Overriding1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

        mobil.info();
        motor.info();
    }
}

class Mobil {
    public void info() {
        System.out.println("Ini adalah Mobil");
    }
}

class Motor extends Mobil {
    public void info() {
        System.out.println("Ini adalah Motor");
    }
}