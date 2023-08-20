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
public class Constructor2 {
    String name;
    int kelas;
    
    public Constructor2(String name, int kls){
        this.name = name;
        this.kelas = kls;
    }
}
 
class mataKuliah {
    public static void main(String[] args){
        Constructor2 mk = new Constructor2("PBO", 4409);
        System.out.println("Mata Kuliah : " + mk.name + "\nKelas : " + mk.kelas);
    }
}