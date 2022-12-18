/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class lingkaran extends bangundatar{
    //jari - jari lingkaran
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran :" + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("keliling lingkaran :" + keliling);
        return keliling;
    }
}
