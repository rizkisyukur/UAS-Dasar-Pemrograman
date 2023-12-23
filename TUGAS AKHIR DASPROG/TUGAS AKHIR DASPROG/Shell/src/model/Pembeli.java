package model;

public class Pembeli extends Akun {
    
    private String idPembeli;
    private String jeniskendaraan;
    private String plat;

    public Pembeli setIdPembeli(String idPembeli){
        this.idPembeli = idPembeli;
        return this;
    }

    public String getIdPembeli(String idPembeli){
        return this.idPembeli;
    }

    public Akun setPlat(String plat){
        this.plat = plat;
        return this;
    }

    public Akun getPlat(String plat){
        this.plat = plat;
        return this;
    }
    

    public String setJeniskendaraan(String jeniskendaraan) {
        return this.jeniskendaraan;
    }

    public String getJeniskendaraan(String jeniskendaraan) {
        return this.jeniskendaraan;
    }

}