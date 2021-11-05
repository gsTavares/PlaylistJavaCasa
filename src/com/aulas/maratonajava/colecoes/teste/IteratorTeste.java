/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Manga;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class IteratorTeste {

    public static void main(String[] args) {

        // Implementando Iterator;
        List<Manga> mangas = new LinkedList<>();
        
        // LinkedList --> cada posição do array conhece suas posições vizinhas

        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Helsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();

//        // Um Iterator percorre a lista e permite fazer alterações nela sem alterar o seu tamanho
//        // em tempo de execução
//        
//        // Exemplo de implementação
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            
//            if(manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
//        System.out.println(mangas);
        // removeIf(var_referencia -> regra de negócio);
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);

    }
}
