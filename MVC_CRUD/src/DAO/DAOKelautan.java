/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModelKelautan;
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
public class DAOKelautan implements ImplementKelautan{

    Connection connection;
    final String select = "SELECT * FROM kelautan";
    final String insert = "INSERT INTO kelautan (nama, luas) VALUE (?, ?)";
    final String delete = "DELETE FROM kelautan WHERE no=?";
    final String update = "UPDATE kelautan set nama=?, luas=? WHERE no=?";
    final String cariNama = "SELECT * FROM kelautan WHERE nama like ?";

    public DAOKelautan() {
        connection = KoneksiDB.connection();
    }
    
    @Override
    public List<ModelKelautan> getAll() {
        List<ModelKelautan> lmk = null;
        
        try {
            lmk = new ArrayList<ModelKelautan>();
            Statement st = connection.createStatement();
   
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModelKelautan mk = new ModelKelautan();
                mk.setNo(rs.getInt("no"));
                mk.setNama(rs.getString("nama"));
                mk.setLuas(rs.getString("luas"));
                lmk.add(mk);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmk;
    }
   
    @Override
    public void insert(ModelKelautan mk) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, mk.getNama());
            statement.setString(2, mk.getLuas());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                mk.setNo(rs.getInt(1));
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
    public void delete(int no) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(delete);
        
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
    public void update(ModelKelautan mk) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, mk.getNama());
            statement.setString(2, mk.getLuas());
            statement.setInt(3, mk.getNo());
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
    public List<ModelKelautan> getCariNama(String nama) {
        List<ModelKelautan> lmk = null;
        try{
            lmk = new ArrayList<ModelKelautan>();
            
            PreparedStatement st = connection.prepareStatement(cariNama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ModelKelautan mk = new ModelKelautan();
                mk.setNo(rs.getInt("no"));
                mk.setNama(rs.getString("nama"));
                mk.setLuas(rs.getString("luas"));
                lmk.add(mk);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lmk;
    }
}
