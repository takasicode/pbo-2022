/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.modelKasir;

/**
 *
 * @author ASUS
 */
public interface implementasiKasir {
    
    public List<modelKasir> getAll();
    public void simpan(modelKasir mk);
    public void hapus(int no);
    public void edit(modelKasir mk);
    public List<modelKasir> getCariMenu(String menu);
}
