/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.lambda.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Marketing
 */
public class LambdaTeste {
    // Interface Consumer -> executa uma operação e não retorna nada
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        
        nomes.add("Gustavo");
        nomes.add("Gabriel");
        nomes.add("Luffy");
        nomes.add("Zoro");
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        forEach(nomes, (String s) -> System.out.println(s));
        System.out.println("----------------------");
        forEach(numbers, (Integer i) -> System.out.println(i));
    }
    
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e : list){
            consumer.accept(e);
        }
    }
}
