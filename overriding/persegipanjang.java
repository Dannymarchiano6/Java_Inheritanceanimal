/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class persegipanjang extends bangundatar{
    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float luas = panjang * lebar ;
        System.out.println("luas persegi panjang :" + luas);
        return luas;
    }
    float keliling(){
        float kil = 2*panjang + 2*lebar;
        System.out.println("keliling persegi panjang"+kil);
        return kil;
    }
}
