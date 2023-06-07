package model;

public class Manajer {
    private String id;
    private String username;
    private String password;
    private Karyawan karyawan;

    public Manajer(String id, String username, String password, Karyawan karyawan) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.karyawan = karyawan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    
}
