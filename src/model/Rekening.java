package model;

import java.math.BigInteger;

public class Rekening {
    private String noRekening;
    private String jenis;
    private BigInteger saldo;
    private String cin;
    private String namaNasabah;
    private Nasabah nasabah;

    public Rekening(String noRekening, String cin, String jenis, BigInteger saldo) {
        this.noRekening = noRekening;
        this.cin = cin;
        this.jenis = jenis;
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public BigInteger getSaldo() {
        return saldo;
    }

    public void setSaldo(BigInteger saldo) {
        this.saldo = saldo;
    }
    
    
    public Nasabah getNasabah(){
        return nasabah;
    }
    
    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }
}
