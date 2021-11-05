/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Consumidor;
import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Marketing
 */
public class QueueTeste2 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Gustavo");
        
        // Objeto precisa de um comparable ou comparator
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Helsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));
        
        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
