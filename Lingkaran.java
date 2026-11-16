package Pertemuan8;

public class Lingkaran {
    private float jari;
    private final float phi = 3.14f;

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    //Override
    protected float luas() {
        return phi * jari * jari;
    }

    //Override
    protected float keliling() {
        return 2 * phi * jari;
    }

    String getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
