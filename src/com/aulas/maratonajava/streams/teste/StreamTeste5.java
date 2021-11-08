/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Marketing
 */
public class StreamTeste5 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        
        words.add("Gomu");
        words.add("Gomu");
        words.add("No");
        words.add("Mi");
        
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));
        
        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList()); 
        System.out.println(letters2);
    }
}
