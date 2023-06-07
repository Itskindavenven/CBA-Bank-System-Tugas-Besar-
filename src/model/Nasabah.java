/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Nasabah {
    private int rekening;
    private String nama;
    private String nik;
    private String alamat;
    private String tanggalLahir;
    private String jenisRekening;
    private double saldo;
    private String username;
    private String password;
    private Transaksi mutasi;
    private Pengajuan_KPR statusKPR;

    public Nasabah(int rekening, String nama, String nik, String alamat, String tanggalLahir, String jenisRekening, double saldo, String username, String password, Transaksi mutasi, Pengajuan_KPR statusKPR) {
        this.rekening = rekening;
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.jenisRekening = jenisRekening;
        this.saldo = saldo;
        this.username = username;
        this.password = password;
        this.mutasi = mutasi;
        this.statusKPR = statusKPR;
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
    public int getRekening() {
        return rekening;
    }

    public void setRekening(int rekening) {
        this.rekening = rekening;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public void setJenisRekening(String jenisRekening) {
        this.jenisRekening = jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Transaksi getMutasi() {
        return mutasi;
    }

    public void setMutasi(Transaksi mutasi) {
        this.mutasi = mutasi;
    }

    public Pengajuan_KPR getStatusKPR() {
        return statusKPR;
    }

    public void setStatusKPR(Pengajuan_KPR statusKPR) {
        this.statusKPR = statusKPR;
    }
    
    
}
