package model;

/**
 *
 * @author Asus
 */
public class Nasabah {
    private String customer_identification;
    private String nik;
    private String nama;
    private String alamat;
    private String tanggalLahir;
    private String pekerjaan;
    private Rekening rekening;

    public Nasabah(String customer_identification, String nik, String nama, String alamat, String tanggalLahir, String pekerjaan) {
        this.customer_identification = customer_identification;
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.rekening = null;
    }

    
    public String getCustomer_identification() {
        return customer_identification;
    }

    public void setCustomer_identification(String customer_identification) {
        this.customer_identification = customer_identification;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    public Rekening getRekening() {
        return rekening;
    }

    public void setRekening(Rekening rekening) {
        this.rekening = rekening;
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
}
