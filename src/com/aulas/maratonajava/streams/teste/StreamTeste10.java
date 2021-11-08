/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 *
 * @author Marketing
 */
public class StreamTeste10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n+2)
                .limit(10)
                .forEach(System.out::println);
        
        // Exemplo com fibonacci
        System.out.println("----------------------------");
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a)+" "));
        
        ThreadLocalRandom random = ThreadLocalRandom.current();
        
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
