/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Marketing
 */
public class StreamTeste9 {
    public static void main(String[] args) {
        // Gerando Streams
        // range e rangeClosed --> respectivamente, exclui ou inclue o último valor passado por parâmetro

        IntStream.range(0, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n+" "));
        System.out.println("\n---------------------");
        IntStream.rangeClosed(0, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n+" "));
        
        System.out.println("\n--------------------");
        
        Stream.of("Eleve ", "O ", "Cosmo ", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s+" "));
        System.out.println("\n--------------------");
        
        int[] num = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
    }
}
