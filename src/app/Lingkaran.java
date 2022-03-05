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
public class Lingkaran implements MenghitungBidang {
    protected float r;

    public Lingkaran(float r) {
        this.r = r;
    }
    
    @Override
    public void HitungKeliling() {
        float keliling = 3.14f * r * 2;
        System.out.println("Keliling Lingkaran = " + keliling);
    }
    
    
    @Override
    public void HitungLuas() {
        float luas = 3.14f * r * r;
        System.out.println("Luas Lingkaran = " + luas);
    }

    
    
}
