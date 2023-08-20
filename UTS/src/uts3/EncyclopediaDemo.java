/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts3;

/**
 *
 * @author ASUS
 */
public class EncyclopediaDemo {
    public static void main(String[] args){
        Print wadah = new Print();
        Encyclopedia tampung = new Encyclopedia();
        
        wadah.setTitle("Legends Manchecter United");
        wadah.setAuthor("Fadhil");
        tampung.setVolume("100");
        tampung.setEdition("2");
        wadah.setIsbn(202012544);
        
        System.out.println("Title   : "+wadah.getTitle());
        System.out.println("Author  : "+wadah.getAuthor());
        System.out.println("ISBN    : "+wadah.getIsbn());
        System.out.println("Volume  : "+tampung.getVolume());
    }
}
