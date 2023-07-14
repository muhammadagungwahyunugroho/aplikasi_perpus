/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.Characters;
import com.manurul.lib.InputBorder;
import com.manurul.lib.RoundedPanel;
import com.manurul.model.RakModel;
import static com.manurul.view.Dashboard.SEARCH_RAK;
import static com.manurul.view.Dashboard.TAMPILKAN_RAK;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author caesarhome
 */
public class RakDATABUKU extends javax.swing.JFrame {

    /**
     * Creates new form RakDATABUKU
     */
    String title = "Edit";
    String Action;
    
    // STATE VALUE INPUT
    String kode;
    String nama;
    String deskripsi;
    
    ImageIcon successIcon;
    
    RakModel RM = new RakModel();
    
    public RakDATABUKU(String Action, String Kode) {
        initComponents();
        
        // SET STATE
        this.Action = Action;
        
        // SET SIZE
        this.setSize(1024, 345);
        
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET DISABLE RESIZESABLE
        this.setResizable(false);
        
        // INIT INPUT BORDER PADDING
        InputBorder.set(INPUT_KODE_RAK, 8);
        InputBorder.set(INPUT_NAMA_RAK, 8);
        InputBorder.set(INPUT_DESKRIPSI, 8);
        InputBorder.set(INPUT_UPDATE, 8);
        InputBorder.set(INPUT_CREATED, 8);
        
        // SET COMPONENT BASED ON ACTION
        if(Action.equals("ADD")){
            
            this.title = "Tambah";
            
            this.setSize(1024, 285);
            
            LABEL_UPDATE.setVisible(false);
            INPUT_UPDATE.setVisible(false);
            
            LABEL_CREATED.setVisible(false);
            INPUT_CREATED.setVisible(false);
            
            BTN_HAPUS_RAK.setVisible(false);
        
        }else{
            
            RM.getSelectedData(Kode);
            
            this.kode = RM.getKode();
            this.nama = RM.getNama();
            this.deskripsi = RM.getDeskripsi();
            
            INPUT_KODE_RAK.setText(RM.getKode());
            INPUT_NAMA_RAK.setText(RM.getNama());
            INPUT_DESKRIPSI.setText(RM.getDeskripsi());
            INPUT_CREATED.setText(RM.getCreated());
            INPUT_UPDATE.setText(RM.getUpdated());
            
        }
        
        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - " + this.title + " Rak Buku");
        
        // SET SUCCESS ICON
        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/manurul/src/ICON_SUCCESS.png"));
        this.successIcon = successIcon;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_FRAME = new javax.swing.JPanel();
        CONTAINER = new RoundedPanel(15, Color.WHITE);
        INPUT_KODE_RAK = new javax.swing.JTextField();
        LABEL_KODE_RAK = new javax.swing.JLabel();
        INPUT_NAMA_RAK = new javax.swing.JTextField();
        LABEL_NAMA_RAK = new javax.swing.JLabel();
        LABEL_UPDATE = new javax.swing.JLabel();
        INPUT_UPDATE = new javax.swing.JTextField();
        INPUT_CREATED = new javax.swing.JTextField();
        LABEL_CREATED = new javax.swing.JLabel();
        INPUT_DESKRIPSI = new javax.swing.JTextField();
        LABEL_DESKRIPSI = new javax.swing.JLabel();
        BTN_HAPUS_RAK = new javax.swing.JButton();
        BTN_SIMPAN_RAK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        MAIN_FRAME.setBackground(new java.awt.Color(239, 240, 245));

        CONTAINER.setBackground(new java.awt.Color(239, 240, 245));

        INPUT_KODE_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_KODE_RAK.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_KODE_RAK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_KODE_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_KODE_RAK.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_KODE_RAK.setText("Kode Rak");

        INPUT_NAMA_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_NAMA_RAK.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_NAMA_RAK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_NAMA_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_NAMA_RAK.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_NAMA_RAK.setText("Nama Rak");

        LABEL_UPDATE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_UPDATE.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_UPDATE.setText("Terakhir Diperbarui");

        INPUT_UPDATE.setEditable(false);
        INPUT_UPDATE.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_UPDATE.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_UPDATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        INPUT_CREATED.setEditable(false);
        INPUT_CREATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_CREATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_CREATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_CREATED.setText("Tanggal Dibuat");

        INPUT_DESKRIPSI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_DESKRIPSI.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_DESKRIPSI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_DESKRIPSI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_DESKRIPSI.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_DESKRIPSI.setText("Deskripsi");

        javax.swing.GroupLayout CONTAINERLayout = new javax.swing.GroupLayout(CONTAINER);
        CONTAINER.setLayout(CONTAINERLayout);
        CONTAINERLayout.setHorizontalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_KODE_RAK, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_KODE_RAK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_CREATED)
                    .addComponent(LABEL_CREATED, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(INPUT_NAMA_RAK)
                    .addComponent(LABEL_NAMA_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_UPDATE)
                    .addComponent(LABEL_UPDATE, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(INPUT_DESKRIPSI)
                    .addComponent(LABEL_DESKRIPSI, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        CONTAINERLayout.setVerticalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINERLayout.createSequentialGroup()
                        .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_KODE_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LABEL_NAMA_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(INPUT_KODE_RAK)
                            .addComponent(INPUT_NAMA_RAK)))
                    .addGroup(CONTAINERLayout.createSequentialGroup()
                        .addComponent(LABEL_DESKRIPSI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_DESKRIPSI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_CREATED)
                    .addComponent(LABEL_UPDATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INPUT_CREATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        BTN_HAPUS_RAK.setBackground(new java.awt.Color(153, 153, 153));
        BTN_HAPUS_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_HAPUS_RAK.setForeground(new java.awt.Color(255, 255, 255));
        BTN_HAPUS_RAK.setText("Hapus");
        BTN_HAPUS_RAK.setBorder(null);
        BTN_HAPUS_RAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_HAPUS_RAKMouseClicked(evt);
            }
        });

