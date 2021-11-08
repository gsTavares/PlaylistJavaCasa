/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import com.aulas.maratonajava.streams.classes.LightNovel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Marketing
 */
public class StreamTeste11 {
    public static void main(String[] args) {
        // Sumarização
        
        List<LightNovel> list = new ArrayList<>();

        list.add(new LightNovel("Tensei Shittara", 8.99));
        list.add(new LightNovel("Overlord", 10.99));
        list.add(new LightNovel("Violet Evergarden", 5.99));
        list.add(new LightNovel("No Game no Life", 2.99));
        list.add(new LightNovel("Fullmetal Alchemist", 5.99));
        list.add(new LightNovel("Kumo Desuga", 1.99));
        list.add(new LightNovel("Kumo Desuga", 1.99));
        list.add(new LightNovel("Monogatari", 4.00));
        
        // stream().count()
        System.out.println(list.stream().count());
        
        // Com Collectors
        System.out.println(list.stream().collect(Collectors.counting()));
        
        list.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        list.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);
        
        System.out.println(list.stream().mapToDouble(LightNovel::getPrice).sum());
        
        System.out.println(list.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println(list.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        
        System.out.println("---------------------------");
        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        
        String titles = list.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
        
    }
}
