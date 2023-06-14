package model;

import java.math.BigInteger;


public class KPR {
    private String id;
    private String cin;
    private BigInteger hargaRumah;
    private BigInteger penghasilan;
    private BigInteger pinjaman;
    private int jangkaWaktu;
    private float rasioCicilan;
    private String approve;
    private Nasabah nasabah;

    public KPR(String id, String cin, BigInteger hargaRumah, BigInteger penghasilan, BigInteger pinjaman, int jangkaWaktu, float rasioCicilan, String approve) {
        this.id = id;
        this.cin = cin;
        this.hargaRumah = hargaRumah;
        this.penghasilan = penghasilan;
        this.pinjaman = pinjaman;
        this.jangkaWaktu = jangkaWaktu;
        this.rasioCicilan = rasioCicilan;
        this.approve = approve;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    
    
    public BigInteger getHargaRumah() {
        return hargaRumah;
    }

    public void setHargaRumah(BigInteger hargaRumah) {
        this.hargaRumah = hargaRumah;
    }

    public BigInteger getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(BigInteger penghasilan) {
        this.penghasilan = penghasilan;
    }

    public BigInteger getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(BigInteger pinjaman) {
        this.pinjaman = pinjaman;
    }

    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    public void setJangkaWaktu(int jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }

    public float getRasioCicilan() {
        return rasioCicilan;
    }

    public void setRasioCicilan(float rasioCicilan) {
        this.rasioCicilan = rasioCicilan;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    
    
    
}
