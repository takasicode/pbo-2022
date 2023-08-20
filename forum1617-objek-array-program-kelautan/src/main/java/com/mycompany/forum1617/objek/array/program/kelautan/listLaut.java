/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum1617.objek.array.program.kelautan;

/**
 *
 * @author ASUS
 */
public class listLaut {
    private String nmList;
    private namaLaut[] objekLaut = new namaLaut[100];
    private int totalLaut = 0;
    
    public listLaut(String nmList) {
        setNmList(nmList);
    }
    
    public void addLaut(namaLaut a) {
        objekLaut[totalLaut] = a;
        totalLaut++;
    }

    public String getNmList() {
        return nmList;
    }

    public void setNmList(String nmList) {
        this.nmList = nmList;
    }

    public namaLaut[] getObjekLaut() {
        return objekLaut;
    }

    public void setObjekLaut(namaLaut[] objekLaut) {
        this.objekLaut = objekLaut;
    }

    public int getTotalLaut() {
        return totalLaut;
    }

    public void setTotalLaut(int totalLaut) {
        this.totalLaut = totalLaut;
    }  
}