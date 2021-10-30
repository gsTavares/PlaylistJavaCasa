/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

/**
 *
 * @author Marketing
 */
public class StringsTeste {
    public static void main(String[] args) {
        // String constant pool
        String nome = "Gustavo"; 
        String nome2 = "Gustavo";
        
        // Variável de referência
        // Objeto do tipo String
        // Uma string da string pool
        
        String nome3 = new String("Gustavo");
        // Apsesar da vas variáveis serem diferentes, elas apontam para a mesma
        // String dentro da string pool
        
        
        nome = nome.concat(" Tavares"); // nome += " Tavares";
        System.out.println(nome);
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

                
    }
}
