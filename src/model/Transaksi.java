/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Transaksi {
    private String transaksi_id;
    private String jenisTransaksi;
    private String tanggal;
    private double jumlah;
    private Nasabah nasabah;

    public Transaksi(String transaksi_id, String jenisTransaksi, String tanggal, double jumlah, Nasabah nasabah) {
        this.transaksi_id = transaksi_id;
        this.jenisTransaksi = jenisTransaksi;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.nasabah = nasabah;
    }

    public String getTransaksi_id() {
        return transaksi_id;
    }

    public void setTransaksi_id(String transaksi_id) {
        this.transaksi_id = transaksi_id;
    }

    public String getJenisTransaksi() {
        return jenisTransaksi;
    }

    public void setJenisTransaksi(String jenisTransaksi) {
        this.jenisTransaksi = jenisTransaksi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }
    
    
}
