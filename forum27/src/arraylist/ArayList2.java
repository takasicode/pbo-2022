/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class ArayList2 {
    public static void main (String[] args){
        ArrayList<String> mhs = new ArrayList<String>();
        
        mhs.add("Fadhil");
        mhs.add("Anton");
        mhs.add("Cindy");
        mhs.add("Sinta");
        
        Collections.sort(mhs);
        
        for (String i : mhs) {
          System.out.println(i);
        }
    }
}