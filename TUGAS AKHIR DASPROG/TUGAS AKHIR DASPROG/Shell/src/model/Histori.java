package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Histori{

    private String idProsesJual;
    private Penjual penjual;
    private Pembeli pembeli;
    private int total;
    private LocalDate tanggal;
    private ArrayList<Struk> strukPenjualans;
    
    public Histori setIdProsesJual(String idProsesJual){
        this.idProsesJual = idProsesJual;
        return this;
    }

    public Histori setPenjual(Penjual penjual){
        this.penjual = penjual;
        return this;
    }

    public Histori setPembeli(Pembeli pembeli){
        this.pembeli = pembeli;
        return this;
    }

    public Histori setTotal(int total){
        this.total = total;
        return this;
    }

    public Histori setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
        return this;
    }

    public Histori setStrukPenjualan(ArrayList<Struk> strukPenjualans){
        this.strukPenjualans = strukPenjualans;
        return this;
    }

    public String getIdProsesJual(String idProsesJual){
        return this.idProsesJual;
    }

    public Penjual getPenjual(Penjual penjual){
        return this.penjual;
    }

    public Pembeli getPembeli(Pembeli pembeli){
        return this.pembeli;
    }

    public int getTotal(int total){
        return this.total;
    }

    public LocalDate getTanggal(){
        return this.tanggal;
    }

    public ArrayList<Struk> getStrukPenjualans(ArrayList<Struk> strukPenjualans){
        return this.strukPenjualans;
    }
}