/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.lambda.teste;

import com.aulas.maratonajava.lambda.dominio.Anime;
import com.aulas.maratonajava.lambda.services.AnimeComparators;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 *
 * @author Marketing
 */
public class MethodReferenceTeste4 {
    public static void main(String[] args) {
        
        // Interface Supliers
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        // Referência a construtor
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>();
        
        animeList.add(new Anime("Berserk", 43));
        animeList.add(new Anime("One piece", 100));
        animeList.add(new Anime("Naruto", 500));
        
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        
        System.out.println(animeList);
        
        BiFunction<String, Integer, Anime> animeBiFunction = (s, i) -> new Anime(s, i);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        
        System.out.println(animeBiFunction2.apply("Super campeões", 36));
    }
}
