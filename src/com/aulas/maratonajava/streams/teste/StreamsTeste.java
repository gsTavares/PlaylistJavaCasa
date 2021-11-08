/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import com.aulas.maratonajava.streams.classes.LightNovel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Marketing
 */
// 1- Ordenar por título
// 2- Retornar os 3 primeiros títulos das lightnovels com preço < 4
public class StreamsTeste {

    public static void main(String[] args) {
        List<LightNovel> list = new ArrayList<>();

        list.add(new LightNovel("Tensei Shittara", 8.99));
        list.add(new LightNovel("Overlord", 3.99));
        list.add(new LightNovel("Violet Evergarden", 5.99));
        list.add(new LightNovel("No Game no Life", 2.99));
        list.add(new LightNovel("Fullmetal Alchemist", 5.99));
        list.add(new LightNovel("Kumo Desuga", 1.99));
        list.add(new LightNovel("Monogatari", 4.00));

        list.sort(Comparator.comparing(LightNovel::getTitle));

        // Resolução do problema com forEach
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(list);
        System.out.println(titles);

    }
}
