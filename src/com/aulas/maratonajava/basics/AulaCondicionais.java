/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaCondicionais {
    public static void main(String[] args) {
        // Condicional if(): só executa o código dentro se a condiçao for verdadeira
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        
        if(idade >= 18){
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }
        
        // Com variável booleana
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado");
        }
        
        // Com operador de negação
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado");
        }
        
        // Atribuições nunca devem ser feitas dentro do if(). Somente comparações
        
        
        
        
    }
}
