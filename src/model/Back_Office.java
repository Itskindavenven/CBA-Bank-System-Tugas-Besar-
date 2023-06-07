package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Back_Office extends Karyawan{
    private String bo_id;

    public Back_Office(String bo_id, String username, String password, String nama, String tanggalLahir, double gaji) {
        super(username, password, nama, tanggalLahir, gaji);
        this.bo_id = bo_id;
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
    
    public String getBo_id() {
        return bo_id;
    }
    
    public void setBo_id(String bo_id) {
        this.bo_id = bo_id;
    }
    
    @Override
    public String getUsername() {
        return username;
    }
    
    @Override
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String getPassword() {
        return password;
    }
    
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    
    @Override
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    @Override
    public double getGaji() {
        return gaji;
    }
    
    @Override
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    
}
