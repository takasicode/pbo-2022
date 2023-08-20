/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class modelTabelKasir extends AbstractTableModel {
    
    List<modelKasir> lmk;
    
    public modelTabelKasir(java.util.List<modelKasir> lmk) {
        this.lmk = lmk;
    }
    
    @Override
    public int getRowCount() {
        return lmk.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmk.get(row).getIdMenu();
            case 1:
                return lmk.get(row).getMenu();
            case 2:
                return lmk.get(row).getHarga();
            case 3:
                return lmk.get(row).getStok();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID Menu";
            case 1:
                return "Menu"; 
            case 2:
                return "Harga";
            case 3:
                return "Stok";
            default:
                return null;
        }
    }
}
