/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ASUS
 */
public class Array1 {
    public static void main(String args[]) {
        int[] array = new int[3];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
  
        for(int i=0; i<array.length; i++) {
            System.out.println(i+1 + ". Nilai pada index "+i +" adalah "+ array[i]);
        }
    }
}