/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.services;

import com.aulas.maratonajava.generics.dominio.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */


public class CarroRentavelService {
    private Carro[] carros = {new Carro("BMW"), new Carro("Fusca")};
    private List<Carro> carrosDisponiveis = gerarListaCarros(carros);
    
    private List<Carro> gerarListaCarros(Carro[] carros){
        List<Carro> listaCarros = new ArrayList<>();
        
        for(Carro carro : carros){
            listaCarros.add(carro);
        }
        
        return listaCarros;
    }
    
    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponível...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }
    
    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        
    }
    
    
    
    
    
}
