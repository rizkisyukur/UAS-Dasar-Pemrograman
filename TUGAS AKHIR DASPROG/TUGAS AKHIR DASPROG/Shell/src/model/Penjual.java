package model;

public class Penjual extends Akun {

    private String idPenjual;
    private String Password;

    public Penjual setIdPenjual(String idPenjual){
        this.idPenjual = idPenjual;
        return this;
    }

    public String getIdPenjual(String idPenjual){
        return this.idPenjual;
    }

    public Penjual setPassword(String Password){
        this.Password = Password;
        return this;
    }

    public String getPassword(String Password){
        return this.Password;
    }
}