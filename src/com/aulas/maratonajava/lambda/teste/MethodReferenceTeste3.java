/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.lambda.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 *
 * @author Marketing
 */
public class MethodReferenceTeste3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Rimuru");
        list.add("Veldora");
        list.add("Hikimaru");
        
        list.sort(String::compareTo);
        System.out.println(list);
        
        Function<String, Integer> stringToInteger = Integer::parseInt;
        
        System.out.println(stringToInteger.apply("10"));
    }
}
