/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> laut = new ArrayList<>();
        
        laut.add("Natuna");
        laut.add("Arafura");
        laut.add("Flores");

        for(int i = 0; i < laut.size(); i++){
            System.out.println("\nArray ke " + i);
            System.out.println("Laut : " + laut.get(i));
        }
    }
}