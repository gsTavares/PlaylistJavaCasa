/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaArraysMultdimensionais2 {
    public static void main(String[] args) {
        // Formas de incialização
        
        int[][] arrayInt = new int[3][];
        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};
        int[] numeros = {1,2};
        
        arrayInt[0] = numeros;
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{1,2,3,4,5,6};
        
        for(int[] arrayBase : arrayInt2){
            for(int num : arrayBase){
                System.out.print(num+" ");
            }
            System.out.println("\n");
        }
    }
}
