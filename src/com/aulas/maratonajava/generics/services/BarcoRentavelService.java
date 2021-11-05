/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.services;

import com.aulas.maratonajava.generics.dominio.Barco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */


public class BarcoRentavelService {
    private Barco[] barcos = {new Barco("Lancha"), new Barco("Canoa")};
    private List<Barco> barcosDisponiveis = gerarListaBarcos(barcos);
    
    private List<Barco> gerarListaBarcos(Barco[] barcos){
        List<Barco> listaBarcos = new ArrayList<>();
        
        for(Barco barco : barcos){
            listaBarcos.add(barco);
        }
        
        return listaBarcos;
    }
    
    public Barco buscarBarcoDisponivel(){
        
        System.out.println("Buscando barco disponível...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }
    
    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        
    }
    
    
    
    
    
}
