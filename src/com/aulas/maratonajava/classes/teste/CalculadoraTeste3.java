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
public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        double resultado = calculadora.dividirDoisNumeros(20, 0);
        
        System.out.println(resultado);
        
        
    }
}
