/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class ListTeste {
    public static void main(String[] args) {
        // Listas
        // List nomes = new ArrayList(); // Implementação até a versao 1.4 do Java
        // List -> ordered
        // List<*Objeto*> nomeVariavel = new ArrayList<>();
        
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        
        nomes.add("Gustavo");
        nomes.add("Gabriel");
        
        nomes2.add("Arthur");
        nomes2.add("Pedro");
        
        nomes.addAll(nomes2);
                
        
        // nomes.remove("Gustavo");
        
        // Impressão dos nomes com foreach
        for(String nome: nomes){
            System.out.println(nome);
        }
        
        nomes.add("Joao");
        System.out.println("-----------------");
        
        // Com for indexado
        
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
