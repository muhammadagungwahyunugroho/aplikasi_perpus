/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.GenKode;
import com.manurul.lib.InputBorder;
import com.manurul.lib.RoundedPanel;
import com.manurul.view.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author caesarhome
 */
public class konfirmasiTransaksiPinjam extends javax.swing.JFrame {

    /**
     * Creates new form konfirmasiTransaksiPinjam
     */
    public konfirmasiTransaksiPinjam() {
        initComponents();

        // SET TITLE
        this.setTitle("Widyagama malang - Konfirmasi Pinjam");
        
        // REQ FOCUS
        TABLE_LIST_BUKU_PINJAM.requestFocus();
        TABLE_LIST_BUKU_PINJAM.setRowSelectionInterval(0, 0);
        
        // SET INPUT BORDE
        InputBorder.set(INPUT_NAMA_PEMINJAM, 8);
        InputBorder.set(INPUT_JENIS_BUKU, 8);
        
        getDateRealTime();
        
    }
    
    public void getDateRealTime(){
    
        Timer timer;
        
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String date = GenKode.TransaksiGetDate();
              LABEL_TGL_PINJAM_TRANSAKSI.setText(date);
            }
        });
        
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WRAPPER = new RoundedPanel(15, Color.WHITE);
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_LIST_BUKU_PINJAM = new javax.swing.JTable();
        LABEL_TRANSAKSI = new javax.swing.JLabel();
        LABEL_ID_TRANSAKSI = new javax.swing.JLabel();
        LABEL_TGL_PINJAM_TRANSAKSI = new javax.swing.JLabel();
        LABEL_NAMA_PEMINJAM = new javax.swing.JLabel();
        INPUT_NAMA_PEMINJAM = new javax.swing.JTextField();
        INPUT_JENIS_BUKU = new javax.swing.JTextField();
        LABEL_JENIS_BUKU = new javax.swing.JLabel();
        BTN_CETAK_TRANSAKSI = new javax.swing.JButton();
        LABEL_PENGURUS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TABLE_LIST_BUKU_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        TABLE_LIST_BUKU_PINJAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Judul Buku", "Masa Pinjam", "Max. Tgl Pengembalian"
            }
        ));
        TABLE_LIST_BUKU_PINJAM.setRowHeight(30);
        TABLE_LIST_BUKU_PINJAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TABLE_LIST_BUKU_PINJAMKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE_LIST_BUKU_PINJAM);

        LABEL_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        LABEL_TRANSAKSI.setText("TRANSAKSI");

        LABEL_ID_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        LABEL_ID_TRANSAKSI.setText("#TR-46235367492");

        LABEL_TGL_PINJAM_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        LABEL_TGL_PINJAM_TRANSAKSI.setText("19 / 08 / 2022 11:31:00");

        LABEL_NAMA_PEMINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_NAMA_PEMINJAM.setText("Peminjam");

        INPUT_NAMA_PEMINJAM.setEditable(false);
        INPUT_NAMA_PEMINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_NAMA_PEMINJAM.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        INPUT_JENIS_BUKU.setEditable(false);
        INPUT_JENIS_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_JENIS_BUKU.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LABEL_JENIS_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_JENIS_BUKU.setText("Jenis Buku");

        BTN_CETAK_TRANSAKSI.setBackground(new java.awt.Color(0, 171, 60));
        BTN_CETAK_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        BTN_CETAK_TRANSAKSI.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CETAK_TRANSAKSI.setText("Cetak Transaksi [ENTER]");
        BTN_CETAK_TRANSAKSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CETAK_TRANSAKSIMouseClicked(evt);
            }
        });

        LABEL_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        LABEL_PENGURUS.setText("Hana Wulan Agusta");

        javax.swing.GroupLayout WRAPPERLayout = new javax.swing.GroupLayout(WRAPPER);
        WRAPPER.setLayout(WRAPPERLayout);
        WRAPPERLayout.setHorizontalGroup(
            WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WRAPPERLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(WRAPPERLayout.createSequentialGroup()
                        .addComponent(BTN_CETAK_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(WRAPPERLayout.createSequentialGroup()
                            .addComponent(LABEL_TRANSAKSI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LABEL_TGL_PINJAM_TRANSAKSI))
                        .addGroup(WRAPPERLayout.createSequentialGroup()
                            .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LABEL_NAMA_PEMINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(INPUT_NAMA_PEMINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(58, 58, 58)
                            .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LABEL_JENIS_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(INPUT_JENIS_BUKU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(WRAPPERLayout.createSequentialGroup()
                            .addComponent(LABEL_ID_TRANSAKSI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LABEL_PENGURUS))))
                .addGap(25, 25, 25))
        );

        WRAPPERLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {INPUT_JENIS_BUKU, INPUT_NAMA_PEMINJAM, LABEL_JENIS_BUKU, LABEL_NAMA_PEMINJAM});

        WRAPPERLayout.setVerticalGroup(
            WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WRAPPERLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_TRANSAKSI)
                    .addComponent(LABEL_TGL_PINJAM_TRANSAKSI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_ID_TRANSAKSI)
                    .addComponent(LABEL_PENGURUS))
                .addGap(25, 25, 25)
                .addGroup(WRAPPERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(WRAPPERLayout.createSequentialGroup()
                        .addComponent(LABEL_NAMA_PEMINJAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_NAMA_PEMINJAM))
                    .addGroup(WRAPPERLayout.createSequentialGroup()
                        .addComponent(LABEL_JENIS_BUKU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_JENIS_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(BTN_CETAK_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(WRAPPER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(WRAPPER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TABLE_LIST_BUKU_PINJAMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLE_LIST_BUKU_PINJAMKeyPressed
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            Dashboard.TM.cetakPinjam();
            this.dispose();
        }
        
    }//GEN-LAST:event_TABLE_LIST_BUKU_PINJAMKeyPressed

    private void BTN_CETAK_TRANSAKSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CETAK_TRANSAKSIMouseClicked
            Dashboard.TM.cetakPinjam();
            this.dispose();
    }//GEN-LAST:event_BTN_CETAK_TRANSAKSIMouseClicked

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
            java.util.logging.Logger.getLogger(konfirmasiTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konfirmasiTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konfirmasiTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konfirmasiTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konfirmasiTransaksiPinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CETAK_TRANSAKSI;
    public static javax.swing.JTextField INPUT_JENIS_BUKU;
    public static javax.swing.JTextField INPUT_NAMA_PEMINJAM;
    public static javax.swing.JLabel LABEL_ID_TRANSAKSI;
    private javax.swing.JLabel LABEL_JENIS_BUKU;
    private javax.swing.JLabel LABEL_NAMA_PEMINJAM;
    public static javax.swing.JLabel LABEL_PENGURUS;
    public static javax.swing.JLabel LABEL_TGL_PINJAM_TRANSAKSI;
    private javax.swing.JLabel LABEL_TRANSAKSI;
    public static javax.swing.JTable TABLE_LIST_BUKU_PINJAM;
    private javax.swing.JPanel WRAPPER;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
