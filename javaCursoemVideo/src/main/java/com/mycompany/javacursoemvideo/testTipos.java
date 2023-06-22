/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacursoemvideo;

/**
 *
 * @author USUARIO
 */
public class testTipos {
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        
        //System.out.println(valor);
        
        /*float i = 2.5f;   
        System.out.println(Math.floor(i)); // Arredonda para baixo
        System.out.println(Math.ceil(i)); // Arredonda para cima
        System.out.println(Math.round(i)); // Arredonda normal*/
        
        double random = Math.random();
        int n = (int) (5 + random * (10 - 5)); // Numero aleatorio de 5 a 10
        System.out.println(n);
    }
}
