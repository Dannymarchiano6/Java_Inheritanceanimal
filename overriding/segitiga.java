/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class segitiga extends bangundatar{
    float alas;
    float tinggi;
    
    @Override
    float luas(){
        float luas = 1/2 * (alas * tinggi);
        System.out.println("luas segitiga:" + luas);
        return luas;
    }
}
