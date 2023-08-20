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

public class Human extends Animal implements LivingThing{

    @Override
    public void walk() {
        System.out.println("Human walking");
    }

    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void checkup() {
        System.out.println("Human checkup");
    }

    @Override
    public void breath() {
        System.out.println("Human breathing.");
    }
    
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();
        
        human.walk();
        human.eat();
        human.checkup();
        human.breath();
        
        cat.checkup();
        cat.breath();
        cat.walk();
        cat.eat();
        
        bird.checkup();
        bird.breath();
        
        dog.checkup();
        dog.breath();
    }
}