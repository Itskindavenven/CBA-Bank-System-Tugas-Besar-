package model;

/**
 *
 * @author Asus
 */
public class Customer_Service extends Karyawan{
    private String cs_id;

    public Customer_Service(String cs_id, String username, String password, String nama, String tanggalLahir, double gaji) {
        super(username, password, nama, tanggalLahir, gaji);
        this.cs_id = cs_id;
    }

    @Override
    public String toString(){
        return nama;
    }
    
    public String getCs_id() {
        return cs_id;
    }

    public void setCs_id(String cs_id) {
        this.cs_id = cs_id;
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
