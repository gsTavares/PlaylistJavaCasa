/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class ExercicioFor3 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        // Condição é que o valor da parcela deve ser maior ou igual a 1000
        
        double valorCarro = 30000;
        int maxParcelas = 0;
        
        for(int i = 1; i <= valorCarro; i++){
            
            if(valorCarro / i < 1000){
                break;
            }
            
            maxParcelas = i;
        }
        
        System.out.println("Máximo de parcelas: "+maxParcelas);
    }
}
