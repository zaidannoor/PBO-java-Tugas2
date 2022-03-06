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
        Scanner input = new Scanner(System.in); // deklarasi scanner input
        int pilih; // memilih pada menu utama dan menu ulang
        float panjang,lebar,tinggi,r; // variabel yang akan menghitung pada menu 1 dan 2
       
        do { 
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            if(pilih == 1){
                System.out.print("Input Panjang : ");
                panjang = input.nextFloat();
                System.out.print("Input Lebar : ");
                lebar = input.nextFloat();
                System.out.print("Input Tinggi : ");
                tinggi = input.nextFloat();
                
                Balok balok = new Balok(tinggi, panjang, lebar); //instansiasi objek balok
                System.out.println("Luas Persegi Panjang = " + balok.HitungLuas());
                System.out.println("Keliling Persegi Panjang = " + balok.HitungKeliling());
                System.out.println("Volume Balok = " + balok.HitungVolume());
                System.out.println("Luas Permukaan Balok = " + balok.HitungLuas(panjang,lebar,tinggi));
                
            }
            else if(pilih == 2){
                System.out.print("Input Jari Jari : ");
                r = input.nextFloat();
                System.out.print("Input Tinggi : ");
                tinggi = input.nextFloat();

                Tabung tabung = new Tabung(tinggi,r); // instansiasi objek tabung
                System.out.println("Luas Lingkaran = " + tabung.HitungLuas());
                System.out.println("Keliling Lingkaran = " + tabung.HitungKeliling());
                System.out.println("Volume Tabung = " + tabung.HitungVolume());
                System.out.println("Luas Permukaan Tabung = " + tabung.HitungLuas(tinggi,r));
            }
            else if(pilih == 0){
                break;
            }
            else{
                System.out.println("Masukkan angka 1 atau 2 saja");
            }
            System.out.print("Ulangi ? (Ya: 1 || Tidak: 0) : ");
            pilih = input.nextInt();
        } while (pilih == 1);
        
        
        
        
        
        
    }
}
