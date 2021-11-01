/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marketing
 */
public class PatternMatcherTeste {
    
    // Expressões regulares - utilizados para buscas e validações
    
    public static void main(String[] args) {
        String regex = "aba";
        // String texto = "abaaba";
        String texto2 = "abababa";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        
        System.out.println("Texto:  "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posicoes encontradas:");
        
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }
        
        
        
    }
}
