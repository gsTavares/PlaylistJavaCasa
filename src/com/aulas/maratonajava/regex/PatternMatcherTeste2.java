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
public class PatternMatcherTeste2 {
    
    // Expressões regulares - utilizados para buscas e validações
    
    public static void main(String[] args) {
        // Metachars
        // \d = todos os dígitos
        // \D = tudo o que não for dígito
        // \s = todos os espaços em branco\t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = tudo de a-Z ou A-Z, dígitos, _
        // \W tudo que não for incluso no \w
        
        String regex = "\\w";
        // String texto = "abaaba";
        String texto2 = "@#$21j eh qw kjeh12j3h1   243";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        
        System.out.println("Texto:  "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posicoes encontradas:");
        
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        
        
        
    }
}
