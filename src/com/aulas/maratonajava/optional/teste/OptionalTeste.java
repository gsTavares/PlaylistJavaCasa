/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.optional.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Marketing
 */
public class OptionalTeste {
    public static void main(String[] args){
        
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
        System.out.println("------------------");
        Optional<String> name = findName("William");
        
        // Se o nome existe, ele é retornado. Se não, retorna o parâmetro passado;
        String result = name.orElse("Vazio");
        System.out.println(result);
    }
    
    private static Optional<String> findName(String name){
        List<String> list = new ArrayList<>();
        
        list.add("William");
        list.add("DevDojo");
        
        int i = list.indexOf(name);
        if(i != -1){
            return Optional.of(list.get(i));
        }
        
        return Optional.empty();
    }
}
