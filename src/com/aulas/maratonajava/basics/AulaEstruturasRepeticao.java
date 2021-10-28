/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaEstruturasRepeticao {

    public static void main(String[] args) {
        // Estruturas de repetição: for(), while(), do{}while()

        int cont = 0;
        
        // Contagem de 1 a 10
        // while(valor booleando)
        while (cont < 10) {
            
            // System.out.println(++cont);

            System.out.println(cont+1);
            cont++;
        }
        
        cont = 0;
        
        // do-while: executa a instrução desejada pelo menos uma vez
        do {            
            System.out.println("Dentro do do-while "+(cont+1));
            cont++;
        } while (cont < 10);
        
        
        // for(int i = valor; condicao; i++)
        for(int i = 0; i < 10; i++){
            System.out.println(i+1);
        }
        
    }
}
