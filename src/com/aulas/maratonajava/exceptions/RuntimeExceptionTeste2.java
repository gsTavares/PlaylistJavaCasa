/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

/**
 *
 * @author Marketing
 */

// Lançamento de exceção unchecked

public class RuntimeExceptionTeste2 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }
    
    // Cláusula throws --> indica a possibilidade de uma exceção (opcional para exceções unchecked)
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            // Lançamento de novas exceções
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        
        return a/b;
        
    }
}
