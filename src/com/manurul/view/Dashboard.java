/*
 * LICENSE BY DKODE Creative
 */
package com.manurul.view;

import com.manurul.lib.InputBorder;
import com.manurul.view.modal.AnggotaUSER;
import com.manurul.view.modal.JurusanUSER;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.manurul.lib.RoundedPanel;
import com.manurul.lib.SideBar;
import com.manurul.model.AnggotaModel;
import com.manurul.model.BukuModel;
import com.manurul.model.DashboardModel;
import com.manurul.model.JurusanModel;
import com.manurul.model.KategoriModel;
import com.manurul.model.LaporanModel;
import com.manurul.model.PenerbitModel;
import com.manurul.model.PengurusModel;
import com.manurul.model.RakModel;
import com.manurul.model.SettingModel;
import com.manurul.model.TransaksiModel;
import com.manurul.view.modal.BukuDATABUKU;
import com.manurul.view.modal.DetailLaporanTransaksi;
import com.manurul.view.modal.KategoriDATABUKU;
import com.manurul.view.modal.KonfirmasiPengembalian;
import com.manurul.view.modal.PenerbitDATABUKU;
import com.manurul.view.modal.PengurusUSER;
import com.manurul.view.modal.RakDATABUKU;
import com.manurul.view.modal.getDaftarBukuTRANSAKSI;
import com.manurul.view.modal.getPeminjamTRANSAKSI;
import com.manurul.view.modal.konfirmasiBukuPengembalian;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author DKODE Creative
 */
public class Dashboard extends javax.swing.JFrame {

    // GLOBAL INIT
    public static String id_kode;
    public static String nama_user;
    private String hak_akses;
    private ImageIcon successIcon;
    
        // TRANSAKSI
        public static TransaksiModel TM = new TransaksiModel();
    
        // SETTING
        public static int Denda;
        public static int MaxPinjamBukuUmum;
        public static int BackupDatabase;
    
    /**
     * INIT FORM DASHBOARD
     */
        
    public Dashboard(String kode, String nama, String hak_akses) {
        
        initComponents();
        
        // SET STATE
        id_kode = kode;
        nama_user = nama;
        this.hak_akses = hak_akses;
        
        // SET TITLE
        this.setTitleApp("Dashboard");
        
        // SET TOP BAR
        USERNAME.setText(nama_user);
        
        // JFRAME FULL SCREEN
        this.setExtendedState(MAXIMIZED_BOTH);
        
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET MINIMUN SIZE
        this.setMinimumSize(new Dimension(1366, 768));
        
        // DEFAULT SIDEBAR ICON SELECTED
        new SideBar().setBar("DASHBOARD");
        
        //SET BORDER FOR INPUT && Utilities Func Part Page
        
            // TRANSAKSI - Pinjam
            InputBorder.set(PJ_INPUT_ID_TRANSAKSI, 8);
            InputBorder.set(PJ_INPUT_PEMINJAM, 8);
            InputBorder.set(PJ_INPUT_TGL_PINJAM, 8);
            
            // TRANSAKSI - Kembalian
            
            Dashboard.TM.initTablePengembalian();
            
            InputBorder.set(PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN, 8);
            InputBorder.set(PJ_INPUT_PEMINJAM_PENGEMBALIAN, 8);
            InputBorder.set(PJ_INPUT_TGL_PINJAM_PENGEMBALIAN, 8);
            InputBorder.set(PJ_INPUT_PENGURUS_PENGEMBALIAN, 8);
            
            PJ_INPUT_JENIS_BUKU_PENGEMBALIAN.disable();
            
            // TRANSAKSI - LAPORAN
            
            InputBorder.set(INPUT_LAPORAN_ID_TRANSAKSI, 8);
            
            // DATA BUKU
            InputBorder.set(SEARCH_BUKU, 8);
            InputBorder.set(SEARCH_KATEGORI, 8);
            InputBorder.set(SEARCH_PENERBIT, 8);
            InputBorder.set(SEARCH_RAK, 8);
        
            // USER
            InputBorder.set(SEARCH_USER, 8);
            InputBorder.set(SEARCH_JURUSAN, 8);
            InputBorder.set(SEARCH_PENGURUS, 8);
        
            //SETTING
            InputBorder.set(INPUT_SET_1, 8);
            
            LABEL_SET_3.setVisible(false);
            INPUT_SET_3.setVisible(false);
            
        // SET SUCCESS ICON
        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/manurul/src/ICON_SUCCESS.png"));
        this.successIcon = successIcon;
        
        // SET ROLE PERMISSION
        if(this.hak_akses.equals("STAF")){
            
            SIDEBAR.remove(BTN_USER);
            SIDEBAR.remove(BTN_SETTING);
            SIDEBAR.repaint();
            SIDEBAR.revalidate();
            
        }
        
        // start realtime for trancaction
        new TransaksiModel().getDateRealTime();
        
        // GET DATA DASHBOARD
        new DashboardModel().getDashboardData(Dashboard.SORT_LIST_LOG.getSelectedItem().toString());
        
        
    }
    
