package Pertemuan8;

public class Segitiga {
    private float alas;
    private float tinggi;
    private float sisiKiri;
    private float sisiKanan;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiKiri(float sisiKiri) {
        this.sisiKiri = sisiKiri;
    }

    public void setSisiKanan(float sisiKanan) {
        this.sisiKanan = sisiKanan;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getSisiKiri() {
        return sisiKiri;
    }

    public float getSisiKanan() {
        return sisiKanan;
    }

    //Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    //Override
    protected float keliling() {
        return alas + sisiKiri + sisiKanan;
    }    

    String getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
