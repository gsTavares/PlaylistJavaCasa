/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.services;

import com.aulas.maratonajava.generics.dominio.Carro;
import java.util.List;

/**
 *
 * @author Marketing
 */

// RentalService<T> --> esse T é o tipo de objeto passado ao instanciar a classe genérica

public class RentavelService<T> {
    
    private List<T> objetosDisponiveis;
    
    public RentavelService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    
    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponível...");
        T t = objetosDisponiveis.remove(0);
        
        System.out.println("Alugando objeto: "+ t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        
        return t;
    }
    
    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto "+ t);
        objetosDisponiveis.add(t);
        
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
