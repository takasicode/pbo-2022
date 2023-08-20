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
public class ArrayList3 {
    public static void main (String[] args){
        ArrayList<String> Handphone = new ArrayList<String>();
        
        Handphone.add("Realme");
        Handphone.add("iPhone");
        Handphone.add("Samsung");
        Handphone.add("Huawei");
        
        Handphone.remove(1);
        
        System.out.println(Handphone);
    }
}