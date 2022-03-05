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
public class Balok extends PersegiPanjang implements MenghitungRuang  {
    protected float tinggi;

    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

   
    
    @Override
    public void HitungVolume() {
        float volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok = " + volume);
    }

    // overload 
    public void HitungLuas(float panjang,float tinggi,float lebar) {
        float luasp = (panjang * lebar + panjang * tinggi + lebar * tinggi) * 2;
        System.out.println("Luas Permukaan balok = " + luasp);
    }

    
    
}
