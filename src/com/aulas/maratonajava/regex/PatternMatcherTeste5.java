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
public class PatternMatcherTeste5 {
    
    // Expressões regulares - utilizados para buscas e validações
    
    public static void main(String[] args) {
        // Metachars
        
        // \d = todos os dígitos
        // \D = tudo o que não for dígito
        // \s = todos os espaços em branco\t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = tudo de a-Z ou A-Z, dígitos, _
        // \W tudo que não for incluso no \w
        // [] -> range
        
        // Quantificadores
        
        // ? -> Zero ou Uma
        // * -> Zero ou mais
        // + -> Uma ou mais
        // {n,m} - > de n até m
        // () -> e
        // | -> ou
        // . 1.3 = 123, 133, 1@3, 1A3
        
        // Exemplo: o(v|c)o --> ovo | oco
        
        // $ -> fim da linha
            
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
      
        
        String texto = "luffy@hotmail.com, 123jorato@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posicoes encontradas:");
        
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        
    }
}
