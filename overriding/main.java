/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class main {
    public static void main(String[] args) {
        bangundatar bangundatar = new bangundatar();
        
        //persegi
        persegi persegi = new persegi();
        persegi.sisi = 2;
        
        //lingkaran
        lingkaran lingkaran = new lingkaran();
        lingkaran.r = 22;
        
        //persegipanjang
        persegipanjang persegipanjang = new persegipanjang();
        persegipanjang.panjang = 8;
        persegipanjang.panjang = 4;
        
        //Segitiga
        segitiga segitiga = new segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        //method luas dan keliling
        
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
    }
}

