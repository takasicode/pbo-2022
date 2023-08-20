/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.daoKasir;
import dao.implementasiKasir;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelKasir;
import model.modelTabelKasir;
import view.formKasir;

/**
 *
 * @author ASUS
 */
public class controllerKasir {
    formKasir frame;
    implementasiKasir implKasir;
    List<modelKasir> lmk;

    public controllerKasir(formKasir frame) {
        this.frame = frame;
        implKasir = new daoKasir();
        lmk = implKasir.getAll();
    }
    
    public void isiTable(){
        lmk = implKasir.getAll();
        modelTabelKasir mtk = new modelTabelKasir(lmk);
        frame.getTbl_dataMenu().setModel(mtk);
    }
    
    public void batal(){
        frame.getTf_idMenu().setText("");
        frame.getTf_menu().setText("");
        frame.getTf_harga().setText("");
        frame.getTf_stok().setText("");
    }

    public void isiField(int row){
        frame.getTf_idMenu().setText(String.valueOf(lmk.get(row).getIdMenu()));
        frame.getTf_menu().setText(String.valueOf(lmk.get(row).getMenu()));
        frame.getTf_harga().setText(String.valueOf(lmk.get(row).getHarga()));
        frame.getTf_stok().setText(String.valueOf(lmk.get(row).getStok()));
    }
    
    public void simpan(){
        if(!frame.getTf_menu().getText().trim().isEmpty()& !frame.getTf_menu().getText().trim().isEmpty()){
            modelKasir mk = new modelKasir();
            
            mk.setMenu(String.valueOf(frame.getTf_menu().getText()));
            mk.setHarga(Integer.valueOf(frame.getTf_harga().getText()));
            mk.setStok(Integer.valueOf(frame.getTf_stok().getText()));
            
            implKasir.simpan(mk);
            JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di simpan");
    
        }
    }
    
    public void hapus(){
        if(!frame.getTf_idMenu().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_idMenu().getText());
            
            implKasir.hapus(no);
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di hapus");
    
        }
    }
    
    public void edit(){
        if(!frame.getTf_idMenu().getText().trim().isEmpty()){
           modelKasir mk = new modelKasir();
           
           mk.setIdMenu(frame.getTf_idMenu().getText());
           mk.setMenu(frame.getTf_menu().getText());
           mk.setHarga(Integer.valueOf(frame.getTf_harga().getText()));
           mk.setStok(Integer.valueOf(frame.getTf_stok().getText()));

           implKasir.edit(mk);
           JOptionPane.showMessageDialog(null, "Data berhasil di edit");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal di edit");
        }
    }
    
    public void isiTabelCariMenu(){
        lmk = implKasir.getCariMenu(frame.getTf_cariMenu().getText());
        
        modelTabelKasir mtk = new modelTabelKasir(lmk);
        frame.getTbl_dataMenu().setModel(mtk);
    }
    
    public void cariMenu(){
        if(!frame.getTf_cariMenu().getText().trim().isEmpty()){
            implKasir.getCariMenu(frame.getTf_cariMenu().getText());
            isiTabelCariMenu();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan masukkan menu");
        }
    }
}
