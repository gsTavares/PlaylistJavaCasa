/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import com.aulas.maratonajava.streams.classes.LightNovel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Marketing
 */
public class StreamTeste2 {
    public static void main(String[] args) {
        List<LightNovel> list = new ArrayList<>();

        list.add(new LightNovel("Tensei Shittara", 8.99));
        list.add(new LightNovel("Overlord", 3.99));
        list.add(new LightNovel("Violet Evergarden", 5.99));
        list.add(new LightNovel("No Game no Life", 2.99));
        list.add(new LightNovel("Fullmetal Alchemist", 5.99));
        list.add(new LightNovel("Kumo Desuga", 1.99));
        list.add(new LightNovel("Monogatari", 4.00));
        
        List<String> titles = list.stream()
                        .sorted(Comparator.comparing(LightNovel::getTitle))
                        .filter(ln -> ln.getPrice() <= 4)
                        .limit(3)
                        .map(LightNovel::getTitle)
                        .collect(Collectors.toList());
        
        System.out.println(titles);
    }
}
