package model;

public class Karyawan {
    protected String username;
    protected String password;
    protected String nama;
    protected String tanggalLahir;
    protected double gaji;
    
    public Karyawan(String username, String password, String nama, String tanggalLahir, double gaji) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.gaji = gaji;
    }
    
    @Override
    public String toString(){
        return nama;
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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    
}
