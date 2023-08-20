/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class ModelTblKelautan extends AbstractTableModel {
    
    List<ModelKelautan> lmk;

    public ModelTblKelautan(List<ModelKelautan> lmk) {
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
                return lmk.get(row).getNo();
            case 1:
                return lmk.get(row).getNama();
            case 2:
                return lmk.get(row).getLuas();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column){
           case 0:
                return "No";
           case 1:
                return "Nama"; 
           case 2:
                return "Luas";
           default:
                return null;
        }
    }   
}
