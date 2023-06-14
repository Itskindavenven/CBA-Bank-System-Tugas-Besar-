package model;

import java.math.BigInteger;

public class Transaksi {
    private String transaksi_id;
    private String jenisTransaksi;
    private String tanggal;
    private BigInteger jumlah;
    private String no_rekening;
    private Rekening rekening;

    public Transaksi(String transaksi_id, String no_rekening, String tanggal, BigInteger jumlah, String jenisTransaksi) {
        this.transaksi_id = transaksi_id;
        this.jenisTransaksi = jenisTransaksi;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.no_rekening = no_rekening;
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

    public BigInteger getJumlah() {
        return jumlah;
    }

    public void setJumlah(BigInteger jumlah) {
        this.jumlah = jumlah;
    }

    public String getNo_rekening() {
        return no_rekening;
    }

    public void setNo_rekening(String no_rekening) {
        this.no_rekening = no_rekening;
    }

    public Rekening getRekening() {
        return rekening;
    }

    public void setRekening(Rekening rekening) {
        this.rekening = rekening;
    }
}