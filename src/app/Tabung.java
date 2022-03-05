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
public class Tabung extends Lingkaran implements MenghitungRuang {
    protected float tinggi;

    public Tabung(float tinggi, float r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    
    
    @Override
    public float HitungVolume() {
        float volume = 3.14f * r * r * tinggi;
        return volume;
    }
    
    public float HitungLuas(float tinggi, float r) {
        float luasP = (2 * HitungLuas()) + (tinggi * HitungKeliling());
        return luasP;
        
    }
    
    
    
}
