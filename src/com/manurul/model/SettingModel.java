/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.model;

import com.manurul.lib.DBConfig;
import com.manurul.lib.SqlTime;
import com.manurul.view.Dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Timestamp;

/**
 *
 * @author caesarhome
 */
public class SettingModel extends DBConfig{
    
    public static Connection conn = (Connection)DBConfig.getConnection();
    public int Denda;
    public int MaxPinjamBuku;
    public int BackupDatabase;
    
    public String message;
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public SettingModel(){
        
        // AMBIL DATA DARI DATABASE
        try{
        
            PreparedStatement pst = conn.prepareCall("SELECT * FROM ma_setting");
            ResultSet res = pst.executeQuery();
            
            if(!res.next()){
                throw new SQLException("Data gagal dimuat!");
            }
            
            Dashboard.INPUT_SET_1.setText(res.getString("denda_terlambat"));
            Dashboard.INPUT_SET_2.setValue(Integer.parseInt(res.getString("max_pinjam_buku_umum")));
            Dashboard.INPUT_SET_3.setSelectedIndex(res.getInt(4));
            
            // SET SETTING GLOBAL VARIABEL
            Dashboard.Denda = Integer.parseInt(res.getString("denda_terlambat"));
            Dashboard.MaxPinjamBukuUmum = Integer.parseInt(res.getString("max_pinjam_buku_umum"));
            Dashboard.BackupDatabase = res.getInt(4);
            
        }catch(SQLException error){
        
            JOptionPane.showMessageDialog(null, error, "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            
        }
        
    }
    
    public boolean update(int Denda, int MaxPinjamBuku, int BackupDatabase){
    
        try {
            
            int updated;
            
            PreparedStatement pst = conn.prepareCall("UPDATE ma_setting SET denda_terlambat = ?, max_pinjam_buku_umum = ?, time_backup_database = ?, updated_at = ? WHERE id = 1");
            pst.setInt(1, Denda);
            pst.setInt(2, MaxPinjamBuku);
            pst.setInt(3, BackupDatabase);
            pst.setTimestamp(4, new SqlTime().getTimeStamp());
            updated = pst.executeUpdate();
            
            if(updated == 0){
                throw new SQLException("Data gagal diperbarui!");
            }
            
            new SettingModel();
            new LogModel().Action("UPDATE PENGATURAN", "Memperbarui data pengaturan", Dashboard.nama_user);
            
            setMessage("Pengaturan berhasil diperbarui!");
            return true;
        
        } catch (SQLException error) {
            
            setMessage(error.getMessage());
            return false;
            
        }
        
    }
    
    public int getMaxPinjam(){
        
        try{
        
            String sql = "SELECT max_pinjam_buku_umum FROM ma_setting";
            ResultSet res = conn.prepareStatement(sql).executeQuery();
            if(!res.next()){
                throw new SQLException("Gagal mengambil data setting !");
            }
            
            return res.getInt("max_pinjam_buku_umum");
            
        }catch(SQLException error){
            return 0;
        }
        
    }
    
}
