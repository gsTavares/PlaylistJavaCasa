/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import java.util.stream.Stream;

/**
 *
 * @author Marketing
 */
public class StreamTeste14 {
    public static void main(String[] args) {
        // Parallel Streams
        
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10000000;
        
        sumFor(num);
        sumStreamIterate(num);
    }
    
    private static void sumFor(long num){
        System.out.println("Sum for");
        
        long result = 0;
        long init = System.currentTimeMillis();
        
        for(long i  =  1; i <= num; i++){
            result += i;
        }
        
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+ (end - init) + "ms");
    }
    
    private static void sumStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        
        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+ (end - init) + "ms");
    }
}
