/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.optional.teste;

import com.aulas.maratonajava.optional.dominio.Manga;
import com.aulas.maratonajava.optional.repositorio.MangaRepository;
import java.util.Optional;

/**
 *
 * @author Marketing
 */
public class OptionalTeste2 {

    public static void main(String[] args) {
        Optional<Manga> manga = MangaRepository.findByTitle("Boku no hero");
        manga.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        
        System.out.println(manga);
        
        Manga mangaId = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        
        System.out.println(mangaId);
        
        Manga mangaCreate = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));
        
        System.out.println(mangaCreate);
    }
}
