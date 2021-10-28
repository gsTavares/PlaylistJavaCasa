/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaArraysMultdimensionais {
    public static void main(String[] args) {
        // Problema
        // Meses : 1, 2, 3, 4, 5, 6, 7..
        // Dias: Mês 1-> 30 dias, Mês 2-> 29 dias...
        // Como linkar os meses e dias do ano?
        
        // Declaração de arrays multidimensionais
        
        int[][] dias = new int[3][3];
        
        // Cada índice do vetor aponta para outro vetor de tamanho predeterminado
        
        dias[0][0] = 20;
        dias[0][1] = 31;
        dias[0][2] = 40;
        
        dias[1][0] = 23;
        dias[1][1] = 30;
        dias[1][2] = 16;
        
        dias[2][0] = 27;
        dias[2][1] = 5;
        dias[2][2] = 2;
        
        for(int i = 0; i < dias.length; i++){ // Percorre as linhas do array
            for(int j = 0; j < dias[i].length; j++){ // Percorre as colunas de cada linha do array
                System.out.print(+dias[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        // Usando foreach()
        
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.print(num+" ");
            }
            System.out.println("\n");
        }
        
    }
}