        BTN_SIMPAN_RAK.setBackground(new java.awt.Color(0, 171, 60));
        BTN_SIMPAN_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_SIMPAN_RAK.setForeground(new java.awt.Color(255, 255, 255));
        BTN_SIMPAN_RAK.setText("Simpan");
        BTN_SIMPAN_RAK.setBorder(null);
        BTN_SIMPAN_RAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_SIMPAN_RAKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MAIN_FRAMELayout = new javax.swing.GroupLayout(MAIN_FRAME);
        MAIN_FRAME.setLayout(MAIN_FRAMELayout);
        MAIN_FRAMELayout.setHorizontalGroup(
            MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_FRAMELayout.createSequentialGroup()
                .addGroup(MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                        .addContainerGap(420, Short.MAX_VALUE)
                        .addComponent(BTN_HAPUS_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_SIMPAN_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        MAIN_FRAMELayout.setVerticalGroup(
            MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CONTAINER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_SIMPAN_RAK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_HAPUS_RAK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean cekValidasi(){
    
        try{
        
            String kode = INPUT_KODE_RAK.getText();
            String nama = INPUT_NAMA_RAK.getText().replaceAll("[0-9]", "");
            String deskripsi = INPUT_DESKRIPSI.getText();
            
            if(kode.equals("")){
                throw new Exception("Nilai Kode harus terisi !");
            }
            
            if(nama.equals("")){
                throw new Exception("Nilai Nama harus terisi dan tidak berisi angka !");
            }
            
            if(deskripsi.equals("")){
                throw new Exception("Nilai Deskripsi harus terisi !");  
            }
            
            return true;
            
        }catch(Exception error){
        
            JOptionPane.showMessageDialog(null, error.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
            return false;
            
        }
        
    }
    
    private void inputRevalidate(){
        
        INPUT_KODE_RAK.setText(this.kode);
        INPUT_NAMA_RAK.setText(this.nama);
        INPUT_DESKRIPSI.setText(this.deskripsi);
        
    }
    
    private void simpan(){
    
        if(cekValidasi()){
         
            RM.setKode(INPUT_KODE_RAK.getText().toUpperCase());
            RM.setNama(Characters.ucwords(INPUT_NAMA_RAK.getText()));
            RM.setDeskripsi(INPUT_DESKRIPSI.getText());
            
            if(RM.insertData()){
                JOptionPane.showMessageDialog(null, RM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
                
                new RakModel().getDataTable(SEARCH_RAK.getText(), TAMPILKAN_RAK.getSelectedItem().toString());
                
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, RM.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        
    }
    
    private void update(){
        
        if(cekValidasi()){
            
            // cek perubahan
            String kode = INPUT_KODE_RAK.getText().toUpperCase();
            String nama = Characters.ucwords(INPUT_NAMA_RAK.getText());
            String deskripsi = INPUT_DESKRIPSI.getText();
            
            if(!kode.equals(this.kode) || !nama.equals(this.nama) || !deskripsi.equals(this.deskripsi)){
                RM.setKode(kode);
                RM.setNama(nama);
                RM.setDeskripsi(deskripsi);

                if(RM.updatedData()){
                    JOptionPane.showMessageDialog(null, RM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);

                    new RakModel().getDataTable(SEARCH_RAK.getText(), TAMPILKAN_RAK.getSelectedItem().toString());

                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, RM.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
                    inputRevalidate();
                }              
            }else{
                JOptionPane.showMessageDialog(null, "Tidak ada perubahan !", "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
            }

            
        }
        
    }
    
    
    private void BTN_SIMPAN_RAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_SIMPAN_RAKMouseClicked
        if(this.Action.equals("ADD")){
            simpan();
        }else{
            update();
        }
    }//GEN-LAST:event_BTN_SIMPAN_RAKMouseClicked

    private void BTN_HAPUS_RAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_HAPUS_RAKMouseClicked
        
        INPUT_KODE_RAK.setText(RM.getKode());
        INPUT_NAMA_RAK.setText(RM.getNama());
        INPUT_DESKRIPSI.setText(RM.getDeskripsi());
        
        int hapus = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengapus rak "+RM.getKode()+" ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(hapus == 0){
            if(RM.deleteData()){
                JOptionPane.showMessageDialog(null, RM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);

                new RakModel().getDataTable(SEARCH_RAK.getText(), TAMPILKAN_RAK.getSelectedItem().toString());

                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, RM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_BTN_HAPUS_RAKMouseClicked

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
            java.util.logging.Logger.getLogger(RakDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RakDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RakDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RakDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RakDATABUKU("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS_RAK;
    private javax.swing.JButton BTN_SIMPAN_RAK;
    private javax.swing.JPanel CONTAINER;
    private javax.swing.JTextField INPUT_CREATED;
    private javax.swing.JTextField INPUT_DESKRIPSI;
    private javax.swing.JTextField INPUT_KODE_RAK;
    private javax.swing.JTextField INPUT_NAMA_RAK;
    private javax.swing.JTextField INPUT_UPDATE;
    private javax.swing.JLabel LABEL_CREATED;
    private javax.swing.JLabel LABEL_DESKRIPSI;
    private javax.swing.JLabel LABEL_KODE_RAK;
    private javax.swing.JLabel LABEL_NAMA_RAK;
    private javax.swing.JLabel LABEL_UPDATE;
    private javax.swing.JPanel MAIN_FRAME;
    // End of variables declaration//GEN-END:variables
}