/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.teste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class StreamTeste7 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        
        // Soma de todos os elementos
        numeros.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        // Com valor incial
        System.out.println(numeros.stream().reduce(1,(x,y) -> x+y));
        
        // Com MethodReference
        numeros.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(1, Integer::sum));
    }
}
