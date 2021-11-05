/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classesinternas;

import com.aulas.maratonajava.generics.dominio.Barco;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class AnonymousClassesTeste2 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>();
        
        barcoList.add(new Barco("Lancha"));
        barcoList.add(new Barco("Canoa"));
        
        // Exemplo de aplicação com classe anônima
        
        // Com lambda expression (sintaxe nova)
        // barcoList.sort((Barco o1, Barco o2) -> o1.getNome().compareTo(o2.getNome()));
        
        barcoList.sort(new Comparator<Barco>(){
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
            
        });
        
        System.out.println(barcoList);
    }
}
