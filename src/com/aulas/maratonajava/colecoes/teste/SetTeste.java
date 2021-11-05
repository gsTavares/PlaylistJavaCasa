/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Marketing
 */
public class SetTeste {
    public static void main(String[] args) {
        
        // Set --> não permite elementos duplicados
        // HashSet --> faz a organização dos elementos via hashCode();
        // Para manter a ordem de inserção --> usar LinekHashSet<>()
        Set<Manga> mangas = new HashSet<>();
        
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Helsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));
        // Elemento duplicado
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));
        
        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
