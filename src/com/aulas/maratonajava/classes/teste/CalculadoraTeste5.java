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
public class CalculadoraTeste5 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int[] numeros = {1,2,3,4,5};
        calculadora.somarArray(numeros);
        
        //  Chamada de um método que utiliza varargs
        calculadora.somarVarArgs(numeros);
        
        // Outro exemplo de chamada
        calculadora.somarVarArgs(1,2,5,6,10,25);
    }
}
