/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.lambda.teste;

import com.aulas.maratonajava.lambda.dominio.Anime;
import com.aulas.maratonajava.lambda.services.AnimeComparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marketing
 */

// Reference to static method
public class MethodReferenceTeste {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>();
        
        animeList.add(new Anime("Berserk", 43));
        animeList.add(new Anime("One piece", 100));
        animeList.add(new Anime("Naruto", 500));
        
        // Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        // Collections.sort(animeList, (a1,a2) -> AnimeComparators.compareByTitle(a1, a2));
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);
        System.out.println("---------------------------");
        
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
        
    }
}
