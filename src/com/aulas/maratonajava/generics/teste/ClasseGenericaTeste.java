/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.teste;

import com.aulas.maratonajava.generics.services.CarroRentavelService;
import com.aulas.maratonajava.generics.dominio.Carro;

/**
 *
 * @author Marketing
 */
public class ClasseGenericaTeste {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        
        System.out.println("Usando o carro por um mês...");
        
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
