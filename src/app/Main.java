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
        
        float panjang = input.nextFloat();
        float lebar = input.nextFloat();
        float tinggi = input.nextFloat();
        
        Balok balok = new Balok(tinggi, panjang, lebar);
        
        balok.HitungLuas();
        balok.HitungKeliling();
        balok.HitungLuas(panjang, tinggi, lebar);
        balok.HitungVolume();
        
        System.out.println("");
        int r = 10;
        float angka = 3.14f * r * r;
        System.out.println(angka);
        
        
    }
}
