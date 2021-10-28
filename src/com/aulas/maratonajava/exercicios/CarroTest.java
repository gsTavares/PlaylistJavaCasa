/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

import com.aulas.maratonajava.exercicios.Carro;

/**
 *
 * @author Marketing
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        
        carro.nome = "Gol";
        carro.modelo = "Volks";
        carro.ano = 2019;
        
        carro2.nome = "Fiesta";
        carro2.modelo = "Ford";
        carro2.ano = 2018;
        
        System.out.println(carro.nome+", modelo "+carro.modelo+", ano "+carro.ano);
        System.out.println(carro2.nome+", modelo "+carro2.modelo+", ano "+carro2.ano);
    }
}
