/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        float panjang = input.nextFloat();
//        float lebar = input.nextFloat();
//        float tinggi = input.nextFloat();
//        
//        Balok balok = new Balok(tinggi, panjang, lebar);
//        
//        balok.HitungLuas();
//        balok.HitungKeliling();
//        balok.HitungLuas(panjang, tinggi, lebar);
//        balok.HitungVolume();

          float r = input.nextFloat();
          float tinggi = input.nextFloat();
          
          Tabung tabung = new Tabung(tinggi,r);
          System.out.println("Tes");
          System.out.println("Keliling Lingkaran = " + tabung.HitungKeliling());
          System.out.println("Luas Lingkaran = " + tabung.HitungLuas());
          System.out.println("Luas Permukaan = " + tabung.HitungLuas(tinggi,r));
          System.out.println("Volume = " + tabung.HitungVolume());
        
        
        
    }
}
