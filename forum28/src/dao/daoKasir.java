/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import koneksi.koneksi;
import model.modelKasir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class daoKasir implements implementasiKasir{
    
    Connection connection;
    final String select = "SELECT * FROM data_menu";
    final String simpan = "INSERT INTO data_menu (menu, harga, stok) VALUE (?, ?, ?)";
    final String hapus = "DELETE FROM data_menu WHERE id_menu=?";
    final String edit = "UPDATE data_menu set menu=?, harga=? WHERE stok=?";
    final String cariMenu = "SELECT * FROM data_menu WHERE menu like ?";

    public daoKasir() {
        connection = koneksi.connection();
    }
    
    @Override
    public List<modelKasir> getAll() {
        List<modelKasir> imk = null;
        
        try {
            imk = new ArrayList<modelKasir>();
            Statement st = connection.createStatement();
   
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                modelKasir mk = new modelKasir();
                mk.setIdMenu(rs.getString("id_menu"));
                mk.setMenu(rs.getString("menu"));
                mk.setHarga(rs.getInt("harga"));
                mk.setStok(rs.getInt("stok"));
                imk.add(mk);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return imk;
    }
   
    @Override
    public void simpan(modelKasir mk) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(simpan);
            statement.setString(1, mk.getMenu());
            statement.setInt(2, mk.getHarga());
            statement.setInt(3, mk.getStok());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                mk.setIdMenu(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void hapus(int no) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(hapus);
        
            statement.setInt(1, no);
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void edit(modelKasir mk) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(edit);
            statement.setString(1, mk.getMenu());
            statement.setInt(2, mk.getHarga());
            statement.setInt(3, mk.getStok());
            statement.setString(5, mk.getIdMenu());
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<modelKasir> getCariMenu(String menu) {
        List<modelKasir> lmk = null;
        try{
            lmk = new ArrayList<modelKasir>();
            
            PreparedStatement st = connection.prepareStatement(cariMenu);
            st.setString(1, "%" + menu + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                modelKasir mk = new modelKasir();
                mk.setIdMenu(rs.getString("id_menu"));
                mk.setMenu(rs.getString("menu"));
                mk.setHarga(rs.getInt("harga"));
                mk.setStok(rs.getInt("stok"));
                lmk.add(mk);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lmk;
    }
}
