/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Model.ModelKelautan;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ImplementKelautan {
    
    public List<ModelKelautan> getAll();
    public void insert(ModelKelautan mk);
    public void delete(int no);
    public void update(ModelKelautan mk);
    public List<ModelKelautan> getCariNama(String nama);  
}
