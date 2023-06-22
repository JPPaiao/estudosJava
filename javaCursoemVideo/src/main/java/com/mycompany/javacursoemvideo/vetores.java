/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacursoemvideo;

import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class vetores {
    public static void main(String[] args) {
        int h[] = {6, 7, 2, 0, 3, 9, 51, 7, 651, 51, 50, 468, 132 ,546 ,021, 465, 222, 1, 546, 988, 5, 7, 7};
        
        Arrays.sort(h); // Colocando os valores em ordem 
        /*
        for (int v: h) {
            System.out.println(v);
            System.out.println(" ");
        }
        */
        
        int p = Arrays.binarySearch(h, 2); // Encontrar o index de um valor dentro do array
        //System.out.println(p);
        
        int num[] = new int[5];
        Arrays.fill(num, 8); // Preencher todos os elementos do array com um valor
        
        for (int v: num) {
            System.out.println(v);
        }
        
        
    }
}
