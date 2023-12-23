package model;

public class Akun {
    
    private String nama;
    private String email;
    private String jeniskendaraan;

    public Akun setNama(String nama){
        this.nama = nama;
        return this;
    }

    public Akun setEmail(String email){
        this.email = email;
        return this;
    }

    public String getNama(String nama){
        return this.nama;
    }

    public String getEmail(String email){
        return this.email;
    }

    public String setJeniskendaraan(String jeniskendaraan){
        return this.jeniskendaraan;
    }

    public String getJeniskendaraan(String jeniskendaraan){
        return this.jeniskendaraan;
    }
    
}