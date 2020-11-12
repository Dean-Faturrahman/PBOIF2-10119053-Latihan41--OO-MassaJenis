/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan41.oo.massajenis;

import model.Kubus;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program menghitung massa jenis
 */
public class PBOIF210119053Latihan41OOMassaJenis {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        
        System.out.println("===Massa Jenis Kubus===");
        kubus.setSisi(5);
        System.out.println("Panjang Sisi : " + kubus.getSisi() + " cm");
        kubus.setMassa(250);
        System.out.println("Massa        : " + kubus.getMassa() + " g");
        System.out.println("");
        System.out.println("===Hasil Perhitunggan===");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()) + " cm^3");
        System.out.println("Massa Jenis Kubus : " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())) + " g/cm^3");
    }
    
}
