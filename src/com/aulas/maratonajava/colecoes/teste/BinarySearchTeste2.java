/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class BinarySearchTeste2 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        
        mangas.add(new Manga(5L ,"Attack on Titan", 19.9));
        mangas.add(new Manga(1L ,"Berserk", 9.5));
        mangas.add(new Manga(4L ,"Helsing Ultimate", 3.2));
        mangas.add(new Manga(3L ,"Pokemon", 11.20));
        mangas.add(new Manga(2L ,"Dragon ball z", 2.99));
        
        // Sort por nome
        // Collections.sort(mangas);
        
        // Sort por ID
        mangas.sort(mangaByIdComparator);
        
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        
        Manga mangaToSearch = new Manga(2L ,"Dragon ball z", 2.99);
        
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
