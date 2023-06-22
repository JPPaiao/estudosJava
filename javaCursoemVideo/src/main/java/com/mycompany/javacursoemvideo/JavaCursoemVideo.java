/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javacursoemvideo;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaCursoemVideo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.println("Digite a nota do aluno: ");    
        float nota = scan.nextFloat();
        
        // %f float
        // %s string
        
        /*
            int idade = scan.nextInt();
            float salario = scan.nextFloat();
            String nome = scan.nextLine();
        */
        
        //System.out.println("Sua nota é " + nota);
        System.out.printf("A nota de %s é %.2f", nome, nota);
    }
}
