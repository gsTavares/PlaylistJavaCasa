/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Calculadora;

/**
 *
 * @author Marketing
 */
public class CalculadoraTeste4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int num1 = 1;
        int num2 = 2;
        
        // Passando paramâmetros por cópia
        calculadora.alterarDoisNumeros(num1, num2);
        
        System.out.println("\nDentro do CalculadoraTeste4");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        
       
    }
}
