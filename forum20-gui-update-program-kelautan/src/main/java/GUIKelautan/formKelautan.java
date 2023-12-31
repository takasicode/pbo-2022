/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIKelautan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

/**
 *
 * @author ASUS
 */
public class formKelautan extends javax.swing.JFrame {

    /**
     * Creates new form formKelautan
     */
    public formKelautan() {
        setTitle("Delete");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_judul = new javax.swing.JLabel();
        label_namaLaut = new javax.swing.JLabel();
        tf_namaLaut = new javax.swing.JTextField();
        tf_luasLaut = new javax.swing.JTextField();
        label_luasLaut = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_hasil = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_judul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_judul.setText("KELAUTAN");
        label_judul.setFocusable(false);

        label_namaLaut.setText("Nama Laut");

        tf_namaLaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaLautActionPerformed(evt);
            }
        });

        tf_luasLaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_luasLautActionPerformed(evt);
            }
        });

        label_luasLaut.setText("Luas Laut");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        table_hasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nama", "Luas"
            }
        ));
        jScrollPane1.setViewportView(table_hasil);

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(label_judul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_luasLaut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_namaLaut, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_namaLaut, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(tf_luasLaut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_judul)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_namaLaut)
                    .addComponent(tf_namaLaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_luasLaut)
                    .addComponent(tf_luasLaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_namaLautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaLautActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaLautActionPerformed

    private void tf_luasLautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_luasLautActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_luasLautActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        
        // Mengatur Variabel
        String namaLaut = tf_namaLaut.getText().trim();
        String luasLaut = tf_luasLaut.getText().trim();
        
        // Mengambil data
        DefaultTableModel tableHasil = (DefaultTableModel) table_hasil.getModel();
        
        // Mengirim data ke tabel
        List dataKelautan = new ArrayList<>();
        
        table_hasil.setAutoCreateColumnsFromModel(true);
        
        dataKelautan.add(namaLaut);
        dataKelautan.add(luasLaut);
        
        tableHasil.addRow(dataKelautan.toArray());
        
        // Menghapus Text Field
        tf_namaLaut.setText("");
        tf_luasLaut.setText("");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        
        // Mengambil data
        DefaultTableModel tableHasil = (DefaultTableModel) table_hasil.getModel();
        
        // menghapus data dari tabel - versi 1
        // tableHasil.removeRow(table_hasil.getSelectedRow());
        
        // menghapus data dari tabel - versi 2
        if(table_hasil.getSelectedRowCount() == 1){
            // menghapus data pada tabel
            tableHasil.removeRow(table_hasil.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Data berhasil terhapus");
        }else{
            if(table_hasil.getRowCount() == 0){
                // jika tabel kosong
                JOptionPane.showMessageDialog(this, "Tabel masih kosong");
            }else{
                // jika data pada tabel yang ingin dihapus belum di klik
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus");
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
        // Mengambil data
        DefaultTableModel tableHasil = (DefaultTableModel) table_hasil.getModel();
        
        if(table_hasil.getSelectedRowCount() == 1){
            // ambil data di text field
            String namaLaut = tf_namaLaut.getText();
            String luasLaut = tf_luasLaut.getText();
            
            // ganti data
            tableHasil.setValueAt(namaLaut, table_hasil.getSelectedRow(), 0);
            tableHasil.setValueAt(luasLaut, table_hasil.getSelectedRow(), 1);
            
            // pesan berhasil
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
        }else{
            if(table_hasil.getRowCount() == 0){
                // jika tabel kosong
                JOptionPane.showMessageDialog(this, "Tabel masih kosong");
            }else{
                // jika data pada tabel yang ingin diupdate belum di klik
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin diupdate");
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formKelautan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKelautan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKelautan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKelautan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKelautan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_judul;
    private javax.swing.JLabel label_luasLaut;
    private javax.swing.JLabel label_namaLaut;
    private javax.swing.JTable table_hasil;
    private javax.swing.JTextField tf_luasLaut;
    private javax.swing.JTextField tf_namaLaut;
    // End of variables declaration//GEN-END:variables
}
