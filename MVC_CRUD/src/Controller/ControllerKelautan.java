/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOKelautan;
import DAO.ImplementKelautan;
import Model.ModelKelautan;
import Model.ModelTblKelautan;
import View.FormKelautan;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllerKelautan {
    FormKelautan frame;
    ImplementKelautan implKelautan;
    List<ModelKelautan> lmk;

    public ControllerKelautan(FormKelautan frame) {
        this.frame = frame;
        implKelautan = new DAOKelautan();
        lmk = implKelautan.getAll();
    }
    
    public void isiTable(){
        lmk = implKelautan.getAll();
        ModelTblKelautan mtk = new ModelTblKelautan(lmk);
        frame.getTabel_hasil().setModel(mtk);
    }
    
    public void reset(){
        frame.getTf_no().setText("");
        frame.getTf_namaLaut().setText("");
        frame.getTf_luasLaut().setText("");
    }

    public void isiField(int row){
        frame.getTf_no().setText(String.valueOf(lmk.get(row).getNo()));
        frame.getTf_namaLaut().setText(String.valueOf(lmk.get(row).getNama()));
        frame.getTf_luasLaut().setText(String.valueOf(lmk.get(row).getLuas()));
    }
    
    public void insert(){
        if(!frame.getTf_namaLaut().getText().trim().isEmpty() & !frame.getTf_namaLaut().getText().trim().isEmpty()){
            ModelKelautan mk = new ModelKelautan();
            
            mk.setNama(frame.getTf_namaLaut().getText());
            mk.setLuas(frame.getTf_luasLaut().getText());
            
            implKelautan.insert(mk);
            JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di simpan");
    
        }
    }
    
    public void delete(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_no().getText());
            
            implKelautan.delete(no);
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di hapus");
    
        }
    }
    
    public void update(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
           ModelKelautan mk = new ModelKelautan();
           
           mk.setNo(Integer.valueOf(frame.getTf_no().getText()));
           mk.setNama(frame.getTf_namaLaut().getText());
           mk.setLuas(frame.getTf_luasLaut().getText());

           implKelautan.update(mk);
           JOptionPane.showMessageDialog(null, "Data berhasil di update");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di update");
        }
    }
    
    public void isiTableCariNama(){
        lmk = implKelautan.getCariNama(frame.getTf_cari().getText());
        
        ModelTblKelautan mtk = new ModelTblKelautan(lmk);
        frame.getTabel_hasil().setModel(mtk);
    }
    
    public void cariNama(){
        if(!frame.getTf_cari().getText().trim().isEmpty()){
            implKelautan.getCariNama(frame.getTf_cari().getText());
            isiTableCariNama();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan masukkan nama");
        }
    }
}
