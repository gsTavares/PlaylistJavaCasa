/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class StreamTeste4 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        
        List<String> graphicDesigners = new ArrayList<>();
        List<String> developers = new ArrayList<>();
        List<String> students = new ArrayList<>();
        
        graphicDesigners.add("Wildnei Suane");
        graphicDesigners.add("Catarina Santos");
        graphicDesigners.add("Sandy Carolina");
        
        developers.add("William");
        developers.add("David");
        developers.add("Harisson");
        
        students.add("Édipo");
        students.add("Gustavo Lima");
        students.add("Gustavo Mendes");
        students.add("Guilherme");
        
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        
        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);
    }
}
