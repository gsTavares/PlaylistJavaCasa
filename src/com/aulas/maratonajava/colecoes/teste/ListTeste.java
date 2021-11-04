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
        
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Gustavo");
        nomes.add("Gabriel");
        
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
