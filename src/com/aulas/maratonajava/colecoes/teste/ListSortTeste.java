/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class ListSortTeste {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Helsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        
        // Reorganização em ordem alfabética ou do menor valor para o maior
        Collections.sort(mangas);
        
        List<Double> dinheiros = new ArrayList<>();
        
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        
        Collections.sort(dinheiros);
        
        for(String manga : mangas){
            System.out.println(manga);
        }
        
        for(Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }
        
    }
}
