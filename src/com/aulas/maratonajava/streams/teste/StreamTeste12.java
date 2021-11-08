/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import com.aulas.maratonajava.streams.classes.Category;
import com.aulas.maratonajava.streams.classes.LightNovel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Marketing
 */
public class StreamTeste12 {
    public static void main(String[] args) {
        List<LightNovel> list = new ArrayList<>();

        list.add(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY));
        list.add(new LightNovel("Overlord", 10.99, Category.FANTASY));
        list.add(new LightNovel("Violet Evergarden", 5.99, Category.DRAMA));
        list.add(new LightNovel("No Game no Life", 2.99, Category.FANTASY));
        list.add(new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY));
        list.add(new LightNovel("Kumo Desuga", 1.99, Category.FANTASY));
        list.add(new LightNovel("Kumo Desuga", 1.99, Category.FANTASY));
        list.add(new LightNovel("Monogatari", 4.00, Category.ROMANCE));
        
        
        // Filtrando as lightnovels por categoria
        
        Map<Category, List<LightNovel>> collect = list.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
