/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Manga;
import com.aulas.maratonajava.colecoes.dominio.Smartphone;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Marketing
 */
class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }

}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
    
}

public class NavigableSetTeste {

    public static void main(String[] args) {
        // TreeSet --> sorteia a lista baseado na regra estabalecida no compareTo da classe
        // ou no compare passado no construtor
        
        // Os elementos duplicados são excluídos também de acordo com a regra do compareTo da classe
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        // System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Helsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        // Elemento duplicado
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));
        
        // Métodos
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        
        for (Manga manga : mangas /* ordem alfabética inversa -> descendingSet()*/ ) {
            System.out.println(manga);
        }
        
        Manga yuyu = new Manga(21L, "Yu Yu Hakusho", 11.20, 5);
        System.out.println("-------------------------------");
        System.out.println(mangas.lower(yuyu)); // manga com menor preço mais próximo em relação ao manga passado por parâmetro
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollLast()); // retorna e remove o primeiro elemento da lista
        System.out.println(mangas.size());
    }
}
