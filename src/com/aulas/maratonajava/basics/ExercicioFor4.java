/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class ExercicioFor4 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        // Valor máximo da parcela
        // Usando continue
        
        double valorCarro = 30000;
        int maxParcelas = 0;
        
        for(int i = (int)valorCarro ; i >= 1; i--){
            
            if(valorCarro / i < 1000){
                continue; // Dá prosseguimento ao laço, ignorando as demais instruções
            }
            
            System.out.println("\nParcela: "+i);
            System.out.println("R$ "+ (valorCarro / i));
        }
        
        
    }
}
