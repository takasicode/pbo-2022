/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satu;

/**
 *
 * @author ASUS
 */

abstract class Animal {
    public abstract void checkup();
    public abstract void breath();
}

class Dog extends Animal{

    @Override
    public void checkup() {
        System.out.println("Dog checkup");
    }

    @Override
    public void breath() {
        System.out.println("Dog breath");
    }
}

class Cat extends Animal implements LivingThing{

    @Override
    public void checkup() {
        System.out.println("Cat checkup");
    }

    @Override
    public void breath() {
        System.out.println("Cat breath");
    }

    public void walk() {
        System.out.println("Cat walking");
    }

    public void eat() {
        System.out.println("Cat eat");
    }
}

class Bird extends Animal{

    @Override
    public void checkup() {
        System.out.println("Bird checkup");
    }

    @Override
    public void breath() {
        System.out.println("Bird breath");
    } 
}