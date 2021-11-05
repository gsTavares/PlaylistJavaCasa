/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.teste;

import com.aulas.maratonajava.generics.dominio.Barco;
import com.aulas.maratonajava.generics.services.BarcoRentavelService;

/**
 *
 * @author Marketing
 */
public class ClasseGenericaTeste2 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        
        System.out.println("Usando o barco por um mês...");
        
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
