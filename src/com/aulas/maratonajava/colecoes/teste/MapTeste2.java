/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Consumidor;
import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marketing
 */
public class MapTeste2 {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Gustavo");
        Consumidor consumidor2 = new Consumidor("Gabriel");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9, 0);
        Manga manga2 = new Manga(1L, "Berserk", 9.5, 5);
        Manga manga3 = new Manga(4L, "Helsing Ultimate", 3.2, 0);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20, 2);
        Manga manga5 = new Manga(2L, "Dragon ball z", 2.99, 0);
        
        
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        
        // Um consumidor compra um mangá
        consumidorManga.put(consumidor, manga1);
        consumidorManga.put(consumidor2, manga4);
        
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
        }
    }
}
