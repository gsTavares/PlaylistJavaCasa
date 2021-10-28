/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaArrays {
    public static void main(String[] args) {
        // Declaração
        // Arrays são do tipo reference
        
        // Valores-padrão para cada array de um tipo primitivo
        // byte, short, int, float e double -> 0
        // char -> '\u0000' -> ''
        // boolean -> false
        // String -> null

        int[]idades = new int[3];
        int i = 0;
        
        idades[0] = 16;
        idades[1] = 20;
        idades[2] = 18;
        
        while(i < idades.length){
            System.out.println("Idade "+(i+1)+": "+idades[i]);
            i++;
        }
    }
}
