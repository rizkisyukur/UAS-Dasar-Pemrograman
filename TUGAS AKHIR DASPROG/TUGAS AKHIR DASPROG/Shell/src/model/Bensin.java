package model;

public class Bensin {

    private String idBensin;
    private String namaBensin;
    private int hargaBensin;
    private int stokBensin;

    public Bensin setIdBensin(String idBensin){
        this.idBensin = idBensin;
        return this;
    }
    
    public Bensin setNamaBensin(String namaBensin){
        this.namaBensin = namaBensin;
        return this;
    }

    public Bensin setHargaBensin(int hargaBensin){
        this.hargaBensin = hargaBensin;
        return this;
    }

    public Bensin setStokBensin(int stokBensin){
        this.stokBensin = stokBensin;
        return this;
    }

    public String getIdBensin(String idBensin){
        return this.idBensin;
    }
    
    public String getNamaBensin(String namaBensin){
        return this.namaBensin;
    }

    public int getHargaBensin(int hargaBensin){
       return this.hargaBensin;
    }

    public int getStokBensin(int stokBensin){
        return this.stokBensin;
    }

}
