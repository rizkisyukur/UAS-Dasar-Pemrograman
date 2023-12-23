package model;

public class Struk {
    
    private String idStruk;
    private Histori histori;
    private Bensin bensin; 
    private int hargaJual;
    private int kuantitas;
    private int subTotal;

    public void setIdStruk(String idStruk){
        this.idStruk = idStruk;
    }

    public Struk setHistori(Histori histori){
        this.histori = histori;
        return this;
    }

    public Struk setBensin(Bensin bensin){  
        this.bensin = bensin;
        return this;
    }

    public Struk setHargaJual(int hargaJual){
        this.hargaJual = hargaJual;
        return this;
    }

    public Struk setKuantitas(int kuantitas){
        this.kuantitas = kuantitas;
        return this;
    }

    public Struk setSubTotal(int subTotal){
        this.subTotal = subTotal;
        return this;
    }

    public String getIdStruk(String idSturk){
        return idStruk;
    }

    public Histori getHistori(){
        return histori;
    }

    public Bensin getBensin(){  // Mengganti getter untuk Bensin
        return bensin;
    }

    public int getHargaJual(int hargaJual){
        return this.hargaJual;
    }

    public int getKuantitas(int kuantitas){
        return this.kuantitas;
    }

    public int getSubTotal(int subTotal){
        return this.subTotal;
    }
}
