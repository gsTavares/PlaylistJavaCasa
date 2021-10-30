/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

/**
 *
 * @author Marketing
 */
public class StringBuilderTeste {
    public static void main(String[] args) {
        String nome = "Gustavo";
        nome.concat(" Tavares");
        System.out.println(nome);
        
        StringBuilder sb = new StringBuilder("Gustavo");
        sb.append(" dos Santos").append(" Tavares").append(" da Silva"); // Concatenação de string
        sb.reverse(); // Reverte a ordem da String;
        sb.reverse();
        sb.delete(0, 3); // Deleta caracteres de uma string em um intervalo
        System.out.println(sb);
    }
}
