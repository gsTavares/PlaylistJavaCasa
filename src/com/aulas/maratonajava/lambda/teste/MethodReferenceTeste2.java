/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.lambda.teste;

import com.aulas.maratonajava.lambda.dominio.Anime;
import com.aulas.maratonajava.lambda.services.AnimeComparators;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */

// Reference to non-static method
public class MethodReferenceTeste2 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        
        List<Anime> animeList = new ArrayList<>();
        
        animeList.add(new Anime("Berserk", 43));
        animeList.add(new Anime("One piece", 100));
        animeList.add(new Anime("Naruto", 500));
        
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
