/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Marketing
 */

// Utilizando comparator --> pode mudar a regra estabelecida na implementação do compareTo

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
       // Mesma regra do compareTo implementado no objeto
       
       return o1.getId().compareTo(o2.getId());
       
    }
    
}

public class MangaSortTeste {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        
        
        mangas.add(new Manga(5L ,"Attack on Titan", 19.9));
        mangas.add(new Manga(1L ,"Berserk", 9.5));
        mangas.add(new Manga(4L ,"Helsing Ultimate", 3.2));
        mangas.add(new Manga(3L ,"Pokemon", 11.20));
        mangas.add(new Manga(2L ,"Dragon ball z", 2.99));
        
        // Por ordem de entrada/índice
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        
        // Sort de uma lista de objetos -> deve conter o método compareTo sobrescrito no objeto
        Collections.sort(mangas);
        
        System.out.println("-----------------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        
        Collections.sort(mangas, new MangaByIdComparator());
        
        System.out.println("-----------------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
