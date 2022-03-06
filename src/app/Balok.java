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
// class Balok merupakan child class PersegiPanjang yang mengimplementasi class MenghitungRuang
public class Balok extends PersegiPanjang implements MenghitungRuang  {
    protected float tinggi;

    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public float HitungVolume() {
        float volume = panjang * lebar * tinggi;
        return volume;
    }

    // overload 
    public float HitungLuas(float panjang,float tinggi,float lebar) {
        float luasP = (panjang * lebar + panjang * tinggi + lebar * tinggi) * 2;
        return luasP;
    }

    
    
}
