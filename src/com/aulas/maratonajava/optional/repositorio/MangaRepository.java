/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.optional.repositorio;

import com.aulas.maratonajava.optional.dominio.Manga;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author Marketing
 */
public class MangaRepository {
    private static List<Manga> mangas;
    
    public static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }
    
    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }
    
    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        mangas = new ArrayList<>();
        mangas.add(new Manga(1, "Boku no hero", 50));
        mangas.add(new Manga(2, "Overlord", 25));
        
        Manga found = null;
        
        for(Manga manga : mangas){
            if(predicate.test(manga)){
                found = manga;
            }
        }
        
        return Optional.ofNullable(found);
    }
}
