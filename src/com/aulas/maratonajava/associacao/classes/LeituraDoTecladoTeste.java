/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

import java.util.Scanner;

/**
 *
 * @author Marketing
 */
public class LeituraDoTecladoTeste {

    public static void main(String[] args) {
        
        // Classe Scanner-> padrão para entrada de dados
        
        Scanner entrada = new Scanner(System.in);
        
        // Métodos de entrada = next(), nextLine(), nextInt()...
        
        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        
        System.out.println("-------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
}
