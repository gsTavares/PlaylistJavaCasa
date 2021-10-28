/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaCondicional4 {
    public static void main(String[] args) {
        // Imprimir o dia da semana, considerando 1 como domingo
        byte dia = 5;
        char sexo = 'M';
        
        // switch(char || int || short || enum || String)
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
                
            // Se o valor não corresponder a nenhum dos casos
            default:
                System.out.println("Opção inválida");
        }
        
        switch(sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida");
        }
        
    }
    
}
