/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaOperadores {
    public static void main(String[] args) {
        // Operadores: + - / *

        int numero1 = 10;
        int numero2 = 20;
        
        // Resultado da divisão é 0, pois está sendo realizada entre dois inteiros
        // Solução -> parsing em uma das duas variáveis e  alterar o tipo de dado
        
        double resultado = numero1 / (double)numero2;
        
        System.out.println("Valor "+ resultado);
        
        // Operador de resto: % (mod)
        int resto = 20 % 2;
        System.out.println("Resto "+resto);
        
        // Operadores relacionais: < > <= >= == !=
        // Comparações só podem ser feitas entre tipos de dados semelhantes
        
        
        // Padrão de nomenclatura boolean: isCondicao

        boolean isDezMaiorQueVinte = 10 > 20; // false
        boolean isDezMenorQueVinte = 10 < 20; // true
        boolean isDezIgualAVinte = 10 == 20; // false
        boolean isDezIgualADez = 10 == 10; // true
        boolean isDezDiferenteDeDez = 10 != 10; // false
        boolean isDezDiferenteDe20 = 10 != 20; // true
        
        // Operadores lógicos: && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        
        System.out.println("Válido pra > 30: "+isDentroDaLeiMaiorQue30);
        System.out.println("Válido pra < 30: "+isDentroDaLeiMenorQue30);
        
        
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystationCinco = 5000F;
        
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystationCinco || valorTotalContaPoupanca > valorPlaystationCinco;
        System.out.println("Comprável: "+isPlaystationCincoCompravel);
        
        // Operadores de atribuição: = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
    }
}
