package Pertemuan8;


class Persegi {
        private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    //Override
    protected float luas() {
        return sisi * sisi;
    }

    //Override
    protected float keliling() {
        return 4 * sisi;
    }

    String getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
