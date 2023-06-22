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
public class operadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        
        r = (x < y && y < z) ? true : false;
        
        //System.out.println(r);
        
        int ano = 2023;
        int idade = ano - 2006;
        
        System.out.println(idade + " anos");
        
        if (idade < 16) {
            System.out.println("Não vota");
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto opcinal");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}
