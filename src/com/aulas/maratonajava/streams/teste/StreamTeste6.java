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
public class StreamTeste6 {
    public static void main(String[] args) {
        List<LightNovel> list = new ArrayList<>();

        list.add(new LightNovel("Tensei Shittara", 8.99));
        list.add(new LightNovel("Overlord", 3.99));
        list.add(new LightNovel("Violet Evergarden", 5.99));
        list.add(new LightNovel("No Game no Life", 2.99));
        list.add(new LightNovel("Fullmetal Alchemist", 5.99));
        list.add(new LightNovel("Kumo Desuga", 1.99));
        list.add(new LightNovel("Kumo Desuga", 1.99));
        list.add(new LightNovel("Monogatari", 4.00));
        
        System.out.println(list.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(list.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(list.stream().noneMatch(ln -> ln.getPrice() > 0));
        
        list.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findAny()
                .ifPresent(System.out::println);
        
        list.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
