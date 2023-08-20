/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ASUS
 */
public class Overloading1 {
    public static void main(String[] args) {
        Motor motor = new Motor();
        
        motor.run();
        motor.run(120);
        motor.run("kencang");
    }
}

class Motor {
    public void run() {
        System.out.println("Motor melaju");
    }
    public void run(int speed) {
        System.out.println("Motor melaju dengan kecepatan " + speed + " km/jam");
    }

    public void run (String speed) {
        System.out.println("Motor melaju " + speed);
    }
}