/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.teste;

import com.aulas.maratonajava.generics.dominio.Barco;
import com.aulas.maratonajava.generics.dominio.Carro;
import com.aulas.maratonajava.generics.services.RentavelService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class ClasseGenericaTeste3 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        List<Barco> barcos = new ArrayList<>();
        
        carros.add(new Carro("BMW"));
        carros.add(new Carro("Fusca"));
        
        barcos.add(new Barco("Lancha"));
        barcos.add(new Barco("Canoa"));
        
        RentavelService<Carro> rentavelService = new RentavelService<>(carros);
        Carro carro = rentavelService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        rentavelService.retornarObjetoAlugado(carro);
        
        
        
    }
}
