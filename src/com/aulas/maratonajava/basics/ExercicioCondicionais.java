/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class ExercicioCondicionais {
    public static void main(String[] args) {
        
        double salario = 4500, imposto, taxa;
        
        if(salario >= 0 && salario <= 34712){
            taxa = 9.7/100;
        } else if(salario > 34712 && salario <= 68507){
            taxa = 37.35/100;
        } else {
            taxa = 49.5/100;
        }
        
        imposto = salario * taxa;
        
        System.out.println("Valor do imposto = "+ imposto);
    }
}
