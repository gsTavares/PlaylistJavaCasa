/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.lambda.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Marketing
 */
public class LambdaTeste2 {
    // Function -> interface funcional
    // Recebe o tipo T (entrada) e o R (saída)
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("Natsu");
        names.add("Allucard");
                                             // (String s) -> s.length() == String::length  
        List<Integer> integers = map(names, String::length);
        List<String> map = map(names, String::toUpperCase);
        
        System.out.println(integers);
        System.out.println(map);
    }
    
    private static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        
        for(T e : list){
            R r = function.apply(e); // recebe T e retorna R
            result.add(r);
        }
        
        return result;
    }
}
