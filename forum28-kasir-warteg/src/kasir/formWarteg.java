/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class formWarteg extends javax.swing.JFrame {

    /**
     * Creates new form warted
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public formWarteg() {
        setTitle("KASIR WARTEG PAK DIAN");
        initComponents();
        Menu();
        Total();
        Diskon();
    }
    
    // jika input Menu maka Harga akan terisi otomatis
    private void Menu(){
        tf_Menu.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String menu;
                menu = (String) tf_Menu.getText();
                
                switch(menu){
                    case "Nasi Rames" :
                        tf_Harga.setText(nf.format(3000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Jengkol" :
                        tf_Harga.setText(nf.format(5000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Empal" :
                        tf_Harga.setText(nf.format(7000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Sayur Asem" :
                        tf_Harga.setText(nf.format(11000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Sayur Lodeh" :
                        tf_Harga.setText(nf.format(13000));
                        tf_Qty.grabFocus();
                        break;
                    default:
                        tf_Harga.setText("");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String menu;
                menu = (String) tf_Menu.getText();
                
                switch(menu){
                    case "Nasi Rames" :
                        tf_Harga.setText(nf.format(3000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Jengkol" :
                        tf_Harga.setText(nf.format(3000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Empal" :
                        tf_Harga.setText(nf.format(3000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Sayur Asem" :
                        tf_Harga.setText(nf.format(3000));
                        tf_Qty.grabFocus();
                        break;
                    case "Nasi Sayur Lodeh" :
                        tf_Harga.setText(nf.format(3000));
                        tf_Qty.grabFocus();
                        break;
                    default:
                        tf_Harga.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // harga menu dikali qty maka TextField Total Harga akan terisi otomatis
    private void Total(){
        tf_Qty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try{
                    int hasil = 0;
                    if(tf_Qty.getText().equals("")){
                        hasil = Integer.parseInt(tf_Harga.getText().replace(".", "")) * 0;
                    }else{
                        hasil = Integer.parseInt(tf_Harga.getText().replace(".", "")) *
                                Integer.parseInt(tf_Qty.getText());
                    }
                    tf_TotalHarga.setText(nf.format(hasil));
                } catch (Exception ex){
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try{
                    int hasil = 0;
                    if(tf_Qty.getText().equals("")){
                        hasil = Integer.parseInt(tf_Harga.getText().replace(".", "")) * 0;
                    }else{
                        hasil = Integer.parseInt(tf_Harga.getText().replace(".", "")) *
                                Integer.parseInt(tf_Qty.getText());
                    }
                    tf_TotalHarga.setText(nf.format(hasil));
                } catch (Exception ex){
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private void Diskon(){
        tf_Diskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                // diskon
                int diskon, hasil_diskon;
                diskon = Integer.parseInt(tf_JumlahHargaKecil.getText().replace(".", "")) * Integer.parseInt(tf_Diskon.getText().replace("", "")) / 100;
                hasil_diskon = Integer.parseInt(tf_JumlahHargaKecil.getText().replace(".", "")) - diskon;

                tf_DiskonHasil.setText(nf.format(diskon));
                
                // ppn
                int hasil_ppn = 0;
                if(chkPPN.isSelected()){
                    hasil_ppn = hasil_diskon * 10 / 100;
                    tf_ppn.setText(nf.format(hasil_ppn));
                }else{
                    hasil_ppn = hasil_diskon * 0 / 100;
                    tf_ppn.setText(nf.format(hasil_ppn));
                }

                // bersih
                int totalBersih;
                totalBersih = hasil_ppn + hasil_diskon;
                tf_JumlahHargaBesar.setText("Rp. " + nf.format(totalBersih));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                // diskon
                int diskon, hasil_diskon;
                diskon = Integer.parseInt(tf_JumlahHargaKecil.getText().replace(".", "")) * Integer.parseInt(tf_Diskon.getText().replace("", "")) / 100;
                hasil_diskon = Integer.parseInt(tf_JumlahHargaKecil.getText().replace(".", "")) - diskon;

                tf_DiskonHasil.setText(nf.format(diskon));
                
                // ppn
                int hasil_ppn = 0;
                if(chkPPN.isSelected()){
                    hasil_ppn = hasil_diskon * 10 / 100;
                    tf_ppn.setText(nf.format(hasil_ppn));
                }else{
                    hasil_ppn = hasil_diskon * 0 / 100;
                    tf_ppn.setText(nf.format(hasil_ppn));
                }

                // bersih
                int totalBersih;
                totalBersih = hasil_ppn + hasil_diskon;
                tf_JumlahHargaBesar.setText("Rp. " + nf.format(totalBersih));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_JumlahHargaBesar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_No = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_Menu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_Harga = new javax.swing.JTextField();
        tf_Qty = new javax.swing.JTextField();
        tf_TotalHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_List = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tf_JumlahHargaKecil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_JumlahQty_MenuDibeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_DiskonHasil = new javax.swing.JTextField();
        chkPPN = new javax.swing.JCheckBox();
        tf_ppn = new javax.swing.JTextField();
        tf_Diskon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WARTEG PAK DIAN");

        tf_JumlahHargaBesar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tf_JumlahHargaBesar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("No");

        jLabel3.setText("Menu");

        jLabel4.setText("Harga");

        tf_Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_QtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_No)
                    .addComponent(tf_Menu)
                    .addComponent(tf_Harga, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Menu", "Harga", "Qty", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tbl_List);

        jLabel5.setText("Jumlah Harga");

        jLabel8.setText("Menu yang dibeli");

        jLabel6.setText("Diskon %");

        chkPPN.setText("PPN 10%");
        chkPPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPPNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(tf_JumlahHargaBesar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chkPPN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_JumlahHargaKecil, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_JumlahQty_MenuDibeli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_DiskonHasil)
                            .addComponent(tf_ppn)
                            .addComponent(tf_Diskon))
                        .addGap(412, 412, 412)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_JumlahHargaBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_JumlahQty_MenuDibeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_JumlahHargaKecil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_Diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tf_DiskonHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPPN)
                    .addComponent(tf_ppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_QtyActionPerformed
        // TODO add your handling code here:
        if(tf_Qty.getText().equals("")){
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel) tbl_List.getModel();
            
            Object obj [] = new Object[5];
            obj [1] = tf_Menu.getText();
            obj [2] = tf_Harga.getText();
            obj [3] = tf_Qty.getText();
            obj [4] = tf_TotalHarga.getText();
            
            model.addRow(obj);
            
            int baris = model.getRowCount();
            for(int a = 0; a < baris; a++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            
            tbl_List.setRowHeight(30);
            
            tf_JumlahQty_MenuDibeli.setText(String.valueOf(baris));
            
            // variabel TextField Jumlah Harga
            Jumlah_Total_Harga();
            
            // variabel hapus saat qty dienter
            bersih();
        }
    }//GEN-LAST:event_tf_QtyActionPerformed

    private void chkPPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPPNActionPerformed
        // TODO add your handling code here:
        Jumlah_Total_Harga();
    }//GEN-LAST:event_chkPPNActionPerformed

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
            java.util.logging.Logger.getLogger(formWarteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formWarteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formWarteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formWarteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formWarteg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPPN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_List;
    private javax.swing.JTextField tf_Diskon;
    private javax.swing.JTextField tf_DiskonHasil;
    private javax.swing.JTextField tf_Harga;
    private javax.swing.JTextField tf_JumlahHargaBesar;
    private javax.swing.JTextField tf_JumlahHargaKecil;
    private javax.swing.JTextField tf_JumlahQty_MenuDibeli;
    private javax.swing.JTextField tf_Menu;
    private javax.swing.JTextField tf_No;
    private javax.swing.JTextField tf_Qty;
    private javax.swing.JTextField tf_TotalHarga;
    private javax.swing.JTextField tf_ppn;
    // End of variables declaration//GEN-END:variables

    // menjumlah harga secara otomatis pada TextField Jumlah Harga
    private void Jumlah_Total_Harga() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sub_total = 0;
        for(int a = 0; a < tbl_List.getRowCount(); a++){
            sub_total += Integer.parseInt((String)
                    tbl_List.getValueAt(a, 4).toString().replace(".", ""));
        }
        
        // total bersih Jumlah Harga Kecil
        tf_JumlahHargaKecil.setText(nf.format(sub_total));
        
        // total bersih Jumlah Harga Besar
//        tf_JumlahHargaBesar.setText("Rp. " + nf.format(sub_total));
        
        // diskon
        int diskon, hasil_diskon;
        diskon = Integer.parseInt(tf_JumlahHargaKecil.getText().replace(".", "")) * Integer.parseInt(tf_Diskon.getText().replace("", "0")) / 100;
        hasil_diskon = Integer.parseInt(tf_JumlahHargaKecil.getText().replace(".", "")) - diskon;
        
        // ppn
        int hasil_ppn = 0;
        if(chkPPN.isSelected()){
            hasil_ppn = hasil_diskon * 10 / 100;
            tf_ppn.setText(nf.format(hasil_ppn));
        }else{
            hasil_ppn = hasil_diskon * 0 / 100;
            tf_ppn.setText(nf.format(hasil_ppn));
        }
        
        // bersih
        int totalBersih;
        totalBersih = hasil_ppn + hasil_diskon;
        tf_JumlahHargaBesar.setText("Rp. " + nf.format(totalBersih));
    }

    // jika qty dienter maka TextField Menu, Harga, Qty, Total Harga akan terhapus
    private void bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tf_Menu.setText("");
        tf_Menu.grabFocus();
        tf_Qty.setText("");
        tf_TotalHarga.setText("");
    }
}
