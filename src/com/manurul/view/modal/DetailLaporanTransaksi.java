/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.RoundedPanel;
import com.manurul.model.LaporanModel;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author caesarhome
 */
public class DetailLaporanTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form DetailLaporanTransaksi
     */
    private LaporanModel LM = new LaporanModel();
    public DetailLaporanTransaksi(String id_transaksi) {
        initComponents();

        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - Detail Transaksi");
        
        // REZISABLE
        this.setResizable(false);
        
        LM.getDetailLaporanTransaksi(id_transaksi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(15, Color.WHITE);
        BTN_CETAK = new javax.swing.JButton();
        BTN_DISPOSE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLES_LIST_BUKU = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        ID_TRANSAKSI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        INPUT_PEMINJAM = new javax.swing.JTextField();
        INPUT_PENGURUS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        INPUT_TGL_DICETAK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        INPUT_TGL_DIPERBARUI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BTN_CETAK.setBackground(new java.awt.Color(0, 171, 60));
        BTN_CETAK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BTN_CETAK.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CETAK.setText("CETAK");
        BTN_CETAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CETAKMouseClicked(evt);
            }
        });

        BTN_DISPOSE.setBackground(new java.awt.Color(255, 51, 51));
        BTN_DISPOSE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BTN_DISPOSE.setForeground(new java.awt.Color(255, 255, 255));
        BTN_DISPOSE.setText("BATAL");
        BTN_DISPOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_DISPOSEMouseClicked(evt);
            }
        });

        TABLES_LIST_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLES_LIST_BUKU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Buku", "Status"
            }
        ));
        TABLES_LIST_BUKU.setRowHeight(30);
        jScrollPane1.setViewportView(TABLES_LIST_BUKU);
        if (TABLES_LIST_BUKU.getColumnModel().getColumnCount() > 0) {
            TABLES_LIST_BUKU.getColumnModel().getColumn(1).setPreferredWidth(150);
            TABLES_LIST_BUKU.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        ID_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ID_TRANSAKSI.setText("#TR-465934857349654 - [BERMASALAH]");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Peminjam");

        INPUT_PEMINJAM.setEditable(false);
        INPUT_PEMINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PEMINJAM.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        INPUT_PENGURUS.setEditable(false);
        INPUT_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PENGURUS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Pengurus");

        INPUT_TGL_DICETAK.setEditable(false);
        INPUT_TGL_DICETAK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_TGL_DICETAK.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Tanggal Dicetak");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Terakhir Diperbarui");

        INPUT_TGL_DIPERBARUI.setEditable(false);
        INPUT_TGL_DIPERBARUI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_TGL_DIPERBARUI.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(ID_TRANSAKSI)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_DISPOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_CETAK, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(INPUT_PEMINJAM)
                    .addComponent(INPUT_PENGURUS)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(INPUT_TGL_DICETAK, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(INPUT_TGL_DIPERBARUI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ID_TRANSAKSI)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_PEMINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_PENGURUS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_TGL_DICETAK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_CETAK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_DISPOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_TGL_DIPERBARUI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_DISPOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DISPOSEMouseClicked
        this.dispose();
    }//GEN-LAST:event_BTN_DISPOSEMouseClicked

    private void BTN_CETAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CETAKMouseClicked
       try {
            LM.cetakDetailTransaksi();
        } catch (JRException ex) {
            Logger.getLogger(DetailLaporanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.dispose();
        }
    }//GEN-LAST:event_BTN_CETAKMouseClicked

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
            java.util.logging.Logger.getLogger(DetailLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailLaporanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailLaporanTransaksi("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CETAK;
    private javax.swing.JButton BTN_DISPOSE;
    public static javax.swing.JLabel ID_TRANSAKSI;
    public static javax.swing.JTextField INPUT_PEMINJAM;
    public static javax.swing.JTextField INPUT_PENGURUS;
    public static javax.swing.JTextField INPUT_TGL_DICETAK;
    public static javax.swing.JTextField INPUT_TGL_DIPERBARUI;
    public static javax.swing.JTable TABLES_LIST_BUKU;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}