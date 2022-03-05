/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang implements MenghitungBidang {
    protected float panjang;
    protected float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void HitungKeliling() {
        float keliling = (panjang+lebar) * 2;
        System.out.println("Luas Persegi panjang = " + keliling);
    }

    @Override
    public void HitungLuas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi panjang = " + luas);
    }
    
    
    
}
