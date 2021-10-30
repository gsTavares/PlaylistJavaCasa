/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

/**
 *
 * @author Marketing
 */
public class StringsTeste2 {

    public static void main(String[] args) {
        String nome = "Gustavo";
        System.out.println(nome.charAt(6)); // Retorna um char baseado no índice da String
        System.out.println(nome.length()); // Retorna o tamanho da String (índice começa em 0)
        System.out.println(nome.replace("a", "v")); // Troca o primeiro char pelo segundo em toda String
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.substring(0,2)); // Retorna a string baseado num intervalo, com o 
        // primeiro índice fechado e o segundo aberto
        System.out.println(nome.substring(3, nome.length()));
        System.out.println(nome.trim()); // Remove os espaços em branco no começo e no fim da string
        
    }
}
