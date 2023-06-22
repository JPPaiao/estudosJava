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
public class variaveisCompostas02 {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int c = 0; c<=mes.length-1; c++) { // for tradicional
            System.out.println("O mês de " + mes[c] + " tem " + dias[c] + " ao todo");
        }
        
        int h[] = {6, 7, 2, 0, 3, 9, 51, 7, 651, 51, 50, 468, 132 ,546 ,021, 465, 222, 1, 546, 988, 5, 7, 7};
        
        Arrays.sort(h);
        System.out.println(h);
        
        for (String valor: mes) { // forEach
            System.out.println(valor);
        }
    }
}
