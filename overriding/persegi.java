/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author DESKTOP F7-VIRUF
 */
public class persegi extends bangundatar {
    float sisi;
    
    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas persegi"+luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("keliling persegi : " + keliling);
        return keliling;
    }
}
