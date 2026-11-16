package Pertemuan8;

class PersegiPanjang {
     private float panjang;
    private float lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }

    //Override
    protected float luas() {
        return panjang * lebar;
    }

    //Override
    protected float keliling() {
        return 2 * (panjang + lebar);
    }

    String getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
