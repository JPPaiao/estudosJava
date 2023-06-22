/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacursoemvideo;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class loops {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        
        Scanner t = new Scanner(System.in);
        do {
             System.out.println("Digite um número");
             n = t.nextInt();
             s += n;
             System.out.println("Quer continuar? [S/N]");
             resp = t.next();
        } while (resp.equals("s"));
        
        System.out.println("A some de todos os valores é " + s);
    }
}
