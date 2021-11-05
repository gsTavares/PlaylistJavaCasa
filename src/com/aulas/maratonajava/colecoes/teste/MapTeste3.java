/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Consumidor;
import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marketing
 */
public class MapTeste3 {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Gustavo");
        Consumidor consumidor2 = new Consumidor("Gabriel");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9, 0);
        Manga manga2 = new Manga(1L, "Berserk", 9.5, 5);
        Manga manga3 = new Manga(4L, "Helsing Ultimate", 3.2, 0);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20, 2);
        Manga manga5 = new Manga(2L, "Dragon ball z", 2.99, 0);
        
        List<Manga> mangaConsumidorList = new ArrayList<>();
        List<Manga> mangaConsumidorList2 = new ArrayList<>();
        
        mangaConsumidorList.add(manga1);
        mangaConsumidorList.add(manga2);
        mangaConsumidorList.add(manga3);
        
        
        
        mangaConsumidorList2.add(manga3);
        mangaConsumidorList2.add(manga4);
        
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        
        consumidorManga.put(consumidor, mangaConsumidorList);
        consumidorManga.put(consumidor2, mangaConsumidorList2);
        
        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome());
            
            for(Manga manga : entry.getValue()){
                System.out.println("----"+manga.getNome());
            }
        }
    }
}
