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
public class LeituraDoTecladoTeste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        
        String pergunta = input.nextLine();
        
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
