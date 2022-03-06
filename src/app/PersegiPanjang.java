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
// class PersegiPanjang mengimplementasi class MenghitungBidang
public class PersegiPanjang implements MenghitungBidang {
    protected float panjang;
    protected float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float HitungKeliling() {
        float keliling = (panjang+lebar) * 2;
        return keliling;
    }

    @Override
    public float HitungLuas() {
        float luas = panjang * lebar;
        return luas;
    }
    
    
    
}