    /*
    ------------------------
        SET TITLE APP
    ------------------------
    */
        public void setTitleApp(String title){
            this.setTitle("Informasi Perpustakaan WIdyagama Malang - " + title);
        }
    /*

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SIDEBAR = new javax.swing.JPanel();
        BTN_DASHBOARD = new javax.swing.JLabel();
        BTN_TRANSAKSI = new javax.swing.JLabel();
        BTN_USER = new javax.swing.JLabel();
        BTN_SETTING = new javax.swing.JLabel();
        BTN_EXIT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTN_DATABUKU = new javax.swing.JLabel();
        MAIN_FRAME = new javax.swing.JPanel();
        DASHBOARD = new javax.swing.JPanel();
        TOPBAR = new RoundedPanel(15, Color.WHITE);
        TITLE_DASHBOARD = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();
        ICON_USER = new javax.swing.JLabel();
        P_TOTAL_BUKU = new RoundedPanel(15, Color.WHITE);
        ICON_TOTAL_BUKU = new javax.swing.JLabel();
        TITLE_TOTAL_BUKU = new javax.swing.JLabel();
        VALUE_TOTAL_BUKU = new javax.swing.JLabel();
        P_DIPINJAM = new RoundedPanel(15, Color.WHITE);
        ICON_DIPINJAM = new javax.swing.JLabel();
        TITLE_DIPINJAM = new javax.swing.JLabel();
        VALUE_DIPINJAM = new javax.swing.JLabel();
        P_BERMASALAH = new RoundedPanel(15, Color.WHITE);
        ICON_BERMASALAH = new javax.swing.JLabel();
        VALUE_BERMASALAH = new javax.swing.JLabel();
        TITLE_BERMASALAH = new javax.swing.JLabel();
        P_ANGGOTA = new RoundedPanel(15, Color.WHITE);
        TITLE_ANGGOTA = new javax.swing.JLabel();
        VALUE_ANGGOTA = new javax.swing.JLabel();
        ICON_ANGGOTA = new javax.swing.JLabel();
        P_TABLE_LOG = new RoundedPanel(15, Color.WHITE);
        LABEL_LOG = new javax.swing.JLabel();
        LABEL_TAMPILKAN = new javax.swing.JLabel();
        TABLE_LOG = new javax.swing.JScrollPane();
        TABLE_LIST_LOG = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        SORT_LIST_LOG = new javax.swing.JComboBox<>();
        TRANSAKSI = new javax.swing.JPanel();
        TOPBAR_TRANSAKSI = new RoundedPanel(15, Color.WHITE);
        T_TR_PINJAM = new javax.swing.JLabel();
        T_TR_KEMBALI = new javax.swing.JLabel();
        T_TR_LAPORAN = new javax.swing.JLabel();
        USERNAME_TRANSAKSI = new javax.swing.JLabel();
        ICON_TR_TRANSAKSI = new javax.swing.JLabel();
        FRAME_TRANSAKSI = new RoundedPanel(15, Color.WHITE);
        F_TR_LAPORAN = new javax.swing.JPanel();
        F_TB_LAPORAN = new RoundedPanel(15, Color.WHITE);
        T_LP_TRANSAKSI = new javax.swing.JLabel();
        T_LP_BUKU_BERMASALAH = new javax.swing.JLabel();
        F_TR_CONTENT_LAPORAN = new RoundedPanel(15, Color.WHITE);
        F_CONTENT_BUKU_BERMASALAH = new RoundedPanel(15, Color.WHITE);
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLES_LAPORAN_BERMASALAH = new javax.swing.JTable();
        F_CONTENT_TRANSAKSI = new RoundedPanel(15, Color.WHITE);
        INPUT_LAPORAN_LIMIT_TRANSAKSI = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLE_LAPORAN_TRANSAKSI = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        INPUT_LAPORAN_ID_TRANSAKSI = new javax.swing.JTextField();
        F_TR_KEMBALI = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_PENGEMBALIAN = new javax.swing.JLabel();
        BTN_CETAK_PENGEMBALIAN = new javax.swing.JButton();
        PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN = new javax.swing.JTextField();
        PJ_ID_TRANSAKSI_PENGEMBALIAN = new javax.swing.JLabel();
        PJ_INPUT_PEMINJAM_PENGEMBALIAN = new javax.swing.JTextField();
        PJ_LABEL_PEMINJAM_PENGEMBALIAN = new javax.swing.JLabel();
        PJ_LABEL_KAT_BUKU_PENGEMBALIAN = new javax.swing.JLabel();
        PJ_LABEL_TGL_PINJAM_PENGEMBALIAN = new javax.swing.JLabel();
        PJ_INPUT_JENIS_BUKU_PENGEMBALIAN = new javax.swing.JComboBox<>();
        PJ_INPUT_TGL_PINJAM_PENGEMBALIAN = new javax.swing.JTextField();
        PJ_ID_TRANSAKSI_PENGEMBALIAN1 = new javax.swing.JLabel();
        PJ_LABEL_PENGURUS_PENGEMBALIAN = new javax.swing.JLabel();
        PJ_INPUT_PENGURUS_PENGEMBALIAN = new javax.swing.JTextField();
        CONTAINER_FORM = new javax.swing.JPanel();
        T_PJ_BUKU_PENGEMBALIAN = new javax.swing.JLabel();
        TABLE_PENGEMBALIAN = new javax.swing.JScrollPane();
        TABLE_LIST_PENGEMBALIAN = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public Component prepareRenderer(TableCellRenderer renderer, int row, int column)
            {
                Component c = super.prepareRenderer(renderer, row, column);

                //  Color row based on a cell value

                if (!isRowSelected(row))
                {
                    c.setBackground(getBackground());
                    c.setForeground(getForeground());
                    int modelRow = convertRowIndexToModel(row);
                    String type = (String)getModel().getValueAt(modelRow, 2);
                    if ("Bermasalah - Terlambat".equals(type)) {
                        c.setBackground(new Color(244, 113, 116));
                        c.setForeground(Color.WHITE);
                    };
                    if ("Bermasalah - Rusak".equals(type)) {
                        c.setBackground(new Color(244, 113, 116));
                        c.setForeground(Color.WHITE);
                    };
                    if ("Bermasalah - Hilang".equals(type)) {
                        c.setBackground(new Color(244, 113, 116));
                        c.setForeground(Color.WHITE);
                    };
                }
                return c;
            }

        };
        T_PJ_ALERT_PENGEMBALIAN = new javax.swing.JLabel();
        T_PJ_BUKU_PENGEMBALIAN1 = new javax.swing.JLabel();
        TABLE_PENGEMBALIAN1 = new javax.swing.JScrollPane();
        TABLE_LIST_PENGEMBALIAN1 = new javax.swing.JTable();
        T_PJ_ALERT_PENGEMBALIAN1 = new javax.swing.JLabel();
        F_TR_PINJAM = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_PINJAM = new javax.swing.JLabel();
        T_PJ_BUKU = new javax.swing.JLabel();
        TABLE_PINJAM = new javax.swing.JScrollPane();
        TABLE_LIST_PINJAM = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        BTN_CETAK_PINJAMAN = new javax.swing.JButton();
        PJ_INPUT_ID_TRANSAKSI = new javax.swing.JTextField();
        PJ_ID_TRANSAKSI = new javax.swing.JLabel();
        PJ_INPUT_PEMINJAM = new javax.swing.JTextField();
        PJ_LABEL_PEMINJAM = new javax.swing.JLabel();
        PJ_LABEL_KAT_BUKU = new javax.swing.JLabel();
        PJ_LABEL_TGL_PINJAM = new javax.swing.JLabel();
        PJ_LABEL_INFO_1 = new javax.swing.JLabel();
        PJ_LABEL_INFO_2 = new javax.swing.JLabel();
        PJ_INPUT_JENIS_BUKU = new javax.swing.JComboBox<>();
        PJ_INPUT_TGL_PINJAM = new javax.swing.JTextField();
        BTN_RESET_DAFTAR_BUKU = new javax.swing.JLabel();
        DATABUKU = new javax.swing.JPanel();
        TOPBAR_DATABUKU = new RoundedPanel(15, Color.WHITE);
        T_DB_BUKU = new javax.swing.JLabel();
        T_DB_KATEGORI = new javax.swing.JLabel();
        T_DB_PENERBIT = new javax.swing.JLabel();
        T_DB_RAK = new javax.swing.JLabel();
        USERNAME_DATABUKU = new javax.swing.JLabel();
        ICON_DB_DATABUKU = new javax.swing.JLabel();
        FRAME_DATABUKU = new RoundedPanel(15, Color.WHITE);
        F_DB_BUKU = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_BUKU = new javax.swing.JLabel();
        ICON_ADD_BUKU = new javax.swing.JLabel();
        SEARCH_BUKU = new javax.swing.JTextField();
        TABLE_LIST_DB_BUKU = new javax.swing.JScrollPane();
        TABLE_LIST_BUKU = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        FILTER_TAMPIL_BUKU = new javax.swing.JLabel();
        TAMPILKAN_COMBOBOX_BUKU = new javax.swing.JComboBox<>();
        FILTER_KATEGORI_BUKU = new javax.swing.JLabel();
        KATEGORI_COMBOBOX_BUKU = new javax.swing.JComboBox<>();
        F_DB_KATEGORI = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_KATEGORI = new javax.swing.JLabel();
        ICON_ADD_KATEGORI = new javax.swing.JLabel();
        TABLE_KATEGORI = new javax.swing.JScrollPane();
        TABLE_LIST_KATEGORI = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        SEARCH_KATEGORI = new javax.swing.JTextField();
        FILTER_TAMPIL_KATEGORI = new javax.swing.JLabel();
        TAMPILKAN_KATEGORI = new javax.swing.JComboBox<>();
        F_DB_PENERBIT = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_PENERBIT = new javax.swing.JLabel();
        ICON_ADD_PENERBIT = new javax.swing.JLabel();
        SEARCH_PENERBIT = new javax.swing.JTextField();
        TABLE_PENERBIT = new javax.swing.JScrollPane();
        TABLE_LIST_PENERBIT = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        FILTER_TAMPIL_PENERBIT = new javax.swing.JLabel();
        TAMPILKAN_PENERBIT = new javax.swing.JComboBox<>();
        F_DB_RAK = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_RAK = new javax.swing.JLabel();
        ICON_ADD_RAK = new javax.swing.JLabel();
        SEARCH_RAK = new javax.swing.JTextField();
        TABLE_RAK = new javax.swing.JScrollPane();
        TABLE_LIST_RAK = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        FILTER_TAMPIL_RAK = new javax.swing.JLabel();
        TAMPILKAN_RAK = new javax.swing.JComboBox<>();
        USER = new javax.swing.JPanel();
        TOPBAR_USER = new RoundedPanel(15, Color.WHITE);
        T_U_ANGGOTA = new javax.swing.JLabel();
        T_U_JURUSAN = new javax.swing.JLabel();
        T_U_PENGURUS = new javax.swing.JLabel();
        USERNAME_USER = new javax.swing.JLabel();
        ICON_U_USER = new javax.swing.JLabel();
        FRAME_USER = new javax.swing.JPanel();
        F_U_ANGGOTA = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_USER = new javax.swing.JLabel();
        ICON_ADD_USER = new javax.swing.JLabel();
        SEARCH_USER = new javax.swing.JTextField();
        TABLE_LIST_U_ANGGOTA = new javax.swing.JScrollPane();
        TABLE_LIST_ANGGOTA = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        FILTER_TAMPIL_USER = new javax.swing.JLabel();
        TAMPILKAN_COMBOBOX_USER = new javax.swing.JComboBox<>();
        GROUP_KELAS_USER = new javax.swing.JLabel();
        GROUP_COMBOBOX_USER = new javax.swing.JComboBox<>();
        F_U_JURUSAN = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_JURUSAN = new javax.swing.JLabel();
        ICON_ADD_JURUSAN = new javax.swing.JLabel();
        SEARCH_JURUSAN = new javax.swing.JTextField();
        TABLE_LIST_JURUSAN = new javax.swing.JScrollPane();
        TABLE_LIST_ITEM_JURUSAN = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        F_U_PENGURUS = new RoundedPanel(15, Color.WHITE);
        TITLE_FRAME_PENGURUS = new javax.swing.JLabel();
        ICON_ADD_PENGURUS = new javax.swing.JLabel();
        SEARCH_PENGURUS = new javax.swing.JTextField();
        TABLE_LIST_PENGURUS = new javax.swing.JScrollPane();
        TABLE_LIST_ITEM_PENGURUS = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };
        SETTING = new javax.swing.JPanel();
        TOPBAR_SETTING = new RoundedPanel(15, Color.WHITE);
        TITLE_SETTING = new javax.swing.JLabel();
        USERNAME_SETTING = new javax.swing.JLabel();
        ICON_SETTING = new javax.swing.JLabel();
        FRAME_MAIN_SETTING = new RoundedPanel(15, Color.WHITE);
        MAIN_TTILE = new javax.swing.JLabel();
        LABEL_SET_RP = new javax.swing.JLabel();
        LABEL_SET_1 = new javax.swing.JLabel();
        INPUT_SET_1 = new javax.swing.JTextField();
        LABEL_SET_2 = new javax.swing.JLabel();
        INPUT_SET_2 = new javax.swing.JSpinner();
        LABEL_SET_3 = new javax.swing.JLabel();
        INPUT_SET_3 = new javax.swing.JComboBox<>();
        BTN_SET_SIMPAN = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SIDEBAR.setBackground(new java.awt.Color(255, 255, 255));

        BTN_DASHBOARD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BTN_DASHBOARD.setForeground(new java.awt.Color(0, 153, 0));
        BTN_DASHBOARD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_AIRPLAY_NON.png"))); // NOI18N
        BTN_DASHBOARD.setText("Dashboard");
        BTN_DASHBOARD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_DASHBOARD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_DASHBOARDMouseClicked(evt);
            }
        });

        BTN_TRANSAKSI.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BTN_TRANSAKSI.setForeground(new java.awt.Color(0, 153, 0));
        BTN_TRANSAKSI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_TRANSAKSI_NON.png"))); // NOI18N
        BTN_TRANSAKSI.setText("Peminjaman");
        BTN_TRANSAKSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_TRANSAKSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_TRANSAKSIMouseClicked(evt);
            }
        });

        BTN_USER.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BTN_USER.setForeground(new java.awt.Color(0, 153, 0));
        BTN_USER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_USER_NON.png"))); // NOI18N
        BTN_USER.setText("Daftar anggota");
        BTN_USER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_USERMouseClicked(evt);
            }
        });

        BTN_SETTING.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BTN_SETTING.setForeground(new java.awt.Color(0, 153, 0));
        BTN_SETTING.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_SETTING_NON.png"))); // NOI18N
        BTN_SETTING.setText("Pengaturan");
        BTN_SETTING.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_SETTING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_SETTINGMouseClicked(evt);
            }
        });

        BTN_EXIT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BTN_EXIT.setForeground(new java.awt.Color(0, 153, 0));
        BTN_EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_EXIT.png"))); // NOI18N
        BTN_EXIT.setText("Logout");
        BTN_EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_EXITMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/widyagama..jpg"))); // NOI18N

        BTN_DATABUKU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BTN_DATABUKU.setForeground(new java.awt.Color(0, 153, 0));
        BTN_DATABUKU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_DATABUKU_NON.png"))); // NOI18N
        BTN_DATABUKU.setText("Daftar buku");
        BTN_DATABUKU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_DATABUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_DATABUKUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SIDEBARLayout = new javax.swing.GroupLayout(SIDEBAR);
        SIDEBAR.setLayout(SIDEBARLayout);
        SIDEBARLayout.setHorizontalGroup(
            SIDEBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIDEBARLayout.createSequentialGroup()
                .addGroup(SIDEBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SIDEBARLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SIDEBARLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(SIDEBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_TRANSAKSI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(SIDEBARLayout.createSequentialGroup()
                                .addGroup(SIDEBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTN_DASHBOARD)
                                    .addComponent(BTN_DATABUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_USER)
                                    .addGroup(SIDEBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BTN_EXIT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTN_SETTING, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 2, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        SIDEBARLayout.setVerticalGroup(
            SIDEBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SIDEBARLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_DASHBOARD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BTN_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BTN_DATABUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BTN_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(BTN_SETTING)
                .addGap(75, 75, 75)
                .addComponent(BTN_EXIT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAIN_FRAME.setBackground(new java.awt.Color(239, 240, 245));
        MAIN_FRAME.setLayout(new java.awt.CardLayout());

        DASHBOARD.setBackground(new java.awt.Color(239, 240, 245));

        TOPBAR.setBackground(new java.awt.Color(239, 240, 245));
        TOPBAR.setPreferredSize(new java.awt.Dimension(353, 70));

        TITLE_DASHBOARD.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TITLE_DASHBOARD.setForeground(new java.awt.Color(78, 204, 121));
        TITLE_DASHBOARD.setText("Dashboard");

        USERNAME.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        USERNAME.setForeground(new java.awt.Color(96, 96, 96));
        USERNAME.setText("USERNAME");

        ICON_USER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_AKUN_CIRCLE.png"))); // NOI18N

        javax.swing.GroupLayout TOPBARLayout = new javax.swing.GroupLayout(TOPBAR);
        TOPBAR.setLayout(TOPBARLayout);
        TOPBARLayout.setHorizontalGroup(
            TOPBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBARLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TITLE_DASHBOARD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERNAME)
                .addGap(18, 18, 18)
                .addComponent(ICON_USER)
                .addGap(81, 81, 81))
        );
        TOPBARLayout.setVerticalGroup(
            TOPBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBARLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TOPBARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITLE_DASHBOARD)
                    .addComponent(USERNAME))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(ICON_USER, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P_TOTAL_BUKU.setBackground(new java.awt.Color(239, 240, 245));
        P_TOTAL_BUKU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        P_TOTAL_BUKU.setPreferredSize(new java.awt.Dimension(290, 143));

        ICON_TOTAL_BUKU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_BOOK.png"))); // NOI18N

        TITLE_TOTAL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        TITLE_TOTAL_BUKU.setForeground(new java.awt.Color(204, 204, 204));
        TITLE_TOTAL_BUKU.setText("Total Buku");

        VALUE_TOTAL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        VALUE_TOTAL_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        VALUE_TOTAL_BUKU.setText("14578");

        javax.swing.GroupLayout P_TOTAL_BUKULayout = new javax.swing.GroupLayout(P_TOTAL_BUKU);
        P_TOTAL_BUKU.setLayout(P_TOTAL_BUKULayout);
        P_TOTAL_BUKULayout.setHorizontalGroup(
            P_TOTAL_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TOTAL_BUKULayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ICON_TOTAL_BUKU)
                .addGap(18, 18, 18)
                .addGroup(P_TOTAL_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_TOTAL_BUKU)
                    .addComponent(VALUE_TOTAL_BUKU))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        P_TOTAL_BUKULayout.setVerticalGroup(
            P_TOTAL_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TOTAL_BUKULayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(P_TOTAL_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_TOTAL_BUKULayout.createSequentialGroup()
                        .addComponent(TITLE_TOTAL_BUKU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VALUE_TOTAL_BUKU)
                        .addGap(5, 5, 5))
                    .addComponent(ICON_TOTAL_BUKU))
                .addGap(34, 34, 34))
        );

        P_DIPINJAM.setBackground(new java.awt.Color(239, 240, 245));
        P_DIPINJAM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        P_DIPINJAM.setPreferredSize(new java.awt.Dimension(290, 143));

        ICON_DIPINJAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_DIPINJAM.png"))); // NOI18N

        TITLE_DIPINJAM.setBackground(new java.awt.Color(204, 204, 204));
        TITLE_DIPINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        TITLE_DIPINJAM.setForeground(new java.awt.Color(204, 204, 204));
        TITLE_DIPINJAM.setText("Dipinjam");

        VALUE_DIPINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        VALUE_DIPINJAM.setForeground(new java.awt.Color(96, 96, 96));
        VALUE_DIPINJAM.setText("1256");

        javax.swing.GroupLayout P_DIPINJAMLayout = new javax.swing.GroupLayout(P_DIPINJAM);
        P_DIPINJAM.setLayout(P_DIPINJAMLayout);
        P_DIPINJAMLayout.setHorizontalGroup(
            P_DIPINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DIPINJAMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ICON_DIPINJAM)
                .addGap(18, 18, 18)
                .addGroup(P_DIPINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_DIPINJAM)
                    .addComponent(VALUE_DIPINJAM))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        P_DIPINJAMLayout.setVerticalGroup(
            P_DIPINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DIPINJAMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(P_DIPINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_DIPINJAMLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TITLE_DIPINJAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VALUE_DIPINJAM))
                    .addComponent(ICON_DIPINJAM))
                .addGap(34, 34, 34))
        );

        P_BERMASALAH.setBackground(new java.awt.Color(239, 240, 245));
        P_BERMASALAH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        P_BERMASALAH.setPreferredSize(new java.awt.Dimension(290, 143));

        ICON_BERMASALAH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_BERMASALAH.png"))); // NOI18N

        VALUE_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        VALUE_BERMASALAH.setForeground(new java.awt.Color(96, 96, 96));
        VALUE_BERMASALAH.setText("25");

        TITLE_BERMASALAH.setBackground(new java.awt.Color(204, 204, 204));
        TITLE_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        TITLE_BERMASALAH.setForeground(new java.awt.Color(204, 204, 204));
        TITLE_BERMASALAH.setText("Bermasalah");

        javax.swing.GroupLayout P_BERMASALAHLayout = new javax.swing.GroupLayout(P_BERMASALAH);
        P_BERMASALAH.setLayout(P_BERMASALAHLayout);
        P_BERMASALAHLayout.setHorizontalGroup(
            P_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BERMASALAHLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ICON_BERMASALAH)
                .addGap(18, 18, 18)
                .addGroup(P_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_BERMASALAH)
                    .addComponent(VALUE_BERMASALAH))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        P_BERMASALAHLayout.setVerticalGroup(
            P_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_BERMASALAHLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(P_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_BERMASALAHLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TITLE_BERMASALAH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VALUE_BERMASALAH))
                    .addComponent(ICON_BERMASALAH))
                .addContainerGap())
        );

        P_ANGGOTA.setBackground(new java.awt.Color(239, 240, 245));
        P_ANGGOTA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        P_ANGGOTA.setPreferredSize(new java.awt.Dimension(290, 143));

        TITLE_ANGGOTA.setBackground(new java.awt.Color(204, 204, 204));
        TITLE_ANGGOTA.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        TITLE_ANGGOTA.setForeground(new java.awt.Color(204, 204, 204));
        TITLE_ANGGOTA.setText("Anggota");

        VALUE_ANGGOTA.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        VALUE_ANGGOTA.setForeground(new java.awt.Color(96, 96, 96));
        VALUE_ANGGOTA.setText("2450");

        ICON_ANGGOTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_USERS.png"))); // NOI18N

        javax.swing.GroupLayout P_ANGGOTALayout = new javax.swing.GroupLayout(P_ANGGOTA);
        P_ANGGOTA.setLayout(P_ANGGOTALayout);
        P_ANGGOTALayout.setHorizontalGroup(
            P_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_ANGGOTALayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ICON_ANGGOTA)
                .addGap(18, 18, 18)
                .addGroup(P_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_ANGGOTA)
                    .addComponent(VALUE_ANGGOTA))
                .addGap(54, 54, 54))
        );
        P_ANGGOTALayout.setVerticalGroup(
            P_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ANGGOTALayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(P_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_ANGGOTALayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TITLE_ANGGOTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VALUE_ANGGOTA))
                    .addComponent(ICON_ANGGOTA))
                .addGap(34, 34, 34))
        );

        P_TABLE_LOG.setBackground(new java.awt.Color(239, 240, 245));

        LABEL_LOG.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        LABEL_LOG.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_LOG.setText("Aktivitas Terbaru");

        LABEL_TAMPILKAN.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        LABEL_TAMPILKAN.setForeground(new java.awt.Color(204, 204, 204));
        LABEL_TAMPILKAN.setText("Tampilkan");

        TABLE_LIST_LOG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Proses", "Pesan", "Pengurus", "Tanggal"
            }
        ));
        TABLE_LIST_LOG.setRowHeight(30);
        TABLE_LOG.setViewportView(TABLE_LIST_LOG);

        SORT_LIST_LOG.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        SORT_LIST_LOG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "20", "50", "100" }));
        SORT_LIST_LOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORT_LIST_LOGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_TABLE_LOGLayout = new javax.swing.GroupLayout(P_TABLE_LOG);
        P_TABLE_LOG.setLayout(P_TABLE_LOGLayout);
        P_TABLE_LOGLayout.setHorizontalGroup(
            P_TABLE_LOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TABLE_LOGLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(P_TABLE_LOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TABLE_LOG, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
                    .addGroup(P_TABLE_LOGLayout.createSequentialGroup()
                        .addGroup(P_TABLE_LOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_TABLE_LOGLayout.createSequentialGroup()
                                .addComponent(LABEL_TAMPILKAN)
                                .addGap(18, 18, 18)
                                .addComponent(SORT_LIST_LOG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LABEL_LOG))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        P_TABLE_LOGLayout.setVerticalGroup(
            P_TABLE_LOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TABLE_LOGLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LABEL_LOG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_TABLE_LOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_TAMPILKAN)
                    .addComponent(SORT_LIST_LOG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TABLE_LOG, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout DASHBOARDLayout = new javax.swing.GroupLayout(DASHBOARD);
        DASHBOARD.setLayout(DASHBOARDLayout);
        DASHBOARDLayout.setHorizontalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DASHBOARDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P_TABLE_LOG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DASHBOARDLayout.createSequentialGroup()
                        .addComponent(P_TOTAL_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(P_DIPINJAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(P_BERMASALAH, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(P_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TOPBAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        DASHBOARDLayout.setVerticalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TOPBAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_DIPINJAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_BERMASALAH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_TOTAL_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(P_TABLE_LOG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        MAIN_FRAME.add(DASHBOARD, "card2");

        TRANSAKSI.setBackground(new java.awt.Color(239, 240, 245));

        TOPBAR_TRANSAKSI.setBackground(new java.awt.Color(239, 240, 245));
        TOPBAR_TRANSAKSI.setPreferredSize(new java.awt.Dimension(353, 70));

        T_TR_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_TR_PINJAM.setForeground(new java.awt.Color(96, 96, 96));
        T_TR_PINJAM.setText("Peminjaman Buku");
        T_TR_PINJAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_TR_PINJAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_TR_PINJAMMouseClicked(evt);
            }
        });

        T_TR_KEMBALI.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_TR_KEMBALI.setForeground(new java.awt.Color(96, 96, 96));
        T_TR_KEMBALI.setText("Pengembalian Buku");
        T_TR_KEMBALI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_TR_KEMBALI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_TR_KEMBALIMouseClicked(evt);
            }
        });

        T_TR_LAPORAN.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_TR_LAPORAN.setForeground(new java.awt.Color(96, 96, 96));
        T_TR_LAPORAN.setText("Laporan");
        T_TR_LAPORAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_TR_LAPORAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_TR_LAPORANMouseClicked(evt);
            }
        });

        USERNAME_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        USERNAME_TRANSAKSI.setForeground(new java.awt.Color(96, 96, 96));
        USERNAME_TRANSAKSI.setText("USERNAME");

        ICON_TR_TRANSAKSI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_AKUN_CIRCLE.png"))); // NOI18N

        javax.swing.GroupLayout TOPBAR_TRANSAKSILayout = new javax.swing.GroupLayout(TOPBAR_TRANSAKSI);
        TOPBAR_TRANSAKSI.setLayout(TOPBAR_TRANSAKSILayout);
        TOPBAR_TRANSAKSILayout.setHorizontalGroup(
            TOPBAR_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_TRANSAKSILayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(T_TR_PINJAM)
                .addGap(46, 46, 46)
                .addComponent(T_TR_KEMBALI)
                .addGap(46, 46, 46)
                .addComponent(T_TR_LAPORAN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERNAME_TRANSAKSI)
                .addGap(18, 18, 18)
                .addComponent(ICON_TR_TRANSAKSI)
                .addGap(27, 27, 27))
        );
        TOPBAR_TRANSAKSILayout.setVerticalGroup(
            TOPBAR_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_TRANSAKSILayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TOPBAR_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_TR_PINJAM)
                    .addComponent(USERNAME_TRANSAKSI)
                    .addComponent(T_TR_KEMBALI)
                    .addComponent(T_TR_LAPORAN))
                .addContainerGap())
            .addComponent(ICON_TR_TRANSAKSI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        FRAME_TRANSAKSI.setBackground(new java.awt.Color(239, 240, 245));
        FRAME_TRANSAKSI.setLayout(new java.awt.CardLayout());

        F_TR_LAPORAN.setBackground(new java.awt.Color(239, 240, 245));

        F_TB_LAPORAN.setBackground(new java.awt.Color(239, 240, 245));

        T_LP_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_LP_TRANSAKSI.setForeground(new java.awt.Color(96, 96, 96));
        T_LP_TRANSAKSI.setText("Transaksi");
        T_LP_TRANSAKSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_LP_TRANSAKSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_LP_TRANSAKSIMouseClicked(evt);
            }
        });

        T_LP_BUKU_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_LP_BUKU_BERMASALAH.setForeground(new java.awt.Color(96, 96, 96));
        T_LP_BUKU_BERMASALAH.setText("Buku Bermasalah");
        T_LP_BUKU_BERMASALAH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_LP_BUKU_BERMASALAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_LP_BUKU_BERMASALAHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout F_TB_LAPORANLayout = new javax.swing.GroupLayout(F_TB_LAPORAN);
        F_TB_LAPORAN.setLayout(F_TB_LAPORANLayout);
        F_TB_LAPORANLayout.setHorizontalGroup(
            F_TB_LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_TB_LAPORANLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(T_LP_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(T_LP_BUKU_BERMASALAH, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        F_TB_LAPORANLayout.setVerticalGroup(
            F_TB_LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_TB_LAPORANLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(F_TB_LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_LP_TRANSAKSI)
                    .addComponent(T_LP_BUKU_BERMASALAH))
                .addGap(25, 25, 25))
        );

        F_TR_CONTENT_LAPORAN.setBackground(new java.awt.Color(239, 240, 245));
        F_TR_CONTENT_LAPORAN.setLayout(new java.awt.CardLayout());

        F_CONTENT_BUKU_BERMASALAH.setBackground(new java.awt.Color(239, 240, 245));

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "50", "100", "Semua" }));

        TABLES_LAPORAN_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLES_LAPORAN_BERMASALAH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transaksi", "Peminjam", "Jumlah Buku", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLES_LAPORAN_BERMASALAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLES_LAPORAN_BERMASALAHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TABLES_LAPORAN_BERMASALAH);
        if (TABLES_LAPORAN_BERMASALAH.getColumnModel().getColumnCount() > 0) {
            TABLES_LAPORAN_BERMASALAH.getColumnModel().getColumn(2).setPreferredWidth(200);
            TABLES_LAPORAN_BERMASALAH.getColumnModel().getColumn(2).setMaxWidth(200);
            TABLES_LAPORAN_BERMASALAH.getColumnModel().getColumn(3).setPreferredWidth(200);
            TABLES_LAPORAN_BERMASALAH.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        javax.swing.GroupLayout F_CONTENT_BUKU_BERMASALAHLayout = new javax.swing.GroupLayout(F_CONTENT_BUKU_BERMASALAH);
        F_CONTENT_BUKU_BERMASALAH.setLayout(F_CONTENT_BUKU_BERMASALAHLayout);
        F_CONTENT_BUKU_BERMASALAHLayout.setHorizontalGroup(
            F_CONTENT_BUKU_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_CONTENT_BUKU_BERMASALAHLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_CONTENT_BUKU_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(F_CONTENT_BUKU_BERMASALAHLayout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        F_CONTENT_BUKU_BERMASALAHLayout.setVerticalGroup(
            F_CONTENT_BUKU_BERMASALAHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_CONTENT_BUKU_BERMASALAHLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        F_TR_CONTENT_LAPORAN.add(F_CONTENT_BUKU_BERMASALAH, "card2");

        F_CONTENT_TRANSAKSI.setBackground(new java.awt.Color(239, 240, 245));

        INPUT_LAPORAN_LIMIT_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_LAPORAN_LIMIT_TRANSAKSI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "20", "50", "100" }));
        INPUT_LAPORAN_LIMIT_TRANSAKSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUT_LAPORAN_LIMIT_TRANSAKSIActionPerformed(evt);
            }
        });

        TABLE_LAPORAN_TRANSAKSI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Peminjam", "Jumlah Buku", "Status"
            }
        ));
        TABLE_LAPORAN_TRANSAKSI.setRowHeight(30);
        TABLE_LAPORAN_TRANSAKSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LAPORAN_TRANSAKSIMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TABLE_LAPORAN_TRANSAKSI);
        if (TABLE_LAPORAN_TRANSAKSI.getColumnModel().getColumnCount() > 0) {
            TABLE_LAPORAN_TRANSAKSI.getColumnModel().getColumn(2).setPreferredWidth(150);
            TABLE_LAPORAN_TRANSAKSI.getColumnModel().getColumn(2).setMaxWidth(150);
            TABLE_LAPORAN_TRANSAKSI.getColumnModel().getColumn(3).setPreferredWidth(150);
            TABLE_LAPORAN_TRANSAKSI.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        INPUT_LAPORAN_ID_TRANSAKSI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        INPUT_LAPORAN_ID_TRANSAKSI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        INPUT_LAPORAN_ID_TRANSAKSI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                INPUT_LAPORAN_ID_TRANSAKSIKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout F_CONTENT_TRANSAKSILayout = new javax.swing.GroupLayout(F_CONTENT_TRANSAKSI);
        F_CONTENT_TRANSAKSI.setLayout(F_CONTENT_TRANSAKSILayout);
        F_CONTENT_TRANSAKSILayout.setHorizontalGroup(
            F_CONTENT_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_CONTENT_TRANSAKSILayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_CONTENT_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(F_CONTENT_TRANSAKSILayout.createSequentialGroup()
                        .addComponent(INPUT_LAPORAN_ID_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(INPUT_LAPORAN_LIMIT_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        F_CONTENT_TRANSAKSILayout.setVerticalGroup(
            F_CONTENT_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_CONTENT_TRANSAKSILayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(F_CONTENT_TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(INPUT_LAPORAN_LIMIT_TRANSAKSI, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(INPUT_LAPORAN_ID_TRANSAKSI))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        F_TR_CONTENT_LAPORAN.add(F_CONTENT_TRANSAKSI, "card2");

        javax.swing.GroupLayout F_TR_LAPORANLayout = new javax.swing.GroupLayout(F_TR_LAPORAN);
        F_TR_LAPORAN.setLayout(F_TR_LAPORANLayout);
        F_TR_LAPORANLayout.setHorizontalGroup(
            F_TR_LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(F_TB_LAPORAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(F_TR_CONTENT_LAPORAN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        F_TR_LAPORANLayout.setVerticalGroup(
            F_TR_LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_TR_LAPORANLayout.createSequentialGroup()
                .addComponent(F_TB_LAPORAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(F_TR_CONTENT_LAPORAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FRAME_TRANSAKSI.add(F_TR_LAPORAN, "card2");

        F_TR_KEMBALI.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_PENGEMBALIAN.setText("Form Pengembalian");

        BTN_CETAK_PENGEMBALIAN.setBackground(new java.awt.Color(0, 171, 60));
        BTN_CETAK_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        BTN_CETAK_PENGEMBALIAN.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CETAK_PENGEMBALIAN.setText("Konfirmasi Pengembalian [ENTER]");
        BTN_CETAK_PENGEMBALIAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CETAK_PENGEMBALIANMouseClicked(evt);
            }
        });

        PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PJ_INPUT_ID_TRANSAKSI_PENGEMBALIANKeyPressed(evt);
            }
        });

        PJ_ID_TRANSAKSI_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_ID_TRANSAKSI_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_ID_TRANSAKSI_PENGEMBALIAN.setText("ID Transaksi");

        PJ_INPUT_PEMINJAM_PENGEMBALIAN.setEditable(false);
        PJ_INPUT_PEMINJAM_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_PEMINJAM_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_PEMINJAM_PENGEMBALIAN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        PJ_INPUT_PEMINJAM_PENGEMBALIAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PJ_INPUT_PEMINJAM_PENGEMBALIANKeyPressed(evt);
            }
        });

        PJ_LABEL_PEMINJAM_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_PEMINJAM_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_PEMINJAM_PENGEMBALIAN.setText("Peminjam");

        PJ_LABEL_KAT_BUKU_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_KAT_BUKU_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_KAT_BUKU_PENGEMBALIAN.setText("Jenis Buku");

        PJ_LABEL_TGL_PINJAM_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_TGL_PINJAM_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_TGL_PINJAM_PENGEMBALIAN.setText("Tanggal Meminjam");

        PJ_INPUT_JENIS_BUKU_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_INPUT_JENIS_BUKU_PENGEMBALIAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UMUM - Buku Umum", "PAKET - Buku Paket" }));
        PJ_INPUT_JENIS_BUKU_PENGEMBALIAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PJ_INPUT_JENIS_BUKU_PENGEMBALIANActionPerformed(evt);
            }
        });

        PJ_INPUT_TGL_PINJAM_PENGEMBALIAN.setEditable(false);
        PJ_INPUT_TGL_PINJAM_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_TGL_PINJAM_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_TGL_PINJAM_PENGEMBALIAN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        PJ_ID_TRANSAKSI_PENGEMBALIAN1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_ID_TRANSAKSI_PENGEMBALIAN1.setForeground(new java.awt.Color(96, 96, 96));
        PJ_ID_TRANSAKSI_PENGEMBALIAN1.setText("TR - ");

        PJ_LABEL_PENGURUS_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_PENGURUS_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_PENGURUS_PENGEMBALIAN.setText("Pengurus Peminjaman");

        PJ_INPUT_PENGURUS_PENGEMBALIAN.setEditable(false);
        PJ_INPUT_PENGURUS_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_PENGURUS_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_PENGURUS_PENGEMBALIAN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        CONTAINER_FORM.setBackground(new java.awt.Color(255, 255, 255));

        T_PJ_BUKU_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        T_PJ_BUKU_PENGEMBALIAN.setForeground(new java.awt.Color(96, 96, 96));
        T_PJ_BUKU_PENGEMBALIAN.setText("Daftar Buku yang dipinjam");

        TABLE_LIST_PENGEMBALIAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLE_LIST_PENGEMBALIAN.setRowHeight(30);
        TABLE_LIST_PENGEMBALIAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_PENGEMBALIANMouseClicked(evt);
            }
        });
        TABLE_LIST_PENGEMBALIAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TABLE_LIST_PENGEMBALIANKeyPressed(evt);
            }
        });
        TABLE_PENGEMBALIAN.setViewportView(TABLE_LIST_PENGEMBALIAN);
        if (TABLE_LIST_PENGEMBALIAN.getColumnModel().getColumnCount() > 0) {
            TABLE_LIST_PENGEMBALIAN.getColumnModel().getColumn(0).setPreferredWidth(200);
            TABLE_LIST_PENGEMBALIAN.getColumnModel().getColumn(0).setMaxWidth(200);
            TABLE_LIST_PENGEMBALIAN.getColumnModel().getColumn(2).setPreferredWidth(150);
            TABLE_LIST_PENGEMBALIAN.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        T_PJ_ALERT_PENGEMBALIAN.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        T_PJ_ALERT_PENGEMBALIAN.setForeground(new java.awt.Color(255, 102, 102));
        T_PJ_ALERT_PENGEMBALIAN.setText("*) Klik 2 kali untuk mengkonfirmasi buku yang akan dikembalikan    *) Klik F2 untuk mengubah status buku yang akan dikembalikan");

        T_PJ_BUKU_PENGEMBALIAN1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        T_PJ_BUKU_PENGEMBALIAN1.setForeground(new java.awt.Color(96, 96, 96));
        T_PJ_BUKU_PENGEMBALIAN1.setText("Daftar Buku yang dikembalikan");

        TABLE_LIST_PENGEMBALIAN1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLE_LIST_PENGEMBALIAN1.setRowHeight(30);
        TABLE_LIST_PENGEMBALIAN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TABLE_LIST_PENGEMBALIAN1KeyPressed(evt);
            }
        });
        TABLE_PENGEMBALIAN1.setViewportView(TABLE_LIST_PENGEMBALIAN1);
        if (TABLE_LIST_PENGEMBALIAN1.getColumnModel().getColumnCount() > 0) {
            TABLE_LIST_PENGEMBALIAN1.getColumnModel().getColumn(0).setPreferredWidth(200);
            TABLE_LIST_PENGEMBALIAN1.getColumnModel().getColumn(0).setMaxWidth(200);
            TABLE_LIST_PENGEMBALIAN1.getColumnModel().getColumn(2).setPreferredWidth(150);
            TABLE_LIST_PENGEMBALIAN1.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        T_PJ_ALERT_PENGEMBALIAN1.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        T_PJ_ALERT_PENGEMBALIAN1.setForeground(new java.awt.Color(255, 102, 102));
        T_PJ_ALERT_PENGEMBALIAN1.setText("*) Klik F7 untuk mengembalikan buku ke daftar pinjam");

        javax.swing.GroupLayout CONTAINER_FORMLayout = new javax.swing.GroupLayout(CONTAINER_FORM);
        CONTAINER_FORM.setLayout(CONTAINER_FORMLayout);
        CONTAINER_FORMLayout.setHorizontalGroup(
            CONTAINER_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TABLE_PENGEMBALIAN, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(TABLE_PENGEMBALIAN1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addComponent(T_PJ_ALERT_PENGEMBALIAN, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addGroup(CONTAINER_FORMLayout.createSequentialGroup()
                .addComponent(T_PJ_BUKU_PENGEMBALIAN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(310, 310, 310))
            .addComponent(T_PJ_BUKU_PENGEMBALIAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CONTAINER_FORMLayout.createSequentialGroup()
                .addComponent(T_PJ_ALERT_PENGEMBALIAN1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CONTAINER_FORMLayout.setVerticalGroup(
            CONTAINER_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINER_FORMLayout.createSequentialGroup()
                .addComponent(T_PJ_BUKU_PENGEMBALIAN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TABLE_PENGEMBALIAN, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(T_PJ_ALERT_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(T_PJ_BUKU_PENGEMBALIAN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TABLE_PENGEMBALIAN1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(T_PJ_ALERT_PENGEMBALIAN1))
        );

        javax.swing.GroupLayout F_TR_KEMBALILayout = new javax.swing.GroupLayout(F_TR_KEMBALI);
        F_TR_KEMBALI.setLayout(F_TR_KEMBALILayout);
        F_TR_KEMBALILayout.setHorizontalGroup(
            F_TR_KEMBALILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_TR_KEMBALILayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_TR_KEMBALILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_FRAME_PENGEMBALIAN)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_TR_KEMBALILayout.createSequentialGroup()
                        .addComponent(CONTAINER_FORM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(F_TR_KEMBALILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(F_TR_KEMBALILayout.createSequentialGroup()
                                .addComponent(PJ_ID_TRANSAKSI_PENGEMBALIAN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTN_CETAK_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_ID_TRANSAKSI_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_PEMINJAM_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_PEMINJAM_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_KAT_BUKU_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_TGL_PINJAM_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_JENIS_BUKU_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_TGL_PINJAM_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_PENGURUS_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_PENGURUS_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        F_TR_KEMBALILayout.setVerticalGroup(
            F_TR_KEMBALILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_TR_KEMBALILayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TITLE_FRAME_PENGEMBALIAN)
                .addGap(18, 18, 18)
                .addGroup(F_TR_KEMBALILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(F_TR_KEMBALILayout.createSequentialGroup()
                        .addComponent(PJ_ID_TRANSAKSI_PENGEMBALIAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(F_TR_KEMBALILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_ID_TRANSAKSI_PENGEMBALIAN1))
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_PEMINJAM_PENGEMBALIAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_PEMINJAM_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_KAT_BUKU_PENGEMBALIAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_JENIS_BUKU_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_TGL_PINJAM_PENGEMBALIAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_TGL_PINJAM_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_PENGURUS_PENGEMBALIAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_PENGURUS_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(BTN_CETAK_PENGEMBALIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CONTAINER_FORM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        FRAME_TRANSAKSI.add(F_TR_KEMBALI, "card2");

        F_TR_PINJAM.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_PINJAM.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_PINJAM.setText("Form Peminjaman");

        T_PJ_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_PJ_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        T_PJ_BUKU.setText("Buku");

        TABLE_LIST_PINJAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TABLE_LIST_PINJAM.setRowHeight(30);
        TABLE_LIST_PINJAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TABLE_LIST_PINJAMKeyPressed(evt);
            }
        });
        TABLE_PINJAM.setViewportView(TABLE_LIST_PINJAM);

        BTN_CETAK_PINJAMAN.setBackground(new java.awt.Color(0, 171, 60));
        BTN_CETAK_PINJAMAN.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        BTN_CETAK_PINJAMAN.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CETAK_PINJAMAN.setText("Konfirmasi Pinjaman [ENTER]");
        BTN_CETAK_PINJAMAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CETAK_PINJAMANMouseClicked(evt);
            }
        });

        PJ_INPUT_ID_TRANSAKSI.setEditable(false);
        PJ_INPUT_ID_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_ID_TRANSAKSI.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_ID_TRANSAKSI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        PJ_ID_TRANSAKSI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_ID_TRANSAKSI.setForeground(new java.awt.Color(96, 96, 96));
        PJ_ID_TRANSAKSI.setText("ID Transaksi");

        PJ_INPUT_PEMINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_PEMINJAM.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_PEMINJAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        PJ_INPUT_PEMINJAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PJ_INPUT_PEMINJAMKeyPressed(evt);
            }
        });

        PJ_LABEL_PEMINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_PEMINJAM.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_PEMINJAM.setText("Peminjam");

        PJ_LABEL_KAT_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_KAT_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_KAT_BUKU.setText("Jenis Buku");

        PJ_LABEL_TGL_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_LABEL_TGL_PINJAM.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_TGL_PINJAM.setText("Tanggal");

        PJ_LABEL_INFO_1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_LABEL_INFO_1.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_INFO_1.setText("Dengan meminjam buku, berarti peminjam sudah ");

        PJ_LABEL_INFO_2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_LABEL_INFO_2.setForeground(new java.awt.Color(96, 96, 96));
        PJ_LABEL_INFO_2.setText("memahami peraturan dan tata tertib perpustakaan.");

        PJ_INPUT_JENIS_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PJ_INPUT_JENIS_BUKU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UMUM - Buku Umum", "PAKET - Buku Paket" }));
        PJ_INPUT_JENIS_BUKU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PJ_INPUT_JENIS_BUKUActionPerformed(evt);
            }
        });

        PJ_INPUT_TGL_PINJAM.setEditable(false);
        PJ_INPUT_TGL_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PJ_INPUT_TGL_PINJAM.setForeground(new java.awt.Color(96, 96, 96));
        PJ_INPUT_TGL_PINJAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        BTN_RESET_DAFTAR_BUKU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_RESET.png"))); // NOI18N
        BTN_RESET_DAFTAR_BUKU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_RESET_DAFTAR_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_RESET_DAFTAR_BUKUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout F_TR_PINJAMLayout = new javax.swing.GroupLayout(F_TR_PINJAM);
        F_TR_PINJAM.setLayout(F_TR_PINJAMLayout);
        F_TR_PINJAMLayout.setHorizontalGroup(
            F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_TR_PINJAMLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE_FRAME_PINJAM)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_TR_PINJAMLayout.createSequentialGroup()
                        .addGroup(F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(F_TR_PINJAMLayout.createSequentialGroup()
                                .addComponent(T_PJ_BUKU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_RESET_DAFTAR_BUKU))
                            .addComponent(TABLE_PINJAM, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_CETAK_PINJAMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_ID_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_ID_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_PEMINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_PEMINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_KAT_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_TGL_PINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_INFO_1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_LABEL_INFO_2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_JENIS_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PJ_INPUT_TGL_PINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        F_TR_PINJAMLayout.setVerticalGroup(
            F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_TR_PINJAMLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TITLE_FRAME_PINJAM)
                .addGap(18, 18, 18)
                .addGroup(F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(F_TR_PINJAMLayout.createSequentialGroup()
                        .addGroup(F_TR_PINJAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_RESET_DAFTAR_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(T_PJ_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(TABLE_PINJAM, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                    .addGroup(F_TR_PINJAMLayout.createSequentialGroup()
                        .addComponent(PJ_ID_TRANSAKSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_ID_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_PEMINJAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_PEMINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_KAT_BUKU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_JENIS_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_TGL_PINJAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_INPUT_TGL_PINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PJ_LABEL_INFO_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PJ_LABEL_INFO_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_CETAK_PINJAMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        FRAME_TRANSAKSI.add(F_TR_PINJAM, "card2");

        javax.swing.GroupLayout TRANSAKSILayout = new javax.swing.GroupLayout(TRANSAKSI);
        TRANSAKSI.setLayout(TRANSAKSILayout);
        TRANSAKSILayout.setHorizontalGroup(
            TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TRANSAKSILayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FRAME_TRANSAKSI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TOPBAR_TRANSAKSI, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        TRANSAKSILayout.setVerticalGroup(
            TRANSAKSILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRANSAKSILayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TOPBAR_TRANSAKSI, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FRAME_TRANSAKSI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        MAIN_FRAME.add(TRANSAKSI, "card3");

        DATABUKU.setBackground(new java.awt.Color(239, 240, 245));

        TOPBAR_DATABUKU.setBackground(new java.awt.Color(239, 240, 245));
        TOPBAR_DATABUKU.setPreferredSize(new java.awt.Dimension(353, 70));

        T_DB_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_DB_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        T_DB_BUKU.setText("Buku");
        T_DB_BUKU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_DB_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_DB_BUKUMouseClicked(evt);
            }
        });

        T_DB_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_DB_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        T_DB_KATEGORI.setText("Kategori");
        T_DB_KATEGORI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_DB_KATEGORI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_DB_KATEGORIMouseClicked(evt);
            }
        });

        T_DB_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_DB_PENERBIT.setForeground(new java.awt.Color(96, 96, 96));
        T_DB_PENERBIT.setText("Penerbit");
        T_DB_PENERBIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_DB_PENERBIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_DB_PENERBITMouseClicked(evt);
            }
        });

        T_DB_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_DB_RAK.setForeground(new java.awt.Color(96, 96, 96));
        T_DB_RAK.setText("Rak");
        T_DB_RAK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_DB_RAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_DB_RAKMouseClicked(evt);
            }
        });

        USERNAME_DATABUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        USERNAME_DATABUKU.setForeground(new java.awt.Color(96, 96, 96));
        USERNAME_DATABUKU.setText("USERNAME");

        ICON_DB_DATABUKU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_AKUN_CIRCLE.png"))); // NOI18N

        javax.swing.GroupLayout TOPBAR_DATABUKULayout = new javax.swing.GroupLayout(TOPBAR_DATABUKU);
        TOPBAR_DATABUKU.setLayout(TOPBAR_DATABUKULayout);
        TOPBAR_DATABUKULayout.setHorizontalGroup(
            TOPBAR_DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_DATABUKULayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(T_DB_BUKU)
                .addGap(46, 46, 46)
                .addComponent(T_DB_KATEGORI)
                .addGap(46, 46, 46)
                .addComponent(T_DB_PENERBIT)
                .addGap(46, 46, 46)
                .addComponent(T_DB_RAK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERNAME_DATABUKU)
                .addGap(18, 18, 18)
                .addComponent(ICON_DB_DATABUKU)
                .addGap(27, 27, 27))
        );
        TOPBAR_DATABUKULayout.setVerticalGroup(
            TOPBAR_DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_DATABUKULayout.createSequentialGroup()
                .addGroup(TOPBAR_DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TOPBAR_DATABUKULayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(TOPBAR_DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_DB_BUKU)
                            .addComponent(USERNAME_DATABUKU)
                            .addComponent(T_DB_KATEGORI)
                            .addComponent(T_DB_PENERBIT)
                            .addComponent(T_DB_RAK)))
                    .addGroup(TOPBAR_DATABUKULayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ICON_DB_DATABUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );

        FRAME_DATABUKU.setBackground(new java.awt.Color(153, 204, 255));
        FRAME_DATABUKU.setLayout(new java.awt.CardLayout());

        F_DB_BUKU.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_BUKU.setText("Daftar Buku");

        ICON_ADD_BUKU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_BUKU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_BUKUMouseClicked(evt);
            }
        });

        SEARCH_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_BUKU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_BUKU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_BUKUKeyTyped(evt);
            }
        });

        TABLE_LIST_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE_LIST_BUKU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_BUKU.setRowHeight(30);
        TABLE_LIST_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_BUKUMouseClicked(evt);
            }
        });
        TABLE_LIST_DB_BUKU.setViewportView(TABLE_LIST_BUKU);

        FILTER_TAMPIL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FILTER_TAMPIL_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        FILTER_TAMPIL_BUKU.setText("Tampilkan");

        TAMPILKAN_COMBOBOX_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TAMPILKAN_COMBOBOX_BUKU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "20", "50", "100" }));
        TAMPILKAN_COMBOBOX_BUKU.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TAMPILKAN_COMBOBOX_BUKUItemStateChanged(evt);
            }
        });

        FILTER_KATEGORI_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FILTER_KATEGORI_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        FILTER_KATEGORI_BUKU.setText("Kategori");

        KATEGORI_COMBOBOX_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        KATEGORI_COMBOBOX_BUKU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Jenis", "Kategori" }));
        KATEGORI_COMBOBOX_BUKU.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                KATEGORI_COMBOBOX_BUKUItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout F_DB_BUKULayout = new javax.swing.GroupLayout(F_DB_BUKU);
        F_DB_BUKU.setLayout(F_DB_BUKULayout);
        F_DB_BUKULayout.setHorizontalGroup(
            F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_DB_BUKULayout.createSequentialGroup()
                .addGroup(F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(F_DB_BUKULayout.createSequentialGroup()
                        .addContainerGap(676, Short.MAX_VALUE)
                        .addComponent(FILTER_KATEGORI_BUKU)
                        .addGap(18, 18, 18)
                        .addComponent(KATEGORI_COMBOBOX_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(FILTER_TAMPIL_BUKU)
                        .addGap(18, 18, 18)
                        .addComponent(TAMPILKAN_COMBOBOX_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(F_DB_BUKULayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TABLE_LIST_DB_BUKU)
                            .addGroup(F_DB_BUKULayout.createSequentialGroup()
                                .addComponent(TITLE_FRAME_BUKU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SEARCH_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ICON_ADD_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        F_DB_BUKULayout.setVerticalGroup(
            F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_DB_BUKULayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_BUKU)
                    .addComponent(ICON_ADD_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_BUKU))
                .addGap(29, 29, 29)
                .addComponent(TABLE_LIST_DB_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(F_DB_BUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TAMPILKAN_COMBOBOX_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FILTER_TAMPIL_BUKU))
                    .addComponent(FILTER_KATEGORI_BUKU)
                    .addComponent(KATEGORI_COMBOBOX_BUKU))
                .addGap(20, 20, 20))
        );

        FRAME_DATABUKU.add(F_DB_BUKU, "card2");

        F_DB_KATEGORI.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_KATEGORI.setText("Daftar Kategori");

        ICON_ADD_KATEGORI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_KATEGORI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_KATEGORI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_KATEGORIMouseClicked(evt);
            }
        });

        TABLE_LIST_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE_LIST_KATEGORI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_KATEGORI.setRowHeight(30);
        TABLE_LIST_KATEGORI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_KATEGORIMouseClicked(evt);
            }
        });
        TABLE_KATEGORI.setViewportView(TABLE_LIST_KATEGORI);

        SEARCH_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_KATEGORI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_KATEGORI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_KATEGORIKeyTyped(evt);
            }
        });

        FILTER_TAMPIL_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FILTER_TAMPIL_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        FILTER_TAMPIL_KATEGORI.setText("Tampilkan");

        TAMPILKAN_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TAMPILKAN_KATEGORI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "20", "50", "100" }));
        TAMPILKAN_KATEGORI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TAMPILKAN_KATEGORIItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout F_DB_KATEGORILayout = new javax.swing.GroupLayout(F_DB_KATEGORI);
        F_DB_KATEGORI.setLayout(F_DB_KATEGORILayout);
        F_DB_KATEGORILayout.setHorizontalGroup(
            F_DB_KATEGORILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_DB_KATEGORILayout.createSequentialGroup()
                .addGroup(F_DB_KATEGORILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(F_DB_KATEGORILayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FILTER_TAMPIL_KATEGORI)
                        .addGap(18, 18, 18)
                        .addComponent(TAMPILKAN_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(F_DB_KATEGORILayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(F_DB_KATEGORILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TABLE_KATEGORI)
                            .addGroup(F_DB_KATEGORILayout.createSequentialGroup()
                                .addComponent(TITLE_FRAME_KATEGORI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 688, Short.MAX_VALUE)
                                .addComponent(SEARCH_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ICON_ADD_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        F_DB_KATEGORILayout.setVerticalGroup(
            F_DB_KATEGORILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_DB_KATEGORILayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_DB_KATEGORILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_KATEGORI)
                    .addComponent(ICON_ADD_KATEGORI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_KATEGORI))
                .addGap(29, 29, 29)
                .addComponent(TABLE_KATEGORI, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(F_DB_KATEGORILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TAMPILKAN_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FILTER_TAMPIL_KATEGORI))
                .addGap(20, 20, 20))
        );

        FRAME_DATABUKU.add(F_DB_KATEGORI, "card2");

        F_DB_PENERBIT.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_PENERBIT.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_PENERBIT.setText("Daftar Penerbit");

        ICON_ADD_PENERBIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_PENERBIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_PENERBIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_PENERBITMouseClicked(evt);
            }
        });

        SEARCH_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_PENERBIT.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_PENERBIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_PENERBIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_PENERBITKeyTyped(evt);
            }
        });

        TABLE_LIST_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE_LIST_PENERBIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_PENERBIT.setRowHeight(30);
        TABLE_LIST_PENERBIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_PENERBITMouseClicked(evt);
            }
        });
        TABLE_PENERBIT.setViewportView(TABLE_LIST_PENERBIT);

        FILTER_TAMPIL_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FILTER_TAMPIL_PENERBIT.setForeground(new java.awt.Color(96, 96, 96));
        FILTER_TAMPIL_PENERBIT.setText("Tampilkan");

        TAMPILKAN_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TAMPILKAN_PENERBIT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "20", "50", "100" }));
        TAMPILKAN_PENERBIT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TAMPILKAN_PENERBITItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout F_DB_PENERBITLayout = new javax.swing.GroupLayout(F_DB_PENERBIT);
        F_DB_PENERBIT.setLayout(F_DB_PENERBITLayout);
        F_DB_PENERBITLayout.setHorizontalGroup(
            F_DB_PENERBITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_DB_PENERBITLayout.createSequentialGroup()
                .addGroup(F_DB_PENERBITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(F_DB_PENERBITLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FILTER_TAMPIL_PENERBIT)
                        .addGap(18, 18, 18)
                        .addComponent(TAMPILKAN_PENERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(F_DB_PENERBITLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(F_DB_PENERBITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TABLE_PENERBIT)
                            .addGroup(F_DB_PENERBITLayout.createSequentialGroup()
                                .addComponent(TITLE_FRAME_PENERBIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                                .addComponent(SEARCH_PENERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ICON_ADD_PENERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        F_DB_PENERBITLayout.setVerticalGroup(
            F_DB_PENERBITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_DB_PENERBITLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_DB_PENERBITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_PENERBIT)
                    .addComponent(ICON_ADD_PENERBIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_PENERBIT))
                .addGap(29, 29, 29)
                .addComponent(TABLE_PENERBIT, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(F_DB_PENERBITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TAMPILKAN_PENERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FILTER_TAMPIL_PENERBIT))
                .addGap(20, 20, 20))
        );

        FRAME_DATABUKU.add(F_DB_PENERBIT, "card2");

        F_DB_RAK.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_RAK.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_RAK.setText("Daftar Rak");

        ICON_ADD_RAK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_RAK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_RAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_RAKMouseClicked(evt);
            }
        });

        SEARCH_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_RAK.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_RAK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_RAK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_RAKKeyTyped(evt);
            }
        });

        TABLE_LIST_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE_LIST_RAK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_RAK.setRowHeight(30);
        TABLE_LIST_RAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_RAKMouseClicked(evt);
            }
        });
        TABLE_RAK.setViewportView(TABLE_LIST_RAK);

        FILTER_TAMPIL_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FILTER_TAMPIL_RAK.setForeground(new java.awt.Color(96, 96, 96));
        FILTER_TAMPIL_RAK.setText("Tampilkan");

        TAMPILKAN_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TAMPILKAN_RAK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "20", "50", "100" }));
        TAMPILKAN_RAK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TAMPILKAN_RAKItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout F_DB_RAKLayout = new javax.swing.GroupLayout(F_DB_RAK);
        F_DB_RAK.setLayout(F_DB_RAKLayout);
        F_DB_RAKLayout.setHorizontalGroup(
            F_DB_RAKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_DB_RAKLayout.createSequentialGroup()
                .addGroup(F_DB_RAKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(F_DB_RAKLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FILTER_TAMPIL_RAK)
                        .addGap(18, 18, 18)
                        .addComponent(TAMPILKAN_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(F_DB_RAKLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(F_DB_RAKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TABLE_RAK)
                            .addGroup(F_DB_RAKLayout.createSequentialGroup()
                                .addComponent(TITLE_FRAME_RAK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                                .addComponent(SEARCH_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ICON_ADD_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        F_DB_RAKLayout.setVerticalGroup(
            F_DB_RAKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_DB_RAKLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_DB_RAKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_RAK)
                    .addComponent(ICON_ADD_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_RAK))
                .addGap(29, 29, 29)
                .addComponent(TABLE_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(F_DB_RAKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TAMPILKAN_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FILTER_TAMPIL_RAK))
                .addGap(20, 20, 20))
        );

        FRAME_DATABUKU.add(F_DB_RAK, "card2");

        javax.swing.GroupLayout DATABUKULayout = new javax.swing.GroupLayout(DATABUKU);
        DATABUKU.setLayout(DATABUKULayout);
        DATABUKULayout.setHorizontalGroup(
            DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DATABUKULayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FRAME_DATABUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TOPBAR_DATABUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        DATABUKULayout.setVerticalGroup(
            DATABUKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DATABUKULayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TOPBAR_DATABUKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(FRAME_DATABUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        MAIN_FRAME.add(DATABUKU, "card3");

        USER.setBackground(new java.awt.Color(239, 240, 245));

        TOPBAR_USER.setBackground(new java.awt.Color(239, 240, 245));
        TOPBAR_USER.setPreferredSize(new java.awt.Dimension(353, 70));

        T_U_ANGGOTA.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_U_ANGGOTA.setForeground(new java.awt.Color(96, 96, 96));
        T_U_ANGGOTA.setText("Anggota");
        T_U_ANGGOTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_U_ANGGOTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_U_ANGGOTAMouseClicked(evt);
            }
        });

        T_U_JURUSAN.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_U_JURUSAN.setForeground(new java.awt.Color(96, 96, 96));
        T_U_JURUSAN.setText("Jurusan");
        T_U_JURUSAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_U_JURUSAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_U_JURUSANMouseClicked(evt);
            }
        });

        T_U_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        T_U_PENGURUS.setForeground(new java.awt.Color(96, 96, 96));
        T_U_PENGURUS.setText("Pengurus");
        T_U_PENGURUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_U_PENGURUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_U_PENGURUSMouseClicked(evt);
            }
        });

        USERNAME_USER.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        USERNAME_USER.setForeground(new java.awt.Color(96, 96, 96));
        USERNAME_USER.setText("USERNAME");

        ICON_U_USER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_AKUN_CIRCLE.png"))); // NOI18N

        javax.swing.GroupLayout TOPBAR_USERLayout = new javax.swing.GroupLayout(TOPBAR_USER);
        TOPBAR_USER.setLayout(TOPBAR_USERLayout);
        TOPBAR_USERLayout.setHorizontalGroup(
            TOPBAR_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_USERLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(T_U_ANGGOTA)
                .addGap(46, 46, 46)
                .addComponent(T_U_JURUSAN)
                .addGap(46, 46, 46)
                .addComponent(T_U_PENGURUS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERNAME_USER)
                .addGap(18, 18, 18)
                .addComponent(ICON_U_USER)
                .addGap(27, 27, 27))
        );
        TOPBAR_USERLayout.setVerticalGroup(
            TOPBAR_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_USERLayout.createSequentialGroup()
                .addGroup(TOPBAR_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TOPBAR_USERLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(TOPBAR_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_U_ANGGOTA)
                            .addComponent(USERNAME_USER)
                            .addComponent(T_U_JURUSAN)
                            .addComponent(T_U_PENGURUS)))
                    .addGroup(TOPBAR_USERLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ICON_U_USER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        FRAME_USER.setBackground(new java.awt.Color(239, 240, 245));
        FRAME_USER.setLayout(new java.awt.CardLayout());

        F_U_ANGGOTA.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_USER.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_USER.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_USER.setText("Daftar Anggota");

        ICON_ADD_USER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_USER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_USERMouseClicked(evt);
            }
        });

        SEARCH_USER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_USER.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_USER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_USERActionPerformed(evt);
            }
        });
        SEARCH_USER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_USERKeyTyped(evt);
            }
        });

        TABLE_LIST_ANGGOTA.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE_LIST_ANGGOTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_ANGGOTA.setRowHeight(30);
        TABLE_LIST_ANGGOTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_ANGGOTAMouseClicked(evt);
            }
        });
        TABLE_LIST_U_ANGGOTA.setViewportView(TABLE_LIST_ANGGOTA);

        FILTER_TAMPIL_USER.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FILTER_TAMPIL_USER.setForeground(new java.awt.Color(96, 96, 96));
        FILTER_TAMPIL_USER.setText("Tampilkan");

        TAMPILKAN_COMBOBOX_USER.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TAMPILKAN_COMBOBOX_USER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "25", "50", "100" }));
        TAMPILKAN_COMBOBOX_USER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TAMPILKAN_COMBOBOX_USERItemStateChanged(evt);
            }
        });

        GROUP_KELAS_USER.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        GROUP_KELAS_USER.setForeground(new java.awt.Color(96, 96, 96));
        GROUP_KELAS_USER.setText("Group");

        GROUP_COMBOBOX_USER.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        GROUP_COMBOBOX_USER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Jurusan" }));
        GROUP_COMBOBOX_USER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GROUP_COMBOBOX_USERItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout F_U_ANGGOTALayout = new javax.swing.GroupLayout(F_U_ANGGOTA);
        F_U_ANGGOTA.setLayout(F_U_ANGGOTALayout);
        F_U_ANGGOTALayout.setHorizontalGroup(
            F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_U_ANGGOTALayout.createSequentialGroup()
                .addGroup(F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(F_U_ANGGOTALayout.createSequentialGroup()
                        .addContainerGap(694, Short.MAX_VALUE)
                        .addComponent(GROUP_KELAS_USER)
                        .addGap(18, 18, 18)
                        .addComponent(GROUP_COMBOBOX_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(FILTER_TAMPIL_USER)
                        .addGap(18, 18, 18)
                        .addComponent(TAMPILKAN_COMBOBOX_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(F_U_ANGGOTALayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TABLE_LIST_U_ANGGOTA)
                            .addGroup(F_U_ANGGOTALayout.createSequentialGroup()
                                .addComponent(TITLE_FRAME_USER)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SEARCH_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ICON_ADD_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        F_U_ANGGOTALayout.setVerticalGroup(
            F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_U_ANGGOTALayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_USER)
                    .addComponent(ICON_ADD_USER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_USER))
                .addGap(29, 29, 29)
                .addComponent(TABLE_LIST_U_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(F_U_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TAMPILKAN_COMBOBOX_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FILTER_TAMPIL_USER))
                    .addComponent(GROUP_KELAS_USER)
                    .addComponent(GROUP_COMBOBOX_USER))
                .addGap(20, 20, 20))
        );

        FRAME_USER.add(F_U_ANGGOTA, "card2");

        F_U_JURUSAN.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_JURUSAN.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_JURUSAN.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_JURUSAN.setText("Daftar Jurusan");

        ICON_ADD_JURUSAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_JURUSAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_JURUSAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_JURUSANMouseClicked(evt);
            }
        });

        SEARCH_JURUSAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_JURUSAN.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_JURUSAN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_JURUSAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_JURUSANKeyTyped(evt);
            }
        });

        TABLE_LIST_ITEM_JURUSAN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE_LIST_ITEM_JURUSAN.setForeground(new java.awt.Color(24, 24, 24));
        TABLE_LIST_ITEM_JURUSAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_ITEM_JURUSAN.setRowHeight(30);
        TABLE_LIST_ITEM_JURUSAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_ITEM_JURUSANMouseClicked(evt);
            }
        });
        TABLE_LIST_JURUSAN.setViewportView(TABLE_LIST_ITEM_JURUSAN);

        javax.swing.GroupLayout F_U_JURUSANLayout = new javax.swing.GroupLayout(F_U_JURUSAN);
        F_U_JURUSAN.setLayout(F_U_JURUSANLayout);
        F_U_JURUSANLayout.setHorizontalGroup(
            F_U_JURUSANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_U_JURUSANLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_U_JURUSANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TABLE_LIST_JURUSAN)
                    .addGroup(F_U_JURUSANLayout.createSequentialGroup()
                        .addComponent(TITLE_FRAME_JURUSAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                        .addComponent(SEARCH_JURUSAN, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ICON_ADD_JURUSAN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        F_U_JURUSANLayout.setVerticalGroup(
            F_U_JURUSANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_U_JURUSANLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_U_JURUSANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_JURUSAN)
                    .addComponent(ICON_ADD_JURUSAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_JURUSAN))
                .addGap(29, 29, 29)
                .addComponent(TABLE_LIST_JURUSAN, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        FRAME_USER.add(F_U_JURUSAN, "card2");

        F_U_PENGURUS.setBackground(new java.awt.Color(239, 240, 245));

        TITLE_FRAME_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        TITLE_FRAME_PENGURUS.setForeground(new java.awt.Color(96, 96, 96));
        TITLE_FRAME_PENGURUS.setText("Daftar Pengurus");

        ICON_ADD_PENGURUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_ADD.png"))); // NOI18N
        ICON_ADD_PENGURUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ICON_ADD_PENGURUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICON_ADD_PENGURUSMouseClicked(evt);
            }
        });

        SEARCH_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SEARCH_PENGURUS.setForeground(new java.awt.Color(96, 96, 96));
        SEARCH_PENGURUS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        SEARCH_PENGURUS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCH_PENGURUSKeyTyped(evt);
            }
        });

        TABLE_LIST_ITEM_PENGURUS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dfsd", "fdsfsdf", "sdfsdfsd", "fsdfsd"},
                {"fsdfds", "fsdfds", "fsdfds", "fsdfsd"},
                {"ferf", "sdfsd", "fsf", "dsfsdfsd"},
                {"dsff", "sdgfgf", "gfdg", "fdfgfdgg"}
            },
            new String [] {
                "Title 1fdsfsd", "Title 2fdfdsf", "Title 3dfdsf", "Title 4"
            }
        ));
        TABLE_LIST_ITEM_PENGURUS.setRowHeight(30);
        TABLE_LIST_ITEM_PENGURUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_ITEM_PENGURUSMouseClicked(evt);
            }
        });
        TABLE_LIST_PENGURUS.setViewportView(TABLE_LIST_ITEM_PENGURUS);

        javax.swing.GroupLayout F_U_PENGURUSLayout = new javax.swing.GroupLayout(F_U_PENGURUS);
        F_U_PENGURUS.setLayout(F_U_PENGURUSLayout);
        F_U_PENGURUSLayout.setHorizontalGroup(
            F_U_PENGURUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, F_U_PENGURUSLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_U_PENGURUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TABLE_LIST_PENGURUS)
                    .addGroup(F_U_PENGURUSLayout.createSequentialGroup()
                        .addComponent(TITLE_FRAME_PENGURUS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 680, Short.MAX_VALUE)
                        .addComponent(SEARCH_PENGURUS, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ICON_ADD_PENGURUS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        F_U_PENGURUSLayout.setVerticalGroup(
            F_U_PENGURUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(F_U_PENGURUSLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(F_U_PENGURUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE_FRAME_PENGURUS)
                    .addComponent(ICON_ADD_PENGURUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEARCH_PENGURUS))
                .addGap(29, 29, 29)
                .addComponent(TABLE_LIST_PENGURUS, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        FRAME_USER.add(F_U_PENGURUS, "card2");

        javax.swing.GroupLayout USERLayout = new javax.swing.GroupLayout(USER);
        USER.setLayout(USERLayout);
        USERLayout.setHorizontalGroup(
            USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, USERLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FRAME_USER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TOPBAR_USER, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        USERLayout.setVerticalGroup(
            USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TOPBAR_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(FRAME_USER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        MAIN_FRAME.add(USER, "card5");

        SETTING.setBackground(new java.awt.Color(239, 240, 245));

        TOPBAR_SETTING.setBackground(new java.awt.Color(239, 240, 245));
        TOPBAR_SETTING.setPreferredSize(new java.awt.Dimension(353, 70));

        TITLE_SETTING.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TITLE_SETTING.setForeground(new java.awt.Color(78, 204, 121));
        TITLE_SETTING.setText("Pengaturan");

        USERNAME_SETTING.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        USERNAME_SETTING.setForeground(new java.awt.Color(96, 96, 96));
        USERNAME_SETTING.setText("USERNAME");

        ICON_SETTING.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_AKUN_CIRCLE.png"))); // NOI18N

        javax.swing.GroupLayout TOPBAR_SETTINGLayout = new javax.swing.GroupLayout(TOPBAR_SETTING);
        TOPBAR_SETTING.setLayout(TOPBAR_SETTINGLayout);
        TOPBAR_SETTINGLayout.setHorizontalGroup(
            TOPBAR_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_SETTINGLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TITLE_SETTING)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERNAME_SETTING)
                .addGap(18, 18, 18)
                .addComponent(ICON_SETTING)
                .addGap(27, 27, 27))
        );
        TOPBAR_SETTINGLayout.setVerticalGroup(
            TOPBAR_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPBAR_SETTINGLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TOPBAR_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITLE_SETTING)
                    .addComponent(USERNAME_SETTING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TOPBAR_SETTINGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ICON_SETTING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        FRAME_MAIN_SETTING.setBackground(new java.awt.Color(239, 240, 245));

        MAIN_TTILE.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        MAIN_TTILE.setForeground(new java.awt.Color(96, 96, 96));
        MAIN_TTILE.setText("Pengaturan");

        LABEL_SET_RP.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LABEL_SET_RP.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_SET_RP.setText("Rp");

        LABEL_SET_1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_SET_1.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_SET_1.setText("Denda Terlambat Per Hari");

        INPUT_SET_1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        INPUT_SET_1.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_SET_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        INPUT_SET_1.setMaximumSize(new java.awt.Dimension(1360, 45));
        INPUT_SET_1.setPreferredSize(new java.awt.Dimension(340, 45));

        LABEL_SET_2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_SET_2.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_SET_2.setText("Max Pinjam Buku ( Buku Umum )");

        INPUT_SET_2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        INPUT_SET_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        INPUT_SET_2.setBorder(null);

        LABEL_SET_3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_SET_3.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_SET_3.setText("Backup Database");

        INPUT_SET_3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_SET_3.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_SET_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Per 1 Jam", "Per 2 Jam", "Per 3 Jam" }));

        javax.swing.GroupLayout FRAME_MAIN_SETTINGLayout = new javax.swing.GroupLayout(FRAME_MAIN_SETTING);
        FRAME_MAIN_SETTING.setLayout(FRAME_MAIN_SETTINGLayout);
        FRAME_MAIN_SETTINGLayout.setHorizontalGroup(
            FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                        .addComponent(MAIN_TTILE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                        .addGroup(FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(INPUT_SET_3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                                .addGroup(FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                                        .addComponent(LABEL_SET_RP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(INPUT_SET_1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LABEL_SET_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(INPUT_SET_2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LABEL_SET_2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LABEL_SET_3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))))
        );
        FRAME_MAIN_SETTINGLayout.setVerticalGroup(
            FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRAME_MAIN_SETTINGLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(MAIN_TTILE)
                .addGap(29, 29, 29)
                .addGroup(FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_SET_1)
                    .addComponent(LABEL_SET_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRAME_MAIN_SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LABEL_SET_RP)
                    .addComponent(INPUT_SET_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(INPUT_SET_2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(LABEL_SET_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_SET_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );

        BTN_SET_SIMPAN.setBackground(new java.awt.Color(0, 171, 60));
        BTN_SET_SIMPAN.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BTN_SET_SIMPAN.setForeground(new java.awt.Color(255, 255, 255));
        BTN_SET_SIMPAN.setText("Simpan Perubahan");
        BTN_SET_SIMPAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_SET_SIMPANMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SETTINGLayout = new javax.swing.GroupLayout(SETTING);
        SETTING.setLayout(SETTINGLayout);
        SETTINGLayout.setHorizontalGroup(
            SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SETTINGLayout.createSequentialGroup()
                .addGroup(SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SETTINGLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_SET_SIMPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SETTINGLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FRAME_MAIN_SETTING, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TOPBAR_SETTING, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        SETTINGLayout.setVerticalGroup(
            SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SETTINGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TOPBAR_SETTING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(FRAME_MAIN_SETTING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BTN_SET_SIMPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        MAIN_FRAME.add(SETTING, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SIDEBAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIDEBAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_DASHBOARDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DASHBOARDMouseClicked
        // SET TITLE
        this.setTitleApp("Dashboard");
        // TAMPILKAN LAYOUT DASHBOARD
        new SideBar().setBar("DASHBOARD");
    }//GEN-LAST:event_BTN_DASHBOARDMouseClicked

    private void BTN_TRANSAKSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_TRANSAKSIMouseClicked
        // SET TITLE
        this.setTitleApp("Transaksi");
        // TAMPILKAN LAYOUT TRANSAKSI
        new SideBar().setBar("TRANSAKSI");
        new SideBar().setTransaksiPageSelected("PINJAM");
        
        TransaksiModel.setDateNowTransaksi();
    }//GEN-LAST:event_BTN_TRANSAKSIMouseClicked

    private void BTN_DATABUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DATABUKUMouseClicked
        // SET TITLE
        this.setTitleApp("Data Buku");
        // TAMPILKAN LAYOUT DATA BUKU
        new SideBar().setBar("DATABUKU");
        new SideBar().setBukuPageSelected("BUKU");
    }//GEN-LAST:event_BTN_DATABUKUMouseClicked

    private void BTN_USERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_USERMouseClicked
        // SET TITLE
        this.setTitleApp("User");
        // TAMPILKAN LAYOUT USER
        new SideBar().setBar("USER");
        new SideBar().setUserPageSelected("ANGGOTA");
        // GET DATA TABLE USER
        new AnggotaModel().getDataTable(SEARCH_USER.getText(), GROUP_COMBOBOX_USER.getSelectedItem().toString(), TAMPILKAN_COMBOBOX_USER.getSelectedItem().toString());
    }//GEN-LAST:event_BTN_USERMouseClicked

    private void BTN_SETTINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_SETTINGMouseClicked
        // SET TITLE
        this.setTitleApp("Pengaturan");
        // TAMPILKAN LAYOUT SETTING
        new SideBar().setBar("PENGATURAN");
        // SETTING MODEL
        new SettingModel();
    }//GEN-LAST:event_BTN_SETTINGMouseClicked

    private void BTN_EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_EXITMouseClicked
        // CLOSE APLIKASI
        int close = JOptionPane.showConfirmDialog(this, "Apakah yakin kamu ingin keluar ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(close == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_BTN_EXITMouseClicked

    private void T_U_ANGGOTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_U_ANGGOTAMouseClicked
        new SideBar().setUserPageSelected("ANGGOTA");
        new AnggotaModel().getDataTable(SEARCH_USER.getText(), GROUP_COMBOBOX_USER.getSelectedItem().toString(), TAMPILKAN_COMBOBOX_USER.getSelectedItem().toString());
    }//GEN-LAST:event_T_U_ANGGOTAMouseClicked

    private void T_U_JURUSANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_U_JURUSANMouseClicked
        new SideBar().setUserPageSelected("JURUSAN");
        new JurusanModel().getDataTable("");
    }//GEN-LAST:event_T_U_JURUSANMouseClicked

    private void T_U_PENGURUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_U_PENGURUSMouseClicked
        new SideBar().setUserPageSelected("PENGURUS");
        new PengurusModel().getDataTable("");
    }//GEN-LAST:event_T_U_PENGURUSMouseClicked

    private void ICON_ADD_USERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_USERMouseClicked
        // OPEN MODAL ANGGOTA
        new AnggotaUSER("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_USERMouseClicked

    private void SEARCH_USERKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_USERKeyTyped
        new AnggotaModel().getDataTable(SEARCH_USER.getText(), GROUP_COMBOBOX_USER.getSelectedItem().toString(), TAMPILKAN_COMBOBOX_USER.getSelectedItem().toString());
    }//GEN-LAST:event_SEARCH_USERKeyTyped

    private void ICON_ADD_JURUSANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_JURUSANMouseClicked
        // OPEN MODAL JURUSAN
        new JurusanUSER("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_JURUSANMouseClicked

    private void SEARCH_JURUSANKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_JURUSANKeyTyped
        new JurusanModel().getDataTable(SEARCH_JURUSAN.getText());
    }//GEN-LAST:event_SEARCH_JURUSANKeyTyped

    private void ICON_ADD_PENGURUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_PENGURUSMouseClicked
        // OPEN MODAL PENGURUS
        new PengurusUSER("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_PENGURUSMouseClicked

    private void SEARCH_PENGURUSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_PENGURUSKeyTyped
        new PengurusModel().getDataTable(SEARCH_PENGURUS.getText());
    }//GEN-LAST:event_SEARCH_PENGURUSKeyTyped

    private void T_DB_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_DB_BUKUMouseClicked
        new SideBar().setBukuPageSelected("BUKU");
    }//GEN-LAST:event_T_DB_BUKUMouseClicked

    private void T_DB_KATEGORIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_DB_KATEGORIMouseClicked
        new SideBar().setBukuPageSelected("KATEGORI");
        new KategoriModel().getDataTable(SEARCH_KATEGORI.getText(), TAMPILKAN_KATEGORI.getSelectedItem().toString());
    }//GEN-LAST:event_T_DB_KATEGORIMouseClicked

    private void T_DB_PENERBITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_DB_PENERBITMouseClicked
        new SideBar().setBukuPageSelected("PENERBIT");
        new PenerbitModel().getDataTable(SEARCH_PENERBIT.getText(), TAMPILKAN_PENERBIT.getSelectedItem().toString());
    }//GEN-LAST:event_T_DB_PENERBITMouseClicked

    private void T_DB_RAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_DB_RAKMouseClicked
        new SideBar().setBukuPageSelected("RAK");
        new RakModel().getDataTable(SEARCH_RAK.getText(), TAMPILKAN_RAK.getSelectedItem().toString());
    }//GEN-LAST:event_T_DB_RAKMouseClicked

    private void ICON_ADD_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_BUKUMouseClicked
        new BukuDATABUKU("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_BUKUMouseClicked

    private void SEARCH_BUKUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_BUKUKeyTyped
        new BukuModel().setDataTable(Dashboard.SEARCH_BUKU.getText(), Dashboard.KATEGORI_COMBOBOX_BUKU.getSelectedItem().toString(), Dashboard.TAMPILKAN_COMBOBOX_BUKU.getSelectedItem().toString());
    }//GEN-LAST:event_SEARCH_BUKUKeyTyped

    private void ICON_ADD_KATEGORIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_KATEGORIMouseClicked
        new KategoriDATABUKU("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_KATEGORIMouseClicked

    private void SEARCH_KATEGORIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_KATEGORIKeyTyped
       new KategoriModel().getDataTable(SEARCH_KATEGORI.getText(), TAMPILKAN_KATEGORI.getSelectedItem().toString());
    }//GEN-LAST:event_SEARCH_KATEGORIKeyTyped

    private void ICON_ADD_PENERBITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_PENERBITMouseClicked
        new PenerbitDATABUKU("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_PENERBITMouseClicked

    private void SEARCH_PENERBITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_PENERBITKeyTyped
       new PenerbitModel().getDataTable(SEARCH_PENERBIT.getText(), TAMPILKAN_PENERBIT.getSelectedItem().toString());
    }//GEN-LAST:event_SEARCH_PENERBITKeyTyped

    private void ICON_ADD_RAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICON_ADD_RAKMouseClicked
        new RakDATABUKU("ADD", "").setVisible(true);
    }//GEN-LAST:event_ICON_ADD_RAKMouseClicked

    private void SEARCH_RAKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCH_RAKKeyTyped
        new RakModel().getDataTable(SEARCH_RAK.getText(), TAMPILKAN_RAK.getSelectedItem().toString());
    }//GEN-LAST:event_SEARCH_RAKKeyTyped

    private void T_TR_PINJAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_TR_PINJAMMouseClicked
        new SideBar().setTransaksiPageSelected("PINJAM");
    }//GEN-LAST:event_T_TR_PINJAMMouseClicked

    private void T_TR_KEMBALIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_TR_KEMBALIMouseClicked
        new SideBar().setTransaksiPageSelected("KEMBALI");
    }//GEN-LAST:event_T_TR_KEMBALIMouseClicked

    private void T_TR_LAPORANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_TR_LAPORANMouseClicked
        new SideBar().setTransaksiPageSelected("LAPORAN");
    }//GEN-LAST:event_T_TR_LAPORANMouseClicked

    private void BTN_SET_SIMPANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_SET_SIMPANMouseClicked
        // GET VALUE IN FORM
        int Denda = Integer.parseInt(INPUT_SET_1.getText().replaceAll("[a-zA-Z]", ""));
        int MaxPinjamBukuUmum = Integer.parseInt(INPUT_SET_2.getValue().toString());
        int BackupDatabase = INPUT_SET_3.getSelectedIndex();
        
        if(this.Denda == Denda && this.MaxPinjamBukuUmum == MaxPinjamBukuUmum && this.BackupDatabase == BackupDatabase){
            JOptionPane.showMessageDialog(null, "Tidak ada perubahan data", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            new SettingModel();
        }else{
            SettingModel SM = new SettingModel();
            if(SM.update(Denda, MaxPinjamBukuUmum, BackupDatabase)){
                JOptionPane.showMessageDialog(null, SM.getMessage(), "Sukses !", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
            }else{
                JOptionPane.showMessageDialog(null, SM.getMessage(), "Terjadi kesalahan !", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTN_SET_SIMPANMouseClicked

    private void TABLE_LIST_ITEM_JURUSANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_ITEM_JURUSANMouseClicked
       
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_ITEM_JURUSAN.getSelectedRow();

            String kode = TABLE_LIST_ITEM_JURUSAN.getValueAt(index, 1).toString();
            new JurusanUSER("EDIT", kode).setVisible(true);
        }
        
    }//GEN-LAST:event_TABLE_LIST_ITEM_JURUSANMouseClicked

    private void TABLE_LIST_ITEM_PENGURUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_ITEM_PENGURUSMouseClicked
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_ITEM_PENGURUS.getSelectedRow();

            String kode = TABLE_LIST_ITEM_PENGURUS.getValueAt(index, 1).toString();
            new PengurusUSER("EDIT", kode).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LIST_ITEM_PENGURUSMouseClicked

    private void GROUP_COMBOBOX_USERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GROUP_COMBOBOX_USERItemStateChanged
        new AnggotaModel().getDataTable(SEARCH_USER.getText(), GROUP_COMBOBOX_USER.getSelectedItem().toString(), TAMPILKAN_COMBOBOX_USER.getSelectedItem().toString());
    }//GEN-LAST:event_GROUP_COMBOBOX_USERItemStateChanged

    private void SEARCH_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCH_USERActionPerformed

    private void TABLE_LIST_ANGGOTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_ANGGOTAMouseClicked
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_ANGGOTA.getSelectedRow();

            String nis = TABLE_LIST_ANGGOTA.getValueAt(index, 1).toString();
            new AnggotaUSER("EDIT", nis).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LIST_ANGGOTAMouseClicked

    private void TAMPILKAN_COMBOBOX_USERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TAMPILKAN_COMBOBOX_USERItemStateChanged
        new AnggotaModel().getDataTable(SEARCH_USER.getText(), GROUP_COMBOBOX_USER.getSelectedItem().toString(), TAMPILKAN_COMBOBOX_USER.getSelectedItem().toString());
    }//GEN-LAST:event_TAMPILKAN_COMBOBOX_USERItemStateChanged

    private void TAMPILKAN_RAKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TAMPILKAN_RAKItemStateChanged
        new RakModel().getDataTable(SEARCH_RAK.getText(), TAMPILKAN_RAK.getSelectedItem().toString());        
    }//GEN-LAST:event_TAMPILKAN_RAKItemStateChanged

    private void TABLE_LIST_RAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_RAKMouseClicked
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_RAK.getSelectedRow();

            String kode = TABLE_LIST_RAK.getValueAt(index, 1).toString();
            new RakDATABUKU("EDIT", kode).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LIST_RAKMouseClicked

    private void TAMPILKAN_PENERBITItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TAMPILKAN_PENERBITItemStateChanged
        new PenerbitModel().getDataTable(SEARCH_PENERBIT.getText(), TAMPILKAN_PENERBIT.getSelectedItem().toString());
    }//GEN-LAST:event_TAMPILKAN_PENERBITItemStateChanged

    private void TABLE_LIST_PENERBITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_PENERBITMouseClicked
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_PENERBIT.getSelectedRow();

            String nama = TABLE_LIST_PENERBIT.getValueAt(index, 1).toString();
            new PenerbitDATABUKU("EDIT", nama).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LIST_PENERBITMouseClicked

    private void TABLE_LIST_KATEGORIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_KATEGORIMouseClicked
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_KATEGORI.getSelectedRow();

            String kode = TABLE_LIST_KATEGORI.getValueAt(index, 1).toString();
            new KategoriDATABUKU("EDIT", kode).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LIST_KATEGORIMouseClicked

    private void TAMPILKAN_KATEGORIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TAMPILKAN_KATEGORIItemStateChanged
        new KategoriModel().getDataTable(SEARCH_KATEGORI.getText(), TAMPILKAN_KATEGORI.getSelectedItem().toString());
    }//GEN-LAST:event_TAMPILKAN_KATEGORIItemStateChanged

    private void KATEGORI_COMBOBOX_BUKUItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_KATEGORI_COMBOBOX_BUKUItemStateChanged
        new BukuModel().setDataTable(Dashboard.SEARCH_BUKU.getText(), Dashboard.KATEGORI_COMBOBOX_BUKU.getSelectedItem().toString(), Dashboard.TAMPILKAN_COMBOBOX_BUKU.getSelectedItem().toString());
    }//GEN-LAST:event_KATEGORI_COMBOBOX_BUKUItemStateChanged

    private void TAMPILKAN_COMBOBOX_BUKUItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TAMPILKAN_COMBOBOX_BUKUItemStateChanged
        new BukuModel().setDataTable(Dashboard.SEARCH_BUKU.getText(), Dashboard.KATEGORI_COMBOBOX_BUKU.getSelectedItem().toString(), Dashboard.TAMPILKAN_COMBOBOX_BUKU.getSelectedItem().toString());
    }//GEN-LAST:event_TAMPILKAN_COMBOBOX_BUKUItemStateChanged

    private void TABLE_LIST_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_BUKUMouseClicked
        if(evt.getClickCount() == 2){
            int index = TABLE_LIST_BUKU.getSelectedRow();

            String isbn = TABLE_LIST_BUKU.getValueAt(index, 1).toString();
            new BukuDATABUKU("EDIT", isbn).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LIST_BUKUMouseClicked

    private void ActionResetFormTransaksi(){
    
        int resetFormPinjam = JOptionPane.showConfirmDialog(null, "Kosongkan form Transaksi ?", "Konfirmasi !", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resetFormPinjam  == 0){
            
            if(TM.getNama() != null){
                
                TM.setNis(null);
                TM.setNama(null);
                
                TM.setHeadTableDashboardPinjam();
                TransaksiModel.setDateNowTransaksi();
                
                PJ_INPUT_PEMINJAM.setText("");
                PJ_INPUT_JENIS_BUKU.setSelectedIndex(0);
            }else{
                JOptionPane.showMessageDialog(null, "Form masih kosong !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);   
            }
            
        }
        
    }
    
    private void TABLE_LIST_PINJAMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLE_LIST_PINJAMKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            if(TM.getNis() != null){
                PJ_INPUT_PEMINJAM.setText(TM.getNis() + " - " + TM.getNama());
                
                // cek nilai table tidak lebih dari nilai pinjam anggota
                
                if(!TABLE_LIST_PINJAM.getValueAt(0, 0).toString().equals("")){
                    
                    
                    if(TM.getJumlahBukuDipinjam() > TABLE_LIST_PINJAM.getRowCount()){
                        new getDaftarBukuTRANSAKSI("").setVisible(true);

                    }else{
                        JOptionPane.showMessageDialog(null, "Kesempatan banyak pinjam sudah mencapai maksimal !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);

                     }
                    
                }else{
                    
                    new getDaftarBukuTRANSAKSI("").setVisible(true);
                    
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Nama peminjam belum terisi !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
                PJ_INPUT_PEMINJAM.requestFocus();
            }
            
        }else if(evt.getKeyCode() == evt.VK_F5){
            
            ActionResetFormTransaksi();
            
        }else if(evt.getKeyCode() == evt.VK_F2){
            
            DefaultTableModel table_transaksi = (DefaultTableModel)TABLE_LIST_PINJAM.getModel();
            
            Object tableFirstRow = TABLE_LIST_PINJAM.getValueAt(0, 0);
            
            if(TABLE_LIST_PINJAM.getRowCount() == 1){
                if(tableFirstRow != null){
                    table_transaksi.removeRow(0);
                    table_transaksi.addRow(new String[]{
                        "",
                        "",
                        ""
                    });
                }
            }else{
                table_transaksi.removeRow(TABLE_LIST_PINJAM.getSelectedRow());
            }
            
        }else if(evt.getKeyCode() == evt.VK_F10){
            
            if(Dashboard.TM.getNis() != null){
                if(TABLE_LIST_PINJAM.getValueAt(0, 0) != ""){
                    TM.konfirmasiTransaksiPinjam();
                }else{
                    JOptionPane.showMessageDialog(null, "Harap masukkan daftar buku !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nama peminjam belum terisi !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
                PJ_INPUT_PEMINJAM.requestFocus();
            }
            
        }
        
    }//GEN-LAST:event_TABLE_LIST_PINJAMKeyPressed

    private void BTN_CETAK_PINJAMANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CETAK_PINJAMANMouseClicked
        TM.konfirmasiTransaksiPinjam();        
    }//GEN-LAST:event_BTN_CETAK_PINJAMANMouseClicked

    private void PJ_INPUT_PEMINJAMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PJ_INPUT_PEMINJAMKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            if(TM.getNis() != null && TM.getNama() != null){
                PJ_INPUT_PEMINJAM.setText(TM.getNis() + " - " + TM.getNama());
            }
            
            if(!PJ_INPUT_PEMINJAM.getText().equals("")){
                
                String peminjam = PJ_INPUT_PEMINJAM.getText();
                if(TM.getNama() != null){
                    peminjam = TM.getNama();
                }
                
                new getPeminjamTRANSAKSI(peminjam).setVisible(true);
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Nilai peminjam harus terisi !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
            
            }
        }
        
    }//GEN-LAST:event_PJ_INPUT_PEMINJAMKeyPressed

    private void BTN_RESET_DAFTAR_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_RESET_DAFTAR_BUKUMouseClicked
        
        ActionResetFormTransaksi();
        
    }//GEN-LAST:event_BTN_RESET_DAFTAR_BUKUMouseClicked

    private void PJ_INPUT_JENIS_BUKUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PJ_INPUT_JENIS_BUKUActionPerformed
        if(TABLE_LIST_PINJAM.getValueAt(0, 0) != ""){
            
            int reset = JOptionPane.showConfirmDialog(null, "Melakukan perubahan jenis, daftar buku akan dimuat ulang ?", "Konfirmasi !", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            if(reset == 0){
                
                TM.setHeadTableDashboardPinjam();
                TransaksiModel.setDateNowTransaksi();
                
            }else{
                int index = 0;
                if(PJ_INPUT_JENIS_BUKU.getSelectedIndex() == 0){
                    index = 1;
                }
                PJ_INPUT_JENIS_BUKU.setSelectedIndex(index);
            }
            
        }
    }//GEN-LAST:event_PJ_INPUT_JENIS_BUKUActionPerformed

    private void BTN_CETAK_PENGEMBALIANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CETAK_PENGEMBALIANMouseClicked
        if(!PJ_INPUT_PEMINJAM_PENGEMBALIAN.getText().equals("")){
            new KonfirmasiPengembalian().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Data pengembalian belum terpenuhi !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BTN_CETAK_PENGEMBALIANMouseClicked

    private void PJ_INPUT_PEMINJAM_PENGEMBALIANKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PJ_INPUT_PEMINJAM_PENGEMBALIANKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PJ_INPUT_PEMINJAM_PENGEMBALIANKeyPressed

    private void PJ_INPUT_JENIS_BUKU_PENGEMBALIANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PJ_INPUT_JENIS_BUKU_PENGEMBALIANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PJ_INPUT_JENIS_BUKU_PENGEMBALIANActionPerformed

    private void PJ_INPUT_ID_TRANSAKSI_PENGEMBALIANKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PJ_INPUT_ID_TRANSAKSI_PENGEMBALIANKeyPressed
        
        if(evt.getKeyCode() == evt.VK_ENTER){
        
            String id_transaksi = PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.getText().replaceAll("[^0-9]", "").trim();
            
            if(!id_transaksi.equals("")){
            
                PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.setText(id_transaksi);
                
                TM.getDataPinjam(id_transaksi);
                
            }else{
            
                PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.setText("");
                PJ_INPUT_PEMINJAM_PENGEMBALIAN.setText("");
                PJ_INPUT_JENIS_BUKU_PENGEMBALIAN.setSelectedIndex(0);
                PJ_INPUT_TGL_PINJAM_PENGEMBALIAN.setText("");
                PJ_INPUT_PENGURUS_PENGEMBALIAN.setText("");
                
                TM.initTablePengembalian();
                
                JOptionPane.showMessageDialog(null, "Nilai id transaksi harus terisi dan hanya berisi angka !", "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
            
            }
            
        }
        
    }//GEN-LAST:event_PJ_INPUT_ID_TRANSAKSI_PENGEMBALIANKeyPressed

    private void TABLE_LIST_PENGEMBALIANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_PENGEMBALIANMouseClicked

        DefaultTableModel table_pengembalian_daftar_pinjam = (DefaultTableModel)TABLE_LIST_PENGEMBALIAN.getModel();
        DefaultTableModel table_pengembalian_daftar_kembali = (DefaultTableModel)TABLE_LIST_PENGEMBALIAN1.getModel();        
        
        if(evt.getClickCount() == 2){
            
            int row = TABLE_LIST_PENGEMBALIAN.getSelectedRow();
            
            String isbn = TABLE_LIST_PENGEMBALIAN.getValueAt(row, 0).toString();
            String status = TABLE_LIST_PENGEMBALIAN.getValueAt(row, 2).toString();
            
            if(!isbn.equals("")){
                if(status.equals("Dipinjam")){

                    if(table_pengembalian_daftar_kembali.getValueAt(0, 0) == null){
                        table_pengembalian_daftar_kembali.setRowCount(0);
                    }

                    table_pengembalian_daftar_kembali.addRow(new String[]{
                        TABLE_LIST_PENGEMBALIAN.getValueAt(row, 0).toString(),
                        TABLE_LIST_PENGEMBALIAN.getValueAt(row, 1).toString(),
                        "Dikembalikan"
                    });

                    table_pengembalian_daftar_pinjam.removeRow(row);

                    if(table_pengembalian_daftar_pinjam.getRowCount() == 0){
                        table_pengembalian_daftar_pinjam.setRowCount(1);
                    }

                }else {

                    JOptionPane.showMessageDialog(null, "Buku ini mengalami masalah, lakukan konfirmasi !", "Tidak dapat dikembalikan !", JOptionPane.INFORMATION_MESSAGE);

                    // ubah status
                    new konfirmasiBukuPengembalian("TR-" + PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.getText(), isbn, status, row).setVisible(true);

                }
            }
            
        }
        
    }//GEN-LAST:event_TABLE_LIST_PENGEMBALIANMouseClicked

    private void TABLE_LIST_PENGEMBALIANKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLE_LIST_PENGEMBALIANKeyPressed
        
        if(evt.getKeyCode() == evt.VK_F2){
        
            int row = TABLE_LIST_PENGEMBALIAN.getSelectedRow();
            // ubah status
            new konfirmasiBukuPengembalian("TR-" + PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN.getText(), TABLE_LIST_PENGEMBALIAN.getValueAt(row, 0).toString(), TABLE_LIST_PENGEMBALIAN.getValueAt(row, 2).toString(), row).setVisible(true);
            
        }
        
    }//GEN-LAST:event_TABLE_LIST_PENGEMBALIANKeyPressed

    private void TABLE_LIST_PENGEMBALIAN1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLE_LIST_PENGEMBALIAN1KeyPressed
        
        if(evt.getKeyCode() == evt.VK_F7){
            
            int row = TABLE_LIST_PENGEMBALIAN1.getSelectedRow();
            if(TABLE_LIST_PENGEMBALIAN1.getValueAt(row, 0) != null){
                
                DefaultTableModel table_list_daftar_pinjam = (DefaultTableModel)TABLE_LIST_PENGEMBALIAN.getModel();
                
                DefaultTableModel table_pengembalian_daftar_kembali = (DefaultTableModel)TABLE_LIST_PENGEMBALIAN1.getModel();
                
                if(!table_pengembalian_daftar_kembali.getValueAt(row, 2).toString().contains("LUNAS")){
                
                    if(table_list_daftar_pinjam.getValueAt(0, 0) == null){
                        table_list_daftar_pinjam.setRowCount(0);
                    }

                    table_list_daftar_pinjam.addRow(new String[]{
                        TABLE_LIST_PENGEMBALIAN1.getValueAt(row, 0).toString(),
                        TABLE_LIST_PENGEMBALIAN1.getValueAt(row, 1).toString(),
                        "Dipinjam"
                    });

                    table_pengembalian_daftar_kembali.removeRow(row);

                    if(table_pengembalian_daftar_kembali.getRowCount() == 0){
                        table_pengembalian_daftar_kembali.setRowCount(1);
                    }
                    
                }else{
                
                    JOptionPane.showMessageDialog(null, "Buku telah dikembalikan !", "Informasi !", JOptionPane.INFORMATION_MESSAGE);
                
                }
                
            }
            
        }
        
    }//GEN-LAST:event_TABLE_LIST_PENGEMBALIAN1KeyPressed

    private void T_LP_TRANSAKSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_LP_TRANSAKSIMouseClicked
        new SideBar().setLaporanPageSelected("TRANSAKSI");
    }//GEN-LAST:event_T_LP_TRANSAKSIMouseClicked

    private void T_LP_BUKU_BERMASALAHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_LP_BUKU_BERMASALAHMouseClicked
        new SideBar().setLaporanPageSelected("BUKU_BERMASALAH");
    }//GEN-LAST:event_T_LP_BUKU_BERMASALAHMouseClicked

    private void INPUT_LAPORAN_ID_TRANSAKSIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_INPUT_LAPORAN_ID_TRANSAKSIKeyTyped
        new LaporanModel().getLaporanTransaksi(INPUT_LAPORAN_ID_TRANSAKSI.getText(), INPUT_LAPORAN_LIMIT_TRANSAKSI.getSelectedItem().toString());
    }//GEN-LAST:event_INPUT_LAPORAN_ID_TRANSAKSIKeyTyped

    private void INPUT_LAPORAN_LIMIT_TRANSAKSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUT_LAPORAN_LIMIT_TRANSAKSIActionPerformed
        new LaporanModel().getLaporanTransaksi(INPUT_LAPORAN_ID_TRANSAKSI.getText(), INPUT_LAPORAN_LIMIT_TRANSAKSI.getSelectedItem().toString());
    }//GEN-LAST:event_INPUT_LAPORAN_LIMIT_TRANSAKSIActionPerformed

    private void TABLES_LAPORAN_BERMASALAHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLES_LAPORAN_BERMASALAHMouseClicked
        
        
        
    }//GEN-LAST:event_TABLES_LAPORAN_BERMASALAHMouseClicked

    private void TABLE_LAPORAN_TRANSAKSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LAPORAN_TRANSAKSIMouseClicked
        if(evt.getClickCount() == 2){
            int row = TABLE_LAPORAN_TRANSAKSI.getSelectedRow();
            String id_transaksi = TABLE_LAPORAN_TRANSAKSI.getValueAt(row, 0).toString();
            new DetailLaporanTransaksi(id_transaksi).setVisible(true);
        }
    }//GEN-LAST:event_TABLE_LAPORAN_TRANSAKSIMouseClicked

    private void SORT_LIST_LOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SORT_LIST_LOGActionPerformed
        new DashboardModel().getDashboardData(SORT_LIST_LOG.getSelectedItem().toString());        
    }//GEN-LAST:event_SORT_LIST_LOGActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard("", "", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CETAK_PENGEMBALIAN;
    private javax.swing.JButton BTN_CETAK_PINJAMAN;
    public static javax.swing.JLabel BTN_DASHBOARD;
    public static javax.swing.JLabel BTN_DATABUKU;
    private javax.swing.JLabel BTN_EXIT;
    private javax.swing.JLabel BTN_RESET_DAFTAR_BUKU;
    public static javax.swing.JLabel BTN_SETTING;
    private javax.swing.JButton BTN_SET_SIMPAN;
    public static javax.swing.JLabel BTN_TRANSAKSI;
    public static javax.swing.JLabel BTN_USER;
    private javax.swing.JPanel CONTAINER_FORM;
    public static javax.swing.JPanel DASHBOARD;
    public static javax.swing.JPanel DATABUKU;
    private javax.swing.JLabel FILTER_KATEGORI_BUKU;
    private javax.swing.JLabel FILTER_TAMPIL_BUKU;
    private javax.swing.JLabel FILTER_TAMPIL_KATEGORI;
    private javax.swing.JLabel FILTER_TAMPIL_PENERBIT;
    private javax.swing.JLabel FILTER_TAMPIL_RAK;
    private javax.swing.JLabel FILTER_TAMPIL_USER;
    public static javax.swing.JPanel FRAME_DATABUKU;
    private javax.swing.JPanel FRAME_MAIN_SETTING;
    public static javax.swing.JPanel FRAME_TRANSAKSI;
    public static javax.swing.JPanel FRAME_USER;
    public static javax.swing.JPanel F_CONTENT_BUKU_BERMASALAH;
    public static javax.swing.JPanel F_CONTENT_TRANSAKSI;
    public static javax.swing.JPanel F_DB_BUKU;
    public static javax.swing.JPanel F_DB_KATEGORI;
    public static javax.swing.JPanel F_DB_PENERBIT;
    public static javax.swing.JPanel F_DB_RAK;
    private javax.swing.JPanel F_TB_LAPORAN;
    public static javax.swing.JPanel F_TR_CONTENT_LAPORAN;
    public static javax.swing.JPanel F_TR_KEMBALI;
    public static javax.swing.JPanel F_TR_LAPORAN;
    public static javax.swing.JPanel F_TR_PINJAM;
    public static javax.swing.JPanel F_U_ANGGOTA;
    public static javax.swing.JPanel F_U_JURUSAN;
    public static javax.swing.JPanel F_U_PENGURUS;
    public static javax.swing.JComboBox<String> GROUP_COMBOBOX_USER;
    private javax.swing.JLabel GROUP_KELAS_USER;
    private javax.swing.JLabel ICON_ADD_BUKU;
    private javax.swing.JLabel ICON_ADD_JURUSAN;
    private javax.swing.JLabel ICON_ADD_KATEGORI;
    private javax.swing.JLabel ICON_ADD_PENERBIT;
    private javax.swing.JLabel ICON_ADD_PENGURUS;
    private javax.swing.JLabel ICON_ADD_RAK;
    private javax.swing.JLabel ICON_ADD_USER;
    private javax.swing.JLabel ICON_ANGGOTA;
    private javax.swing.JLabel ICON_BERMASALAH;
    private javax.swing.JLabel ICON_DB_DATABUKU;
    private javax.swing.JLabel ICON_DIPINJAM;
    private javax.swing.JLabel ICON_SETTING;
    private javax.swing.JLabel ICON_TOTAL_BUKU;
    private javax.swing.JLabel ICON_TR_TRANSAKSI;
    private javax.swing.JLabel ICON_USER;
    private javax.swing.JLabel ICON_U_USER;
    public static javax.swing.JTextField INPUT_LAPORAN_ID_TRANSAKSI;
    public static javax.swing.JComboBox<String> INPUT_LAPORAN_LIMIT_TRANSAKSI;
    public static javax.swing.JTextField INPUT_SET_1;
    public static javax.swing.JSpinner INPUT_SET_2;
    public static javax.swing.JComboBox<String> INPUT_SET_3;
    public static javax.swing.JComboBox<String> KATEGORI_COMBOBOX_BUKU;
    private javax.swing.JLabel LABEL_LOG;
    private javax.swing.JLabel LABEL_SET_1;
    private javax.swing.JLabel LABEL_SET_2;
    private javax.swing.JLabel LABEL_SET_3;
    private javax.swing.JLabel LABEL_SET_RP;
    private javax.swing.JLabel LABEL_TAMPILKAN;
    public static javax.swing.JPanel MAIN_FRAME;
    private javax.swing.JLabel MAIN_TTILE;
    private javax.swing.JLabel PJ_ID_TRANSAKSI;
    private javax.swing.JLabel PJ_ID_TRANSAKSI_PENGEMBALIAN;
    private javax.swing.JLabel PJ_ID_TRANSAKSI_PENGEMBALIAN1;
    public static javax.swing.JTextField PJ_INPUT_ID_TRANSAKSI;
    public static javax.swing.JTextField PJ_INPUT_ID_TRANSAKSI_PENGEMBALIAN;
    public static javax.swing.JComboBox<String> PJ_INPUT_JENIS_BUKU;
    public static javax.swing.JComboBox<String> PJ_INPUT_JENIS_BUKU_PENGEMBALIAN;
    public static javax.swing.JTextField PJ_INPUT_PEMINJAM;
    public static javax.swing.JTextField PJ_INPUT_PEMINJAM_PENGEMBALIAN;
    public static javax.swing.JTextField PJ_INPUT_PENGURUS_PENGEMBALIAN;
    public static javax.swing.JTextField PJ_INPUT_TGL_PINJAM;
    public static javax.swing.JTextField PJ_INPUT_TGL_PINJAM_PENGEMBALIAN;
    private javax.swing.JLabel PJ_LABEL_INFO_1;
    private javax.swing.JLabel PJ_LABEL_INFO_2;
    private javax.swing.JLabel PJ_LABEL_KAT_BUKU;
    private javax.swing.JLabel PJ_LABEL_KAT_BUKU_PENGEMBALIAN;
    private javax.swing.JLabel PJ_LABEL_PEMINJAM;
    private javax.swing.JLabel PJ_LABEL_PEMINJAM_PENGEMBALIAN;
    private javax.swing.JLabel PJ_LABEL_PENGURUS_PENGEMBALIAN;
    private javax.swing.JLabel PJ_LABEL_TGL_PINJAM;
    private javax.swing.JLabel PJ_LABEL_TGL_PINJAM_PENGEMBALIAN;
    private javax.swing.JPanel P_ANGGOTA;
    private javax.swing.JPanel P_BERMASALAH;
    private javax.swing.JPanel P_DIPINJAM;
    private javax.swing.JPanel P_TABLE_LOG;
    private javax.swing.JPanel P_TOTAL_BUKU;
    public static javax.swing.JTextField SEARCH_BUKU;
    private javax.swing.JTextField SEARCH_JURUSAN;
    public static javax.swing.JTextField SEARCH_KATEGORI;
    public static javax.swing.JTextField SEARCH_PENERBIT;
    private javax.swing.JTextField SEARCH_PENGURUS;
    public static javax.swing.JTextField SEARCH_RAK;
    public static javax.swing.JTextField SEARCH_USER;
    public static javax.swing.JPanel SETTING;
    private javax.swing.JPanel SIDEBAR;
    public static javax.swing.JComboBox<String> SORT_LIST_LOG;
    public static javax.swing.JTable TABLES_LAPORAN_BERMASALAH;
    private javax.swing.JScrollPane TABLE_KATEGORI;
    public static javax.swing.JTable TABLE_LAPORAN_TRANSAKSI;
    public static javax.swing.JTable TABLE_LIST_ANGGOTA;
    public static javax.swing.JTable TABLE_LIST_BUKU;
    private javax.swing.JScrollPane TABLE_LIST_DB_BUKU;
    public static javax.swing.JTable TABLE_LIST_ITEM_JURUSAN;
    public static javax.swing.JTable TABLE_LIST_ITEM_PENGURUS;
    private javax.swing.JScrollPane TABLE_LIST_JURUSAN;
    public static javax.swing.JTable TABLE_LIST_KATEGORI;
    public static javax.swing.JTable TABLE_LIST_LOG;
    public static javax.swing.JTable TABLE_LIST_PENERBIT;
    public static javax.swing.JTable TABLE_LIST_PENGEMBALIAN;
    public static javax.swing.JTable TABLE_LIST_PENGEMBALIAN1;
    private javax.swing.JScrollPane TABLE_LIST_PENGURUS;
    public static javax.swing.JTable TABLE_LIST_PINJAM;
    public static javax.swing.JTable TABLE_LIST_RAK;
    private javax.swing.JScrollPane TABLE_LIST_U_ANGGOTA;
    private javax.swing.JScrollPane TABLE_LOG;
    private javax.swing.JScrollPane TABLE_PENERBIT;
    public static javax.swing.JScrollPane TABLE_PENGEMBALIAN;
    public static javax.swing.JScrollPane TABLE_PENGEMBALIAN1;
    private javax.swing.JScrollPane TABLE_PINJAM;
    private javax.swing.JScrollPane TABLE_RAK;
    public static javax.swing.JComboBox<String> TAMPILKAN_COMBOBOX_BUKU;
    public static javax.swing.JComboBox<String> TAMPILKAN_COMBOBOX_USER;
    public static javax.swing.JComboBox<String> TAMPILKAN_KATEGORI;
    public static javax.swing.JComboBox<String> TAMPILKAN_PENERBIT;
    public static javax.swing.JComboBox<String> TAMPILKAN_RAK;
    private javax.swing.JLabel TITLE_ANGGOTA;
    private javax.swing.JLabel TITLE_BERMASALAH;
    private javax.swing.JLabel TITLE_DASHBOARD;
    private javax.swing.JLabel TITLE_DIPINJAM;
    private javax.swing.JLabel TITLE_FRAME_BUKU;
    private javax.swing.JLabel TITLE_FRAME_JURUSAN;
    private javax.swing.JLabel TITLE_FRAME_KATEGORI;
    private javax.swing.JLabel TITLE_FRAME_PENERBIT;
    private javax.swing.JLabel TITLE_FRAME_PENGEMBALIAN;
    private javax.swing.JLabel TITLE_FRAME_PENGURUS;
    private javax.swing.JLabel TITLE_FRAME_PINJAM;
    private javax.swing.JLabel TITLE_FRAME_RAK;
    private javax.swing.JLabel TITLE_FRAME_USER;
    private javax.swing.JLabel TITLE_SETTING;
    private javax.swing.JLabel TITLE_TOTAL_BUKU;
    private javax.swing.JPanel TOPBAR;
    private javax.swing.JPanel TOPBAR_DATABUKU;
    private javax.swing.JPanel TOPBAR_SETTING;
    private javax.swing.JPanel TOPBAR_TRANSAKSI;
    private javax.swing.JPanel TOPBAR_USER;
    public static javax.swing.JPanel TRANSAKSI;
    public static javax.swing.JLabel T_DB_BUKU;
    public static javax.swing.JLabel T_DB_KATEGORI;
    public static javax.swing.JLabel T_DB_PENERBIT;
    public static javax.swing.JLabel T_DB_RAK;
    public static javax.swing.JLabel T_LP_BUKU_BERMASALAH;
    public static javax.swing.JLabel T_LP_TRANSAKSI;
    private javax.swing.JLabel T_PJ_ALERT_PENGEMBALIAN;
    private javax.swing.JLabel T_PJ_ALERT_PENGEMBALIAN1;
    private javax.swing.JLabel T_PJ_BUKU;
    private javax.swing.JLabel T_PJ_BUKU_PENGEMBALIAN;
    private javax.swing.JLabel T_PJ_BUKU_PENGEMBALIAN1;
    public static javax.swing.JLabel T_TR_KEMBALI;
    public static javax.swing.JLabel T_TR_LAPORAN;
    public static javax.swing.JLabel T_TR_PINJAM;
    public static javax.swing.JLabel T_U_ANGGOTA;
    public static javax.swing.JLabel T_U_JURUSAN;
    public static javax.swing.JLabel T_U_PENGURUS;
    public static javax.swing.JPanel USER;
    public static javax.swing.JLabel USERNAME;
    public static javax.swing.JLabel USERNAME_DATABUKU;
    public static javax.swing.JLabel USERNAME_SETTING;
    public static javax.swing.JLabel USERNAME_TRANSAKSI;
    public static javax.swing.JLabel USERNAME_USER;
    public static javax.swing.JLabel VALUE_ANGGOTA;
    public static javax.swing.JLabel VALUE_BERMASALAH;
    public static javax.swing.JLabel VALUE_DIPINJAM;
    public static javax.swing.JLabel VALUE_TOTAL_BUKU;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
